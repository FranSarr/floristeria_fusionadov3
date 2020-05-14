package floristería_fusionado_v2;

public class Decor extends Product{

    private String material;

    public Decor(String name, double price, String material) throws Exception {
        super(name, price);

        if(!material.equals("wood") && !material.equals("plastic")) throw new Exception();
        this.material = material;
    }

	@Override
	public String toString() {
		return "Decor [name=" + name + " price= " + price + "material=" + material + "]";
	}
    
}