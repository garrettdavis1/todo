/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ToDo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ToDo extends Application {
ArrayList Week;
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        Stage stage1 = new Stage(); // Create a new stage

        stage1.setTitle("Set To Do"); // Set the stage title
        //grid pane/text enter
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        Button add = new Button("Add");
        add.setAlignment(Pos.BOTTOM_RIGHT);
        Button clear = new Button("Clear");
        clear.setAlignment(Pos.BOTTOM_CENTER);
        ArrayList DaysofWeek=new ArrayList<String>();
        DaysofWeek.add("Monday");
        DaysofWeek.add("Teusday");
        DaysofWeek.add("Wednesday");
        DaysofWeek.add("Thursday");
        DaysofWeek.add("Friday");
        DaysofWeek.add("Saturday");
        DaysofWeek.add("Sunday");
        
      for(int k=0;k<6;k++){
          pane.add(new Label(""+DaysofWeek.get(k)),0,k);
          pane.add(new TextField(),1,k);
      }

        add.setOnAction(e -> SendOut());
        clear.setOnAction(e -> Clear());


        
      
       
        
        Scene prompt = new Scene(pane);
        stage1.setScene(prompt);
        stage1.show();
   
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void SendOut() {
       
    }

    private void Clear() {
        
    }
}
