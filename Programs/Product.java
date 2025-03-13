class Product {
    int pcode;
    String pname;
    double price;

    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    void display() {
        System.out.println("Product Code: " + pcode + ", Name: " + pname + ", Price: " + price);
    }

    public static void main(String[] args) {
        
        Product product1 = new Product(101, "Laptop", 55000);
        Product product2 = new Product(102, "Smartphone", 25000);
        Product product3 = new Product(103, "Tablet", 30000);

        
        Product lowestPrice = product1;
        
        if (product2.price < lowestPrice.price) {
            lowestPrice = product2;
        }
        if (product3.price < lowestPrice.price) {
            lowestPrice = product3;
        }

        System.out.println("\nProduct with the lowest price:");
        lowestPrice.display();
    }
}
 