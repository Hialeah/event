package event.fxml;

import com.jfoenix.controls.JFXButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class EBase extends Pane {

    protected final Pane pane;
    protected final Pane pane0;
    protected final JFXButton jFXButton;
    protected final Pane pane1;
    protected final ImageView imageView;
    protected final Text text;
    protected final Pane pane2;
    protected final ImageView imageView0;
    protected final Text text0;
    protected final Pane pane3;
    protected final ImageView imageView1;
    protected final Text text1;
    protected final Pane pane4;
    protected final ImageView imageView2;
    protected final Text text2;

    public EBase() {

        pane = new Pane();
        pane0 = new Pane();
        jFXButton = new JFXButton();
        pane1 = new Pane();
        imageView = new ImageView();
        text = new Text();
        pane2 = new Pane();
        imageView0 = new ImageView();
        text0 = new Text();
        pane3 = new Pane();
        imageView1 = new ImageView();
        text1 = new Text();
        pane4 = new Pane();
        imageView2 = new ImageView();
        text2 = new Text();

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

        pane0.setLayoutX(304.0);
        pane0.setPrefHeight(700.0);
        pane0.setPrefWidth(599.0);
        pane0.setStyle("-fx-background-color: #ffffff;");

        jFXButton.setLayoutX(479.0);
        jFXButton.setLayoutY(614.0);

        pane1.setLayoutX(92.0);
        pane1.setLayoutY(148.0);
        pane1.setOpacity(0.63);
        pane1.setPrefHeight(166.0);
        pane1.setPrefWidth(192.0);
        pane1.setStyle("-fx-background-color: #E5E4E4;");

        imageView.setLayoutX(48.0);
        imageView.setLayoutY(23.0);
        imageView.setImage(new Image(getClass().getResource("../../../../../../../../Documents/com.visualpharm.Icons8/android_l/Editing/100/1756f5/icons8-pencil_tip.png").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        text.setLayoutX(65.0);
        text.setLayoutY(142.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Edit Event");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setFont(new Font("System Font", 13.0));

        pane2.setLayoutX(316.0);
        pane2.setLayoutY(148.0);
        pane2.setOpacity(0.63);
        pane2.setPrefHeight(166.0);
        pane2.setPrefWidth(192.0);
        pane2.setStyle("-fx-background-color: #E5E4E4;");

        imageView0.setLayoutX(53.0);
        imageView0.setLayoutY(31.0);
        imageView0.setImage(new Image(getClass().getResource("../../../../../../../../Documents/com.visualpharm.Icons8/android_l/Profile/100/1756f5/icons8-edit_user.png").toExternalForm()));

        text0.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        text0.setLayoutX(62.0);
        text0.setLayoutY(144.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Edit Traveler");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setFont(new Font("System Font", 13.0));

        pane3.setLayoutX(92.0);
        pane3.setLayoutY(337.0);
        pane3.setOpacity(0.63);
        pane3.setPrefHeight(166.0);
        pane3.setPrefWidth(192.0);
        pane3.setStyle("-fx-background-color: #E5E4E4;");

        imageView1.setLayoutX(45.0);
        imageView1.setLayoutY(29.0);
        imageView1.setImage(new Image(getClass().getResource("../../../../../../../../Documents/com.visualpharm.Icons8/android_l/Business/100/1756f5/icons8-estimate.png").toExternalForm()));

        text1.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        text1.setLayoutX(50.0);
        text1.setLayoutY(147.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Edit Expenses");
        text1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1.setFont(new Font("System Font", 13.0));

        pane4.setLayoutX(316.0);
        pane4.setLayoutY(337.0);
        pane4.setOpacity(0.63);
        pane4.setPrefHeight(166.0);
        pane4.setPrefWidth(192.0);
        pane4.setStyle("-fx-background-color: #E5E4E4;");

        imageView2.setLayoutX(48.0);
        imageView2.setLayoutY(31.0);
        imageView2.setImage(new Image(getClass().getResource("../../../../../../../../Documents/com.visualpharm.Icons8/android_l/Healthcare/100/1756f5/icons8-ambulance.png").toExternalForm()));

        text2.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        text2.setLayoutX(22.0);
        text2.setLayoutY(145.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Edit Emergency Contact");
        text2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text2.setFont(new Font("System Font", 13.0));

        getChildren().add(pane);
        pane0.getChildren().add(jFXButton);
        pane1.getChildren().add(imageView);
        pane1.getChildren().add(text);
        pane0.getChildren().add(pane1);
        pane2.getChildren().add(imageView0);
        pane2.getChildren().add(text0);
        pane0.getChildren().add(pane2);
        pane3.getChildren().add(imageView1);
        pane3.getChildren().add(text1);
        pane0.getChildren().add(pane3);
        pane4.getChildren().add(imageView2);
        pane4.getChildren().add(text2);
        pane0.getChildren().add(pane4);
        getChildren().add(pane0);

    }
}
