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
public class Local {
    private Autorizacao autorizacao = new Autorizacao();
    public Local(Autorizacao autorizacao){
        this.autorizacao = autorizacao;
    }
    
    private long CEP;

    public long getCEP() {
        return CEP;
    }

    public void setCEP(long CEP) {
        this.CEP = CEP;
    }
    
    public Local() {
    }
    
}
