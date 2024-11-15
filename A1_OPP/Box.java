package A1_OPP;

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
    
}
