package Strategy;

public class Cash implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
            System.out.println("Clientul plateste cash suma de "+sumaPlatita);
    }
}
