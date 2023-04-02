package Singleton;

public class Program {
    public static void main(String[] args) {
        Agentie primaAgentie = Agentie.getInstanta("Agentie1", 2000,4);
        Agentie aDouaAgentie=Agentie.getInstanta("Agentie2", 10000,20);

        //System.out.println(primaAgentie.getNumeAgentie());
        //System.out.println(aDouaAgentie.getNumeAgentie());

        double capacitatiMotoare[]={150,200,250};
        TargMasini primulTarg=TargMasini.getInstance();
        TargMasini alDoileaTarg=TargMasini.getInstance();
        alDoileaTarg.setNume("Targ2");

        System.out.println(primulTarg.toString());
        System.out.println(alDoileaTarg.toString());
    }
}
