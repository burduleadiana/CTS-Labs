package Builder3;

public class Casa {
    private String subsol;
    private String structura;
    private String acoperis;
    private String interior;
    private boolean piscina;
    private boolean gradina;

    public Casa(){

    }

    public Casa(String subsol, String structura, String acoperis, String interior, boolean piscina, boolean gradina){
        super();
        this.subsol=subsol;
        this.structura=structura;
        this.acoperis=acoperis;
        this.interior=interior;
        this.piscina=piscina;
        this.gradina=gradina;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "subsol='" + subsol + '\'' +
                ", structura='" + structura + '\'' +
                ", acoperis='" + acoperis + '\'' +
                ", interior='" + interior + '\'' +
                ", piscina=" + piscina +
                ", gradina=" + gradina +
                '}';
    }

    public String getSubsol() {
        return subsol;
    }

    public void setSubsol(String subsol) {
        this.subsol = subsol;
    }

    public String getStructura() {
        return structura;
    }

    public void setStructura(String structura) {
        this.structura = structura;
    }

    public String getAcoperis() {
        return acoperis;
    }

    public void setAcoperis(String acoperis) {
        this.acoperis = acoperis;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public boolean isPiscina() {
        return piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public boolean isGradina() {
        return gradina;
    }

    public void setGradina(boolean gradina) {
        this.gradina = gradina;
    }
}
