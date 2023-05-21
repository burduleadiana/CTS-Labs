package State2;

public class LocOcupat implements State{

    @Override
    public void schimbaStarea(Loc loc) {
        System.out.println("Locul"+ loc.getNrLoc()+" are starea OCUPAT");
        loc.setState(this);
    }
}
