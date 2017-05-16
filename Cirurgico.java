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
public class Cirurgico extends Procedimento {
    private ArrayList<Hospital> hospital;
    public Cirurgico(Hospital hospital){
        this.hospital = new ArrayList();
    }
    
    private String tipo;
    private int qtdeDeMedicos;
    private ArrayList<Cirurgico> cirurgico;
    
    @Override
    public void setTipo() {
        this.tipo = "cirurgico";
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public Cirurgico() {
        this.cirurgico = new ArrayList();
    }

    public ArrayList<Cirurgico> getCirurgico() {
        return cirurgico;
    }

    public void addCirurgico(Cirurgico cirurgico) {
        this.cirurgico.add(cirurgico);
    }
    
    @Override
    public String toString(){
        return ""+qtdeDeMedicos;
    }
    

    public int getQtdeDeMedicos() {
        return qtdeDeMedicos;
    }

    public void setQtdeDeMedicos(int qtdeDeMedicos) {
        this.qtdeDeMedicos = qtdeDeMedicos;
    }
    
    
    
}
