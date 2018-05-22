/**
 * MIT License
 * Copyright (c) 2018 MDC Blue and/or its contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * 
 *  @author Carlos Abraham Hernandez
 *  @repository https://github.com/MDCblue/Event.git
 *  @see https://event.mdc.blue
 */
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
        root.setStyle("-fx-background-color: #1175f7;");
        
        Scene scene = new Scene(root);
        
        /**
         * Create introduction Pane that is basically the introduction to the application
         */
        Intro intro = new Intro();
        
        /**
         * Add the main view of the Event Application 
         */
        MainView mainView = new MainView();
        
        /**
         * Create the left side bar of the Main View
         */
        Side side = new Side();
        
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
        
        timer.schedule(new TimerTask(){
            public void run(){
                Platform.runLater(() -> {
                    Platform.runLater(() -> root.getChildren().remove(intro));
                    root.getChildren().addAll(mainView, side);
                });
            }
        }, Constants.INTRO_APPEARANCE + 3000); // 3 seconds later
        
        
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