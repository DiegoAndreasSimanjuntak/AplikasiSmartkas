import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AuthController {

    public String login(String email, String password) {

        try {
            Connection conn = Koneksi.getKoneksi();

            String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                // return fullname jika berhasil login
                return rs.getString("fullname");
            } else {
                return null; // gagal login
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                "Terjadi kesalahan koneksi: " + e.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
