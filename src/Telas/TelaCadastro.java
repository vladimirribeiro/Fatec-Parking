
package Telas;
import Banco.Dados;
import Banco.Usuario;
public class TelaCadastro extends javax.swing.JFrame {

    
    public static Usuario u;
    private Dados d;  
    private TelaVagas vaga;
    public TelaCadastro() {
        initComponents();
        u = new Usuario();
        d = new Dados();
        vaga = new TelaVagas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Cadastro = new javax.swing.JLabel();
        Nome = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        campoCPF = new javax.swing.JTextField();
        RA = new javax.swing.JLabel();
        campoRA = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JTextField();
        Curso = new javax.swing.JLabel();
        Funcao = new javax.swing.JLabel();
        Marca = new javax.swing.JLabel();
        Modelo = new javax.swing.JLabel();
        campoModelo = new javax.swing.JTextField();
        Placa = new javax.swing.JLabel();
        campoPlaca = new javax.swing.JTextField();
        Proximo = new javax.swing.JButton();
        Cor = new javax.swing.JLabel();
        campoCor = new javax.swing.JTextField();
        campoCurso = new javax.swing.JTextField();
        campoFuncao = new javax.swing.JTextField();
        campoMarca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(3, 1, 57));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fatec Parking 7.png"))); // NOI18N

        Cadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cadastro.setForeground(new java.awt.Color(255, 255, 255));
        Cadastro.setText("Cadastro");

        Nome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nome.setForeground(new java.awt.Color(255, 255, 255));
        Nome.setText("Nome");

        CPF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CPF.setForeground(new java.awt.Color(255, 255, 255));
        CPF.setText("CPF");

        RA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RA.setForeground(new java.awt.Color(255, 255, 255));
        RA.setText("RA");

        Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email");

        Telefone.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Telefone.setForeground(new java.awt.Color(255, 255, 255));
        Telefone.setText("Telefone");

        Senha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Senha.setForeground(new java.awt.Color(255, 255, 255));
        Senha.setText("Definir Senha");

        Curso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Curso.setForeground(new java.awt.Color(255, 255, 255));
        Curso.setText("Curso");

        Funcao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Funcao.setForeground(new java.awt.Color(255, 255, 255));
        Funcao.setText("Função");

        Marca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Marca.setForeground(new java.awt.Color(255, 255, 255));
        Marca.setText("Marca do Veículo");

        Modelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Modelo.setForeground(new java.awt.Color(255, 255, 255));
        Modelo.setText("Modelo do Veículo");

        Placa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Placa.setForeground(new java.awt.Color(255, 255, 255));
        Placa.setText("Placa do Veículo");

        Proximo.setBackground(new java.awt.Color(0, 0, 102));
        Proximo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Proximo.setForeground(new java.awt.Color(255, 255, 255));
        Proximo.setText("Próximo");
        Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProximoActionPerformed(evt);
            }
        });

        Cor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cor.setForeground(new java.awt.Color(255, 255, 255));
        Cor.setText("Cor do Veículo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Cadastro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Telefone)
                                .addComponent(Email)
                                .addComponent(RA)
                                .addComponent(Nome)
                                .addComponent(CPF)
                                .addComponent(campoCPF)
                                .addComponent(campoRA)
                                .addComponent(campoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Senha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Curso)
                                    .addComponent(campoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Funcao)
                                    .addComponent(campoFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Marca)
                            .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Placa)
                                    .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Proximo)
                                            .addComponent(Cor)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(campoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Modelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(87, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Cadastro)
                        .addGap(18, 18, 18)
                        .addComponent(Nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(CPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(Email)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Telefone)
                            .addComponent(Modelo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Marca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Senha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Placa)
                            .addComponent(Cor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Curso)
                    .addComponent(Funcao))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(Proximo)
                        .addGap(55, 55, 55))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProximoActionPerformed
       // recebe os dados inseridos e guarda-os para terminar o cadastro
                vaga.setVisible(true);
                
                u.setNome(campoNome.getText());
                u.setCpf(campoCPF.getText());
                u.setRa(campoRA.getText());
                u.setEmail(campoEmail.getText());
                u.setTelefone(campoTelefone.getText());
                u.setSenha(campoSenha.getText());
                u.setCurso(campoCurso.getText());
                u.setFuncao(campoFuncao.getText());
                u.setMarcaveiculo(campoMarca.getText());
                u.setModeloveiculo(campoModelo.getText());
                u.setPlacaveiculo(campoPlaca.getText());
                u.setCorveiculo(campoCor.getText());
                System.out.println(u.getNome());
                System.out.println(u.getCpf());
                System.out.println(u.getRa());
                System.out.println(u.getEmail());
                System.out.println(u.getTelefone());
                System.out.println(u.getSenha());
                System.out.println(u.getCurso());
                System.out.println(u.getFuncao());
                System.out.println(u.getMarcaveiculo());
                System.out.println(u.getModeloveiculo());
                System.out.println(u.getPlacaveiculo());
                System.out.println(u.getCorveiculo());
    }//GEN-LAST:event_ProximoActionPerformed


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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Cadastro;
    private javax.swing.JLabel Cor;
    private javax.swing.JLabel Curso;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Funcao;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Marca;
    private javax.swing.JLabel Modelo;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Placa;
    private javax.swing.JButton Proximo;
    private javax.swing.JLabel RA;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Telefone;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoCor;
    private javax.swing.JTextField campoCurso;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoFuncao;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JTextField campoRA;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
