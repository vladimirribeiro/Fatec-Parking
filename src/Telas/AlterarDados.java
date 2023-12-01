
package Telas;

import static Telas.ConsultaDados.cpf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class AlterarDados extends javax.swing.JFrame {
 
    
    public AlterarDados(String cpf) {
        initComponents();
         
        preencherCampos(cpf);
       
    }
     private void preencherCampos(String cpf) {
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
               
            String consultaSQL = "SELECT * FROM informacoes WHERE cpf = '" + cpf+ "'";
            resultSet = statement.executeQuery(consultaSQL);

            if(resultSet.next()) {
                altNome.setText(resultSet.getString("nome"));
                altCpf.setText(resultSet.getString("cpf"));
                altRa.setText(resultSet.getString("ra"));

                altEmail.setText(resultSet.getString("email"));
                altTelefone.setText(resultSet.getString("telefone"));
                altSenha.setText(resultSet.getString("senha"));
                altCurso.setText(resultSet.getString("curso"));
                altFuncao.setText(resultSet.getString("funcao"));

                altMarca.setText(resultSet.getString("marcaveiculo"));
                altModelo.setText(resultSet.getString("modeloveiculo"));
                altPlaca.setText(resultSet.getString("placaveiculo"));
                altCor.setText(resultSet.getString("corveiculo"));
                altVaga.setText(resultSet.getString("vaga"));
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        alterarDados = new javax.swing.JLabel();
        Ra = new javax.swing.JLabel();
        altNome = new javax.swing.JTextField();
        Cpf = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        Senha = new javax.swing.JLabel();
        Funcao = new javax.swing.JLabel();
        Curso = new javax.swing.JLabel();
        ModeloVeiculo = new javax.swing.JLabel();
        PlacaVeiculo = new javax.swing.JLabel();
        Vaga = new javax.swing.JLabel();
        MarcaVeiculo = new javax.swing.JLabel();
        CorVeiculo = new javax.swing.JLabel();
        altRa = new javax.swing.JTextField();
        altEmail = new javax.swing.JTextField();
        altCor = new javax.swing.JTextField();
        altCpf = new javax.swing.JTextField();
        altTelefone = new javax.swing.JTextField();
        altSenha = new javax.swing.JTextField();
        altCurso = new javax.swing.JTextField();
        altFuncao = new javax.swing.JTextField();
        altMarca = new javax.swing.JTextField();
        altModelo = new javax.swing.JTextField();
        altPlaca = new javax.swing.JTextField();
        altVaga = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Dados");

        jPanel2.setBackground(new java.awt.Color(3, 1, 57));

        alterarDados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alterarDados.setForeground(new java.awt.Color(255, 255, 255));
        alterarDados.setText("Alterar Dados");

        Ra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Ra.setForeground(new java.awt.Color(255, 255, 255));
        Ra.setText("RA");

        Cpf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cpf.setForeground(new java.awt.Color(255, 255, 255));
        Cpf.setText("CPF");

        Nome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nome.setForeground(new java.awt.Color(255, 255, 255));
        Nome.setText("Nome");

        Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email");

        Telefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Telefone.setForeground(new java.awt.Color(255, 255, 255));
        Telefone.setText("Telefone");

        Senha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setText("Senha");

        Funcao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Funcao.setForeground(new java.awt.Color(255, 255, 255));
        Funcao.setText("Função");

        Curso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Curso.setForeground(new java.awt.Color(255, 255, 255));
        Curso.setText("Curso");

        ModeloVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ModeloVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        ModeloVeiculo.setText("Modelo do Veículo");

        PlacaVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PlacaVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        PlacaVeiculo.setText("Placa do Veículo");

        Vaga.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Vaga.setForeground(new java.awt.Color(255, 255, 255));
        Vaga.setText("Vaga");

        MarcaVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MarcaVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        MarcaVeiculo.setText("Marca do Veículo");

        CorVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CorVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        CorVeiculo.setText("Cor do Veículo");

        altRa.setEditable(false);

        altCpf.setEditable(false);

        altVaga.setEditable(false);

        botaoSalvar.setBackground(new java.awt.Color(0, 0, 102));
        botaoSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(alterarDados))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Curso)
                                            .addComponent(Senha))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(altSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(altCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Cpf)
                                            .addComponent(Ra)
                                            .addComponent(Email)
                                            .addComponent(Telefone))
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(altCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(altRa, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(altEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(altTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(87, 87, 87)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PlacaVeiculo)
                                            .addComponent(ModeloVeiculo)
                                            .addComponent(MarcaVeiculo)
                                            .addComponent(CorVeiculo)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(Vaga)
                                                .addGap(18, 18, 18)
                                                .addComponent(altVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(altModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(altMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(altPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(altCor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Nome)
                                .addGap(26, 26, 26)
                                .addComponent(altNome, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Funcao)
                                .addGap(19, 19, 19)
                                .addComponent(altFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoSalvar)
                                .addGap(79, 79, 79)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(alterarDados)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nome))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ra)
                            .addComponent(altRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cpf)
                            .addComponent(altCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MarcaVeiculo)
                            .addComponent(altMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModeloVeiculo)
                            .addComponent(altModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Email))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PlacaVeiculo)
                                    .addComponent(altPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CorVeiculo)
                            .addComponent(altCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Vaga)
                            .addComponent(altVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(altEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(altCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Telefone)
                                    .addComponent(altTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Senha)
                                    .addComponent(altSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(Curso)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Funcao)
                            .addComponent(altFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSalvar))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
       //botão para salvar alterações feitas pelo usuário no banco de dados
        try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    String url = "jdbc:mysql://localhost:3306/fatecparking";
    String usuario = "root";
    String senha = "";
    Connection connection = DriverManager.getConnection(url, usuario, senha);

   String comandoSQL = "UPDATE informacoes SET "
    + "nome = ?, "
    + "ra = ?, "
    + "email = ?, "
    + "telefone = ?, "
    + "senha = ?, "
    + "curso = ?, "
    + "funcao = ?, "
    + "marcaveiculo = ?, "
    + "modeloveiculo = ?, "
    + "placaveiculo = ?, "
    + "corveiculo = ?, "
    + "vaga = ? "
    + "WHERE cpf = ?";

java.sql.PreparedStatement preparedStatement = connection.prepareStatement(comandoSQL);

preparedStatement.setString(1, altNome.getText());
preparedStatement.setString(2, altRa.getText());
preparedStatement.setString(3, altEmail.getText());
preparedStatement.setString(4, altTelefone.getText());
preparedStatement.setString(5, altSenha.getText());
preparedStatement.setString(6, altCurso.getText());
preparedStatement.setString(7, altFuncao.getText());
preparedStatement.setString(8, altMarca.getText());
preparedStatement.setString(9, altModelo.getText());
preparedStatement.setString(10, altPlaca.getText());
preparedStatement.setString(11, altCor.getText());
preparedStatement.setString(12, altVaga.getText());
preparedStatement.setString(13, altCpf.getText());

int linhasAfetadas = preparedStatement.executeUpdate();

    if (linhasAfetadas > 0) {
        JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
    } else {
        JOptionPane.showMessageDialog(null, "Falha ao atualizar os dados.");
    }

    preparedStatement.close();
    connection.close();
} catch (ClassNotFoundException | SQLException e) {
    e.printStackTrace();
} 
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlterarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarDados(cpf).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorVeiculo;
    private javax.swing.JLabel Cpf;
    private javax.swing.JLabel Curso;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Funcao;
    private javax.swing.JLabel MarcaVeiculo;
    private javax.swing.JLabel ModeloVeiculo;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel PlacaVeiculo;
    private javax.swing.JLabel Ra;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Telefone;
    private javax.swing.JLabel Vaga;
    private javax.swing.JTextField altCor;
    private javax.swing.JTextField altCpf;
    private javax.swing.JTextField altCurso;
    private javax.swing.JTextField altEmail;
    private javax.swing.JTextField altFuncao;
    private javax.swing.JTextField altMarca;
    private javax.swing.JTextField altModelo;
    private javax.swing.JTextField altNome;
    private javax.swing.JTextField altPlaca;
    private javax.swing.JTextField altRa;
    private javax.swing.JTextField altSenha;
    private javax.swing.JTextField altTelefone;
    private javax.swing.JTextField altVaga;
    private javax.swing.JLabel alterarDados;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private static class PreparedStatement {

        public PreparedStatement() {
        }

        private void setString(int i, String text) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void close() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private int executeUpdate() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
