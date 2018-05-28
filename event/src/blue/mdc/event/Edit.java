package blue.mdc.event;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
/**
 *
 * @author Carlos Abraham
 */
public class Edit extends Pane{
        
    Pane editEvent;
    ImageView imageView;
    Text text;
    Pane editUser;
    ImageView imageView0;
    Text text0;
    Pane editExpenses;
    ImageView imageView1;
    Text text1;
    Pane editEmergencyContact;
    ImageView imageView2;
    Text text2;
    
    public Edit() {
        
        editEvent = new Pane();
        imageView = new ImageView();
        text = new Text();
        editUser = new Pane();
        imageView0 = new ImageView();
        text0 = new Text();
        editExpenses = new Pane();
        imageView1 = new ImageView();
        text1 = new Text();
        editEmergencyContact = new Pane();
        imageView2 = new ImageView();
        text2 = new Text();
        
        setStyle("-fx-background-color: #ffffff;");
        setLayoutX(304.0);
        setPrefHeight(700.0);
        setPrefWidth(599.0);

        editEvent.setLayoutX(92.0);
        editEvent.setLayoutY(148.0);
        editEvent.setOpacity(0.63);
        editEvent.setPrefHeight(166.0);
        editEvent.setPrefWidth(192.0);
        editEvent.setStyle("-fx-background-color: #E5E4E4;");
        editEvent.setOnMouseEntered(e -> {editEvent.setOpacity(1);});
        editEvent.setOnMouseExited(e -> {editEvent.setOpacity(0.63);});

        imageView.setLayoutX(48.0);
        imageView.setLayoutY(23.0);
        imageView.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/edit96.png").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        text.setLayoutX(65.0);
        text.setLayoutY(142.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Edit Event");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setFont(new Font("System Font", 13.0));

        editUser.setLayoutX(316.0);
        editUser.setLayoutY(148.0);
        editUser.setOpacity(0.63);
        editUser.setPrefHeight(166.0);
        editUser.setPrefWidth(192.0);
        editUser.setStyle("-fx-background-color: #E5E4E4;");
        editUser.setOnMouseEntered(e -> {editUser.setOpacity(1);});
        editUser.setOnMouseExited(e -> {editUser.setOpacity(0.63);});

        imageView0.setLayoutX(53.0);
        imageView0.setLayoutY(31.0);
        imageView0.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/editUser96.png").toExternalForm()));

        text0.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        text0.setLayoutX(62.0);
        text0.setLayoutY(144.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Edit Traveler");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setFont(new Font("System Font", 13.0));

        editExpenses.setLayoutX(92.0);
        editExpenses.setLayoutY(337.0);
        editExpenses.setOpacity(0.63);
        editExpenses.setPrefHeight(166.0);
        editExpenses.setPrefWidth(192.0);
        editExpenses.setStyle("-fx-background-color: #E5E4E4;");
        editExpenses.setOnMouseEntered(e -> {editExpenses.setOpacity(1);});
        editExpenses.setOnMouseExited(e -> {editExpenses.setOpacity(0.63);});

        imageView1.setLayoutX(45.0);
        imageView1.setLayoutY(29.0);
        imageView1.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/expenses96.png").toExternalForm()));

        text1.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        text1.setLayoutX(50.0);
        text1.setLayoutY(147.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Edit Expenses");
        text1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1.setFont(new Font("System Font", 13.0));

        editEmergencyContact.setLayoutX(316.0);
        editEmergencyContact.setLayoutY(337.0);
        editEmergencyContact.setOpacity(0.63);
        editEmergencyContact.setPrefHeight(166.0);
        editEmergencyContact.setPrefWidth(192.0);
        editEmergencyContact.setStyle("-fx-background-color: #E5E4E4;");
        editEmergencyContact.setOnMouseEntered(e -> {editEmergencyContact.setOpacity(1);});
        editEmergencyContact.setOnMouseExited(e -> {editEmergencyContact.setOpacity(0.63);});

        imageView2.setLayoutX(48.0);
        imageView2.setLayoutY(31.0);
        imageView2.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/emergency96.png").toExternalForm()));

        text2.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        text2.setLayoutX(22.0);
        text2.setLayoutY(145.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Edit Emergency Contact");
        text2.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text2.setFont(new Font("System Font", 13.0));

        editEvent.getChildren().addAll(imageView, text);
        getChildren().add(editEvent);
        
        editUser.getChildren().addAll(imageView0, text0);
        getChildren().add(editUser);
        
        editExpenses.getChildren().addAll(imageView1, text1);
        getChildren().add(editExpenses);
        
        editEmergencyContact.getChildren().addAll(imageView2, text2);
        getChildren().add(editEmergencyContact);
    }
}
