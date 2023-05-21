package Observer.Clase;

import Observer.Clienti.Observer;

public interface Subject {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);

    void trimiteNotificare(String mesaj);
}
