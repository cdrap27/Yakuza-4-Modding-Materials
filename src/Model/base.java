package Model;

public class base {
    private String name;
    private String cost;
    private String location;
    private int qty;

    public base(String name, String cost, String location){
        this.name = name;
        this.cost = cost;
        this.location = location;
        char quotes = '"';
        this.cost =  this.cost.replace("\"", "");
        if(this.cost.isBlank()){
           this.cost = "0";

        }
       if(Integer.parseInt(this.cost) < 1){
           this.cost = "free";
        }
        qty = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

    public String getLocation(){
        return location;
    }

    public int getQty() {
        return qty;
    }
}
