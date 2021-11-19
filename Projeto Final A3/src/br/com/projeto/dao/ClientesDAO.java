package br.com.projeto.dao;

import br.com.projeto.model.Clientes;
import br.com.projeto.jdbc.ConnectionFactory;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClientesDAO {
    
    private Connection con;
    
    public ClientesDAO() {
        //Para abrir a conexão (Recebendo uma nova conexão)
        this.con = new ConnectionFactory().getConnection();
}
      
    //Método Cadastrar Cliente
    public void cadastrarCliente(Clientes obj) {
        
        try {
            // 1º Criar comando SQL
            //Variável de conexão
            String sql = "insert into tb_clientes (nome, rg, cpf, email, telefone, celular, cep, endereco, numero, complemento, bairro, cidade, estado"
                       + ") values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            // 2º Conectar o banco SQL e organizar o SQL (?)
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getEstado());
            
            //3º Executar o comando SQL
            stmt.execute();
            
            //Fechar Conexão
            stmt.close();
            
             JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso!", "Sistema sem nome ainda...",JOptionPane.INFORMATION_MESSAGE );

        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
            
        }
    }

    //Método Alterar Cliente
    public void alterarCliente(Clientes obj) {
        
         try {
            // 1º Criar comando SQL
            //Variável de conexão
            String sql = "update tb_clientes set nome=?, rg=?, cpf=?, email=?, telefone=?, celular=?, cep=?, endereco=?, numero=?, "
                       + "complemento=?, bairro=?, cidade=?, estado=? where id=?";
            
            // 2º Conectar o banco SQL e organizar o SQL (?)
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getTelefone());
            stmt.setString(6, obj.getCelular());
            stmt.setString(7, obj.getCep());
            stmt.setString(8, obj.getEndereco());
            stmt.setInt(9, obj.getNumero());
            stmt.setString(10, obj.getComplemento());
            stmt.setString(11, obj.getBairro());
            stmt.setString(12, obj.getCidade());
            stmt.setString(13, obj.getEstado());
            
            stmt.setInt(14, obj.getId());
            
            //3º Executar o comando SQL
            stmt.execute();
            
            //Fechar Conexão
            stmt.close();
            
             JOptionPane.showMessageDialog(null, "Alterado com sucesso!", "Sistema sem nome ainda...",JOptionPane.INFORMATION_MESSAGE );

        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
            
        }
        
    }

    //Método Excluir Cliente
    public void excluirCliente(Clientes obj) {
        
         try {
            // 1º Criar comando SQL
            //Variável de conexão
            String sql = "delete from tb_clientes where id = ?";
            
            // 2º Conectar o banco SQL e organizar o SQL (?)
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId()); 
            
            //3º Executar o comando SQL
            stmt.execute();
            
            //Fechar Conexão
            stmt.close();
            
             JOptionPane.showMessageDialog(null, "Excluido com sucesso!", "Sistema sem nome ainda...",JOptionPane.INFORMATION_MESSAGE );

        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
            
        }
         
    }
    
    //Método Listar Cliente
    public List<Clientes> listarCliente() {
        
        try {
            
            //Criando a lista
            List<Clientes> lista = new ArrayList<>();
            
            //Criando o comando SQL e executar
            String sql = "select * from tb_clientes";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            //Enquanto percorre o rs => resultado select cria um objeto
            while(rs.next()) {
                
                Clientes obj = new Clientes(); 
                //Montar o objeto
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
                
                //Adicionando o objeto montado na lista
                lista.add(obj);              
                
            }
            
            return lista;
            
        } catch (SQLException erro) {
                        
             JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
             return null;
            
        }
    }
    
    //Buscar cliente pelo CPF
    public List<Clientes> buscaCliente(String nome) {
        
        try {
            
            //Criando a lista
            List<Clientes> lista = new ArrayList<>();
            
            //Criando o comando SQL e executar
            String sql = "select * from tb_clientes where nome like ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            //Enquanto percorre o rs => resultado select cria um objeto
            while(rs.next()) {
                
                Clientes obj = new Clientes(); 
                //Montar o objeto
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                obj.setTelefone(rs.getString("telefone"));
                obj.setCelular(rs.getString("celular"));
                obj.setCep(rs.getString("cep"));
                obj.setEndereco(rs.getString("endereco"));
                obj.setNumero(rs.getInt("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCidade(rs.getString("cidade"));
                obj.setEstado(rs.getString("estado"));
                
                //Adicionando o objeto montado na lista
                lista.add(obj);              
                
            }
            
            return lista;
            
        } catch (SQLException erro) {
                        
             JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
             return null;
            
        }
    }    
    
}
