/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class Login extends Application {
    
       ImageView createImageFromURL(String imageURL){
        Image image = new Image( "https://picsum.photos/200", 200, 200, true, true);
        ImageView imageView = new ImageView(image);
        return imageView;
    }
    
    @Override
    public void start(Stage primaryStage) {
       GridPane pane = new GridPane();
       pane.setAlignment(Pos.CENTER);
       pane.setPadding(new Insets(10));
       pane.setHgap(10);
       pane.setVgap(10);
       
       pane.add(new Label("username"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("password"), 0, 1);
        pane.add(new TextField(),1, 1);
        
        Button log = new Button("login");
        Button reg = new Button("register");
        pane.add(log, 1, 2);
        pane.add(reg, 0, 2);
        HBox hb = new HBox();
        hb.setPadding(new Insets(20));
        hb.setAlignment(Pos.CENTER);
        hb.setSpacing(15);
        String imageURL ="https://picsum.photos/200";
        hb.getChildren().add(createImageFromURL(imageURL));
       
        StackPane p = new StackPane();
         p.getChildren().addAll(hb,pane);
        Scene scene = new Scene(p, 300, 200);
        
        primaryStage.setTitle("Hello World!");
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
