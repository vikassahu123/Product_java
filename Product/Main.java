import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductService service=new ProductService();

         // hey service please add product

//        Product p=new Product("Asus VivoBook","Laptop","Table",30000);
//        service.addProduct(p);

        // we also write like that.
        service.addProduct(new Product("Asus VivoBook","Laptop","Table",3));
        service.addProduct(new Product("Dell Inspiron", "Electronics", "Shelf", 2));
        service.addProduct(new Product("HP Pavilion", "Laptop", "Desk", 1));
        service.addProduct(new Product("Apple MacBook Air", "Laptop", "Cabinet", 3));
        service.addProduct(new Product("Samsung Galaxy S21", "Smartphone", "Counter", 2));
        service.addProduct(new Product("Sony WH-1000XM4", "Headphones", "Drawer", 1));
        service.addProduct(new Product("Lenovo ThinkPad", "Laptop", "Shelf", 4));
        service.addProduct(new Product("Canon EOS 90D", "Camera", "Showcase", 2));
        service.addProduct(new Product("Bose SoundLink", "Speaker", "Table", 3));
        service.addProduct(new Product("Microsoft Surface Pro", "Tablet", "Stand", 2));
        service.addProduct(new Product("LG UltraGear Monitor", "Monitor", "Workstation", 1));

        //get all products
       List<Product> products= service.getAllProducts();
       //  System.out.println(products);

        for(Product p:products) {
            System.out.println(p);
        }

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");


        // get product by name
        Product p=service.getProduct("Dell Inspiron");
        System.out.println(p);

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        // get product by place
       Product pr= service.getProductByPlace("Table");
        System.out.println(pr);

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        // get product which having text into name,place,type.
        List<Product> productsText=service.getProductByText("book");
        for(Product pro:productsText) {
            System.out.println(pro);
        }

    }


}
