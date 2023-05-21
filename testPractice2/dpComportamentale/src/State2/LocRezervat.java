package State2;

public class LocRezervat implements State{
    @Override
    public void schimbaStarea(Loc loc) {
        System.out.println("Locul "+loc.getNrLoc()+" are starea REZERVAT");
        loc.setState(this);
    }
}
