package Builder3;

public class CasaBuilder implements IBuilder{

    private Casa casa;

    public CasaBuilder(){
        casa=new Casa();
    }

    public CasaBuilder setSubsol(String subsol){
        casa.setSubsol(subsol);
        return this;
    }

    public CasaBuilder setStructura(String structura){
        casa.setStructura(structura);
        return this;
    }

    public CasaBuilder setAcoperit(String acoperis){
        casa.setAcoperis(acoperis);
        return this;
    }

    public CasaBuilder setInterior(String interior){
        casa.setInterior(interior);
        return this;
    }

    public CasaBuilder setPiscina(boolean piscina){
        casa.setPiscina(piscina);
        return this;
    }

    public CasaBuilder setGradina(boolean gradina){
        casa.setGradina(gradina);
        return this;
    }



    @Override
    public Casa build() {
        return casa;
    }
}
