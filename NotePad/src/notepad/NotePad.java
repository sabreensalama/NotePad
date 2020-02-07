/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.util.HashSet;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class NotePad extends Application {

    @Override
    public void start(Stage primaryStage) {
        double height = 500;
        double width = 1200;
        primaryStage.setTitle("Untitled_Notepad");
        MenuBar menubar = new MenuBar();
        Menu File = new Menu("File");
        MenuItem New = new MenuItem("New");
        MenuItem newWindow = new MenuItem("New Window");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem saveas = new MenuItem("Save As");
        MenuItem pageSetup = new MenuItem("Page Setup");
        MenuItem print = new MenuItem("Print");
        MenuItem exit = new MenuItem("Exit");
        Menu edit = new Menu("Edit");
        MenuItem cut = new MenuItem("Cut");
        MenuItem copy = new MenuItem("Copy");
        MenuItem paste = new MenuItem("Paste");
        MenuItem delete = new MenuItem("delete");

        Menu format = new Menu("Format");
        Menu view = new Menu("View");

        Menu help = new Menu("Help");

        File.getItems().addAll(New, newWindow, open, save, saveas, pageSetup, print, exit);
        edit.getItems().addAll(cut,copy,paste,delete);
        menubar.getMenus().addAll(File, edit, format, view, help);
        TextArea text = new TextArea();
        text.setPrefHeight(height);
        text.setPrefWidth(width);
        VBox vbox = new VBox(menubar, text);
        Scene scene = new Scene(vbox, 900, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
