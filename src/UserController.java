import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UserController {

    public boolean registerUser(String fullname, String email, String password) {

        try {
            Connection conn = Koneksi.getKoneksi();

            String sql = "INSERT INTO users (fullname, email, password) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, fullname);
            pst.setString(2, email);
            pst.setString(3, password);

            int row = pst.executeUpdate();

            return row > 0;   // true jika berhasil, false jika gagal
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                "Gagal menyimpan data: " + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
