/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Uso do padrão controller para fazer as funções do caso de uso mostrar dados do cliente
package segurado;

/**
 *
 * @author 31649033
 */
public class Autorizacao {
    private Local local;
    private Estado estado;
    private Segurado segurado;
    private ItemDeProcedimentos listadeprocedimentos;
    public Autorizacao(Local local,Estado estado,Segurado segurado,ItemDeProcedimentos listadeprocedimentos) {
        this.local = local;
        this.estado = estado;
        this.segurado = segurado;
        listadeprocedimentos = new ItemDeProcedimentos();
    }
    
    public Autorizacao(){
    
    }
    private String dataDaAvaliacao;

    public String getDataDaAvaliacao() {
        return dataDaAvaliacao;
    }

    public void setDataDaAvaliacao(String dataDaAvaliacao) {
        this.dataDaAvaliacao = dataDaAvaliacao;
    }
     
    public void Autorizar(Autorizado e){
        e.setEstado();
    }
    public void Negar(Negado e){
        e.setEstado();
    }

    public void mostrarDados(Segurado s, planoSaude p,Autorizacao a,String pl,String es,
                                    Autorizado e2,String t,ItemDeProcedimentos l2, ItemDeProcedimentos l,
                                    ItemDeProcedimentos l1){
        System.out.println("Nome: "+s.getNome());
        System.out.println("CPF: "+s.getCpf());
        System.out.println("Planos: "+p.getplanoSaude());
        System.out.println("Data de Avaliação: "+a.getDataDaAvaliacao());
        System.out.println("Plano utilizado: "+pl);
        System.out.println("Estado: "+es);
        if (es==e2.getEstado()){
            System.out.println("Tipo escolhido: "+t);
            System.out.println("Lista de instrumentos e métodos utilizados: "+l2.getItemdeprocedimentos());
            System.out.println("Quantidade de injeção: "+l.getQuantidade());
            System.out.println("Quantidade de gesso: "+l1.getQuantidade());
            System.out.println("Número de autorização: "+p.getNumAutorizacao());
        }
        System.out.println("");
    }
}
