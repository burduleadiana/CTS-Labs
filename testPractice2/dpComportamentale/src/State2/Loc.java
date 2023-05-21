package State2;

public class Loc {
    private int nrLoc;
    private State state;

    public Loc(int nrLoc) {
        this.nrLoc = nrLoc;
        this.state=null;
    }

    public int getNrLoc() {
        return nrLoc;
    }

    public void setNrLoc(int nrLoc) {
        this.nrLoc = nrLoc;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
