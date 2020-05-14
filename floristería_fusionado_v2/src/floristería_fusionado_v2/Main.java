package floristería_fusionado_v2;

import java.util.Scanner;

public class Main {

    //private static String flowershop_name ="Floristeria Srta. Pepis";
    private static ProductRepository articles = new ProductRepository();

    // Created a new FlowerShop with a list of Products
    //private static Flowershop pepisflowers = new Flowershop(flowershop_name,articles);

    public static void main(String[] args) throws Exception {

        System.out.println("Welcome to the Flower Shop Creator!");
        Scanner sc = new Scanner (System.in);
        System.out.println("Insert the name of the Flower Shop.");
        String shopName =sc.nextLine();
        Flowershop nameShop = new Flowershop (shopName,articles);
        System.out.println("The shop " + shopName + " has been created.");



        boolean exit = true;

        while (exit != false)
        {
            System.out.println("What do you want to do?");
            System.out.println("Press '1' to add a Tree.");
            System.out.println("Press '2' to add a Flower.");
            System.out.println("Press '3' to add Decoration.");
            System.out.println("Press '4' to see the stock.");
            System.out.println("Press '5' to EXIT.");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Welcome to the Tree Creator!");

                    Scanner entrada1 = new Scanner(System.in);
                    System.out.println("Enter the name of the tree");
                    String nameTree = entrada1.nextLine();

                    System.out.println("Enter the size of the tree");
                    double size = entrada1.nextDouble();

                    System.out.println("Enter the price of the tree");
                    double price = entrada1.nextDouble();

                    System.out.println("The tree: " + nameTree + "/" + size + "/" + price + " has been created");
                    nameShop.addTree(nameTree, price,size);
                    exit =true;
                    break;

                case 2:
                    System.out.println("Welcome to the Flower Creator!");
                    Scanner entrada2 = new Scanner(System.in);
                    System.out.println("Enter the name of the flower");
                    String nameFlower = entrada2.nextLine();
                    System.out.println("Enter the color of the flower");
                    String color = entrada2.nextLine();
                    System.out.println("Enter the price of the flower");
                    double priceFlower = entrada2.nextDouble();
                    System.out.println("The flower: " + nameFlower + "/" + color + "/" + priceFlower + " has been created");
                    nameShop.addFlower(nameFlower,priceFlower,color);
                    exit =true;
                    break;

                case 3:
                    System.out.println("Welcome to the Decoration Creator!");
                    Scanner entrada3 = new Scanner(System.in);
                    System.out.println("Enter the name of the decoration");
                    String nameDecor = entrada3.nextLine();
                    System.out.println("Choose between 'wood' or 'plastic'");
                    String material = entrada3.nextLine();
                    System.out.println("Enter the price of the decoration");
                    double priceDecor = entrada3.nextDouble();
                    System.out.println("The decoration: " + nameDecor + "/" + material + "/" + priceDecor + " has been created");
                    nameShop.addDecor(nameDecor,priceDecor,material);
                    exit =true;
                    break;

                case 4:
                	System.out.println(nameShop.getStock());
                	exit =true;
                    break;

                case 5:
                    exit = false;
                    System.out.println("Goodbye!");
                    break;
            }
        }





        //pepisflowers.addFlower("gardenia", 23.5, "blanca");
        //pepisflowers.addDecor("tiesto",11.3,"plastic");
        //pepisflowers.addTree("eucalipto",44.8,1.2);


        // TODO stock
    }

}