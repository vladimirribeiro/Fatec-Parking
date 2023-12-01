
package Banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConsultaRegistro {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
 
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
 
            
            String url = "jdbc:mysql://localhost:3306/fatecparking";
            String usuario = "root";
            String senha = "";
            connection = DriverManager.getConnection(url, usuario, senha);
 
           
            statement = connection.createStatement();
 
          
            String consultaSQL = "SELECT * FROM informacoes";
            resultSet = statement.executeQuery(consultaSQL);
 
            
            while (resultSet.next()) {
             
            }
 
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

