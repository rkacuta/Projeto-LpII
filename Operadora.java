/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segurado;
import java.util.ArrayList;
/**
 *
 * @author 31649033
 */
public class Operadora {
    private ArrayList<planoSaude> planoSaude;
    public Operadora(ArrayList planoSaude){
        this.planoSaude = new ArrayList();
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
