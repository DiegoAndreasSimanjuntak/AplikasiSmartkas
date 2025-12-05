import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class LaporanService {

    public static void simpanLaporan(
            String jenis,
            String kategori,
            double nominal,
            String catatan,
            java.util.Date tanggal
    ) throws Exception {

        // Format tanggal ke format MySQL
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalFormatted = sdf.format(tanggal);

        try (Connection conn = Koneksi.getKoneksi()) {

            // ---- Cek apakah kategori sudah ada ---
            int categoryId = 0;
            String sqlKategori = "SELECT id FROM categories WHERE name = ?";
            try (PreparedStatement ps = conn.prepareStatement(sqlKategori)) {
                ps.setString(1, kategori);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        categoryId = rs.getInt("id");
                    } else {
                        // Insert kategori baru
                        String insertKategori = "INSERT INTO categories (name, user_id) VALUES (?, ?)";
                        try (PreparedStatement ps2 = conn.prepareStatement(insertKategori, Statement.RETURN_GENERATED_KEYS)) {
                            ps2.setString(1, kategori);
                            ps2.setInt(2, 1);
                            ps2.executeUpdate();

                            try (ResultSet rs2 = ps2.getGeneratedKeys()) {
                                if (rs2.next()) {
                                    categoryId = rs2.getInt(1);
                                }
                            }
                        }
                    }
                }
            }

            // ---- Insert ke tabel laporan ----
            String sql = "INSERT INTO laporan (kategori, jenis, nominal, catatan, tanggal) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, kategori);
                ps.setString(2, jenis);
                ps.setDouble(3, nominal);
                ps.setString(4, catatan);
                ps.setString(5, tanggalFormatted);
                ps.executeUpdate();
            }
        }
    }
}
