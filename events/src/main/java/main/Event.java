package main;

import constants.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Event extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Pane root = new Pane();
        root.setPrefSize(Constants.WIDTH, Constants.HEIGHT);
        
        Scene scene = new Scene(root);
        
        Pane intro = new Intro();
        
        root.getChildren().addAll(intro);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    /**
     * @param commands the command line arguments
     */
    public static void main(String[] commands){
        launch(commands);
    }
}
