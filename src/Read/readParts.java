package Read;

import Model.design;

import java.util.Arrays;
import java.util.List;

public class readParts {

    public static void setPartList(){
        for(int i = 0; i < openCSV.getLines().size(); i++){
            List<String> values = Arrays.asList(openCSV.getLines().get(i).split(","));
            design d = new design(values.get(0), values.get(1), 0, false);
            readDesigns.getDesignList().add(d);

        }
    }

    public static void setCompletePartList(){
        for(int i = 0; i < openCSV.getLines().size(); i++){
            List<String> values = Arrays.asList(openCSV.getLines().get(i).split(","));
            design d = new design(values.get(0), values.get(1), 0, false);
            readDesigns.getCompletedDesignList().add(d);

        }
    }

}
