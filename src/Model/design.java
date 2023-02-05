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
    }
}
