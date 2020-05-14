package floristería_fusionado_v2;

import java.util.ArrayList;
import java.util.List;

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

    public String getStock() {
        String stock ="\n";
        List<Product> productos= new ArrayList<>();
        productos = repository.getAllProducts();

        stock = stock + "This is your current stock:" + " \n";

        stock = stock + "TREES" + " \n";
        for (Product p : productos){
            if ( p instanceof Tree) {
                stock = stock + p.getName() + " of height " + ((Tree) p).getHeight() + " with a price of " + p.getPrice() + " \n";
            }
        }

        stock = stock + "FLOWERS" + " \n";
        for (Product p : productos){
            if ( p instanceof Flower) {
                stock = stock + p.getName() + " of colour " + ((Flower) p).getColour() + " with a price of " + p.getPrice() + " \n";
            }
        }

        stock = stock + "DECORATION" + " \n";
        for (Product p : productos){
            if ( p instanceof Decor) {
                stock = stock + p.getName() + " of material " + ((Decor) p).getMaterial() + " with a price of " + p.getPrice() + " \n";
            }
        }

        return stock;
    }
}