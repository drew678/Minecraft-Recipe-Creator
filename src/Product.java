import java.util.ArrayList;

public class Product{
	private final String name;
	private ArrayList<Material> list;
	
	public Product(String name, ArrayList<Material> list) {
		super();
		this.name = name;
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Material> getList() {
		return list;
	}
}
