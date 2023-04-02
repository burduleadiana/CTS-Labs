package Builder2;

public class RezervareBuilder implements IBuilder{

    public Rezervare rezervare;

    public RezervareBuilder(){
        rezervare=new Rezervare();
    }

    public RezervareBuilder setCodRezervare(int codRezervare){
        rezervare.setCodRezervare(codRezervare);
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica){
        rezervare.setGenMuzica(genMuzica);
        return this;
    }

    public RezervareBuilder setMancareInclusa(boolean mancareInclusa){
        rezervare.setMancareInclusa(mancareInclusa);
        return this;
    }

    public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic){
        rezervare.setScaunErgonomic(scaunErgonomic);
        return this;
    }

    public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare){
        rezervare.setBauturaRacoritoare(bauturaRacoritoare);
        return this;
    }
    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala){
        rezervare.setMuzicaAmbientala(muzicaAmbientala);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
