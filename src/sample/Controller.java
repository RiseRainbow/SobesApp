package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class Controller {
    @FXML
    public TextArea area_one;
    public ListView my_list;
    public Button del_but;
    @FXML
    private Button mybut;

    ArrayList<String> arrayList = new ArrayList<>();
    ObservableList<String> newLangs = FXCollections.observableArrayList();
    int index_delete = 0;//"PHP", "Go", "C++"
    /*@FXML
    public void initialize(){
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                button.setText("Thanks!");
            }
        });
    }*/
    @FXML
    public void onClickMethod(){ // Добавление элемента по кнопке батон
        //mybut.setText(area_one.getText());
        newLangs.add(area_one.getText());
        my_list.setItems(newLangs);

    }

    public void list_edit(ListView.EditEvent editEvent) {
    }

    public void delClick(ActionEvent actionEvent) { // обработка события клика по кнопке делит
        newLangs.remove(index_delete);

    }

    public void focusClick(MouseEvent mouseEvent) {  // Беру id выбранного элемента списка
        System.out.println(mouseEvent.getTarget());
        index_delete = my_list.getSelectionModel().getSelectedIndex();

    }
}
