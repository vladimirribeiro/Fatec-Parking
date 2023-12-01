package Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dados {
    public void create(Usuario u) {
        try (Connection con = Conexao.getConnection();
             PreparedStatement stmt = con.prepareStatement("INSERT INTO informacoes(nome, cpf, ra, email, telefone, senha, curso, funcao, marcaveiculo, modeloveiculo, placaveiculo, corveiculo, vaga) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)")) {

            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getCpf());
            stmt.setString(3, u.getRa());
            stmt.setString(4, u.getEmail());
            stmt.setString(5, u.getTelefone());
            stmt.setString(6, u.getSenha());
            stmt.setString(7, u.getCurso());
            stmt.setString(8, u.getFuncao());
            stmt.setString(9, u.getMarcaveiculo());
            stmt.setString(10, u.getModeloveiculo());
            stmt.setString(11, u.getPlacaveiculo());
            stmt.setString(12, u.getCorveiculo());
            stmt.setString(13, u.getVaga());

             stmt.executeUpdate();
            

        } catch (SQLException ex) {
            Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
