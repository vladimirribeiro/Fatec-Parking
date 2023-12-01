
package Banco;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Dados.Usuario;


public class UsuarioBD {
     Connection connection = null;
      public boolean inserirUsuario(Usuario usuario) 
    {
    	boolean status = true;
    	
        System.out.println("Inserir Usuario");
        
        connection = ConexaoBD.getInstance().getConnection();
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            String sql = "INSERT INTO usuario (nome,cpf,ra,email,telefone,curso,funcao,marcaveiculo,nomeveiculo,corveiculo,placaveiculo,vaga) "
               + "VALUES('"+usuario.getNome()+"','"+usuario.getCpf()+"',"
               + " "+usuario.getRa()+",'"+usuario.getEmail()+"','"+usuario.getTelefone()+"',"
               + "'"+usuario.getCurso()+"','"+usuario.getFuncao()+"','"+usuario.getMarcaveiculo()+"','"+usuario.getNomeveiculo()+"','"+usuario.getCorveiculo()+"','"+usuario.getPlacaveiculo()+"','"+usuario.getVaga()+"');";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            
            status = true;
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
        }
        finally
        {
            try
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
                status = false;
            }
        }
        
        return status;
    } 
       public boolean atualizarUsuario(Usuario usuario) 
    {
        System.out.println("Atualizar Usuario");
        connection = ConexaoBD.getInstance().getConnection();
        System.out.println("Conectado e pronto para atualizar");
        Statement stmt = null;
    
        try
        {
            stmt = connection.createStatement();

            String sql = "UPDATE usuario SET nomeusuario = '" + usuario.getCpf() + "' WHERE codusuario = " + usuario.getCodigo() + ";";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            
            return true;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        finally
        {
            try 
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    } 
     public void relatorioUsuario(Usuario usuario, DefaultTableModel modelo)      
    {
       connection = ConexaoBD.getInstance().getConnection();
       System.out.println("Conectado!! Preparando a exclusao");
       Statement stmt = null;
         
  	        
  	   try
  	   {  		    
  		   stmt = connection.createStatement();
           ResultSet res = stmt.executeQuery("SELECT * FROM informacoes ORDER BY codigo");
         
  		   while(res.next())
  		   {
  			   usuario.setCodigo(res.getInt("codigo"));
  			   usuario.setNome(res.getString("nome"));	
  			   usuario.setCpf(res.getString("cpf"));
			   usuario.setRa(res.getString("ra"));	
			   usuario.setEmail(res.getString("email"));
  			   usuario.setTelefone(res.getString("telefone"));
  			   usuario.setSenha(res.getString("senha"));	
			   usuario.setCurso(res.getString("curso"));
			   usuario.setFuncao(res.getString("funcao"));
                           usuario.setMarcaveiculo(res.getString("marcaveiculo"));
                           usuario.setNomeveiculo(res.getString("nomeveiculo"));
                           usuario.setCorveiculo(res.getString("corveiculo"));
                           usuario.setPlacaveiculo(res.getString("placaveiculo"));
                           usuario.setVaga(res.getInt("vaga"));
			   
  			   modelo.addRow(new Object[] {usuario.getCodigo(), usuario.getNome(),
                                            usuario.getCpf(),usuario.getRa(),usuario.getEmail(),
  					   usuario.getTelefone(), usuario.getSenha(),usuario.getCurso(),
  					   usuario.getFuncao(),usuario.getMarcaveiculo(),usuario.getNomeveiculo(),usuario.getCorveiculo(),usuario.getPlacaveiculo(),usuario.getVaga(),});		    
	   
  		   }
  	   }
  	   catch(SQLException ex)
  	   {
  		   System.out.println("Erro SQL: " + ex.getMessage());
  	   }
  	   finally 
       {
         try
         {
             stmt.close();
             connection.close();
         }
         catch (SQLException e)
         {
             System.out.println("Erro ao desconectar" + e.getMessage());
         }
     }
  	
    	
    } 
    
     

}
