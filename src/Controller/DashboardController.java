package Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class DashboardController {
    public TableView modList;
    public TableColumn modListName;
    public TableColumn modLIstDesign;
    public TableColumn modListBase;
    public TableColumn modListMaterial1;
    public TableColumn modLIstMaterial2;
    public TableColumn modListCost;
    public TableView baseList;
    public TableColumn baseListName;
    public TableColumn baseListLocation;
    public TableColumn baseListCost;
    public TableView partsList;
    public TableColumn partsListName;
    public TableColumn partsLIstLocation;
    public TableColumn partsListCost;
    public ChoiceBox modLIstOption;
    public ChoiceBox partsOption;
    public ChoiceBox baseOption;
    public TableColumn baseListQty;
    public TableColumn partsListQty;
    public RadioButton mainAll;
    public ToggleGroup mainSelector;
    public RadioButton mainStillNeeded;

    public void onWeaponsBase(ActionEvent actionEvent) {
    }

    public void onGearBase(ActionEvent actionEvent) {
    }

    public void onAll(ActionEvent actionEvent) {
    }

    public void onStillNeeded(ActionEvent actionEvent) {
    }
}
