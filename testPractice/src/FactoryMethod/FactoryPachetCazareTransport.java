package FactoryMethod;

public class FactoryPachetCazareTransport implements FactoryPachetTuristic{
    @Override
    public PachetTuristic createPachet() {
        return new PachetCazareTransport();
    }
}
