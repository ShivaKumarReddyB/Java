package vehicleCart;

public class VehicleCart {
    String vehicleName;
    double Price, DISCOUNT =0.20;
    double taxPercentage,totalPrice,finalPrice;
    public VehicleCart (String vehicleName, double Price, double taxPercentage){
        this.vehicleName = vehicleName;
        this.Price = Price;
        this.taxPercentage = taxPercentage;

    }
    public  VehicleCart(){

    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double calcTotalPrice() {
        totalPrice = Price + (Price * taxPercentage / 100);
        return totalPrice;
    }

    public double calcFinalPrice() {
        finalPrice = Price - (Price * DISCOUNT / 100);
        return finalPrice;
    }
    @Override
    public String toString() {
        return "Vehicle Name: " + vehicleName + "\nPrice: $" + Price + "\nTax Percentage: " + taxPercentage + "%";
    }


}
