
public class Material {
	private final String name;
	public double ammount;
	
	public Material(String name, double ammount) {
		super();
		this.name = name;
		this.ammount = ammount;
	}

	public String getName() {
		return name;
	}

	public double getAmmount() {
		return ammount;
	}
	
	public void setAmmount(double ammount) {
		this.ammount=ammount;
	}
	
}
