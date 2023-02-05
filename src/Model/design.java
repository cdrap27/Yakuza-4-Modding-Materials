package Model;

public class design {
    private String name;
    private String location;
    private String cost;

    public design(String name, String location){
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
        String costing = "36";
        if(cost.isBlank()){
            cost = "0";

        }
        if(Integer.parseInt(cost) < 100){
            cost = "free";
        }


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

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public String getCost(){
        return cost;
    }
}
