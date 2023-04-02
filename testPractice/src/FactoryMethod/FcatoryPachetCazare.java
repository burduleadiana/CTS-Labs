package FactoryMethod;

public class FcatoryPachetCazare implements FactoryPachetTuristic{
    @Override
    public PachetTuristic createPachet() {
        return new PachetCazare();
    }
}
