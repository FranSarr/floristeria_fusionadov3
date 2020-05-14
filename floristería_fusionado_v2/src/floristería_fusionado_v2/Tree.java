package floristería_fusionado_v2;

public class Tree extends Product{

    private Double height;

    public Tree(String name, double price, Double height) throws Exception {
        super(name, price);
        this.height = height;
    }

	@Override
	public String toString() {
		return "Tree [name=" + name + " price= " + price + " height=" + height + "]";
	}
    
    
}
