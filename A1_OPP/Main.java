package A1_OPP;

import java.util.Scanner;
// import java.util.ArrayList;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    // private static ArrayList<Material> catalog = new ArrayList<>();
    public static void main(String[] args){

        while(true) {
            int choice = displayMenu();
            if(choice == 1) {
                System.out.println("1.display list");
            }
            if(choice == 2) {
                System.out.println("2. addProduct");
            }
            if(choice == 3) {
                System.out.println("edit list");
            }
            if(choice == 4) {
                System.out.println("delete list");
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

}