/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import java.util.ArrayList;
import java.util.ArrayList;
import model.bean.Cliente;
import model.dao.ClienteDAO;

/**
 *
 * @author Ricardo
 */
public class ClienteController {
    
    public void create (String nome, String email, String cpf, String telefone, String dataAniversario) {
        Cliente c = new Cliente();
        ClienteDAO cDAO = new ClienteDAO();
        
        c.setNome(nome);
        c.setEmail(email);
        c.setCpf(cpf);
        c.setTelefone(telefone);
        c.setDataAniversario(dataAniversario);
        
        cDAO.create(c);
    }
    
    public void update (int idcliente, String nome, String email, String cpf, String telefone, String dataAniversario) {
        Cliente c = new Cliente();
        ClienteDAO cDAO = new ClienteDAO();
        
        c.setId(idcliente);
        c.setNome(nome);
        c.setEmail(email);
        c.setCpf(cpf);
        c.setTelefone(telefone);
        c.setDataAniversario(dataAniversario);
        
        cDAO.update(c);        
    }
    
    public void delete (int idcliente){
        Cliente c = new Cliente();
        ClienteDAO cDAO = new ClienteDAO();

        c.setId(idcliente);  
        
        cDAO.delete(c);
    }  
    
    public ArrayList<Cliente> read(){
        ClienteDAO cDAO = new ClienteDAO();
        return cDAO.read();
    }  
    
    public ArrayList<Cliente> query(String nome){
        ClienteDAO cDAO = new ClienteDAO();
        return cDAO.query(nome);
    }
    
}
