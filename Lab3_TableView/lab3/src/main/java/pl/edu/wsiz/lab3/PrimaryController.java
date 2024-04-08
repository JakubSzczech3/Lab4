package pl.edu.wsiz.lab3;

import java.io.IOException;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {
    @FXML public TableColumn col_im;
    @FXML public TableColumn col_na;
    @FXML public TableView tab;

    @FXML public void initialize(){
        col_im.setCellValueFactory(
                new PropertyValueFactory<>("imie"));
        col_na.setCellValueFactory(
                new PropertyValueFactory<>("nazwisko"));


    ObservableList<Osoba> list = FXCollections.observableArrayList();
    list.addAll(new Osoba("adasd","asddsadas"));
    list.addAll(new Osoba("adasd","asddsadas"));
    list.addAll(new Osoba("adasd","asddsadas"));

    //dodaj elementy listy
    tab.getItems().addAll(list);
    }
    
}
