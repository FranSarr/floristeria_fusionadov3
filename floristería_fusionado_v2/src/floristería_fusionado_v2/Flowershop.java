package floristería_fusionado_v2;

public class Flowershop {

    private String flowershop_name;
    private ProductRepository repository;


    public Flowershop(String flowershop_name, ProductRepository repository) {
        this.flowershop_name = flowershop_name;
        this.repository = repository;
    }

    public void setFlowershop_name(String flowershop_name) {
        this.flowershop_name = flowershop_name;
    }

    public void addFlower(String name, Double price, String colour) throws Exception{
        Flower flor = new Flower(name,price,colour);
        repository.addProduct(flor);
    }

    public void addDecor(String name, Double price, String material) throws Exception{
        Decor decor = new Decor(name,price,material);
        repository.addProduct(decor);
    }

    public void addTree( String name, Double price, Double height) throws Exception{
        Tree tree = new Tree(name,price,height);
        repository.addProduct(tree);
    }

}