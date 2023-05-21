package State;

public class StareNeplatita implements State{
    @Override
    public void schimbaStare(Rezervare rezervare) {
        System.out.println("Rezervarea "+rezervare.getId()+ " este trecuta in starea NEPLATITA");
        rezervare.setStare(this);
    }
}
