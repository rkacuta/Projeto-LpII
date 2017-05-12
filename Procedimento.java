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
public class Procedimento {
    private planoSaude planoSaude ;
    private ItemDeProcedimentos ListaDeProcedimentos;
    public Procedimento(planoSaude planoSaude, ItemDeProcedimentos ListaDeProcedimentos){
        this.planoSaude = new planoSaude();
        this.ListaDeProcedimentos = new ItemDeProcedimentos();
    }
    private String nome;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        this.tipo = "pendente";
    }
    
    
    public Procedimento() {
        
    }
    
}
