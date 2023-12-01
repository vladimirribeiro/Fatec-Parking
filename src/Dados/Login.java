package Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    private String cpf;
    private String senha;

    public Login() {
        this.cpf = null;
        this.senha = null;
    }

    public Login(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean realizarLogin() {
        Connection conn = null;
PreparedStatement stmt = null;
ResultSet rs = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fatecparking", "root", "");

    String query = "SELECT * FROM informacoes WHERE cpf = ? AND senha = ?";
    stmt = conn.prepareStatement(query);
    stmt.setString(1, this.cpf);
    stmt.setString(2, this.senha);
    rs = stmt.executeQuery();

    boolean hasResult = rs.next();
    return hasResult; 

} catch (ClassNotFoundException | SQLException e) {
    e.printStackTrace();
    return false;
} finally {
    try {
        if (rs != null) {
            rs.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    try {
        if (stmt != null) {
            stmt.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    try {
        if (conn != null) {
            conn.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    }
}


