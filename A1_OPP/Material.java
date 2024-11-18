package A1_OPP;

import java.util.Scanner;

public abstract class Material {
    private String name;
    private int quantity;
    private int noOfDays;
    private double price;
 

    private static int product_count = 0;

    public static int getMaterialCount() {
        return product_count;
    }
//  overriding - different class, same method name and same parameter
    public Material() {
        name = "N/A";
    }

    public Material(String name, int noOfDays, int quantity, double price) {
        this.name = name;
        this.noOfDays = noOfDays;
        this.quantity = quantity;    
        this.price = price;    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid customer Name");
        }
       
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQunatity(int quantity) {
        this.quantity =  quantity;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWithGST() {
        return price + Utility.calculateGST(price);
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be less than 0");
        }
    }

    @Override 
    public String toString() {
        return "CustomerList [Name=" + name +", quantity="+ quantity +", noOfDays="+ noOfDays +"]";
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("NoOfDays: " + noOfDays);
    }

    public void editList(Scanner sc) {
        System.out.println("Enter the new list name");
        String customerName = sc.nextLine();
        setName(customerName.length() > 0 ? customerName : this.name);

        System.out.println("Enter the new quantity");
        int newQuantity = sc.nextInt();
        setQunatity(newQuantity > 0 ? newQuantity : this.quantity);

        System.out.println("Enter the new no.of.days");
        int newDays = sc.nextInt();
        setNoOfDays(newDays > 0 ? newDays : this.noOfDays);

        System.out.println("Enter the new price");
        double newPrice = sc.nextDouble();
        setPrice(newPrice > 0 ? newPrice : this.price);
    }

    
}

