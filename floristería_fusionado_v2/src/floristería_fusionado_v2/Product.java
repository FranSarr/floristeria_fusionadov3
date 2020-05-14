package floristería_fusionado_v2;

public abstract class Product {

    protected int id;
    protected String name;
    protected double price;

    private static int COUNTER_PRODUCTS = 1;

    public Product(String name, double price) throws Exception {
        if (name.equals(""))
            throw new Exception();
        if (price==0)
            throw new Exception();

        this.name = name;
        this.price = price;
        id = COUNTER_PRODUCTS;
        COUNTER_PRODUCTS++;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}