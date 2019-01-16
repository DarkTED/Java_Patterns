package factory_method.example;

public class BlablaDialog extends Dialog {

	@Override
	public Button createButton() {
		return new BlablaButton();
	}

}
