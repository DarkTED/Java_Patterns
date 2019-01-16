package factory_method.example;

public class BlablaButton implements Button {

	@Override
	public void render() {
		System.out.println("New render BLABLA");

	}

	@Override
	public void onClick() {
		System.out.println("onClick");

	}

}
