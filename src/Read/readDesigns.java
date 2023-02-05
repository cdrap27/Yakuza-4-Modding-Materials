package Read;

import Model.design;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Arrays;
import java.util.List;

public class readDesigns {
    public static ObservableList<design> designList = FXCollections.observableArrayList();

    public static void setDesignList(){
       for(int i = 0; i < openCSV.getLines().size(); i++){
           List<String> values = Arrays.asList(openCSV.getLines().get(i).split(","));
           design d = new design(values.get(0), values.get(1));
           designList.add(d);

       }
    }

    public static ObservableList<design> getDesignList(){
        return designList;
    }
}
