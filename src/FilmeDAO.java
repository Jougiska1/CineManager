import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FilmeDAO {

    public void cadastrarFilme(Filme filme) {
        String sql = "INSERT INTO filme (titulo, genero, ano_lancamento, valor_locacao, quantidade_estoque) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection conn = new ConexaoDAO().connectDB();
            PreparedStatement prep = conn.prepareStatement(sql);
            prep.setString(1, filme.getTitulo());
            prep.setString(2, filme.getGenero());
            prep.setInt(3, filme.getAnoLancamento());
            prep.setDouble(4, filme.getValorLocacao());
            prep.setInt(5, filme.getQuantidadeEstoque());
            prep.execute();
            JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar filme: " + erro.getMessage());
        }
    }

    public ArrayList<Filme> listarFilmes() {
        ArrayList<Filme> lista = new ArrayList<>();
        String sql = "SELECT * FROM filme";
        try {
            Connection conn = new ConexaoDAO().connectDB();
            PreparedStatement prep = conn.prepareStatement(sql);
            ResultSet rs = prep.executeQuery();
            while (rs.next()) {
                Filme f = new Filme();
                f.setIdFilme(rs.getInt("id_filme"));
                f.setTitulo(rs.getString("titulo"));
                f.setGenero(rs.getString("genero"));
                f.setAnoLancamento(rs.getInt("ano_lancamento"));
                f.setValorLocacao(rs.getDouble("valor_locacao"));
                f.setQuantidadeEstoque(rs.getInt("quantidade_estoque"));
                lista.add(f);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar filmes: " + erro.getMessage());
        }
        return lista;
    }
}