package Builder3;

public class Program {
    public static void main(String[] args) {
        Casa casa=new Casa();
        casa.setAcoperis("tigla");
        casa.setPiscina(true);
        casa.setStructura("scandinava");

        Casa casa1=new CasaBuilder()
                        .setPiscina(true)
                        .setGradina(true)
                        .setSubsol("beci")
                        .build();

        System.out.println(casa.toString());
        System.out.println(casa1.toString());
    }
}
