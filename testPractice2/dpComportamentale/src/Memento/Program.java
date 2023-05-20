package Memento;

public class Program {

    public static void main(String[] args) {
        PachetTuristic pachetTuristic=new PachetTuristic(20);
        ManagerPacheteTuristice managerPacheteTuristice=new ManagerPacheteTuristice();

        System.out.println(pachetTuristic.toString());

        managerPacheteTuristice.adaugaMemento(pachetTuristic.salvareMemento());
        pachetTuristic.setPret(50);
        System.out.println(pachetTuristic.toString());
        pachetTuristic.setPret(100);
        System.out.println(pachetTuristic.toString());
        managerPacheteTuristice.adaugaMemento(pachetTuristic.salvareMemento());
        System.out.println(pachetTuristic.toString());


        try{
            pachetTuristic.undoMemento(managerPacheteTuristice.getMemento(0));
            System.out.println(pachetTuristic.toString());
        }catch(Exception exception){

        }
    }


}
