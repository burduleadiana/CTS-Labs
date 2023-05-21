package State;

public class Rezervare {
    private int id;
    private State stare;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rezervare(int id) {
        this.id = id;
        this.stare=null;
    }

    public State getStare() {
        return stare;
    }

    public void setStare(State stare) {
        this.stare = stare;
    }
}
