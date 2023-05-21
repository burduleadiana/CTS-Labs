package Strategy;

public class Paypal implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println("Clientul plateste PAYPAL suma de: "+sumaPlatita);
    }
}
