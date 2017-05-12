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
public class Hospital extends Local {
    private Cirurgico cirurgico;
    public Hospital(Cirurgico cirurgico){
        this.cirurgico = new Cirurgico();
    }
    
    private ArrayList<Hospital> hospital;
    private int qtdeDeMedicos;
    
    public Hospital() {
        this.hospital = new ArrayList();
    }

    public ArrayList<Hospital> getHospital() {
        return hospital;
    }

    public void addHospital(Hospital hospital) {
        this.hospital.add(hospital);
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
