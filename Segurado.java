/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segurado;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Felipe Macena e Rafael Kacuta
 */
public class Segurado {
    private planoSaude planoSaude;
    private Autorizacao autorizacao ;
    public Segurado(planoSaude planoSaude, Autorizacao autorizacao) {
        this.planoSaude  = new planoSaude();
        this.autorizacao = new Autorizacao();
    } 
    /**
     * @param args the command line arguments
     */
    private String nome;
    private long cpf;
    
    private ArrayList<Segurado> Segurado;
    
    
    public String getNome() {
        return nome;
    }

    public ArrayList<Segurado> getSegurado() {
        return Segurado;
    }

    public void addSegurado(Segurado segurado) {
        this.Segurado.add(segurado);
    }
    
    
    public Segurado(){
        this.Segurado = new ArrayList();
    }    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    
    //padrão creator
    public planoSaude criarPlano(){
        planoSaude p = new planoSaude();
        return p;
    }
    
    //funções
    public static void menuAutoriza(){
        System.out.println("Tipo de autorização");
        System.out.println("1 - Autorizar");
        System.out.println("2 - Negar");
        System.out.println("Escolha a opção: ");
    }
    
    public static void menuTiposProc(){
        System.out.println("Qual tipo de Procedimento deseja fazer?");
        System.out.println("1- Cirurgico");
        System.out.println("2- Ambulatorial");
    }
    
    public static void invalida(){
        System.out.println("Opção Inválida");
        System.out.println("");
    }
    
    public static void menuItemsProc(Procedimento pr){       
        System.out.println("Deseja usar "+pr.getNome()+"?");
        System.out.println("1- Sim");
        System.out.println("2- Não");
        System.out.println("Resposta: ");
    }
    
    public static void menuMetodoProc(Procedimento pr){       
        System.out.println("Deseja fazer "+pr.getNome()+"?");
        System.out.println("1- Sim");
        System.out.println("2- Não");
        System.out.println("Resposta: ");
    }
    
    public static void menuPlanos(planoSaude p,Segurado s){
        System.out.println("Lista de planos do "+s.getNome()+":");
        for (int i = 0; i < p.getplanoSaude().size(); i++) {
            System.out.println((i+1)+": "+p.getplanoSaude().get(i));
        }
        System.out.println("Escolha a opção");
    }
    
