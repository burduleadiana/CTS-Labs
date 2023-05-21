package State;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare(1000);
        StareNeplatita neplatita=new StareNeplatita();
        neplatita.schimbaStare(rezervare);

        StarePlatitaPartial partialPlatita=new StarePlatitaPartial();
        partialPlatita.schimbaStare(rezervare);
    }
}
