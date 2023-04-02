package Singleton;

import java.util.Arrays;

public class TargMasini {
    private String nume;
    private String adresa;
    private double profit;
    private float[] capacitateMotoare;

    private static TargMasini instance;

    static{
        try{
            instance=new TargMasini();
        }
        catch(Exception exception){
            System.out.println("Instanta nu poate fi creata");
        }
    }

    //constructor privat
    private TargMasini(){
        this.nume="Targ";
        this. adresa="Bucuresti";
        this.profit=5000;
        float capacitati[]={150,200,250};
        this.capacitateMotoare=capacitati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public float[] getCapacitateMotoare() {
        return capacitateMotoare;
    }

    public void setCapacitateMotoare(float[] capacitateMotoare) {
        this.capacitateMotoare = capacitateMotoare;
    }

    public static TargMasini getInstance() {
        if(instance==null){
            instance=new TargMasini();
        }
        return instance;
    }

    public static void setInstance(TargMasini instance) {
        TargMasini.instance = instance;
    }


    @Override
    public String toString() {
        return "TargMasini{" +
                "nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", profit=" + profit +
                ", capacitateMotoare=" + Arrays.toString(capacitateMotoare) +
                '}';
    }
}
