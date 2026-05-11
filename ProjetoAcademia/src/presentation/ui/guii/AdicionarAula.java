
package presentation.ui.guii;

/**
 *
 * @author wende
 */
public class AdicionarAula extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdicionarAula.class.getName());

    /**
     * Creates new form CriarAula
     */
    public AdicionarAula() {
        initComponents();
        carregarTreinadores();
    }

   private void carregarTreinadores() {
    try {
        java.sql.Connection con = conexao.Conexao.getConexao();
        java.sql.ResultSet rs = con.createStatement().executeQuery(
            "SELECT t.id, u.nome FROM treinador t JOIN utilizador u ON t.utilizador_id = u.id");

        cmbTreinadores.removeAllItems();
        while (rs.next()) {
            cmbTreinadores.addItem(rs.getInt("id") + " - " + rs.getString("nome"));
        }
    } catch (java.sql.SQLException e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        txtAdicionarNomeAula = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtDuracao = new javax.swing.JTextField();
        txtCapacidadeMaxima = new javax.swing.JTextField();
        cmbTreinadores = new javax.swing.JComboBox<>();
        btnAdicionarDados = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAdicionarNomeAula.addActionListener(this::txtAdicionarNomeAulaActionPerformed);

        txtHora.addActionListener(this::txtHoraActionPerformed);

        txtDuracao.addActionListener(this::txtDuracaoActionPerformed);

        txtCapacidadeMaxima.addActionListener(this::txtCapacidadeMaximaActionPerformed);

        cmbTreinadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTreinadores.addActionListener(this::cmbTreinadoresActionPerformed);

        btnAdicionarDados.setText("GUARDAR");
        btnAdicionarDados.addActionListener(this::btnAdicionarDadosActionPerformed);

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        jLabel1.setText("Nome da Aula");

        jLabel2.setText("Hora");

        jLabel3.setText("Duração(minutos)");

        jLabel4.setText("Capacidade Máx:");

        jLabel5.setText("Treinador");

        jLabel6.setText("CRIAR NOVA AULA ");

        txtData.addActionListener(this::txtDataActionPerformed);

        jLabel7.setText("Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdicionarDados)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtData, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAdicionarNomeAula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(txtHora, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDuracao, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCapacidadeMaxima, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTreinadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdicionarNomeAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapacidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTreinadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarDados)
                    .addComponent(btnCancelar))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new PainelTreinador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtAdicionarNomeAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdicionarNomeAulaActionPerformed
       
    }//GEN-LAST:event_txtAdicionarNomeAulaActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        
    }//GEN-LAST:event_txtHoraActionPerformed

    private void txtDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracaoActionPerformed
       
    }//GEN-LAST:event_txtDuracaoActionPerformed

    private void txtCapacidadeMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadeMaximaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadeMaximaActionPerformed

    private void btnAdicionarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDadosActionPerformed
        
        try {
    // pega o treinador selecionado no combobox
    String treinadorSelecionado = cmbTreinadores.getSelectedItem().toString();

    // indexOf encontra a posição do " - " no texto
    int posicaoDoTraco = treinadorSelecionado.indexOf(" - ");

    // substring pega o texto desde o início até à posição do traço
    String idEmTexto = treinadorSelecionado.substring(0, posicaoDoTraco);

    // converte o texto para número
    int idDoTreinador = Integer.parseInt(idEmTexto);

    // pega os valores dos campos
    String nomeDaAula = txtAdicionarNomeAula.getText();
    String dataDaAula = txtData.getText();
    String horaDaAula = txtHora.getText();
    String duracaoDaAula = txtDuracao.getText();
    String capacidadeDaAula = txtCapacidadeMaxima.getText();

    // junta data e hora
    String dataEHoraDaAula = dataDaAula + " " + horaDaAula;

    // abre ligação à base de dados
    java.sql.Connection ligacaoBaseDados = conexao.Conexao.getConexao();
    java.sql.Statement statementAula = ligacaoBaseDados.createStatement();

    // insere a aula na base de dados
    statementAula.executeUpdate(
        "INSERT INTO aula (nome, data_hora_inicio, duracao, capacidade, treinador_id) VALUES ('"
        + nomeDaAula + "', '"
        + dataEHoraDaAula  + "', "
        + duracaoDaAula    + ", "
        + capacidadeDaAula + ", "
        + idDoTreinador    + ")"
    );

    javax.swing.JOptionPane.showMessageDialog(this, "Aula adicionada com sucesso!");
    this.dispose();

} catch (java.sql.SQLException erroBaseDados) {
    javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + erroBaseDados.getMessage());
}
    }//GEN-LAST:event_btnAdicionarDadosActionPerformed

    private void cmbTreinadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTreinadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTreinadoresActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

 
    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(() -> new AdicionarAula().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarDados;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbTreinadores;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JTextField txtAdicionarNomeAula;
    private javax.swing.JTextField txtCapacidadeMaxima;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
