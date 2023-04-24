public class DealerAuto {
    private MasinaDeFamilie masinaDeFamilie;
    private  MasinaElectrica masinaElectrica;
    private MasinaSport masinaSport;

    public DealerAuto(){
        masinaDeFamilie=new MasinaDeFamilie();
        masinaElectrica=new MasinaElectrica();
        masinaSport=new MasinaSport();
    }

    public void descriereMasinaDeFamilie(){
        masinaDeFamilie.descriere();
    }

    public void descriereMasinaElectrica(){
        masinaElectrica.descriere();
    }

    public void descriereMasinaSport(){
        masinaSport.descriere();
    }
}
