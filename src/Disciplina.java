/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hader
 */
public class Disciplina {
    private String nome;
    private int cod;
    private String periodo;
    
public Disciplina(String n, int c, String p){
    this.nome=n;
    this.cod=c;
    this.periodo=p;
}   
    
public String getNome(){
    return this.nome;
} 

public void setNome(String n){
    this.nome=n;    
}

public int getCod(){
    return this.cod;
}

public void setCod(int c){
    this.cod=c;
}

public String getPeriodo(){
    return this.periodo;
}

public void setPeriodo(String p){
    this.periodo=p;
}

public void exibir(){
    System.out.println("Nome: "+getNome());
    System.out.println("Código: "+getCod());
    System.out.println("Período: "+getPeriodo());
}

}
