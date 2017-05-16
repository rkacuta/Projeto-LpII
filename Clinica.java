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
public class Clinica extends Local {
    private ArrayList<Ambulatorial> ambulatorial;
    
    public Clinica(Ambulatorial ambulatorial){
        this.ambulatorial = new ArrayList();
    }
    public Clinica() {
        this.clinica = new ArrayList();
    }
    
    private String medicoResponsavel;
    private ArrayList<Clinica> clinica;

    public ArrayList<Clinica> getClinica() {
        return clinica;
    }

    public void addClinica(Clinica clinica) {
        this.clinica.add(clinica);
    }
    
    @Override
    public String toString(){
        return medicoResponsavel;
    }
    
    public String getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(String medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }
    
}
