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

    public static void setQty(){
        for(int i = 0; i < readMods.getModList().size(); i++){
            for(int j = 0; j < readDesigns.getDesignList().size(); j++){
                if(readMods.getModList().get(i).getMaterial1().equals(readDesigns.getDesignList().get(j).getName()) ||
                        readMods.getModList().get(i).getMaterial2().equals(readDesigns.getDesignList().get(j).getName())){
                    readDesigns.getDesignList().get(j).setQty(readDesigns.getDesignList().get(j).getQty() + 1);
                }
            }
        }

    }

    public static void setCompleteQty(){
        for(int i = 0; i < readMods.getCompleteModList().size(); i++){
            for(int j = 0; j < readDesigns.getCompletedDesignList().size(); j++){
                if(readMods.getCompleteModList().get(i).getMaterial1().equals(readDesigns.getCompletedDesignList().get(j).getName()) ||
                        readMods.getCompleteModList().get(i).getMaterial2().equals(readDesigns.getCompletedDesignList().get(j).getName())){
                    readDesigns.getCompletedDesignList().get(j).setQty(readDesigns.getCompletedDesignList().get(j).getQty() + 1);
                }
            }
        }
     // for(int i = 0; i < readDesigns.getCompletedDesignList().size(); i++){
         /* if(!readDesigns.getCompletedDesignList().get(i).getIsDesign())
          readDesigns.getCompletedDesignList().get(i).setQty(readDesigns.getCompletedDesignList().get(i).getQty() -1);
      }*/
    }
}
