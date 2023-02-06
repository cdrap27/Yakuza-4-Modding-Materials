package Read;

import Model.design;
import Model.mods;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class readMods {
    public static  ArrayList<String> weapon;
    private static ObservableList<mods> modList = FXCollections.observableArrayList();
    private ObservableList<mods> completeModList = FXCollections.observableArrayList();

    public static void setModList() throws FileNotFoundException {
        File file = new File("weapons.txt");
        PrintWriter pw = new PrintWriter(file);
        weapon = new ArrayList<String>();
        for(int i = 0; i < openCSV.getLines().size(); i++){
            List<String> values = Arrays.asList(openCSV.getLines().get(i).split(","));
            mods m = new mods(values.get(0), values.get(1), values.get(2), values.get(3), values.get(4), (values.get(5))+","+values.get(6));
            Boolean duplicate = false;
            for(int j = 0; j < weapon.size(); j++){
                if(weapon.get(j).equals(values.get(2)))
                    duplicate = true;
            }
            if(duplicate == false){
                weapon.add(values.get(2));
                pw.append(values.get(2)+"\n");
            }
            modList.add(m);

        }
        pw.close();
    }

    public static ObservableList<mods> getModList(){
        return modList;
    }

}
