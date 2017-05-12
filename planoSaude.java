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
public class planoSaude {
    private Segurado segurado;
    private Operadora operadora;
    private Procedimento procedimento ;
    public planoSaude(Segurado segurado,Operadora operadora,Procedimento procedimento){
        this.segurado = new Segurado();
        this.operadora =operadora;
        this.procedimento = new Procedimento();
    }
    
    private long numAutorizacao;
    private String nome;
    private ArrayList<planoSaude> planoSaude;

    public planoSaude() {
        this.planoSaude = new ArrayList();
    }
    
    
    public void addplanoSaude(planoSaude plano){
        this.planoSaude.add(plano);
    }
    
    public ArrayList<planoSaude> getplanoSaude(){
        return planoSaude;
    }
    
    public long getNumAutorizacao() {
        return numAutorizacao;
    }

    public void setNumAutorizacao(long numAutorizacao) {
        this.numAutorizacao = numAutorizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
