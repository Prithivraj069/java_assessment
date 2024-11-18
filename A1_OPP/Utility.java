package A1_OPP;

public class Utility {
    private static double box_rate  = 12;
    // private static double sheet_rate = 3;
    public static double calculatePrice(double quantity) {
      return quantity * box_rate;
           
    }
}
