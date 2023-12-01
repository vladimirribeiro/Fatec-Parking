 package Banco;




public class Usuario {
    private String nome;
    private String cpf;
    private String ra;
    private String email;
    private String telefone;
    private String senha;
    private String curso;
    private String funcao;
    private String marcaveiculo;
    private String modeloveiculo;
    private String placaveiculo;
    private String corveiculo;
    private String vaga;

    public Usuario(){
        nome = "INDEF";
        cpf = "000.000.000-00";
        ra = "INDEF";
        email = "INDEF";
        telefone = "(00) 00000-0000";
        senha = "INDEF";
        curso = "XXX";
        funcao = "INDEF";
        marcaveiculo = "INDEF";
        modeloveiculo = "INDEF";
        placaveiculo = "INDEF";
        corveiculo = "INDEF";
        vaga = "00";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getMarcaveiculo() {
        return marcaveiculo;
    }

    public void setMarcaveiculo(String marcaveiculo) {
        this.marcaveiculo = marcaveiculo;
    }

    public String getModeloveiculo() {
        return modeloveiculo;
    }

    public void setModeloveiculo(String modeloveiculo) {
        this.modeloveiculo = modeloveiculo;
    }
    
    public String getPlacaveiculo() {
        return placaveiculo;
    }

    public void setPlacaveiculo(String placaveiculo) {
        this.placaveiculo = placaveiculo;
    }
    public String getCorveiculo() {
        return corveiculo;
    }

    public void setCorveiculo(String corveiculo) {
        this.corveiculo = corveiculo;
    }

    public String getVaga() {
        return vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }
    
}
