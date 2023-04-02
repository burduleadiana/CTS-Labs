package program;
import eagerInitialization.AgentieEager;

public class Program {
    public static void main(String[] args){
        AgentieEager primaAgentie = AgentieEager.getInstanta("AgeTur", 1000, 10);
        AgentieEager aDouaAgentie=AgentieEager.getInstanta("o alta agentie", 10,2);

        System.out.println(primaAgentie.getNumeAgentie());
        System.out.println(aDouaAgentie.getNumeAgentie());
    }
}
