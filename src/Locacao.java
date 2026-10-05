public class Locacao {
    private int idLocacao;
    private int idCliente;
    private int idFilme;
    private String dataLocacao;
    private String dataPrevisaoDevolucao;
    private String status;

    public int getIdLocacao() { return idLocacao; }
    public void setIdLocacao(int idLocacao) { this.idLocacao = idLocacao; }

    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public int getIdFilme() { return idFilme; }
    public void setIdFilme(int idFilme) { this.idFilme = idFilme; }

    public String getDataLocacao() { return dataLocacao; }
    public void setDataLocacao(String dataLocacao) { this.dataLocacao = dataLocacao; }

    public String getDataPrevisaoDevolucao() { return dataPrevisaoDevolucao; }
    public void setDataPrevisaoDevolucao(String dataPrevisaoDevolucao) { this.dataPrevisaoDevolucao = dataPrevisaoDevolucao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}