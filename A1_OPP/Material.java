package A1_OPP;

public class Material {
    private String name;
    private int quantity;
    private int noOfDays;
 

//  overriding - different class, same method name and same parameter
    public Material() {
        name = "N/A";
    }

    public Material(String name, int noOfDays, int quantity) {
        this.name = name;
        this.noOfDays = noOfDays;
        this.quantity = quantity;        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}

