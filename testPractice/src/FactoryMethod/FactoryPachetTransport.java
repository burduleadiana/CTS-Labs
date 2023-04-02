package FactoryMethod;

public class FactoryPachetTransport implements FactoryPachetTuristic {
    @Override
    public PachetTuristic createPachet() {
        return new PachetTransport();
    }
}
