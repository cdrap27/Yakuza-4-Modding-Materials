package Controller;

import Read.readBase;
import Read.readDesigns;
import Read.readMods;
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
        partsList.setItems(readDesigns.getDesignList());
        partsListName.setCellValueFactory(new PropertyValueFactory<>("name"));
        partsLIstLocation.setCellValueFactory(new PropertyValueFactory<>("location"));
        partsListCost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        partsListQty.setCellValueFactory(new PropertyValueFactory<>("qty"));

        modList.setItems(readMods.getModList());
        modListName.setCellValueFactory(new PropertyValueFactory<>("name"));
        modListBase.setCellValueFactory(new PropertyValueFactory<>("base"));
        modLIstDesign.setCellValueFactory(new PropertyValueFactory<>("design"));
        modListMaterial1.setCellValueFactory(new PropertyValueFactory<>("material1"));
        modLIstMaterial2.setCellValueFactory(new PropertyValueFactory<>("material2"));
        modListCost.setCellValueFactory(new PropertyValueFactory<>("cost"));

        baseList.setItems(readBase.getBaseList());
        baseListName.setCellValueFactory(new PropertyValueFactory<>("name"));
        baseListCost.setCellValueFactory(new PropertyValueFactory<>("cost"));
        baseListLocation.setCellValueFactory(new PropertyValueFactory<>("location"));
        baseListQty.setCellValueFactory(new PropertyValueFactory<>("qty"));


    }

    public void onWeaponsBase(ActionEvent actionEvent) {
    }

    public void onGearBase(ActionEvent actionEvent) {
    }

    public void onAll(ActionEvent actionEvent) {
        partsList.setItems(readDesigns.getDesignList());
    }

    public void onStillNeeded(ActionEvent actionEvent) {
        partsList.setItems(readDesigns.getCompletedDesignList());
    }
}
