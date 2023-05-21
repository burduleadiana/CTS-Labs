package State;

public class StarePlatita implements State{
    @Override
    public void schimbaStare(Rezervare rezervare) {
        System.out.println("Rezervarea "+rezervare.getId()+" este trecuta in starea PLATITA");
        rezervare.setStare(this);
    }
}
