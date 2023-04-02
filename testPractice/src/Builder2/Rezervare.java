package Builder2;

public class Rezervare {
    private String genMuzica;
    private int codRezervare;

    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbientala;

    public Rezervare(){

    }

    public Rezervare(String genMuzica, int codRezervare, boolean mancareInclusa,
                     boolean scaunErgonomic, boolean
                     bauturaRacoritoare, boolean muzicaAmbientala){
        super();
        this.genMuzica=genMuzica;
        this.codRezervare=codRezervare;
        this.mancareInclusa=mancareInclusa;
        this.scaunErgonomic=scaunErgonomic;
        this.bauturaRacoritoare=bauturaRacoritoare;
        this.muzicaAmbientala=muzicaAmbientala;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "genMuzica='" + genMuzica + '\'' +
                ", codRezervare=" + codRezervare +
                ", mancareInclusa=" + mancareInclusa +
                ", scaunErgonomic=" + scaunErgonomic +
                ", bauturaRacoritoare=" + bauturaRacoritoare +
                ", muzicaAmbientala=" + muzicaAmbientala +
                '}';
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    public int getCodRezervare() {
        return codRezervare;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public boolean isMancareInclusa() {
        return mancareInclusa;
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public boolean isBauturaRacoritoare() {
        return bauturaRacoritoare;
    }

    public void setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
    }

    public boolean isMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }
}