    public static void mostrarDados(Segurado s, planoSaude p,Autorizacao a,String pl,String es,
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
    public static void main(String[] args) {
        Random rand = new Random();
        
        //Criação dos objetos
        //Segurado
        Segurado s = new Segurado();
        Segurado s1 = new Segurado();
        Segurado s2 = new Segurado();
        s.setNome("Felipe");        
        s.setCpf(391231212);
        s1.setNome("Rafael");
        s1.setCpf(319051234);
        s2.setNome("Fabio");
        s2.setCpf(36526890);
        s.addSegurado(s);      
        s.addSegurado(s1);
        s.addSegurado(s2);
        s1.addSegurado(s);
        s1.addSegurado(s1);
        s2.addSegurado(s);     
        
        //operadora
        Operadora o = new Operadora();
        o.setNome("Amil");   
        
        //plano de saude
        planoSaude p,p1,p2;
        p= s.criarPlano();
        p1=s.criarPlano();
        p2=s.criarPlano();
        p.setNome("Dix");
        p1.setNome("LinkX");
        p2.setNome("Amil 300");
        p.addplanoSaude(p);
        p.addplanoSaude(p1);
        p.addplanoSaude(p2);
        p1.addplanoSaude(p);
        p1.addplanoSaude(p1);
        p2.addplanoSaude(p);
        
        //autorizações e estados        
        Autorizacao a = new Autorizacao();
        Autorizacao a1 = new Autorizacao();
        Autorizacao a2 = new Autorizacao();
        a.setDataDaAvaliacao("03/04/2017");
        a1.setDataDaAvaliacao("09/04/2017");
        a2.setDataDaAvaliacao("15/04/2017");
        Estado e = new Estado();
        Pendente e1 = new Pendente();
        e1.setEstado();
        Autorizado e2 = new Autorizado();
        a.Autorizar(e2);
        Negado e3 = new Negado();
        a.Negar(e3);
        
        //Procedimentos
        Procedimento pr = new Procedimento();
        Procedimento pr1 = new Procedimento();
        Procedimento pr2 = new Procedimento();
        Procedimento pr3 = new Procedimento();
        pr.setNome("Injeção");
        pr1.setNome("Gesso");
        pr2.setNome("Anestesia");
        pr3.setNome("Cortar");
        
        ItemDeProcedimentos ip = new ItemDeProcedimentos();
        ip.addItemdeprocedimentos(pr.getNome());
        ip.addItemdeprocedimentos(pr1.getNome());
        ItemDeProcedimentos ip1 = new ItemDeProcedimentos();
        ip1.addItemdeprocedimentos(pr2.getNome());
        ip1.addItemdeprocedimentos(pr3.getNome());
        ItemDeProcedimentos ip2 = new ItemDeProcedimentos();
        ItemDeProcedimentos ip3 = new ItemDeProcedimentos();
        ItemDeProcedimentos ip4 = new ItemDeProcedimentos();
        ItemDeProcedimentos ip5 = new ItemDeProcedimentos();
        
        //hospital
        Hospital h = new Hospital();
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        h.setQtdeDeMedicos(10);
        h1.setQtdeDeMedicos(15);
        h2.setQtdeDeMedicos(12);
        h.addHospital(h);
        h.addHospital(h1);
        h.addHospital(h2);
        
        //Clinica
        Clinica cl = new Clinica();
        Clinica cl1 = new Clinica();
        Clinica cl2 = new Clinica();
        cl.setMedicoResponsavel("Daniel");
        cl.addClinica(cl);
        cl1.setMedicoResponsavel("Luciana");
        cl.addClinica(cl1);
        cl2.setMedicoResponsavel("Roberto");
        cl.addClinica(cl2);
        
        //Ambulatorial
        Ambulatorial am = new Ambulatorial();
        Ambulatorial am1 = new Ambulatorial();
        Ambulatorial am2 = new Ambulatorial();
        am.setTipo();
        am.setQtdeDeTecnicos(3);
        am1.setQtdeDeTecnicos(2);
        am2.setQtdeDeTecnicos(5);
        am.addAmbulatorial(am);
        am.addAmbulatorial(am1);
        am.addAmbulatorial(am2);
        
        //cirurgico
        Cirurgico c = new Cirurgico();
        Cirurgico c1 = new Cirurgico();
        Cirurgico c2 = new Cirurgico();
        c.setTipo();
        c.setQtdeDeMedicos(6);
        c1.setQtdeDeMedicos(7);
        c2.setQtdeDeMedicos(2);
        c.addCirurgico(c);
        c.addCirurgico(c1);
        c.addCirurgico(c2);
        
        //local
        Local l = new Local();
        l.setCEP(12345678);
        Local l1 = new Local();
        l1.setCEP(23454389);
        Local l2 = new Local();
        l2.setCEP(38765912);

        //var do main
        boolean saida = false;
        int op,op1,op2,opc,opl,num,num1,num2,opp,otp,opm;
        double qi;
        String es,es1,es2,pl,pl1,pl2,t,t1,t2;
        es= e1.getEstado();
        es1= e1.getEstado();
        es2= e1.getEstado();
        pl="Pendente";
        pl1="Pendente";
        pl2="Pendente";
        t="";t1="";t2="";
        
        //menu
        Scanner entrada = new Scanner(System.in);
        while (saida==false){
            System.out.println("Sistema de autorizações das consultas");        
            System.out.println("1- Fazer autorização");
            System.out.println("2- Checar planos de Saúde");
            System.out.println("3- Status dos clientes");
            System.out.println("4- Locais das consultas");
            System.out.println("0- Sair");
            System.out.println("Escolha a opção: ");
            op = entrada.nextInt();
            System.out.println("");
            switch(op){
                case 1:
                    System.out.println("Lista de Clientes");
                    for (int i = 0; i < s.getSegurado().size(); i++) {
                        System.out.println((i+1)+": "+s.getSegurado().get(i));        
                    }
                    System.out.println("Escolha a opção: ");
                    op1 = entrada.nextInt();
                    System.out.println("");
                    switch(op1){
                        case 1:
                            if (es==e2.getEstado()){
                                System.out.println("Já está autorizado");
                                break;
                            }
                            menuPlanos(p,s);
                            opl = entrada.nextInt();
                            System.out.println("");
                            switch(opl){
                                case 1:
                                    menuAutoriza();
                                    opc = entrada.nextInt();
                                    switch(opc){
                                        case 1:
                                            System.out.println("");
                                            menuTiposProc();
                                            otp=entrada.nextInt();
                                            while ((otp<1)||(otp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                otp=entrada.nextInt();
                                            }
                                            switch(otp){
                                                case 1:
                                                    System.out.println("Tipo cirurgico escolhido");
                                                    t=c.getTipo();
                                                    System.out.println("");
                                                    break;
                                                case 2:
                                                    System.out.println("Tipo ambulatorial escolhido");
                                                    t=am.getTipo();
                                                    System.out.println("");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;   
                                            }
                                            System.out.println("Lista de Instrumentos: "+ip.getItemdeprocedimentos());
                                            menuItemsProc(pr);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    ip2.addItemdeprocedimentos(pr.getNome());
                                                    System.out.println("Adicione as quantidades ");
                                                    qi = entrada.nextDouble();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Coloque uma quantidade acima de zero");
                                                        qi = entrada.nextDouble();
                                                    }
                                                    ip.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            menuItemsProc(pr1);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    ip2.addItemdeprocedimentos(pr1.getNome());
                                                    System.out.println("Adicione as quantidades ");
                                                    qi = entrada.nextDouble();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Coloque uma quantidade acima de zero");
                                                        qi = entrada.nextDouble();
                                                    }
                                                    ip1.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr1.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Lista de Métodos: "+ip1.getItemdeprocedimentos());
                                            menuMetodoProc(pr2);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    ip2.addItemdeprocedimentos(pr2.getNome());
                                                    System.out.println("Adicionado "+pr2.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            menuMetodoProc(pr3);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    ip2.addItemdeprocedimentos(pr3.getNome());
                                                    System.out.println("Adicionado "+pr3.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Cliente autorizado a fazer consulta");
                                            num= rand.nextInt(100000)+999999;
                                            p.setNumAutorizacao(num);
                                            System.out.println("Seu número de autorização é esse: "+p.getNumAutorizacao());
                                            pl=p.getNome();
                                            es= e2.getEstado();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Cliente não pode fazer autorização");
                                            pl = "plano recusado";
                                            es= e3.getEstado();
                                            System.out.println("");
                                            break;
                                        default:
                                            System.out.println("Opção Inválida");
                                            System.out.println("");
                                            break;
                                    }                                                                   
                                    break;
                                case 2:
                                    menuAutoriza();
                                    opc = entrada.nextInt();
                                    System.out.println("");
                                    switch(opc){
                                        case 1:
                                            menuTiposProc();
                                            otp=entrada.nextInt();
                                            while ((otp<1)||(otp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                otp=entrada.nextInt();
                                            }
                                            switch(otp){
                                                case 1:
                                                    System.out.println("Tipo cirurgico escolhido");
                                                    t=c.getTipo();
                                                    System.out.println("");
                                                    break;
                                                case 2:
                                                    System.out.println("Tipo ambulatorial escolhido");
                                                    t=am.getTipo();
                                                    System.out.println("");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;   
                                            }
                                            System.out.println("Lista de Instrumentos: "+ip.getItemdeprocedimentos());
                                            menuItemsProc(pr);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    ip2.addItemdeprocedimentos(pr.getNome());
                                                    System.out.println("Adicione as quantidades ");
                                                    qi = entrada.nextDouble();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Coloque uma quantidade acima de zero");
                                                        qi = entrada.nextDouble();
                                                    }
                                                    ip.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            menuItemsProc(pr1);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    ip2.addItemdeprocedimentos(pr1.getNome());
                                                    System.out.println("Adicione as quantidades ");
                                                    qi = entrada.nextDouble();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Coloque uma quantidade acima de zero");
                                                        qi = entrada.nextDouble();
                                                    }
                                                    ip1.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr1.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Lista de Métodos: "+ip1.getItemdeprocedimentos());
                                            menuMetodoProc(pr2);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    ip2.addItemdeprocedimentos(pr2.getNome());
                                                    System.out.println("Adicionado "+pr2.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            menuMetodoProc(pr3);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    ip2.addItemdeprocedimentos(pr3.getNome());
                                                    System.out.println("Adicionado "+pr3.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Cliente autorizado a fazer consulta");
                                            num= rand.nextInt(100000)+999999;
                                            p.setNumAutorizacao(num);
                                            System.out.println("Seu número de autorização é esse: "+p.getNumAutorizacao());
                                            pl=p1.getNome();
                                            es= e2.getEstado();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Cliente não pode fazer autorização");
                                            pl = "plano recusado";
                                            es= e3.getEstado();
                                            System.out.println("");
                                            break;
                                        default:
                                            System.out.println("Opção Inválida");
                                            System.out.println("");
                                            break;
                                    }   
                                    break;
                                case 3:
                                    menuAutoriza();
                                    opc = entrada.nextInt();
                                    switch(opc){
                                        case 1:
                                            System.out.println("");
                                            menuTiposProc();
                                            otp=entrada.nextInt();
                                            while ((otp<1)||(otp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                otp=entrada.nextInt();
                                            }
                                            switch(otp){
                                                case 1:
                                                    System.out.println("Tipo cirurgico escolhido");
                                                    t=c.getTipo();
                                                    System.out.println("");
                                                    break;
                                                case 2:
                                                    System.out.println("Tipo ambulatorial escolhido");
                                                    t=am.getTipo();
                                                    System.out.println("");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;   
                                            }
                                            System.out.println("Lista de Instrumentos: "+ip.getItemdeprocedimentos());
                                            menuItemsProc(pr);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
 
                                            switch(opp){
                                                case 1:
                                                    ip2.addItemdeprocedimentos(pr.getNome());
                                                    System.out.println("Adicione as quantidades ");
                                                    qi = entrada.nextDouble();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Coloque uma quantidade acima de zero");
                                                        qi = entrada.nextDouble();
                                                    }
                                                    ip.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            menuItemsProc(pr1);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    ip2.addItemdeprocedimentos(pr1.getNome());
                                                    System.out.println("Adicione as quantidades ");
                                                    qi = entrada.nextDouble();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Coloque uma quantidade acima de zero");
                                                        qi = entrada.nextDouble();
                                                    }
                                                    ip1.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr1.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Lista de Métodos: "+ip1.getItemdeprocedimentos());
                                            menuMetodoProc(pr2);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    ip2.addItemdeprocedimentos(pr2.getNome());
                                                    System.out.println("Adicionado "+pr2.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            menuMetodoProc(pr3);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    ip2.addItemdeprocedimentos(pr3.getNome());
                                                    System.out.println("Adicionado "+pr3.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("Cliente autorizado a fazer consulta");
                                            num= rand.nextInt(100000)+999999;
                                            p.setNumAutorizacao(num);
                                            System.out.println("Seu número de autorização é esse: "+p.getNumAutorizacao());
                                            pl =p2.getNome();
                                            es= e2.getEstado();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Cliente não pode fazer autorização");
                                            pl= "plano recusado";
                                            es= e3.getEstado();
                                            System.out.println("");
                                            break;
                                        default:
                                            System.out.println("Opção Inválida");
                                            System.out.println("");
                                            break;
                                    }
                                break;
                                default:
                                    invalida();
                                    break;
                            }                           
                            break;
                        case 2:
                            if (es1==e2.getEstado()){
                                System.out.println("Já está autorizado");
                                break;
                            }
                            menuPlanos(p1,s1);
                            opl = entrada.nextInt();
                            System.out.println("");
                            switch(opl){
                                case 1:
                                    menuAutoriza();
                                    opc = entrada.nextInt();
                                    switch(opc){
                                        case 1:
                                            System.out.println("");
                                            menuTiposProc();
                                            otp=entrada.nextInt();
                                            while ((otp<1)||(otp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                otp=entrada.nextInt();
                                            }
                                            switch(otp){
                                                case 1:
                                                    System.out.println("Tipo cirurgico escolhido");
                                                    t1=c.getTipo();
                                                    System.out.println("");
                                                    break;
                                                case 2:
                                                    System.out.println("Tipo ambulatorial escolhido");
                                                    t1=am.getTipo();
                                                    System.out.println("");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;   
                                            }
                                            System.out.println("Lista de Instrumentos: "+ip.getItemdeprocedimentos());
                                            menuItemsProc(pr);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }

                                            switch(opp){
                                                case 1:
                                                    ip3.addItemdeprocedimentos(pr.getNome());
                                                    System.out.println("Adicione as quantidades ");
                                                    qi = entrada.nextDouble();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Coloque uma quantidade acima de zero");
                                                        qi = entrada.nextDouble();
                                                    }
                                                    ip2.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            menuItemsProc(pr1);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    ip3.addItemdeprocedimentos(pr1.getNome());
                                                    System.out.println("Adicione as quantidades ");
                                                    qi = entrada.nextDouble();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Coloque uma quantidade acima de zero");
                                                        qi = entrada.nextDouble();
                                                    }
                                                    ip3.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr1.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Lista de Métodos: "+ip1.getItemdeprocedimentos());
                                            menuMetodoProc(pr2);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    ip3.addItemdeprocedimentos(pr2.getNome());
                                                    System.out.println("Adicionado "+pr2.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            menuMetodoProc(pr3);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    ip3.addItemdeprocedimentos(pr3.getNome());
                                                    System.out.println("Adicionado "+pr3.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Cliente autorizado a fazer consulta");
                                            num= rand.nextInt(100000)+999999;
                                            p1.setNumAutorizacao(num);
                                            System.out.println("Seu número de autorização é esse: "+p1.getNumAutorizacao());
                                            pl1=p.getNome();
                                            es1= e2.getEstado();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Cliente não pode fazer autorização");
                                            es1= e3.getEstado();
                                            pl1 = "plano recusado";
                                            System.out.println("");
                                            break;
                                        default:
                                            invalida();
                                            break;
                                    }                                                                   
                                    break;
                                case 2:
                                    menuAutoriza();
                                    opc = entrada.nextInt();
                                    switch(opc){
                                        case 1:
                                            System.out.println("");
                                            menuTiposProc();
                                            otp=entrada.nextInt();
                                            while ((otp<1)||(otp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                otp=entrada.nextInt();
                                            }
                                            switch(otp){
                                                case 1:
                                                    System.out.println("Tipo cirurgico escolhido");
                                                    t1=c.getTipo();
                                                    System.out.println("");
                                                    break;
                                                case 2:
                                                    System.out.println("Tipo ambulatorial escolhido");
                                                    t1=am.getTipo();
                                                    System.out.println("");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;   
                                            }
                                            System.out.println("Lista de Instrumentos: "+ip.getItemdeprocedimentos());
                                            menuItemsProc(pr);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    ip3.addItemdeprocedimentos(pr.getNome());
                                                    System.out.println("Adicione as quantidades ");
                                                    qi = entrada.nextDouble();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Coloque uma quantidade acima de zero");
                                                        qi = entrada.nextDouble();
                                                    }
                                                    ip2.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            menuItemsProc(pr1);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    ip3.addItemdeprocedimentos(pr1.getNome());
                                                    System.out.println("Adicione as quantidades ");
                                                    qi = entrada.nextDouble();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Coloque uma quantidade acima de zero");
                                                        qi = entrada.nextDouble();
                                                    }
                                                    ip3.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr1.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Lista de Métodos: "+ip1.getItemdeprocedimentos());
                                            menuMetodoProc(pr2);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    ip3.addItemdeprocedimentos(pr2.getNome());
                                                    System.out.println("Adicionado "+pr2.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            menuMetodoProc(pr3);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    ip3.addItemdeprocedimentos(pr3.getNome());
                                                    System.out.println("Adicionado "+pr3.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Cliente autorizado a fazer consulta");
                                            num= rand.nextInt(100000)+999999;
                                            p1.setNumAutorizacao(num);
                                            System.out.println("Seu número de autorização é esse: "+p1.getNumAutorizacao());
                                            pl1=p1.getNome();
                                            es1= e2.getEstado();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Cliente não pode fazer autorização");
                                            pl1 = "plano recusado";
                                            es1= e3.getEstado();
                                            System.out.println("");
                                        default:
                                            invalida();
                                            break;
                                    }   
                                    break;
                                    default:
                                        invalida();
                                        break;
                            }
                            break;
                        case 3:
                            if (es==e2.getEstado()){
                                System.out.println("Já está autorizado");
                                break;
                            }
                            menuPlanos(p2,s2);                            
                            opl = entrada.nextInt();
                            System.out.println("");
                            switch(opl){
                                case 1: 
                                    menuAutoriza();
                                    opc = entrada.nextInt();
                                    switch(opc){
                                        case 1:
                                            System.out.println("");
                                            menuTiposProc();
                                            otp=entrada.nextInt();
                                            while ((otp<1)||(otp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                otp=entrada.nextInt();
                                            }
                                            switch(otp){
                                                case 1:
                                                    System.out.println("Tipo cirurgico escolhido");
                                                    t2=c.getTipo();
                                                    System.out.println("");
                                                    break;
                                                case 2:
                                                    System.out.println("Tipo ambulatorial escolhido");
                                                    t2=am.getTipo();
                                                    System.out.println("");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;   
                                            }
                                            System.out.println("Lista de Instrumentos: "+ip.getItemdeprocedimentos());
                                            menuItemsProc(pr);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    ip4.addItemdeprocedimentos(pr.getNome());
                                                    System.out.println("Adicione as quantidades ");
                                                    qi = entrada.nextDouble();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Coloque uma quantidade acima de zero");
                                                        qi = entrada.nextDouble();
                                                    }
                                                    ip4.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            menuItemsProc(pr1);
                                            opp=entrada.nextInt();
                                            while ((opp<1)||(opp>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opp=entrada.nextInt();
                                            }
                                            switch(opp){
                                                case 1:
                                                    ip4.addItemdeprocedimentos(pr1.getNome());
                                                    System.out.println("Adicione as quantidades ");
                                                    qi = entrada.nextDouble();
                                                    while (qi<1){
                                                        invalida();
                                                        System.out.println("Coloque uma quantidade acima de zero");
                                                        qi = entrada.nextDouble();
                                                    }
                                                    ip5.setQuantidade(qi);
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado: "+pr1.getNome());
                                                    break;
                                            }
                                            System.out.println("");
                                            System.out.println("Lista de Métodos: "+ip1.getItemdeprocedimentos());
                                            menuMetodoProc(pr2);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    ip4.addItemdeprocedimentos(pr2.getNome());
                                                    System.out.println("Adicionado "+pr2.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("");
                                            menuMetodoProc(pr3);
                                            opm=entrada.nextInt();
                                            while ((opm<1)||(opm>2)){
                                                invalida();
                                                System.out.println("Escolha a opção correta");
                                                opm=entrada.nextInt();
                                            }
                                            switch(opm){
                                                case 1:
                                                    ip4.addItemdeprocedimentos(pr3.getNome());
                                                    System.out.println("Adicionado "+pr3.getNome());
                                                    break;
                                                case 2:
                                                    System.out.println("Não será usado");
                                                    break;
                                                default:
                                                    invalida();
                                                    break;
                                            }
                                            System.out.println("Cliente autorizado a fazer consulta");
                                            num= rand.nextInt(100000)+999999;
                                            p2.setNumAutorizacao(num);
                                            System.out.println("Seu número de autorização é esse: "+p2.getNumAutorizacao());
                                            pl2=p.getNome();
                                            es2= e2.getEstado();
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("Cliente não pode fazer autorização");
                                            pl2 = "plano recusado";
                                            es2= e3.getEstado();
                                            System.out.println("");
                                        default:
                                            invalida();
                                            break;
                                    }
                                    break;
                                default:
                                    invalida();
                                    break;
                            }
                        break;
                        default:
                            invalida();
                            break;
                        }
                    break;
                case 2:
                    System.out.println("Planos Existentes da "+o.getNome());
                    for (int i = 0; i < p.getplanoSaude().size(); i++) {
                        System.out.println((i+1)+": "+p.getplanoSaude().get(i));
                    }
                    System.out.println("Escolha a opção: ");
                    op2 = entrada.nextInt();
                    switch(op2){
                        case 1:
                            System.out.println("Pessoas com plano Dix: "+s.getSegurado());
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("Pessoas com plano LinkX: "+s1.getSegurado());
                            System.out.println("");
                            break;                        
                        case 3:
                            System.out.println("Pessoas com plano Amil 300: "+s2.getSegurado());
                            System.out.println("");
                            break;
                        default:
                            invalida();
                            break;
                        }
                    break;
                case 3:
                    System.out.println("Dados dos clientes: ");
                    mostrarDados(s,p,a,pl,es,e2,t,ip2,ip,ip1);
                    mostrarDados(s1,p1,a1,pl1,es1,e2,t1,ip3,ip2,ip3);
                    mostrarDados(s2,p2,a2,pl2,es2,e2,t2,ip4,ip4,ip5);
                    break;
                case 4:
                    System.out.println("Dados dos locais");
                    System.out.println("");
                    for (int i = 0; i < h.getHospital().size(); i++) {
                        if (i==0){
                            System.out.println("CPF do local: "+l.getCEP());
                        }else{
                            if (i==1){
                                System.out.println("CPF do local: "+l1.getCEP());
                            }else{
                                if (i==2){
                                    System.out.println("CPF do local: "+l2.getCEP());
                                  }     
                                }                                         
                        }
                        System.out.println("Médico Responsavel: "+cl.getClinica().get(i));
                        System.out.println("Quantidade de médicos do hospital: "+h.getHospital().get(i));
                        System.out.println("Quandidade de técnicos ambulatoriais: "+am.getAmbulatorial().get(i));
                        System.out.println("Quantidade de médicos cirurgiões: "+c.getCirurgico().get(i));
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.out.println("Saiu do programa");
                    saida=true;
                    break;
                default:
                    invalida();
                    break;
            }
         
        }
    }
    }  

