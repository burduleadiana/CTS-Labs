package Singleton;

public class Agentie {

    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static Agentie instanta;
    static {
        try {
            instanta = new Agentie();
        }
        catch(Exception exception){
            System.out.println("Instanta nu poate fi creata");
        }
    }
    private Agentie(){
        this.numeAgentie="Agentie";
        this.capital=1000;
        this.numarAngajati=8;

    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public void setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static Agentie getInstanta(String nume, float capital, int numarAngajati) {
        return instanta;
    }
}
