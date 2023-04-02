package Builder;

public class Program {
    public static void main(String[] args) {
        ContBancar cont=new ContBancar();
        cont.setDetinator("Ionescu Pop");
        cont.setSuma(1000);
        cont.setMoneda("RON");
        cont.setContSalariu(true);
        cont.setInternetBanking(true);
        cont.setCardAtasat(true);

        System.out.println(cont.toString());

        //utilizare builder

        ContBancar cont2=new ContBancarBuilder()
                                    .setDetinator("Marinescu")
                                    .setSuma(5000)
                                    .setMoneda("EUR")
                                    .setInternetBanking(false)
                                    .build();
        System.out.println(cont2.toString());
    }
}
