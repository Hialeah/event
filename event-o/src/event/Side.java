package event;

import com.jfoenix.controls.JFXTextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author Carlos Abraham
 */
public class Side extends Pane{
    
    
        Pane pane0 = new Pane();
        Text text0 = new Text();
        ImageView imageView0 = new ImageView();
        Pane pane1 = new Pane();
        Text text1 = new Text();
        ImageView imageView1 = new ImageView();
        Pane search = new Pane();
        ImageView imageView2 = new ImageView();
        JFXTextField textField = new JFXTextField();
        Pane pane3 = new Pane();
        Text text2 = new Text();
        ImageView imageView3 = new ImageView();
        Pane pane4 = new Pane();
        Text text3 = new Text();
        ImageView imageView4 = new ImageView();
        
        public Side(){
            
        setPrefHeight(700.0);
        setPrefWidth(304.0);
        
        pane0.setLayoutY(137.0);
        pane0.setPrefHeight(46.0);
        pane0.setPrefWidth(303.0);
        pane0.setOnMouseEntered(e -> {pane0.setStyle("-fx-background-color: #2185ff;");});
        pane0.setOnMouseExited(e -> {pane0.setStyle("-fx-background-color: #1175f7;");});
        pane0.setOnMouseClicked(e ->{
            AddEvent addEvent = new AddEvent();
            getChildren().add(addEvent);
        });

        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setLayoutX(83.0);
        text0.setLayoutY(30.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("New Event");
        text0.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView0.setLayoutX(45.0);
        imageView0.setLayoutY(11.0);
        imageView0.setImage(new Image(getClass().getResource("/images/icons/icons8-joyent.png").toExternalForm()));

        pane1.setLayoutY(198.0);
        pane1.setPrefHeight(46.0);
        pane1.setPrefWidth(303.0);
        pane1.setOnMouseEntered(e -> {pane1.setStyle("-fx-background-color: #2185ff;");});
        pane1.setOnMouseExited(e -> {pane1.setStyle("-fx-background-color: #1175f7;");});
        

        text1.setFill(javafx.scene.paint.Color.WHITE);
        text1.setLayoutX(83.0);
        text1.setLayoutY(30.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Edit Event");
        text1.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView1.setLayoutX(45.0);
        imageView1.setLayoutY(9.0);
        imageView1.setImage(new Image(getClass().getResource("/images/icons/icons8-pencil_tip.png").toExternalForm()));

        search.setLayoutY(45.0);
        search.setPrefHeight(46.0);
        search.setPrefWidth(303.0);
        

        imageView2.setLayoutX(27.0);
        imageView2.setLayoutY(12.0);
        imageView2.setImage(new Image(getClass().getResource("/images/icons/icons8-search.png").toExternalForm()));
       
        textField.setLayoutX(68.0);
        textField.setLayoutY(11.0);
        textField.setStyle("-jfx-focus-color: #ffffff;"
                + "-fx-text-fill: WHITE;");

        pane3.setLayoutY(259.0);
        pane3.setPrefHeight(46.0);
        pane3.setPrefWidth(303.0);
        pane3.setOnMouseEntered(e -> {pane3.setStyle("-fx-background-color: #2185ff;");});
        pane3.setOnMouseExited(e -> {pane3.setStyle("-fx-background-color: #1175f7;");});

        text2.setFill(javafx.scene.paint.Color.WHITE);
        text2.setLayoutX(83.0);
        text2.setLayoutY(30.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Instructions");
        text2.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView3.setLayoutX(45.0);
        imageView3.setLayoutY(9.0);
        imageView3.setImage(new Image(getClass().getResource("/images/icons/icons8-bulleted_list.png").toExternalForm()));
        
        pane4.setLayoutY(312.0);
        pane4.setPrefHeight(46.0);
        pane4.setPrefWidth(303.0);
        pane4.setOnMouseEntered(e -> {pane4.setStyle("-fx-background-color: #2185ff;");});
        pane4.setOnMouseExited(e -> {pane4.setStyle("-fx-background-color: #1175f7;");});

        text3.setFill(javafx.scene.paint.Color.WHITE);
        text3.setLayoutX(83.0);
        text3.setLayoutY(30.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("View Event ");
        text3.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView4.setLayoutX(45.0);
        imageView4.setLayoutY(9.0);
        imageView4.setImage(new Image(getClass().getResource("/images/icons/icons8-star.png").toExternalForm()));

        
        pane0.getChildren().addAll(text0, imageView0);
        getChildren().add(pane0);
        
        pane1.getChildren().addAll(text1, imageView1);
        getChildren().add(pane1);
        
        search.getChildren().addAll(imageView2, textField);
        getChildren().add(search);
        
        pane3.getChildren().addAll(text2, imageView3);
        getChildren().add(pane3);
        
        pane4.getChildren().addAll(text3, imageView4);
        getChildren().add(pane4);
        }
}
