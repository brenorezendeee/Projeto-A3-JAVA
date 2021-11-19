package br.com.projeto.dao;

import br.com.projeto.jdbc.ConnectionFactory;
import br.com.projeto.model.Funcionarios;
import br.com.projeto.view.frmMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class FuncionariosDAO {
    
    private Connection con;
    
    public FuncionariosDAO() {
        //Para abrir a conexão (Recebendo uma nova conexão)
        this.con = new ConnectionFactory().getConnection();  
}
    
    //Metodo cadastrar Funcionarios
    public void cadastrarFuncionarios(Funcionarios obj) {
        
        try {
            // 1º Criar comando SQL
            //Variável de conexão
            String sql = "insert into tb_funcionarios (nome, rg, cpf, email, senha, cargo, nivel_acesso, telefone, "
                       + "celular, cep, endereco, numero, complemento, bairro, cidade, estado"
                       + ") values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            // 2º Conectar o banco SQL e organizar o SQL (?)
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel_acesso());
            
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getEstado());
            
            //3º Executar o comando SQL
            stmt.execute();
            
            //Fechar Conexão
            stmt.close();
            
             JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com sucesso!", "Sistema sem nome ainda...",JOptionPane.INFORMATION_MESSAGE );

        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
            
        }
              
    }
    
    //Metodo Alterar Funcionario
    public void alterarFuncionarios(Funcionarios obj) {
        
         try {
            // 1º Criar comando SQL
            //Variável de conexão
            String sql = "update tb_funcionarios set nome=?, rg=?, cpf=?, email=?, senha=?, cargo=?, nivel_acesso=?, telefone=?, celular=?, cep=?, endereco=?, numero=?, "
                       + "complemento=?, bairro=?, cidade=?, estado=? where id=?";
            
            // 2º Conectar o banco SQL e organizar o SQL (?)
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getRg());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            
            stmt.setString(5, obj.getSenha());
            stmt.setString(6, obj.getCargo());
            stmt.setString(7, obj.getNivel_acesso());
            
            stmt.setString(8, obj.getTelefone());
            stmt.setString(9, obj.getCelular());
            stmt.setString(10, obj.getCep());
            stmt.setString(11, obj.getEndereco());
            stmt.setInt(12, obj.getNumero());
            stmt.setString(13, obj.getComplemento());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getCidade());
            stmt.setString(16, obj.getEstado());
            
            stmt.setInt(17, obj.getId());
            
            //3º Executar o comando SQL
            stmt.execute();
            
            //Fechar Conexão
            stmt.close();
            
             JOptionPane.showMessageDialog(null, "Alterado com sucesso!", "Sistema sem nome ainda...",JOptionPane.INFORMATION_MESSAGE );

        } catch (SQLException erro) {
            
             JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
            
        }
        
    }  
    
    //Metodo Excluir Funcionario
     public void excluirFuncionarios(Funcionarios obj) {
        
         try {
            // 1º Criar comando SQL
            //Variável de conexão
            String sql = "delete from tb_funcionarios where id = ?";
            
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
     
     //Buscar cliente pelo CPF
    public List<Funcionarios> buscaFuncionarios(String nome) {
        
        try {
            
            //Criando a lista
            List<Funcionarios> lista = new ArrayList<>();
            
            //Criando o comando SQL e executar
            String sql = "select * from tb_clientes where nome like ?";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            //Enquanto percorre o rs => resultado select cria um objeto
            while(rs.next()) {
                
                Funcionarios obj = new Funcionarios(); 
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
    
    //Método Listar Funcionario
    public List<Funcionarios> listarFuncionarios() {
        
        try {
            
            //Criando a lista
            List<Funcionarios> lista = new ArrayList<>();
            
            //Criando o comando SQL e executar
            String sql = "select * from tb_funcionarios";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            //Enquanto percorre o rs => resultado select cria um objeto
            while(rs.next()) {
                
                Funcionarios obj = new Funcionarios(); 
                //Montar o objeto
                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setRg(rs.getString("rg"));
                obj.setCpf(rs.getString("cpf"));
                obj.setEmail(rs.getString("email"));
                
                obj.setSenha(rs.getString("senha"));
                obj.setCargo(rs.getString("cargo"));
                obj.setNivel_acesso(rs.getString("nivel_acesso"));
                
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
    
    //Metodo efetuar login
    public void efetuarLogin(String email, String senha) {
        
        try {
            
            //Comando SQL
            String sql = "select * from tb_funcionarios where email = ? and senha = ?";
            PreparedStatement stmt = con.prepareStatement(sql);   
            
            //Oganizar
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            //rs por culpa do select
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) {
                //Usuario logado
                
                //Usuario tipo Admin sem restrições
                if(rs.getString("nivel_acesso").equals("Administrador")){
                    
                JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema!", "Sistema sem nome ainda...",JOptionPane.INFORMATION_MESSAGE );
                 
                 //Chama menu
                 frmMenu tela = new frmMenu();
                 tela.usuarioLogado = rs.getString("nome");
                 tela.setVisible(true);
                 
                 
                 //caso seja gerente, pode apenas pesquisar clientes e funcionarios
                }else if(rs.getString("nivel_acesso").equals("Gerente")) {                     
                                   
                JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema!", "Sistema sem nome ainda...",JOptionPane.INFORMATION_MESSAGE );
                 
                 //Chama menu
                 frmMenu tela = new frmMenu();
                 tela.usuarioLogado = rs.getString("nome");
                 
                 //tira menus
                 tela.menuCadastrarCliente.setVisible(false);
                 tela.menuCadastrarFuncionario.setVisible(false);
                 tela.menuConfiguracao.setVisible(false);
                 
                 tela.setVisible(true);   
                    
                 
                }else if(rs.getString("nivel_acesso").equals("Vendedor")) { //é vendedor
                    
                JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema!", "Sistema sem nome ainda...",JOptionPane.INFORMATION_MESSAGE );
                 
                 //Chama menu
                 frmMenu tela = new frmMenu();
                 tela.usuarioLogado = rs.getString("nome");
                 
                 tela.menuFuncionario.setVisible(false);
                 tela.menuFuncoes.setVisible(false);
                 
                 tela.setVisible(true); 
                    
                }
                

            }else{
                //Dados Incorretos
                JOptionPane.showMessageDialog(null, "Dados Incorretos, tente novamente!", "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );                
                           
            }
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Ooooops... Aconteceu o erro: \n " + erro, "Sistema sem nome ainda...",JOptionPane.ERROR_MESSAGE );
        }
        
        
    }  
        
}


