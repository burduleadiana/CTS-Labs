package Memento3;

public class EditorDocument {
    private String body;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public EditorDocument(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "EditorDocument{" +
                "body='" + body + '\'' +
                '}';
    }

    public MementoEditorDocument salvareText(){
        return new MementoEditorDocument(body);
    }

    public void undoMemento(MementoEditorDocument memento){
        this.body=memento.getTextBody();
    }
}
