package factory_method.example;

public class WindowsDialog extends Dialog {


    public Button createButton() {
        return new WindowsButton();
    }
}