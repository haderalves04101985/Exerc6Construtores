/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hader
 */
public class Pessoa {
 
    private String nome;
    private String endereco;
    private int telefone;
    
    public Pessoa(String n, String e, int t){
        this.nome=n;
        this.endereco=e;
        this.telefone=t;       
    
    }
    
    public String getNome(){
        return this.nome;
        
    }
    
    public void setNome(String n){
        this.nome=n;
    
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String e) {
        this.endereco = e;
    }

    
    public int getTelefone(){
        return this.telefone;
    
    }
    
    public void setTelefone(int t){
        this.telefone=t;
        
    }
    
    public void exibir(){
    
        System.out.println("Nome: "+getNome());
        System.out.println("Endereço: "+getEndereco());
        System.out.println("Telefone: "+getTelefone());
    
    }
    
    
}
