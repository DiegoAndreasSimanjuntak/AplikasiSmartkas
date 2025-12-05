import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfilController {
    
    public boolean updateProfile(String fullname, String email, String username) {
    Connection conn = Koneksi.getKoneksi();

    String sql = "UPDATE users SET fullname = ?, email = ?, username = ? WHERE id = 1";

    try {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, fullname);
        ps.setString(2, email);
        ps.setString(3, username);

        int rows = ps.executeUpdate();
        return rows > 0;

    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

}
