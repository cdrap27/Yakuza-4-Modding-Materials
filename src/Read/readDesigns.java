package Read;

import Model.design;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class readDesigns {
    public static ObservableList<design> designList = FXCollections.observableArrayList();

    public static void setDesignList(){
        design d = new design("Kamiyama Weapon Catalog", "Beam (3,800 yen) as Akiyama");
        designList.add(d);
    }

    public static ObservableList<design> getDesignList(){
        return designList;
    }
}
