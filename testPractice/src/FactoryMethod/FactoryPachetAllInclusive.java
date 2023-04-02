package FactoryMethod;

public class FactoryPachetAllInclusive implements FactoryPachetTuristic{
    @Override
    public PachetTuristic createPachet() {
        return new PachetAllInclusive();
    }
}
