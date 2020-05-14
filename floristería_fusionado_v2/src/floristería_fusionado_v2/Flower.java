package floristería_fusionado_v2;

public class Flower extends Product {

    private String colour;

    public Flower(String name, double price, String colour) throws Exception {
        super(name, price);
        this.colour = colour;
    }

	@Override
	public String toString() {
		return "Flower [name=" + name + " price= " + price + " colour=" + colour + "]";
	}
    
}