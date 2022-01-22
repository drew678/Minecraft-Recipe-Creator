import java.util.ArrayList;
import java.util.Iterator;

public class Driver {
	static ArrayList<Product> lOP;
	static ArrayList<Material> lOM;
	
	public static void main(String args[]) {
		lOM = new ArrayList<Material>();
		lOP = new ArrayList<Product>();
		
		ArrayList<Material> list = new ArrayList<Material>();
		list.add(new Material("matter plastics",14));
		list.add(new Material("diamond gear",2));
		list.add(new Material("computation matrix",8));
		list.add(new Material("me controller",1));
		Product p = new Product("guidance", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("matter ball",9));
		p = new Product("matter plastics", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("diamond",4));
		list.add(new Material("iron nugget",1));
		p = new Product("diamond gear", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("liquid computation matrix",20));
		p = new Product("computation matrix", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("liquid computation matrix",20));
		p = new Product("computation matrix", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("0",10));
		list.add(new Material("1",10));
		list.add(new Material("2",10));
		list.add(new Material("3",10));
		list.add(new Material("4",10));
		list.add(new Material("5",10));
		list.add(new Material("6",10));
		list.add(new Material("7",10));
		list.add(new Material("8",10));
		list.add(new Material("9",10));
		p = new Product("liquid computation matrix", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("3",2));
		list.add(new Material("-",1));
		p = new Product("0", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("3",2));
		list.add(new Material("/",1));
		p = new Product("1", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("8",1));
		list.add(new Material("-",1));
		list.add(new Material("6",1));
		p = new Product("2", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("liquid logic",1));
		p = new Product("3", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("3",1));
		list.add(new Material("+",1));
		list.add(new Material("1",1));
		p = new Product("4", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("8",1));
		list.add(new Material("-",1));
		list.add(new Material("3",1));
		p = new Product("5", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("3",2));
		list.add(new Material("+",1));
		p = new Product("6", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("8",1));
		list.add(new Material("-",1));
		list.add(new Material("1",1));
		p = new Product("7", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("liquid logic",1));
		p = new Product("8", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("3",1));
		list.add(new Material("*",1));
		list.add(new Material("3",1));
		p = new Product("9", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("liquid logic",1));
		p = new Product("+", list);
		lOP.add(p);

		list = new ArrayList<Material>();
		list.add(new Material("liquid logic",1));
		p = new Product("-", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("liquid logic",1));
		p = new Product("/", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("liquid logic",1));
		p = new Product("*", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("calculation mechanism",1.0/30.0));
		p = new Product("liquid logic", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("printed silicon",2));
		list.add(new Material("inductive mechanism",1));
		p = new Product("calculation mechanism", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("silicon",1));
		p = new Product("printed silicon", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("ice charge",1));
		list.add(new Material("silicon compound",1));
		p = new Product("silicon", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("blizz powder",8));
		p = new Product("ice charge", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("blizz cube",2.0/3.0));
		p = new Product("blizz powder", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("laser snowball",1));
		p = new Product("blizz cube", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("purified sand",1));
		list.add(new Material("coke chunk",1));
		list.add(new Material("fine sand",1));
		p = new Product("silicon compound", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("sand chunk",1));
		list.add(new Material("earth charge",1));
		p = new Product("purified sand", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("ball of sand",1));
		p = new Product("sand chunk", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("sandstone",8.33333));
		p = new Product("ball of sand", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("sand",4));
		p = new Product("sandstone", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("basalz powder",8));
		p = new Product("earth charge", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("basalz charge",2.0/3.0));
		p = new Product("basalz powder", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("laser basalt",1));
		p = new Product("basalz charge", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("coke",1));
		p = new Product("coke chunk", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("coal",1));
		p = new Product("coke", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("ball of sand",1));
		p = new Product("fine sand", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("induction coil",2));
		list.add(new Material("precision mechanism",1));
		p = new Product("inductive mechanism", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("radiant sheet",1));
		p = new Product("induction coil", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("refined radiance",1));
		p = new Product("radiant sheet", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("chromatic coumpound",1));
		p = new Product("refined radiance", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("magenta paint ball",4));
		p = new Product("chromatic coumpound", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("chromatic singularity",1.0/3.5));
		p = new Product("magenta paint ball", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("quantum entangled singularity",1));
		list.add(new Material("dye",1));
		p = new Product("chromatic singularity", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("singularity",1));
		list.add(new Material("ender dust",1));
		p = new Product("quantum entangled singularity", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("crushing wheel",1));
		p = new Product("singularity", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("cobblestone",8));
		list.add(new Material("stick",5.0/2.0));
		p = new Product("crushing wheel", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("plank",1.0/2.0));
		p = new Product("stick", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("wood",1.0/4.0));
		p = new Product("plank", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("ender pearl",1));
		p = new Product("ender dust", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("electron tube",2));
		list.add(new Material("kinetic mechanism",1));
		p = new Product("precision mechanism", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("molten iron",1.0/9.0));
		list.add(new Material("polished rose quartz",1));
		p = new Product("electron tube", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("rose quartz",1));
		list.add(new Material("sand paper",1));
		p = new Product("polished rose quartz", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("paper",1));
		list.add(new Material("sand",1));
		p = new Product("sand paper", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("sugarcane",1));
		p = new Product("paper", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("redstone",4));
		list.add(new Material("nether quartz",1));
		p = new Product("rose quartz", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("iron",1));
		p = new Product("molten iron", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("andesite alloy",2));
		list.add(new Material("slab",1));
		p = new Product("kinetic mechanism", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("plank",1.0/2.0));
		p = new Product("slab", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("andesite",2));
		list.add(new Material("algal brick",2));
		p = new Product("andesite alloy", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("algal blend",1));
		p = new Product("algal brick", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("kelp",1.0/2.0));
		list.add(new Material("clay ball",1.0/2.0));
		p = new Product("algal blend", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("calculation mechanism",8));
		list.add(new Material("fluix casing",1));
		p = new Product("me controller", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("blackstone",1.0/2.0));
		list.add(new Material("lead plate",1.0/2.0));
		p = new Product("fluix casing", list);
		lOP.add(p);
		
		list = new ArrayList<Material>();
		list.add(new Material("lead ingot",1));
		p = new Product("lead plate", list);
		lOP.add(p);
		
		String name = "guidance";
		creater(name, 0, 1);
		
		for (Material material : lOM) {
			System.out.println(material.getAmmount() + " " + material.getName());
		}
	}
	
	public static void creater(String name, int depth, double mult) {
		for (int i = 0; i < depth; i++) {
			System.out.print("\t");
		}
		System.out.println(mult + " " + name);
		boolean pNotFound = true;
		for (Product product : lOP) {
			if(product.getName().equals(name)) {
				pNotFound = false;
				for (Material material : product.getList()) {
					creater(material.getName(), depth+1, material.getAmmount()*mult);
				}
			}
		}
		if(pNotFound || name.equals("liquid logic")) {
			boolean mNotFound = true;
			for (Material material : lOM) {
				if(material.getName().equals(name)) {
					mNotFound = false;
					material.setAmmount(material.getAmmount()+mult);
				}
			}
			if(mNotFound) {
				lOM.add(new Material(name,mult));
			}
		}
	}
}
