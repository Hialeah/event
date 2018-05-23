package blue.mdc.event;

import blue.mdc.event.constants.Constants;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * Introduction to Event Application
 * 
 * @author Carlos Abraham
 * @see Event
 */
public class Intro extends Pane {

    Text eventText;
    ImageView logo;
    ImageView gif;
    Reflection reflection;
    Text copyright;
    
    /**
     * Constructor for introduction of the Event Application
     * 
     * @see Intro
     */
    public Intro() {

        eventText = new Text();
        logo = new ImageView();
        reflection = new Reflection();
        copyright = new Text();
        gif = new ImageView();

        setPrefHeight(Constants.HEIGHT);
        setPrefWidth(Constants.WIDTH);
        setStyle("-fx-background-color: #1175f7;");
        
        /* This text is commented because the introduction 
         * is using the .gif but you can uncomment it you want.
         */
        eventText.setFill(javafx.scene.paint.Color.valueOf("#ff5e5e"));
        eventText.setLayoutX(389.0);
        eventText.setLayoutY(367.0);
        eventText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        eventText.setStrokeWidth(0.0);
        eventText.setText("vent");
        eventText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        eventText.setFont(Font.font("Arial Narrow", FontWeight.BOLD, 93.0));
       
        logo.setFitHeight(150.0);
        logo.setFitWidth(200.0);
        logo.setLayoutX(280.0);
        logo.setLayoutY(241.0);
        logo.setPickOnBounds(true);
        logo.setPreserveRatio(true);
        logo.setImage(new Image(getClass().getResource("/blue/mdc/event/images/event/event-logo.png").toExternalForm()));
        logo.setEffect(reflection);
        
        gif.setFitHeight(137.0);
        gif.setFitWidth(291.0);
        gif.setLayoutX(391.0);
        gif.setLayoutY(287.0);
        gif.setPickOnBounds(true);
        gif.setPreserveRatio(true);
        gif.setImage(new Image(getClass().getResource("/blue/mdc/event/images/gif/vent.gif").toExternalForm()));
        
        copyright.setFill(javafx.scene.paint.Color.WHITE);
        copyright.setLayoutX(393.0);
        copyright.setLayoutY(657.0);
        copyright.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        copyright.setStrokeWidth(0.0);
        copyright.setFont(new Font("Baghdad", 17.0));
        copyright.setText("Event  ©  MDC Blue");

         getChildren().add(eventText); 
        getChildren().add(logo);
        getChildren().add(copyright);
        getChildren().add(gif);

    }
}