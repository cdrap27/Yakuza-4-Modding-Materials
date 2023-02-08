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

        public static void setCompletedBaseList() {
            for (int i = 0; i < openCSV.getLines().size(); i++) {

                List<String> values = Arrays.asList(openCSV.getLines().get(i).split(","));

                //System.out.println(openCSV.getLines().size());
                //System.out.println("0" + values.get(0) + "\n4" + values.get(1)+"\n5" + values.get(2));
                base b = new base(values.get(0), values.get(1), values.get(2));
                completedBaseList.add(b);
            }
        }

        public static ObservableList<base>getCompletedBaseList(){
        return completedBaseList;
        }

        public static void setCompleteQty() {
        for (int i = 0; i < readMods.getCompleteModList().size(); i++) {
            for (int j = 0; j < readBase.getCompletedBaseList().size(); j++) {
                if (readMods.getCompleteModList().get(i).getBase().equals(readBase.getCompletedBaseList().get(j).getName())) {
                    readBase.getCompletedBaseList().get(j).setQty(readBase.getCompletedBaseList().get(j).getQty() + 1);
                }
            }
        }
    }

    public static void setQty() {
        for (int i = 0; i < readMods.getModList().size(); i++) {
            for (int j = 0; j < readBase.getBaseList().size(); j++) {
                if (readMods.getModList().get(i).getBase().equals(readBase.getBaseList().get(j).getName())) {
                    readBase.getBaseList().get(j).setQty(readBase.getBaseList().get(j).getQty() + 1);
                }
            }
        }
    }
    }


