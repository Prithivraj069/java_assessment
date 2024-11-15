package A1_OPP;

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
}
