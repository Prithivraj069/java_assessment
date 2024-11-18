package A1_OPP;

import java.util.Scanner;

public class Box extends Material {
    private String boxSize;
    private double weight;
    private String boxType;

    public Box() {
        super();
        boxSize = "n/a";
        weight = 0;
        boxType = "N/A";
    }

    public Box(String name, int noOfDays, int quantity, String boxSize, double weight, String boxType) {
        super(name, noOfDays, quantity);
        this.boxSize = boxSize;
        this.weight = weight;
        this.boxType = boxType;
    }

    public String getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(String boxSize) {
        this.boxSize = boxSize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBoxType() {
        return boxType;
    }

    public void setBoxType(String boxType) {
        this.boxType = boxType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("boxSize: " + boxSize);
        System.out.println("weight: " + weight);
        System.out.println("boxType: " + boxType);
    }

    public void editList(Scanner sc) {
        super.editList(sc);

        System.out.println("Enter the new boxSize");
        String boxSize = sc.nextLine();
         setBoxSize(boxSize.length() > 0 ? boxSize : this.boxSize);

        System.out.println("Enter the new weight");
        try {
            double weight = sc.nextDouble();
            this.setWeight(weight);
        } catch (Exception e) {
        
        }

        System.out.println("Enter the new box Type");
        String boxType = sc.nextLine();
        setBoxType(boxType.length() > 0 ? boxType : this.boxType);
    }
    
}
