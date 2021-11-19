package br.com.projeto.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmMenu extends javax.swing.JFrame {

    public String usuarioLogado;
        
    public frmMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/Fundo.jpg"));

        Image image = icon.getImage();
        painel_desktop = new javax.swing.JDesktopPane() {

            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(),getHeight(),this);
            }

        };
        jPanel1 = new javax.swing.JPanel();
        lblusuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuCadastrarCliente = new javax.swing.JMenuItem();
        menuPesquisarClientes = new javax.swing.JMenuItem();
        menuFuncionario = new javax.swing.JMenu();
        menuCadastrarFuncionario = new javax.swing.JMenuItem();
        menuPesquisarFuncionario = new javax.swing.JMenuItem();
        menuFuncoes = new javax.swing.JMenu();
        menuVendasporCliente = new javax.swing.JMenuItem();
        menuConfiguracao = new javax.swing.JMenu();
        menuTrocadeUsuario = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema sem nome ainda");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblusuario.setForeground(new java.awt.Color(0, 102, 102));
        lblusuario.setText("Juliano Cesar Martins");

        jLabel2.setText("Usuário logado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(552, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painel_desktopLayout = new javax.swing.GroupLayout(painel_desktop);
        painel_desktop.setLayout(painel_desktopLayout);
        painel_desktopLayout.setHorizontalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painel_desktopLayout.setVerticalGroup(
            painel_desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_desktopLayout.createSequentialGroup()
                .addGap(0, 434, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientes.png"))); // NOI18N
        menuCliente.setText("Clientes");
        menuCliente.setMaximumSize(new java.awt.Dimension(140, 32767));

        menuCadastrarCliente.setText("Cadastrar Cliente");
        menuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarClienteActionPerformed(evt);
            }
        });
        menuCliente.add(menuCadastrarCliente);

        menuPesquisarClientes.setText("Pesquisar Cliente");
        menuPesquisarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarClientesActionPerformed(evt);
            }
        });
        menuCliente.add(menuPesquisarClientes);

        jMenuBar1.add(menuCliente);

        menuFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcionarios.png"))); // NOI18N
        menuFuncionario.setText("Funcionários");
        menuFuncionario.setMaximumSize(new java.awt.Dimension(140, 32767));

        menuCadastrarFuncionario.setText("Cadastrar Funcionário");
        menuCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarFuncionarioActionPerformed(evt);
            }
        });
        menuFuncionario.add(menuCadastrarFuncionario);

        menuPesquisarFuncionario.setText("Pesquisar Funcionário");
        menuPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPesquisarFuncionarioActionPerformed(evt);
            }
        });
        menuFuncionario.add(menuPesquisarFuncionario);

        jMenuBar1.add(menuFuncionario);

        menuFuncoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/funcoes.png"))); // NOI18N
        menuFuncoes.setText("Funcões");

        menuVendasporCliente.setText("Cadastro de Atividades");
        menuVendasporCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendasporClienteActionPerformed(evt);
            }
        });
        menuFuncoes.add(menuVendasporCliente);

        jMenuBar1.add(menuFuncoes);

        menuConfiguracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/configuracoes.png"))); // NOI18N
        menuConfiguracao.setText("Configurações");
        menuConfiguracao.setMaximumSize(new java.awt.Dimension(140, 32767));

        menuTrocadeUsuario.setText("Trocar de Usuários");
        menuTrocadeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTrocadeUsuarioActionPerformed(evt);
            }
        });
        menuConfiguracao.add(menuTrocadeUsuario);

        jMenuBar1.add(menuConfiguracao);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        menuSair.setText("Sair");
        menuSair.setMaximumSize(new java.awt.Dimension(140, 32767));
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel_desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Tela cheia
        this.setExtendedState(this.MAXIMIZED_BOTH);
        lblusuario.setText(usuarioLogado);
        this.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void menuTrocadeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTrocadeUsuarioActionPerformed
        //Trocar usuários
        
        frmLogin telalogin = new frmLogin();
        
        this.dispose();
        
        telalogin.setVisible(true);
    }//GEN-LAST:event_menuTrocadeUsuarioActionPerformed

    private void menuPesquisarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarClientesActionPerformed
        // Pesquisar Cliente             
        
        frmPesquisaCli tela = new frmPesquisaCli();  
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuPesquisarClientesActionPerformed

    private void menuPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPesquisarFuncionarioActionPerformed
               // Pesquisar Cliente        
        frmPesquisaFunc tela = new frmPesquisaFunc();        
        tela.setVisible(true);
    }//GEN-LAST:event_menuPesquisarFuncionarioActionPerformed

    private void menuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClienteActionPerformed
        // Cadastrar Cliente        
        frmClientes tela = new frmClientes();        
        tela.setVisible(true);
    }//GEN-LAST:event_menuCadastrarClienteActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        // Sair
        
        int op;
        
        op = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja sair?", "Sistema sem noome", JOptionPane.OK_CANCEL_OPTION);
        
        if(op == 0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarFuncionarioActionPerformed
                // Cadastrar Funcionarios             
        
        frmFuncionarios tela = new frmFuncionarios();  
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuCadastrarFuncionarioActionPerformed

    private void menuVendasporClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendasporClienteActionPerformed
        // Cadastar Funceos
        
            frmAtividades tela = new frmAtividades();  
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuVendasporClienteActionPerformed

     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblusuario;
    public javax.swing.JMenuItem menuCadastrarCliente;
    public javax.swing.JMenuItem menuCadastrarFuncionario;
    public javax.swing.JMenu menuCliente;
    public javax.swing.JMenu menuConfiguracao;
    public javax.swing.JMenu menuFuncionario;
    public javax.swing.JMenu menuFuncoes;
    public javax.swing.JMenuItem menuPesquisarClientes;
    public javax.swing.JMenuItem menuPesquisarFuncionario;
    public javax.swing.JMenu menuSair;
    public javax.swing.JMenuItem menuTrocadeUsuario;
    public javax.swing.JMenuItem menuVendasporCliente;
    private javax.swing.JDesktopPane painel_desktop;
    // End of variables declaration//GEN-END:variables
}