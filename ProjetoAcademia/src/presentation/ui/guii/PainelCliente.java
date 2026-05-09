
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
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInscrever)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addGap(108, 108, 108))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel1)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
   
      /**
     * getSelectedRow() devolve o número da linha selecionada.
     * Se nenhuma linha estiver selecionada devolve -1.
     */
    int linhaSelecionada = tblAulasDisponiveis.getSelectedRow();

    if (linhaSelecionada == -1) {
        javax.swing.JOptionPane.showMessageDialog(null, "Seleciona uma aula!");
        return;
    }

    /**
     * getValueAt() pega o valor de uma célula da tabela.
     * Coluna 0 é a coluna do Nome da aula.
     * trim() remove espaços em branco no início e no fim.
     */
    String nomeAulaEscolhida = tblAulasDisponiveis.getValueAt(linhaSelecionada, 0).toString().trim();

    try {
        // abre ligação à base de dados
        java.sql.Connection ligacaoBaseDados = conexao.Conexao.getConexao();

        /**
         * PROCURAR O ID DA AULA.
         * LIKE '% %' procura o nome mesmo que esteja truncado na tabela visual.
         */
        java.sql.Statement statementAula = ligacaoBaseDados.createStatement();
        java.sql.ResultSet resultadoAula = statementAula.executeQuery(
            "SELECT id FROM aula WHERE nome LIKE '%" + nomeAulaEscolhida + "%'");

        /**
         * next() avança para a próxima linha do ResultSet.
         * Se retornar false significa que a query não encontrou nenhum resultado.
         */
        if (!resultadoAula.next()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Aula não encontrada! Nome buscado: [" + nomeAulaEscolhida + "]");
            return;
        }
        int idDaAula = resultadoAula.getInt("id");

        /**
         * PROCURAR O ID DO CLIENTE.
         * getUtilizadorAtual() devolve o utilizador que fez login.
         * getId() devolve o id desse utilizador.
         */
        GestaoAcademia.Utilizador utilizadorAtual = GestaoAcademia.Sessao.getUtilizadorAtual();

        java.sql.Statement statementCliente = ligacaoBaseDados.createStatement();
        java.sql.ResultSet resultadoCliente = statementCliente.executeQuery(
            "SELECT id FROM cliente WHERE utilizador_id = " + utilizadorAtual.getId());

        if (!resultadoCliente.next()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Cliente não encontrado! ID utilizador: [" + utilizadorAtual.getId() + "]");
            return;
        }
        int idDoCliente = resultadoCliente.getInt("id");

        /**
         * INSERIR A INSCRIÇÃO.
         * NOW() é uma função do MySQL que insere a data e hora atual.
         */
        java.sql.Statement statementInscricao = ligacaoBaseDados.createStatement();
        statementInscricao.executeUpdate(
            "INSERT INTO inscricao (cliente_id, aula_id, data_inscricao) VALUES ("
            + idDoCliente + ", " + idDaAula + ", NOW())");

        javax.swing.JOptionPane.showMessageDialog(null, "Inscrito com sucesso: " + nomeAulaEscolhida);

    } catch (java.sql.SQLException erroBaseDados) {
        javax.swing.JOptionPane.showMessageDialog(null, "Erro: " + erroBaseDados.getMessage());
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
        // abre ligação à base de dados
        java.sql.Connection ligacaoBaseDados = conexao.Conexao.getConexao();

        // cria o statement para executar a query
        java.sql.Statement statementAulas = ligacaoBaseDados.createStatement();

        // busca todas as aulas com o nome do treinador
        java.sql.ResultSet resultadoAulas = statementAulas.executeQuery(
            "SELECT a.nome, a.data_hora_inicio, a.duracao, a.capacidade, u.username " +
            "FROM aula a " +
            "JOIN treinador t ON a.treinador_id = t.id " +
            "JOIN utilizador u ON t.utilizador_id = u.id");

        /**
         * DefaultTableModel é o objeto que guarda os dados da tabela visual.
         * Cada linha do ResultSet torna-se uma linha na tabela.
         */
        javax.swing.table.DefaultTableModel modeloTabela = new javax.swing.table.DefaultTableModel(
            new String[]{"Nome", "Data/Hora", "Duração", "Vagas", "Treinador"}, 0);

        // percorre os resultados e adiciona cada linha à tabela
        while (resultadoAulas.next()) {
            modeloTabela.addRow(new Object[]{
                resultadoAulas.getString("nome"),
                resultadoAulas.getString("data_hora_inicio"),
                resultadoAulas.getInt("duracao"),
                resultadoAulas.getInt("capacidade"),
                resultadoAulas.getString("username")
            });
        }

        // aplica o modelo à tabela visual
        tblAulasDisponiveis.setModel(modeloTabela);

    } catch (java.sql.SQLException erroBaseDados) {
        javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + erroBaseDados.getMessage());
    }
}

    public static void main(String args[]) {
     
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
