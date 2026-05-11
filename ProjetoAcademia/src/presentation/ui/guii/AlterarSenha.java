package presentation.ui.guii;

public class AlterarSenha extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AlterarSenha.class.getName());

    public AlterarSenha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAlterarSenha = new javax.swing.JPanel();
        txtDigiteSenha = new javax.swing.JTextField();
        txtNovaPalavraPasse = new javax.swing.JTextField();
        txtConfirmarPasse = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAlterarPass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDigiteSenha.addActionListener(this::txtDigiteSenhaActionPerformed);

        txtNovaPalavraPasse.addActionListener(this::txtNovaPalavraPasseActionPerformed);

        txtConfirmarPasse.addActionListener(this::txtConfirmarPasseActionPerformed);

        jLabel4.setText("DIGITE A SENHA ");

        jLabel5.setText("CONFIRMAR NOVA PALAVRAR- PASSE ");

        jLabel6.setText("NOVA PALAVRA - PASSE ");

        btnAlterarPass.setText("ALTERAR PALAVRA-PASSE ");
        btnAlterarPass.addActionListener(this::btnAlterarPassActionPerformed);

        javax.swing.GroupLayout pnlAlterarSenhaLayout = new javax.swing.GroupLayout(pnlAlterarSenha);
        pnlAlterarSenha.setLayout(pnlAlterarSenhaLayout);
        pnlAlterarSenhaLayout.setHorizontalGroup(
            pnlAlterarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlterarSenhaLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAlterarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDigiteSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNovaPalavraPasse, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfirmarPasse, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlterarSenhaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterarPass)
                .addGap(123, 123, 123))
            .addGroup(pnlAlterarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAlterarSenhaLayout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addGroup(pnlAlterarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6))
                    .addContainerGap(301, Short.MAX_VALUE)))
        );
        pnlAlterarSenhaLayout.setVerticalGroup(
            pnlAlterarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlterarSenhaLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(txtDigiteSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNovaPalavraPasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAlterarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtConfirmarPasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnAlterarPass)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(pnlAlterarSenhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAlterarSenhaLayout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(jLabel4)
                    .addGap(27, 27, 27)
                    .addComponent(jLabel6)
                    .addContainerGap(239, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlAlterarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlAlterarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDigiteSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigiteSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDigiteSenhaActionPerformed

    private void txtNovaPalavraPasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNovaPalavraPasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNovaPalavraPasseActionPerformed

    private void txtConfirmarPasseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarPasseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarPasseActionPerformed

    private void btnAlterarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarPassActionPerformed

        // pega o texto escrito em cada campo
        String senhaAtual = txtDigiteSenha.getText();
        String novaSenha = txtNovaPalavraPasse.getText();
        String confirmarSenha = txtConfirmarPasse.getText();

        /**
         * length() verifica se o campo está vazio. Se o tamanho for 0 significa
         * que está vazio.
         */
        if (senhaAtual.length() == 0 || novaSenha.length() == 0 || confirmarSenha.length() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Preenche todos os campos!");
            return;
        }

        /**
         * indexOf() procura o texto da novaSenha dentro da confirmarSenha. Se o
         * resultado for -1 significa que não encontrou — as senhas são
         * diferentes. Se o resultado for 0 e o tamanho for igual — as senhas
         * são iguais.
         */
        if (novaSenha.indexOf(confirmarSenha) != 0 || novaSenha.length() != confirmarSenha.length()) {
            javax.swing.JOptionPane.showMessageDialog(this, "As senhas não coincidem!");
            return;
        }

        /**
         * length() retorna o número de caracteres da String. Verifica se a nova
         * senha tem pelo menos 6 caracteres.
         */
        if (novaSenha.length() < 6) {
            javax.swing.JOptionPane.showMessageDialog(this, "A senha tem de ter no mínimo 6 caracteres!");
            return;
        }

        try {
            // cria o objeto DAO que faz as operações na base de dados
            Servicoes.UtilizadorDAO daoUtilizador = new Servicoes.UtilizadorDAO();

            // pega o utilizador que está atualmente com sessão iniciada
            GestaoAcademia.Utilizador utilizadorAtual = GestaoAcademia.Sessao.getUtilizadorAtual();

            /**
             * indexOf() procura a senhaAtual dentro da password guardada na
             * sessão. Se o resultado for -1 significa que a senha atual está
             * errada.
             */
            String passwordGuardada = utilizadorAtual.getPassword();

            if (passwordGuardada.indexOf(senhaAtual) != 0 || passwordGuardada.length() != senhaAtual.length()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Senha atual incorreta!");
                return;
            }

            // atualiza a senha na base de dados
            daoUtilizador.alterarPassword(utilizadorAtual.getId(), novaSenha);

            // atualiza o objeto em memória para ficar consistente com a base de dados
            utilizadorAtual.setPassword(novaSenha);
            utilizadorAtual.setPrimeiroLogin(false);

            javax.swing.JOptionPane.showMessageDialog(this, "Senha alterada com sucesso!");

            /**
             * Redireciona para o painel correto consoante o tipo de utilizador.
             * eTreinador() verifica o tipo guardado na sessão atual.
             */
            if (GestaoAcademia.Sessao.eTreinador()) {
                new PainelTreinador().setVisible(true);
            } else {
                new PainelCliente().setVisible(true);
            }

            // fecha esta janela
            this.dispose();

        } catch (java.sql.SQLException erroBaseDados) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: " + erroBaseDados.getMessage());
        }
    }//GEN-LAST:event_btnAlterarPassActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new AlterarSenha().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarPass;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pnlAlterarSenha;
    private javax.swing.JTextField txtConfirmarPasse;
    private javax.swing.JTextField txtDigiteSenha;
    private javax.swing.JTextField txtNovaPalavraPasse;
    // End of variables declaration//GEN-END:variables
}
