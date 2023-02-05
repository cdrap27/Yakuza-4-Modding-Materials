package Controller;

import Read.readDesigns;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

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

    @FXML
    private void initialize(){
        readDesigns.setDesignList();
        partsList.setItems(readDesigns.getDesignList());
        partsListName.setCellValueFactory(new PropertyValueFactory<>("name"));
        partsLIstLocation.setCellValueFactory(new PropertyValueFactory<>("location"));
        partsListCost.setCellValueFactory(new PropertyValueFactory<>("cost"));

    }

    public void onWeaponsBase(ActionEvent actionEvent) {
    }

    public void onGearBase(ActionEvent actionEvent) {
    }

    public void onAll(ActionEvent actionEvent) {
    }

    public void onStillNeeded(ActionEvent actionEvent) {
    }
}
