package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Funcionarios;
import br.com.projeto.model.Funcoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FuncoesDAO {
    
        private Connection con;
    
    public FuncoesDAO() {
        //Para abrir a conexão (Recebendo uma nova conexão)
        this.con = new ConnectionFactory().getConnection();  
}    
    
    //Cadastrar Função
     public void cadastrarFuncoes(Funcoes obj) {
        
        try {
            // 1º Criar comando SQL
            //Variável de conexão
            String sql = "insert into tb_funcoes (cargo, atividades) values (?,?)";
            
            // 2º Conectar o banco SQL e organizar o SQL (?)
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getCargo());
            stmt.setString(2, obj.getAtividades());
     
            
            //3º Executar o comando SQL
            stmt.execute();
            
            //Fechar Conexão
            stmt.close();
            
             JOptionPane.showMessageDialog(null, "Função Cadastrado com sucesso!", "Sistema sem nome ainda...",JOptionPane.INFORMATION_MESSAGE );

        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
            
        }
              
    }
    
    //Método Listar Funcionario
    public List<Funcoes> listarFuncoes() {
        
        try {
            
            //Criando a lista
            List<Funcoes> lista = new ArrayList<>();
            
            //Criando o comando SQL e executar
            String sql = "select * from tb_funcoes";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            //Enquanto percorre o rs => resultado select cria um objeto
            while(rs.next()) {
                
                  Funcoes obj = new Funcoes(); 
                //Montar o objeto
                obj.setCodigo(rs.getInt("id"));
                obj.setCargo(rs.getString("cargo"));
                obj.setAtividades(rs.getString("atividades"));
                                
                //Adicionando o objeto montado na lista
                lista.add(obj);              
                
            }
            
            return lista;
            
        } catch (SQLException erro) {
                        
             JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
             return null;
            
        }
    } 
    
    //Metodo Excluir Funcionario
     public void excluirFuncoes(Funcoes obj) {
        
         try {
            // 1º Criar comando SQL
            //Variável de conexão
            String sql = "delete from tb_funcoes where id = ?";
            
            // 2º Conectar o banco SQL e organizar o SQL (?)
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo()); 
            
            //3º Executar o comando SQL
            stmt.execute();
            
            //Fechar Conexão
            stmt.close();
            
             JOptionPane.showMessageDialog(null, "Excluido com sucesso!", "Sistema sem nome ainda...",JOptionPane.INFORMATION_MESSAGE );

        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
            
        }
         
    }  
     
     //Metodo Alterar Funcionario
    public void alterarFuncoes(Funcoes obj) {
        
         try {
            // 1º Criar comando SQL
            //Variável de conexão
            String sql = "update tb_funcoes set cargo=?, atividade=? where id=?";
            
            // 2º Conectar o banco SQL e organizar o SQL (?)
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getCargo());
            stmt.setString(2, obj.getAtividades());
             
            stmt.setInt(3, obj.getCodigo());
            
            //3º Executar o comando SQL
            stmt.execute();
            
            //Fechar Conexão
            stmt.close();
            
             JOptionPane.showMessageDialog(null, "Alterado com sucesso!", "Sistema sem nome ainda...",JOptionPane.INFORMATION_MESSAGE );

        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
            
        }
        
    }  
    
}
