package Observer.Clase;

import java.util.ArrayList;
import java.util.List;
import Observer.Clienti.Observer;

public class Agentie implements  Subject{
    private List<Observer> observeri;
    private String numeAgentie;

    public Agentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
        observeri=new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
            observeri.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
            for(Observer observer:observeri){
                observer.receptionareMesaj(numeAgentie+": "+mesaj);
            }
    }

    public void notificareOfertaNoua(){
            trimiteNotificare("A fost adaugata o oferta noua");
    }

    public void notificareReducerePret(){
        trimiteNotificare("Pretul unei oferte a scazut!");
    }
}
