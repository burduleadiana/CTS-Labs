package Builder2;

public class Program {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare();
        rezervare.setCodRezervare(1);
        rezervare.setGenMuzica("Pop");
        rezervare.setMuzicaAmbientala(true);

        //utilizare builder

        Rezervare rezervare2=new RezervareBuilder().setCodRezervare(2)
                                .setMancareInclusa(true)
                                .setMuzicaAmbientala(true)
                                .build();

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
    }
}
