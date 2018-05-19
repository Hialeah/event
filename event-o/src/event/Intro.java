package event;

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
 */
public class Intro extends Pane {

    Text text;
    ImageView imageView;
    Reflection reflection;
    Text text0;
    Text text1;

    public Intro() {

        text = new Text();
        imageView = new ImageView();
        reflection = new Reflection();
        text0 = new Text();
        text1 = new Text();

        setPrefHeight(constants.Constants.HEIGHT);
        setPrefWidth(constants.Constants.WIDTH);
        setStyle("-fx-background-color: #1175f7;");

        text.setFill(javafx.scene.paint.Color.valueOf("#ff5e5e"));
        text.setLayoutX(389.0);
        text.setLayoutY(367.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("vent");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setFont(Font.font("Arial Narrow", FontWeight.BOLD, 93.0));
       
        imageView.setFitHeight(150.0);
        imageView.setFitWidth(200.0);
        imageView.setLayoutX(280.0);
        imageView.setLayoutY(241.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("/images/event/event-logo.png").toExternalForm()));

        imageView.setEffect(reflection);

        text0.setFill(javafx.scene.paint.Color.valueOf("#ff5e5e"));
        text0.setLayoutX(559.0);
        text0.setLayoutY(290.0);
//        text0.setRotate(128.7);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("#");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setWrappingWidth(57.33);
        text0.setFont(new Font("Arial Narrow Bold", 69.0));

        text1.setFill(javafx.scene.paint.Color.WHITE);
        text1.setLayoutX(393.0);
        text1.setLayoutY(657.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setFont(new Font("Baghdad", 17.0));
        text1.setText("Event  ©  MDC Blue");

        getChildren().add(text);
        getChildren().add(imageView);
        getChildren().add(text0);
        getChildren().add(text1);

    }
}