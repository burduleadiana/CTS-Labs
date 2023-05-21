package Strategy;

public class Client {
    private String numeClient;
    private ModPlata modPlata;

    public Client(String numeClient) {
        super();
        this.numeClient = numeClient;
        this.modPlata = new Cash();
    }

    public Client(String numeClient, ModPlata modPlata) {
        this.numeClient = numeClient;
        this.modPlata = modPlata;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(double sumaDePlata){
        modPlata.plateste(this.numeClient, sumaDePlata);
    }

}
