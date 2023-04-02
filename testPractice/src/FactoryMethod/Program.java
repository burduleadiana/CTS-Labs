package FactoryMethod;

public class Program {
    private static void afisare(FactoryPachetTuristic fabrica){
        PachetTuristic pachetTuristic= fabrica.createPachet();
        pachetTuristic.descriere();
    }
    public static void main(String[] args) {
        afisare(new FactoryPachetCazareTransport());
    }
}
