/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segurado;

/**
 *
 * @author 31649033
 */
public class Operadora {
    private planoSaude planoSaude = new planoSaude();
    public Operadora(planoSaude planoSaude){
        this.planoSaude = planoSaude;
    }
    private String nome;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public Operadora() {
        
    }
    
}
