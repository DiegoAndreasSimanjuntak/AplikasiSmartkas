import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;

    public static Connection getKoneksi() {
        try {
            // Jika koneksi belum dibuat atau sudah tertutup, buat koneksi baru
            if (conn == null || conn.isClosed()) {
                String url = "jdbc:mysql://localhost:3306/smartkas";
                String user = "root";
                String pass = "";

                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi berhasil!");
            }

        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }

        return conn;
    }
}
