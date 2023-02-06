package Model;

public class mods {
    private String name;
    private String design;
    private String base;
    private String material1;
    private String material2;
    private String cost;

    public mods(String name, String design, String base, String material1, String material2, String cost){
        this.name = name;
        this.design = design;
        this.base = base;
        this.material1 = material1;
        this.material2 = material2;
        this.cost = cost.replace("\"", "");

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public void setMaterial1(String material1) {
        this.material1 = material1;
    }

    public void setMaterial2(String material2) {
        this.material2 = material2;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getDesign() {
        return design;
    }

    public String getBase() {
        return base;
    }

    public String getMaterial1() {
        return material1;
    }

    public String getMaterial2() {
        return material2;
    }

    public String getCost() {
        return cost;
    }
}
