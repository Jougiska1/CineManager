import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LocacaoDAO {

    public void registrarLocacao(Locacao locacao) {
        String sql = "INSERT INTO locacao (id_cliente, id_filme, data_locacao, data_previsao_devolucao, status) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection conn = new ConexaoDAO().connectDB();
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setInt(1, locacao.getIdCliente());
            prep.setInt(2, locacao.getIdFilme());
            prep.setString(3, locacao.getDataLocacao());
            prep.setString(4, locacao.getDataPrevisaoDevolucao());
            prep.setString(5, locacao.getStatus());
            prep.execute();
            JOptionPane.showMessageDialog(null, "Locação registrada com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao registrar locação: " + erro.getMessage());
        }
    }
}