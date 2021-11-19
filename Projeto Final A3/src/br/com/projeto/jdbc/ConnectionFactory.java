package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
   
    //Retorna um objeto do tipo connection    
    public Connection getConnection() {
        
        //Tratamento de erro
        try {
            
            //Classe da biblioteca SQL
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdprojeto","equipe6","123");          
            
            
        } catch (Exception erro) {
            
            throw new RuntimeException(erro);
            
        }
        
    }
    
}
