/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package InterfacesGraficas;
/*importar a classe principal de cadastro*/
import dadoseclasses.CadastroProduto;
import InterfacesGraficas.ModalCadastroProd;
import dadoseclasses.TabelaProdutos;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class TelaMatriz extends javax.swing.JFrame {
    /*importar a classe onde está  a  tabela*/
    public TabelaProdutos TabelaModelo;

    public TelaMatriz() {
        initComponents();
        /*aqui esotu instanciando a classe da tabela*/
        TabelaModelo = new TabelaProdutos();
        /*Aqui esotu estabelecendo vinculo na tabela criada na interface com a classe tabela de cadastro do produto*/
        this.TABELA.setModel(TabelaModelo);
        
    }

    public void AdicionarProduto(CadastroProduto cad){
        /*aqui importando o metodo adicionar*/
        TabelaModelo.Adicionar(cad);
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        BotaoNovo = new javax.swing.JButton();
        BotaoAlterar = new javax.swing.JButton();
        BotaoInativar = new javax.swing.JButton();
        BotaoAtivar = new javax.swing.JButton();
        TextoCodigo = new javax.swing.JLabel();
        TextoProduto = new javax.swing.JLabel();
        TextoCodigoBarras = new javax.swing.JLabel();
        TextoUN = new javax.swing.JLabel();
        TextoProdutoAtivo = new javax.swing.JLabel();
        BotaoPesquisar = new javax.swing.JButton();
        BotaoLimpar = new javax.swing.JButton();
        jTextField1Codigo = new javax.swing.JTextField();
        jTextField2Produto = new javax.swing.JTextField();
        jTextField3CodBarras = new javax.swing.JTextField();
        jTextField4UN = new javax.swing.JTextField();
        BotaoProdutoAtivoSim = new javax.swing.JRadioButton();
        BotaoProdutoAtivoNao = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABELA = new javax.swing.JTable();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoNovo.setText("Novo");
        BotaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovoActionPerformed(evt);
            }
        });

        BotaoAlterar.setText("Alterar");
        BotaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarActionPerformed(evt);
            }
        });

        BotaoInativar.setText("Inativar");

        BotaoAtivar.setText("Ativar");

        TextoCodigo.setText("Cód:");

        TextoProduto.setText("Produto:");

        TextoCodigoBarras.setText("Código Barras:");

        TextoUN.setText("UN:");

        TextoProdutoAtivo.setText("Produto Ativo?");

        BotaoPesquisar.setText("Pesquisar");

        BotaoLimpar.setText("Limpar");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        BotaoProdutoAtivoSim.setText("Sim");
        BotaoProdutoAtivoSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProdutoAtivoSimActionPerformed(evt);
            }
        });

        BotaoProdutoAtivoNao.setText("Não");
        BotaoProdutoAtivoNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoProdutoAtivoNaoActionPerformed(evt);
            }
        });

        jTextField5.setText("Imprimir");

        TABELA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TABELA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoNovo)
                            .addComponent(TextoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(BotaoAlterar)
                        .addGap(119, 119, 119)
                        .addComponent(BotaoInativar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(BotaoAtivar))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoCodigoBarras)
                                    .addComponent(jTextField3CodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoUN)
                                    .addComponent(jTextField4UN, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoProdutoAtivo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotaoProdutoAtivoSim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotaoProdutoAtivoNao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 862, Short.MAX_VALUE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jTextField1Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextoProduto)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BotaoPesquisar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoNovo)
                    .addComponent(BotaoInativar)
                    .addComponent(BotaoAtivar)
                    .addComponent(BotaoAlterar))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TextoCodigo)
                                .addComponent(TextoProduto)
                                .addComponent(TextoProdutoAtivo))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BotaoPesquisar)
                                .addComponent(BotaoLimpar)
                                .addComponent(jTextField1Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BotaoProdutoAtivoSim)
                                .addComponent(BotaoProdutoAtivoNao)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TextoUN)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField4UN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoCodigoBarras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3CodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovoActionPerformed
        ModalCadastroProd cad = new ModalCadastroProd(this);
        cad.setVisible(true);
    }//GEN-LAST:event_BotaoNovoActionPerformed

    private void BotaoProdutoAtivoSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProdutoAtivoSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoProdutoAtivoSimActionPerformed

    private void BotaoProdutoAtivoNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoProdutoAtivoNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoProdutoAtivoNaoActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        /*aqui chamamos o metodo remover e passamos o parametro tabela atual com função getSelectedRow*/
        TabelaModelo.Remover(this.TABELA.getSelectedRow());
        
    }//GEN-LAST:event_BotaoLimparActionPerformed
    
    private void BotaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarActionPerformed
        /*sempre instanciar a classe principal*/
        CadastroProduto produto = new CadastroProduto();
        /*aqui estamos atribuindo um valor a instânica/classe com a linha selecionada */
        produto = TabelaModelo.selectproduto(this.TABELA.getSelectedRow());
        /* aqui estamos instanciando a tela de cadastro de produto com parÂmetro esta interface*/
        ModalCadastroProd cad = new ModalCadastroProd(this);
        cad.preencherproduto(produto);
       // produto = TabelaModelo.selectproduto(this.TABELA.getSelectedRow());
        cad.setVisible(true);
    }//GEN-LAST:event_BotaoAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMatriz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoAtivar;
    private javax.swing.JButton BotaoInativar;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JButton BotaoNovo;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JRadioButton BotaoProdutoAtivoNao;
    private javax.swing.JRadioButton BotaoProdutoAtivoSim;
    private javax.swing.JTable TABELA;
    private javax.swing.JLabel TextoCodigo;
    private javax.swing.JLabel TextoCodigoBarras;
    private javax.swing.JLabel TextoProduto;
    private javax.swing.JLabel TextoProdutoAtivo;
    private javax.swing.JLabel TextoUN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1Codigo;
    private javax.swing.JTextField jTextField2Produto;
    private javax.swing.JTextField jTextField3CodBarras;
    private javax.swing.JTextField jTextField4UN;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
