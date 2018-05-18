package event;

import constants.*;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
        
        /**
         * Create introduction Pane that is basically the introduction to the application
         */
        Intro intro = new Intro();
        
        /**
         * Add the main view of the Event Application 
         */
        MainView mainView = new MainView();
        
        
        /**
         * Creates a transaction introduction to
         * the main view of Event Application.
         * 
         */
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                Platform.runLater(() -> root.getChildren().add(intro));
            }
        }, Constants.INTRO_APPEARANCE);
        timer.schedule(new TimerTask() {
            public void run() {
                Platform.runLater(() -> root.getChildren().remove(intro));
            }
        }, Constants.INTRO_APPEARANCE + 3000); // 3 seconds later
        timer.schedule(new TimerTask(){
            public void run(){
                Platform.runLater(() -> root.getChildren().add(mainView));
            }
        }, Constants.INTRO_APPEARANCE + 5000); // 5 seconds later
        
        
        //Set icon logo
        //primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/images/icon/event.icns")));
        
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
