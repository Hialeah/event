package event;

import constants.*;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Event extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Pane root = new Pane();
        root.setPrefSize(Constants.WIDTH, Constants.HEIGHT);
        
        Scene scene = new Scene(root);
        scene.setFill(Color.valueOf("1175f7"));
        
        Intro intro = new Intro();
        MainView mainView = new MainView();
        
        
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                Platform.runLater(() -> root.getChildren().add(intro));
            }
        }, 2000);
        timer.schedule(new TimerTask() {
            public void run() {
                Platform.runLater(() -> root.getChildren().remove(intro));
            }
        }, 5000);
        timer.schedule(new TimerTask(){
            public void run(){
                Platform.runLater(() -> root.getChildren().add(mainView));
            }
        }, 7000);
        
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
