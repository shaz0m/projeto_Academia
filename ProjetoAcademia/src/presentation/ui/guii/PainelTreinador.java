package presentation.ui.guii;

public class PainelTreinador extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(PainelTreinador.class.getName());

    public PainelTreinador() {
        initComponents();
        carregarAulas();
        carregarClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovoClientes = new javax.swing.JButton();
        btnAdicionarAula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTodasAulas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientesRegistrados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRemoverClientes = new javax.swing.JButton();
        btnRemoverAula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNovoClientes.setText("NOVO CLIENTE ");
        btnNovoClientes.addActionListener(this::btnNovoClientesActionPerformed);

        btnAdicionarAula.setText("ADICIONAR AULA");
        btnAdicionarAula.addActionListener(this::btnAdicionarAulaActionPerformed);

        tblTodasAulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Data/Hora ", "Duração", "Vagas", "Inscritos  ", "Estado "
            }
        ));
        jScrollPane1.setViewportView(tblTodasAulas);
        if (tblTodasAulas.getColumnModel().getColumnCount() > 0) {
            tblTodasAulas.getColumnModel().getColumn(0).setHeaderValue("Nome");
            tblTodasAulas.getColumnModel().getColumn(1).setHeaderValue("Data/Hora ");
            tblTodasAulas.getColumnModel().getColumn(2).setHeaderValue("Duração");
        }

        tblClientesRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Email  ", "Telefone", "Inscrições "
            }
        ));
        jScrollPane2.setViewportView(tblClientesRegistrados);

        jLabel1.setText("CLIENTES REGISTRADOS");

        jLabel2.setText("TODAS AS AULAS");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(this::btnCancelarActionPerformed);

        btnRemoverClientes.setText("Remover Cliente");
        btnRemoverClientes.addActionListener(this::btnRemoverClientesActionPerformed);

        btnRemoverAula.setText("Remover Aula");
        btnRemoverAula.addActionListener(this::btnRemoverAulaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovoClientes)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionarAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemoverClientes)
                            .addComponent(btnRemoverAula))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoClientes)
                    .addComponent(btnAdicionarAula)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnRemoverAula)))
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRemoverClientes)
                        .addGap(118, 118, 118))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAdicionarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAulaActionPerformed
        new AdicionarAula().setVisible(true);
    }//GEN-LAST:event_btnAdicionarAulaActionPerformed

    private void btnRemoverAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverAulaActionPerformed

        int linha = tblTodasAulas.getSelectedRow();

        if (linha == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleciona uma aula!");
            return;
        }

        try {
            java.sql.Connection con = conexao.Conexao.getConexao();
            String nome = tblTodasAulas.getValueAt(linha, 0).toString();

            //apaga as inscrições dessa aula
            java.sql.PreparedStatement ps1 = con.prepareStatement("DELETE FROM inscricao WHERE aula_id = (SELECT id FROM aula WHERE nome = ?)");
            ps1.setString(1, nome);
            ps1.executeUpdate();

            // apaga a aula
            java.sql.PreparedStatement ps2 = con.prepareStatement("DELETE FROM aula WHERE nome = ?");
            ps2.setString(1, nome);
            ps2.executeUpdate();

            carregarAulas();
        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnRemoverAulaActionPerformed

    private void btnRemoverClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverClientesActionPerformed

        // pega a linha selecionada na tabela
        int linha = tblClientesRegistrados.getSelectedRow();

        // se nenhuma linha foi selecionada, avisa e para
        if (linha == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Seleciona um cliente!");
            return;
        }

        // pega o email do cliente selecionado
        String email = tblClientesRegistrados.getValueAt(linha, 1).toString();

        try {
            // conecta à base de dados
            java.sql.Connection con = conexao.Conexao.getConexao();

            // apaga as inscrições do cliente
            java.sql.PreparedStatement ps1 = con.prepareStatement(
                    "DELETE FROM inscricao WHERE cliente_id = (SELECT id FROM cliente WHERE email = ?)");
            ps1.setString(1, email);
            ps1.executeUpdate();

            // apaga o cliente
            java.sql.PreparedStatement ps2 = con.prepareStatement(
                    "DELETE FROM cliente WHERE email = ?");
            ps2.setString(1, email);
            ps2.executeUpdate();

            // atualiza a tabela
            carregarClientes();

        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }//GEN-LAST:event_btnRemoverClientesActionPerformed

    private void btnNovoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClientesActionPerformed
        new AdicionarCliente().setVisible(true);
    }//GEN-LAST:event_btnNovoClientesActionPerformed
    private void carregarClientes() {
        try {
            java.sql.Connection con = conexao.Conexao.getConexao();

            // Parâmetro: query SQL com LEFT JOIN e COUNT
            // Âmbito: método privado — só acessível dentro de PainelTreinador (encapsulamento)
            java.sql.ResultSet rs = con.createStatement().executeQuery(
                    "SELECT c.nome, c.email, c.telefone, COUNT(i.id) AS inscricoes "
                    + "FROM cliente c "
                    + "LEFT JOIN inscricao i ON c.id = i.cliente_id "
                    + "GROUP BY c.id, c.nome, c.email, c.telefone");

            // DefaultTableModel — objeto que serve de modelo de dados para a JTable
            javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                    new String[]{"Nome", "Email", "Telefone", "Inscrições"}, 0);

            // Iteração sobre o ResultSet — cada linha da BD torna-se uma linha na tabela
            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("nome"),
                    rs.getString("email"),
                    rs.getString("telefone"),
                    rs.getInt("inscricoes")
                });
            }
            /*
         Encapsulamento - tblClientesRegistrados é privado, só alterado por este método
             */

            tblClientesRegistrados.setModel(modelo);

        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }

    private void carregarAulas() {
        try {
            java.sql.Connection con = conexao.Conexao.getConexao();

            java.sql.ResultSet rs = con.createStatement().executeQuery(
                    "SELECT a.nome, a.data_hora_inicio, a.duracao, a.capacidade, "
                    + "COUNT(i.id) AS inscritos "
                    + "FROM aula a "
                    + "LEFT JOIN inscricao i ON a.id = i.aula_id "
                    + "GROUP BY a.id, a.nome, a.data_hora_inicio, a.duracao, a.capacidade");

            javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(
                    new String[]{"Nome", "Data/Hora", "Duração", "Vagas", "Inscritos", "Estado"}, 0);

            while (rs.next()) {
                int vagas = rs.getInt("capacidade");
                int inscritos = rs.getInt("inscritos");
                String estado;

                if (inscritos >= vagas) {
                    estado = "Lotada";
                } else {
                    estado = "Disponivel";
                }

                modelo.addRow(new Object[]{
                    rs.getString("nome"),
                    rs.getString("data_hora_inicio"),
                    rs.getInt("duracao"),
                    vagas,
                    inscritos,
                    estado
                });
            }

            tblTodasAulas.setModel(modelo);

        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new PainelTreinador().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarAula;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovoClientes;
    private javax.swing.JButton btnRemoverAula;
    private javax.swing.JButton btnRemoverClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblClientesRegistrados;
    private javax.swing.JTable tblTodasAulas;
    // End of variables declaration//GEN-END:variables
}
