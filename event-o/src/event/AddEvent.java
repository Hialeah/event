/**
 * Add Event Part 
 * 
 * @author Carlos Abraham
 */
package event;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class AddEvent extends Pane {

   
    Text text4;
    Text text5;
    Text text6;
    Text text7;
    Text text8;
    Text text9;
    Text text10;
    Text text11;
    Text text12;
    JFXDatePicker jFXDatePicker;
    JFXDatePicker jFXDatePicker0;
    Text text13;
    JFXButton jFXButton;
    TextField textField;
    TextField textField0;
    TextField textField1;
    TextField textField2;
    TextField textField3;
    TextField textField4;
    TextField textField5;
    TextField textField6;

    public AddEvent() {
        
        setStyle("-fx-background-color: #ffffff;");
        setLayoutX(304.0);
        setPrefHeight(700.0);
        setPrefWidth(599.0);
        
        text4 = new Text();
        text5 = new Text();
        text6 = new Text();
        text7 = new Text();
        text8 = new Text();
        text9 = new Text();
        text10 = new Text();
        text11 = new Text();
        text12 = new Text();
        jFXDatePicker = new JFXDatePicker();
        jFXDatePicker0 = new JFXDatePicker();
        text13 = new Text();
        jFXButton = new JFXButton("Save");
        textField = new TextField();
        textField0 = new TextField();
        textField1 = new TextField();
        textField2 = new TextField();
        textField3 = new TextField();
        textField4 = new TextField();
        textField5 = new TextField();
        textField6 = new TextField();


        text4.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text4.setLayoutX(60.0);
        text4.setLayoutY(110.0);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Event Name");
        text4.setFont(new Font(17.0));

        text5.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text5.setLayoutX(60.0);
        text5.setLayoutY(158.0);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Organization");
        text5.setFont(new Font(17.0));

        text6.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text6.setLayoutX(60.0);
        text6.setLayoutY(211.0);
        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Advisor");
        text6.setFont(new Font(17.0));

        text7.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text7.setLayoutX(60.0);
        text7.setLayoutY(262.0);
        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("Transportation");
        text7.setFont(new Font(17.0));

        text8.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text8.setLayoutX(60.0);
        text8.setLayoutY(319.0);
        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("Number of Students in Organization");
        text8.setFont(new Font(17.0));

        text9.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text9.setLayoutX(60.0);
        text9.setLayoutY(382.0);
        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("Number of Students Attending Event");
        text9.setFont(new Font(17.0));

        text10.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text10.setLayoutX(60.0);
        text10.setLayoutY(443.0);
        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText("Number of Chaperones Attending Event");
        text10.setFont(new Font(17.0));

        text11.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text11.setLayoutX(60.0);
        text11.setLayoutY(512.0);
        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText("Date");
        text11.setFont(new Font(17.0));

        text12.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text12.setLayoutX(320.0);
        text12.setLayoutY(509.0);
        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setText("to");
        text12.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text12.setFont(new Font(17.0));

        jFXDatePicker.setLayoutX(122.0);
        jFXDatePicker.setLayoutY(489.0);
        jFXDatePicker.setStyle("-jfx-default-color: #1175f7");
        
        jFXDatePicker0.setLayoutX(377.0);
        jFXDatePicker0.setLayoutY(489.0);
        jFXDatePicker0.setStyle("-jfx-default-color: #1175f7");
        
        text13.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text13.setLayoutX(63.0);
        text13.setLayoutY(574.0);
        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setText("Location");
        text13.setFont(new Font(17.0));

        jFXButton.setLayoutX(479.0);
        jFXButton.setLayoutY(614.0);
        jFXButton.setStyle("-fx-background-color: #1175f7;"
                          +"-fx-text-fill: WHITE;");

        textField.setLayoutX(207.0);
        textField.setLayoutY(83.0);

        textField0.setLayoutX(207.0);
        textField0.setLayoutY(126.0);

        textField1.setLayoutX(207.0);
        textField1.setLayoutY(182.0);

        textField2.setLayoutX(207.0);
        textField2.setLayoutY(233.0);

        textField3.setLayoutX(405.0);
        textField3.setLayoutY(290.0);
        textField3.setPrefHeight(26.0);
        textField3.setPrefWidth(61.0);

        textField4.setLayoutX(405.0);
        textField4.setLayoutY(353.0);
        textField4.setPrefHeight(26.0);
        textField4.setPrefWidth(61.0);

        textField5.setLayoutX(405.0);
        textField5.setLayoutY(414.0);
        textField5.setPrefHeight(26.0);
        textField5.setPrefWidth(61.0);

        textField6.setLayoutX(60.0);
        textField6.setLayoutY(588.0);
        textField6.setPrefHeight(26.0);
        textField6.setPrefWidth(213.0);
        
        getChildren().add(text4);
        getChildren().add(text5);
        getChildren().add(text6);
        getChildren().add(text7);
        getChildren().add(text8);
        getChildren().add(text9);
        getChildren().add(text10);
        getChildren().add(text11);
        getChildren().add(text12);
        getChildren().add(jFXDatePicker);
        getChildren().add(jFXDatePicker0);
        getChildren().add(text13);
        getChildren().add(jFXButton);
        getChildren().add(textField);
        getChildren().add(textField0);
        getChildren().add(textField1);
        getChildren().add(textField2);
        getChildren().add(textField3);
        getChildren().add(textField4);
        getChildren().add(textField5);
        getChildren().add(textField6);
    }
}
