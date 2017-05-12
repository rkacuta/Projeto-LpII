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
public class Autorizado extends Estado {
    @Override
    public void setEstado(){
        this.estado = tiposEstado.AUTORIZADO.getTipoEstado();
    }
}
