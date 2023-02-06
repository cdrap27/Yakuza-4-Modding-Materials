package Model;

public class design {
    private String name;
    private String location;
    private String cost;
    private int qty;
    private Boolean isDesign;

    public design(String name, String location, int qty, Boolean isDesign){
        this.name = name;
        this.location = location;
        char[] chars = location.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c: chars){
            if(Character.isDigit(c) || c == ','){
                sb.append(c);
            }
        }
        cost = sb.toString();
        if(cost.isBlank()){
            cost = "0";

        }
        if(Integer.parseInt(cost) < 1){
            cost = "free";
        }
        this.qty = qty;
        this.isDesign = isDesign;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setCost(String cost){
        this.cost = cost;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public void setIsDesign(Boolean isDesign){
        this.isDesign = isDesign;
    }

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public String getCost(){
        return cost;
    }

    public int getQty(){
        return qty;
    }

    public Boolean getIsDesign(){
        return isDesign;
    }
}
