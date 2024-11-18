package A1_OPP;

import java.util.Scanner;

public class Sheet extends Material{
    private String sheetSize;
    private String sheetUsageType;

    public Sheet() {
        super();
        sheetSize = "N/A";
        sheetUsageType = "N/A";
    }

    public Sheet(String name, int noOfDays, int quantity, String sheetSize, String sheetUsageType) {
        super(name, noOfDays, quantity);
        this.sheetSize = sheetSize;
        this.sheetUsageType = sheetUsageType;
    }

    public String getSheetSize() {
        return sheetSize;
    }

    public void setSheetSize(String sheetSize) {
        this.sheetSize = sheetSize;
    }

    public String getSheetUsageType() {
        return sheetUsageType;
    }

    public void setSheetUsageType(String sheetUsageType) {
        this.sheetUsageType = sheetUsageType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("SheetSize: " + sheetSize);
        System.out.println("sheetUsageType: " + sheetUsageType);
    }

    public void editList(Scanner sc) {
        super.editList(sc);

        System.out.println("Enter the new new sheet size");
        String newSheetSize = sc.nextLine();
        setSheetSize(newSheetSize.length() > 0 ? newSheetSize : this.sheetSize);

        System.out.println("Enter the new sheetUsagetype[roof(r) or side(s)]");
        String newSheetUsage = sc.nextLine();
       if(newSheetUsage.length() > 0) {
            setSheetUsageType(newSheetUsage);
       } else {
         setSheetUsageType(this.sheetUsageType);
       }
    }
}
