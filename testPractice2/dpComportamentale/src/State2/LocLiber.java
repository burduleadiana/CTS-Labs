package State2;

public class LocLiber implements State{
    @Override
    public void schimbaStarea(Loc loc) {
        System.out.println("Locul "+loc.getNrLoc()+" are starea LIBER");
        loc.setState(this);
    }
}
