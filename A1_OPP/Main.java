package A1_OPP;

import java.util.Scanner;
 import java.util.ArrayList;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    private static ArrayList<Material> catalog = new ArrayList<>();
    public static void main(String[] args){

        while(true) {
            int choice = displayMenu();
            if(choice == 1) {
              displayCustomerList();
            }
            if(choice == 2) {
                addCustomerList();
            }
            if(choice == 3) {
              updateCustomerList();
            }
            if(choice == 4) {
               deleteCustomerList();
            }
            if(choice == 5) {
                break;
            }
        }
    
        
    }

    private static int displayMenu() {
        System.out.println("");
        System.out.println("MENU");
        System.out.println("1. show all lists");
        System.out.println("2. add customer data");
        System.out.println("3. edit customer data");
        System.out.println("4. delete customer data");
        System.out.println("5. exit");

        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    private static void displayCustomerList() {
        System.out.println();
        System.out.println("All customer List");
        for(int i = 0; i < catalog.size(); i++) {
            var list = catalog.get(i);
            System.out.println("Customer List:" + i);
            list.displayDetails();
        }
    }

    private static void addCustomerList() {
        System.out.println("Enter product no: " + Material.getMaterialCount());
        System.out.println("Enter the type of product to create:(b) for box or (s) for sheet ");
        String Materialtype = sc.nextLine().toLowerCase();

        if(Materialtype.equals("b") || Materialtype.equals("s")) {
            System.out.println("Enter the customer name: ");
            String customerName = sc.nextLine();

            System.out.println("Enter the quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the no of days: ");
            int days = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            Material m;

            if(Materialtype.equals("b")) {
                System.out.println("Enter the box size");
                String boxSize = sc.nextLine();

                System.out.println("Enter the weight");
                double weight = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter the box type");
                String boxtype = sc.nextLine();

                m = new Box(customerName, days, quantity, price, boxSize, weight,boxtype);
            } else {
                System.out.println("Enter the sheet size");
                String sheetSize = sc.nextLine();

                System.out.println("Enter the sheet usage type (roof) or (side)");
                String sheetUsage = sc.nextLine();

                m = new Sheet(customerName, days, quantity, price, sheetSize, sheetUsage);
            }

            catalog.add(m);

        } else {
            System.out.println("please select (b) or (s)");
            return;
        }
    }

    private static void updateCustomerList() {
        System.out.println();
        System.out.println("choose a list to edit");
        displayCustomerList();
        int listIndex = sc.nextInt();
        sc.nextLine();
        Material l = catalog.get(listIndex);
        l.editList(sc);

    }

    private static void deleteCustomerList() {
        System.out.println();
        System.out.println("choose a list to delete");
        displayCustomerList(); 
        int listIndex = sc.nextInt();
        // Material l = catalog.get(listIndex);
       catalog.remove(listIndex);
    }

}