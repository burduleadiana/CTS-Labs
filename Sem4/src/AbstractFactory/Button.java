package AbstractFactory;

public class Button implements WindowsGUIFactory {

    public void WindowsButton(){
        System.out.println("This is a Windows Button");
    }

    public void MacButton(){
        System.out.println("This is a Mac button");
    }

    @Override
    public Button createButton() {
        return null;
    }
}
