package floristería_fusionado_v2;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private static List<Product> articles=new ArrayList<>();


    public ProductRepository(){

    }

    public static List<Product> getAllProducts(){
        return new ArrayList<>(articles);
    }


    public void addProduct(Product article) throws Exception{
        if(article==null) throw new Exception();
        articles.add(article);
    }

	@Override
	public String toString() {
		return "ProductRepository [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}