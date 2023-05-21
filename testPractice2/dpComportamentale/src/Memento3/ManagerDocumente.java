package Memento3;

import Memento.MementoPachetTuristic;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class ManagerDocumente {

    public List<MementoEditorDocument> documentList=new ArrayList<>();

    public void adaugaMemento(MementoEditorDocument memento){
        documentList.add(memento);
    }

    public MementoEditorDocument getMemento(int index){
        return documentList.get(index);
    }

    public MementoEditorDocument getLastMemento() throws Exception {
        if(documentList.size()!=0){
            MementoEditorDocument memento=documentList.get(documentList.size()-1);
            documentList.remove(documentList.size()-1);
            return memento;
        }else{
            throw new Exception("Nu exista stari salvate!");
        }
    }

}
