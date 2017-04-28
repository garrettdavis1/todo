/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
public class ToDo extends Application {
//initialize array lists

    ArrayList DaysofWeek = new ArrayList<Day>();
    ArrayList TextInFields = new ArrayList<String>();
    ArrayList tf= new ArrayList<TextField>();
    
    
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        //initialize stage, buttons, and panes
        Stage stage1 = new Stage(); // Create a new stage
        Stage stage2 = new Stage();
        stage2.setTitle("To Do");
        stage1.setTitle("Set To Do"); // Set the stage title
        BorderPane bPane = new BorderPane();
        GridPane pane = new GridPane();
        VBox showlist = new VBox();
        HBox addButtons = new HBox();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        Button add = new Button("Add");
        Button clear = new Button("Clear");

        //initialize the days of week array just has the names of mon-fri
        DaysofWeek.add("Monday");
        DaysofWeek.add("Teusday");
        DaysofWeek.add("Wednesday");
        DaysofWeek.add("Thursday");
        DaysofWeek.add("Friday");
        DaysofWeek.add("Saturday");
        DaysofWeek.add("Sunday");

        //declare the textfields
        for (int k = 0; k < 7; k++) {
            pane.add(new Label("" + DaysofWeek.get(k)), 0, k);
            pane.add(new TextField(""), 1, k);
        }

        add.setOnAction(e -> {
            SendOut();
        });
        clear.setOnAction(e -> {
            Clear();
        });

        //add nodes to the pane
        addButtons.getChildren().addAll(add);//clear?! maybe put on the show
        bPane.setCenter(pane);
        bPane.setBottom(addButtons);
        //show the panes and stages
        Scene prompt = new Scene(bPane);
        stage1.setScene(prompt);
        stage1.show();
        
        Text showtxt=new Text("Show here");
        
        showlist.getChildren().addAll(showtxt);
        Scene show = new Scene(showlist);
        stage2.setScene(show);
        stage2.show();

    }
//need to add handler classes or do anon inner classes

    public static void main(String[] args) {
        launch(args);
    }

    public void SendOut() {
        //sends to an arraylist that holds the string of each day
       for(int k=0;k<7;k++){
          String day=DaysofWeek.get(k).getName();
       }
    }

    private void Clear() {
    }
}
