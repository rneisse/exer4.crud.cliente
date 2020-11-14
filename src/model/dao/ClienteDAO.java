/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Cliente;
/**
 *
 * @author Ricardo
 */
public class ClienteDAO {
    
    public void create(Cliente cliente){
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente (nome, email, cpf, telefone, dataaniversario) VALUES (?,?,?,?,?)");    
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getDataAniversario());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + ex);
        } finally {
            
        }        
    }
    
    public void update(Cliente cliente){
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE cliente set nome = ?, email = ? , cpf = ? , telefone = ? , dataaniversario = ? where idcliente");    
            stmt.setInt(0,cliente.getId());
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getDataAniversario());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            
        }  
        
    }  
    
    public void delete(Cliente cliente){
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FOM cliente where idcliente");    
            stmt.setInt(0,cliente.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            
        }         
    }
    
    public ArrayList<Cliente> read(){
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente ORDER BY idcliente");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setDataAniversario(rs.getString("dataaniversario"));              
                listaClientes.add(cliente);                
            }    
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao ler a lista de clientes!" + ex);
            //JOptionPane.showMessageDialog(null, "Erro ao ler a lista de clientes!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaClientes;        
    }   
    
    public ArrayList<Cliente> query(String nome){
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cliente where nome LIKE ? ORDER BY idcliente");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setDataAniversario(rs.getString("dataaniversario"));              
                listaClientes.add(cliente);                
            }    
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao consultar a lista de clientes!" + ex);
            //JOptionPane.showMessageDialog(null, "Erro ao consultar a lista de clientes!", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaClientes;        
    } 
    
    
    
    
    
       
}
