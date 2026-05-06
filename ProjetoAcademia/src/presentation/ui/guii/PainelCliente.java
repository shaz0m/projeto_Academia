
package presentation.ui.guii;

/**
 *
 * @author wende
 */
public class PainelCliente extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PainelCliente.class.getName());

    /**
     * Creates new form PainelCliente
     */
    public PainelCliente() {
        initComponents();
        carregarAulas();
       // inscreverNaAula();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAulasDisponiveis = new javax.swing.JTable();
        btnInscrever = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblAulasDisponiveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Data/Hora ", "Duração", "Vagas", "Treinador "
            }
        ));
        jScrollPane1.setViewportView(tblAulasDisponiveis);
        if (tblAulasDisponiveis.getColumnModel().getColumnCount() > 0) {
            tblAulasDisponiveis.getColumnModel().getColumn(3).setHeaderValue("Vagas");
            tblAulasDisponiveis.getColumnModel().getColumn(4).setHeaderValue("Treinador ");
        }

        btnInscrever.setText("INSCREVER");
        btnInscrever.addActionListener(this::btnInscreverActionPerformed);

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        jLabel1.setText("AULAS DISPONIVEIS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInscrever)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addGap(108, 108, 108)))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscrever, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInscreverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscreverActionPerformed
        int linha = tblAulasDisponiveis.getSelectedRow();

    if (linha == -1) {
        javax.swing.JOptionPane.showMessageDialog(null, "Seleciona uma aula!");
        return;
    }

    String nomeAula = tblAulasDisponiveis.getValueAt(linha, 0).toString();

    try {
        
        java.sql.Connection ligacao = conexao.Conexao.getConexao();
        java.sql.Statement stmt = ligacao.createStatement();

        java.sql.ResultSet rsAula = stmt.executeQuery("SELECT id FROM aula WHERE nome = '" + nomeAula + "'");
        rsAula.next();
        int aulaId = rsAula.getInt("id");

        GestaoAcademia.Utilizador u = GestaoAcademia.Sessao.getUtilizadorAtual();

        java.sql.ResultSet rsCliente = stmt.executeQuery("SELECT id FROM cliente WHERE utilizador_id = " + u.getId());
        rsCliente.next();
        int clienteId = rsCliente.getInt("id");

        stmt.executeUpdate("INSERT INTO inscricao (cliente_id, aula_id, data_inscricao) VALUES (" + clienteId + ", " + aulaId + ", NOW())");

        javax.swing.JOptionPane.showMessageDialog(null, "Inscrito com sucesso: " + nomeAula);

    } catch (java.sql.SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
    }
    }//GEN-LAST:event_btnInscreverActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

 
    /**
 * Carrega as aulas disponíveis da base de dados e mostra na tabela.
 */
private void carregarAulas() {
    try {
        java.sql.Connection ligacao = conexao.Conexao.getConexao();
        java.sql.Statement stmt = ligacao.createStatement();
        java.sql.ResultSet rs = stmt.executeQuery("SELECT a.nome, a.data_hora_inicio, a.duracao, a.capacidade, u.username FROM aula a JOIN treinador t ON a.treinador_id = t.id JOIN utilizador u ON t.utilizador_id = u.id");

        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
            new String[]{"Nome", "Data/Hora", "Duração", "Vagas", "Treinador"}, 0);

        while (rs.next()) {
            modelo.addRow(new Object[]{
                rs.getString("nome"),
                rs.getString("data_hora_inicio"),
                rs.getInt("duracao"),
                rs.getInt("capacidade"),
                rs.getString("username")
            });
        }

        tblAulasDisponiveis.setModel(modelo);

    } catch (java.sql.SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
    }
}

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new PainelCliente().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInscrever;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAulasDisponiveis;
    // End of variables declaration//GEN-END:variables
}
