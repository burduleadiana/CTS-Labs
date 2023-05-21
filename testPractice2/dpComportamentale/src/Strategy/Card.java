package Strategy;

public class Card implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println("Clientul plateste CARD suma de: "+sumaPlatita);
    }
}
