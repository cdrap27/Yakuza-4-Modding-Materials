package Read;

import Model.base;
import Model.design;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class readBase {
    public static ObservableList<base> baseList = FXCollections.observableArrayList();
    public static ObservableList<base> completedBaseList = FXCollections.observableArrayList();

    public static void setBaseList() {
       for(int i = 0; i < openCSV.getLines().size(); i++) {

            List<String> values = Arrays.asList(openCSV.getLines().get(i).split(","));

            //System.out.println(openCSV.getLines().size());
           //System.out.println("0" + values.get(0) + "\n4" + values.get(1)+"\n5" + values.get(2));
            base b = new base(values.get(0),values.get(1),values.get(2));
           baseList.add(b);
            }
        }

        public static ObservableList<base> getBaseList(){
        return baseList;
        }

    }


