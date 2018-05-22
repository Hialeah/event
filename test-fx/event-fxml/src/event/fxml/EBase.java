package event.fxml;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class EBase extends Pane {

    protected final Pane pane;
    protected final Text text;
    protected final ImageView imageView;
    protected final Pane pane0;
    protected final ImageView imageView0;
    protected final JFXTextField jFXTextField;
    protected final Pane pane1;
    protected final Text text0;
    protected final ImageView imageView1;
    protected final Pane pane2;
    protected final Text text1;
    protected final ImageView imageView2;
    protected final Pane pane3;
    protected final Text text2;
    protected final ImageView imageView3;
    protected final Pane pane4;
    protected final Text text3;
    protected final ImageView imageView4;
    protected final Pane pane5;
    protected final Text text4;
    protected final ImageView imageView5;
    protected final Pane pane6;
    protected final Text text5;
    protected final ImageView imageView6;
    protected final Pane pane7;
    protected final Text text6;
    protected final Text text7;
    protected final Text text8;
    protected final Text text9;
    protected final Text text10;
    protected final Text text11;
    protected final Text text12;
    protected final Text text13;
    protected final Text text14;
    protected final JFXButton jFXButton;
    protected final TextField textField;
    protected final TextField textField0;
    protected final TextField textField1;
    protected final TextField textField2;
    protected final TextField textField3;
    protected final TextField textField4;
    protected final TextField textField5;
    protected final TextField textField6;
    protected final Text text15;
    protected final MenuButton menuButton;
    protected final MenuItem menuItem;
    protected final MenuItem menuItem0;

    public EBase() {

        pane = new Pane();
        text = new Text();
        imageView = new ImageView();
        pane0 = new Pane();
        imageView0 = new ImageView();
        jFXTextField = new JFXTextField();
        pane1 = new Pane();
        text0 = new Text();
        imageView1 = new ImageView();
        pane2 = new Pane();
        text1 = new Text();
        imageView2 = new ImageView();
        pane3 = new Pane();
        text2 = new Text();
        imageView3 = new ImageView();
        pane4 = new Pane();
        text3 = new Text();
        imageView4 = new ImageView();
        pane5 = new Pane();
        text4 = new Text();
        imageView5 = new ImageView();
        pane6 = new Pane();
        text5 = new Text();
        imageView6 = new ImageView();
        pane7 = new Pane();
        text6 = new Text();
        text7 = new Text();
        text8 = new Text();
        text9 = new Text();
        text10 = new Text();
        text11 = new Text();
        text12 = new Text();
        text13 = new Text();
        text14 = new Text();
        jFXButton = new JFXButton();
        textField = new TextField();
        textField0 = new TextField();
        textField1 = new TextField();
        textField2 = new TextField();
        textField3 = new TextField();
        textField4 = new TextField();
        textField5 = new TextField();
        textField6 = new TextField();
        text15 = new Text();
        menuButton = new MenuButton();
        menuItem = new MenuItem();
        menuItem0 = new MenuItem();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(700.0);
        setPrefWidth(900.0);
        setStyle("-fx-background-color: #1175f7;");

        pane.setPrefHeight(700.0);
        pane.setPrefWidth(304.0);
        pane.setStyle("-fx-background-color: #1175f7;");

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(98.0);
        text.setLayoutY(672.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Event © MDC Blue");

        imageView.setFitHeight(96.0);
        imageView.setFitWidth(79.0);
        imageView.setLayoutX(117.0);
        imageView.setLayoutY(542.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../../../../../event-o/src/images/event/event-logo.png").toExternalForm()));

        pane0.setLayoutY(45.0);
        pane0.setPrefHeight(46.0);
        pane0.setPrefWidth(303.0);

        imageView0.setLayoutX(27.0);
        imageView0.setLayoutY(12.0);
        imageView0.setImage(new Image(getClass().getResource("../../../../../../../Documents/com.visualpharm.Icons8/android_l/Popular%20Icons/25/ffffff/icons8-search.png").toExternalForm()));

        jFXTextField.setLayoutX(62.0);
        jFXTextField.setLayoutY(10.0);

        pane1.setLayoutY(137.0);
        pane1.setPrefHeight(46.0);
        pane1.setPrefWidth(303.0);

        text0.setFill(javafx.scene.paint.Color.WHITE);
        text0.setLayoutX(85.0);
        text0.setLayoutY(30.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("New Event");
        text0.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView1.setFitHeight(24.0);
        imageView1.setFitWidth(24.0);
        imageView1.setLayoutX(45.0);
        imageView1.setLayoutY(11.0);
        imageView1.setImage(new Image(getClass().getResource("../../../../../event-o/src/images/icons/icons8-joyent.png").toExternalForm()));

        pane2.setLayoutX(7.0);
        pane2.setLayoutY(192.0);
        pane2.setPrefHeight(46.0);
        pane2.setPrefWidth(303.0);

        text1.setFill(javafx.scene.paint.Color.WHITE);
        text1.setLayoutX(85.0);
        text1.setLayoutY(30.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Edit Event");
        text1.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView2.setLayoutX(45.0);
        imageView2.setLayoutY(9.0);
        imageView2.setImage(new Image(getClass().getResource("../../../../../../../Documents/com.visualpharm.Icons8/android_l/Editing/25/ffffff/icons8-pencil_tip.png").toExternalForm()));

        pane3.setLayoutX(1.0);
        pane3.setLayoutY(240.0);
        pane3.setPrefHeight(46.0);
        pane3.setPrefWidth(303.0);

        text2.setFill(javafx.scene.paint.Color.WHITE);
        text2.setLayoutX(85.0);
        text2.setLayoutY(30.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Add Traveler");
        text2.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView3.setLayoutX(45.0);
        imageView3.setLayoutY(11.0);
        imageView3.setImage(new Image(getClass().getResource("../../../../../../../Documents/com.visualpharm.Icons8/android_l/Profile/25/ffffff/icons8-add_user.png").toExternalForm()));

        pane4.setLayoutX(7.0);
        pane4.setLayoutY(297.0);
        pane4.setPrefHeight(46.0);
        pane4.setPrefWidth(303.0);

        text3.setFill(javafx.scene.paint.Color.WHITE);
        text3.setLayoutX(85.0);
        text3.setLayoutY(30.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Add Traveler");
        text3.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView4.setLayoutX(45.0);
        imageView4.setLayoutY(8.0);
        imageView4.setImage(new Image(getClass().getResource("../../../../../../../Documents/com.visualpharm.Icons8/android_l/Profile/25/ffffff/icons8-edit_user.png").toExternalForm()));

        pane5.setLayoutY(350.0);
        pane5.setPrefHeight(46.0);
        pane5.setPrefWidth(303.0);

        text4.setFill(javafx.scene.paint.Color.WHITE);
        text4.setLayoutX(83.0);
        text4.setLayoutY(30.0);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("View Event ");
        text4.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView5.setLayoutX(45.0);
        imageView5.setLayoutY(9.0);
        imageView5.setImage(new Image(getClass().getResource("../../../../../Documents/com.visualpharm.Icons8/android_l/Messaging/25/ffffff/icons8-star.png").toExternalForm()));

        pane6.setLayoutX(1.0);
        pane6.setLayoutY(408.0);
        pane6.setPrefHeight(46.0);
        pane6.setPrefWidth(303.0);

        text5.setFill(javafx.scene.paint.Color.WHITE);
        text5.setLayoutX(83.0);
        text5.setLayoutY(30.0);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Instructions");
        text5.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        imageView6.setLayoutX(45.0);
        imageView6.setLayoutY(9.0);
        imageView6.setImage(new Image(getClass().getResource("../../../../../../../Documents/com.visualpharm.Icons8/android_l/Editing/25/ffffff/icons8-bulleted_list.png").toExternalForm()));

        pane7.setLayoutX(304.0);
        pane7.setPrefHeight(700.0);
        pane7.setPrefWidth(599.0);
        pane7.setStyle("-fx-background-color: #ffffff;");

        text6.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text6.setLayoutX(56.0);
        text6.setLayoutY(159.0);
        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Name");
        text6.setFont(new Font(17.0));

        text7.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text7.setLayoutX(56.0);
        text7.setLayoutY(211.0);
        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("Last Name");
        text7.setFont(new Font(17.0));

        text8.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text8.setLayoutX(56.0);
        text8.setLayoutY(275.0);
        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText("MDC ID");
        text8.setFont(new Font(17.0));

        text9.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text9.setLayoutX(56.0);
        text9.setLayoutY(339.0);
        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("Phone");
        text9.setFont(new Font(17.0));

        text10.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text10.setLayoutX(56.0);
        text10.setLayoutY(392.0);
        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setText("Email");
        text10.setFont(new Font(17.0));

        text11.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text11.setLayoutX(56.0);
        text11.setLayoutY(448.0);
        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setText("Address");
        text11.setFont(new Font(17.0));

        text12.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text12.setLayoutX(56.0);
        text12.setLayoutY(505.0);
        text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text12.setStrokeWidth(0.0);
        text12.setText("City");
        text12.setFont(new Font(17.0));

        text13.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text13.setLayoutX(56.0);
        text13.setLayoutY(565.0);
        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setText("Main Campus");
        text13.setFont(new Font(17.0));

        text14.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        text14.setLayoutX(284.0);
        text14.setLayoutY(505.0);
        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        text14.setText("Zip Code");
        text14.setFont(new Font(17.0));

        jFXButton.setLayoutX(479.0);
        jFXButton.setLayoutY(614.0);

        textField.setLayoutX(160.0);
        textField.setLayoutY(131.0);

        textField0.setLayoutX(160.0);
        textField0.setLayoutY(179.0);

        textField1.setLayoutX(160.0);
        textField1.setLayoutY(246.0);

        textField2.setLayoutX(160.0);
        textField2.setLayoutY(310.0);

        textField3.setLayoutX(160.0);
        textField3.setLayoutY(363.0);
        textField3.setPrefHeight(26.0);
        textField3.setPrefWidth(264.0);

        textField4.setLayoutX(160.0);
        textField4.setLayoutY(419.0);
        textField4.setPrefHeight(26.0);
        textField4.setPrefWidth(264.0);

        textField5.setLayoutX(111.0);
        textField5.setLayoutY(478.0);
        textField5.setPrefHeight(26.0);
        textField5.setPrefWidth(145.0);

        textField6.setLayoutX(379.0);
        textField6.setLayoutY(478.0);
        textField6.setPrefHeight(26.0);
        textField6.setPrefWidth(109.0);

        text15.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        text15.setLayoutX(58.0);
        text15.setLayoutY(93.0);
        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        text15.setText("Add Traveler");
        text15.setWrappingWidth(151.5982458628714);
        text15.setFont(new Font("System Bold", 22.0));

        menuButton.setLayoutX(218.0);
        menuButton.setLayoutY(546.0);
        menuButton.setMnemonicParsing(false);
        menuButton.setText("MenuButton");

        menuItem.setMnemonicParsing(false);
        menuItem.setText("Action 1");

        menuItem0.setMnemonicParsing(false);
        menuItem0.setText("Action 2");

        pane.getChildren().add(text);
        pane.getChildren().add(imageView);
        pane0.getChildren().add(imageView0);
        pane0.getChildren().add(jFXTextField);
        pane.getChildren().add(pane0);
        pane1.getChildren().add(text0);
        pane1.getChildren().add(imageView1);
        pane.getChildren().add(pane1);
        pane2.getChildren().add(text1);
        pane2.getChildren().add(imageView2);
        pane.getChildren().add(pane2);
        pane3.getChildren().add(text2);
        pane3.getChildren().add(imageView3);
        pane.getChildren().add(pane3);
        pane4.getChildren().add(text3);
        pane4.getChildren().add(imageView4);
        pane.getChildren().add(pane4);
        pane5.getChildren().add(text4);
        pane5.getChildren().add(imageView5);
        pane.getChildren().add(pane5);
        pane6.getChildren().add(text5);
        pane6.getChildren().add(imageView6);
        pane.getChildren().add(pane6);
        getChildren().add(pane);
        pane7.getChildren().add(text6);
        pane7.getChildren().add(text7);
        pane7.getChildren().add(text8);
        pane7.getChildren().add(text9);
        pane7.getChildren().add(text10);
        pane7.getChildren().add(text11);
        pane7.getChildren().add(text12);
        pane7.getChildren().add(text13);
        pane7.getChildren().add(text14);
        pane7.getChildren().add(jFXButton);
        pane7.getChildren().add(textField);
        pane7.getChildren().add(textField0);
        pane7.getChildren().add(textField1);
        pane7.getChildren().add(textField2);
        pane7.getChildren().add(textField3);
        pane7.getChildren().add(textField4);
        pane7.getChildren().add(textField5);
        pane7.getChildren().add(textField6);
        pane7.getChildren().add(text15);
        menuButton.getItems().add(menuItem);
        menuButton.getItems().add(menuItem0);
        pane7.getChildren().add(menuButton);
        getChildren().add(pane7);

    }
}
