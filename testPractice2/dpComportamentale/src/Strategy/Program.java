package Strategy;

public class Program {
    public static void main(String[] args) {
        Client client1=new Client("POPESCU");

        client1.setModPlata(new Paypal());
        client1.plateste(300);

        client1.setModPlata(new Card());
        client1.plateste(500);
    }
}
