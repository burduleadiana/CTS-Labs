package State;

public class StarePlatitaPartial implements State {
    @Override
    public void schimbaStare(Rezervare rezervare) {
        System.out.println("Rezervarea "+rezervare.getId()+" este trecuta in starea PLATITA PARTIAL");
        rezervare.setStare(this);
    }
}
