import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    public Connection connectDB() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost/cinemanager?user=root&password=123456"
            );
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ConexaoDAO: " + erro.getMessage());
        }
        return conn;
    }
}