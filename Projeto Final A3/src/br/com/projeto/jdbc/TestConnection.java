package br.com.projeto.jdbc;

import javax.swing.JOptionPane;

public class TestConnection {
    
    public static void main(String[] args) {           
        //É necessário ter uma classe principal para executar
        
        try {
            //Java meu amor, cria uma nova conexão
            new ConnectionFactory().getConnection();
            
            //se der boa a conexão
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!", "Sistema sem nome ainda...",JOptionPane.INFORMATION_MESSAGE );
            
        } catch (Exception erro) {
            
            //se der ruim a conexão
            JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
            
        }
    }
}
