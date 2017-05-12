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
public class ItemDeProcedimentos {
    private Procedimento procedimento ;
    public ItemDeProcedimentos(Procedimento procedimento){
        this.procedimento = procedimento;
    }
    private double quantidade;
    private ArrayList<String> itemdeprocedimentos;
    
    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<String> getItemdeprocedimentos() {
        return itemdeprocedimentos;
    }


    public void addItemdeprocedimentos(String idp) {
        this.itemdeprocedimentos.add(idp);
    }
    
    
    public ItemDeProcedimentos() {
        this.itemdeprocedimentos = new ArrayList();
    }
 
}
