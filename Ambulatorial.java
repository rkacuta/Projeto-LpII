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
public class Ambulatorial extends Procedimento{
    private Clinica clinica;
    public Ambulatorial(Clinica clinica){
        this.clinica = new Clinica();
    }
    
    private String tipo;
    private int qtdeDeTecnicos;
    private ArrayList<Ambulatorial> ambulatorial;
   
    @Override
    public void setTipo() {
        this.tipo = "Ambulatorial";
    }
    
    @Override
    public String getTipo() {
        return tipo;
    }

    public Ambulatorial() {
        this.ambulatorial = new ArrayList();
    }

    public ArrayList<Ambulatorial> getAmbulatorial() {
        return ambulatorial;
    }

    public void addAmbulatorial(Ambulatorial ambulatorial) {
        this.ambulatorial.add(ambulatorial);
    }
    
    @Override
    public String toString(){
        return ""+qtdeDeTecnicos;
    }
    
    public int getQtdeDeTecnicos() {
        return qtdeDeTecnicos;
    }

    public void setQtdeDeTecnicos(int qtdeDeTecnicos) {
        this.qtdeDeTecnicos = qtdeDeTecnicos;
    }
    
    
}
