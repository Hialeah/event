package blue.mdc.event;

import blue.mdc.event.constants.Constants;
import com.jfoenix.controls.JFXTextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Pane that represents the left blue Side bar of the Event Application.
 * The side bar contains seven buttons created with panes, those are:
 * 
 * <ol>
 *  <li>Search</li>
 *  <li>Add New Event</li>
 *  <li>Edit Event</li>
 *  <li>Add Traveler</li>
 *  <li>Edit Traveler</li>
 *  <li>View Event</li>
 *  <li>Information</li>
 * </ol>
 * 
 * The side bar also contains the organization logo and copyright test at the button.
 * 
 * @author Carlos Abraham
 * @see <a href="http://eventgenerator.ga">eventgenerator.ga</a>
 * @see blue.mdc.event.constants.Constants
 */

public class Side extends Pane{
    
    
        Pane newEvent = new Pane(); // Buttons are represented by a Pane()
        Text newEventText = new Text();
        ImageView newEventImg = new ImageView();
        Pane editEvent = new Pane();
        Text editEventText = new Text();
        ImageView editEventImg = new ImageView();
        Pane search = new Pane();
        ImageView searchImg = new ImageView();
        JFXTextField searchField = new JFXTextField();
        Pane pane3 = new Pane();
        Text text2 = new Text();
        ImageView imageView3 = new ImageView();
        Pane pane4 = new Pane();
        Text text3 = new Text();
        ImageView imageView4 = new ImageView();
        
        public Side(){
            
        setPrefHeight(Constants.SIDE_HEIGHT);
        setPrefWidth(Constants.SIDE_WIDTH);
        
        /* Search Pane box */
        search.setLayoutY(45.0);
        search.setPrefHeight(46.0);
        search.setPrefWidth(303.0);
        
        /* Search Icon */
        searchImg.setLayoutX(27.0);
        searchImg.setLayoutY(12.0);
        searchImg.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/search.png").toExternalForm()));
        
        /* Style for Text Field Search */
        searchField.setLayoutX(68.0);
        searchField.setLayoutY(11.0);
        searchField.setStyle("-jfx-focus-color: #ffffff;"
                + "-fx-text-fill: WHITE;");
        
        /* Create new Event Button */
        newEvent.setLayoutY(137.0);
        newEvent.setPrefHeight(46.0);
        newEvent.setPrefWidth(303.0);
        newEvent.setOnMouseEntered(e -> {newEvent.setStyle("-fx-background-color: #2185ff;");});
        newEvent.setOnMouseExited(e -> {newEvent.setStyle("-fx-background-color: #1175f7;");});
        newEvent.setOnMouseClicked(e ->{
            AddEvent addEvent = new AddEvent();
            getChildren().add(addEvent);
        });
        
        /* Create new Evet Text */
        newEventText.setFill(javafx.scene.paint.Color.WHITE);
        newEventText.setLayoutX(83.0);
        newEventText.setLayoutY(30.0);
        newEventText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        newEventText.setStrokeWidth(0.0);
        newEventText.setText("New Event");
        newEventText.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));
        
        /* Create new Event Icon */
        newEventImg.setLayoutX(45.0);
        newEventImg.setLayoutY(11.0);
        newEventImg.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/add.png").toExternalForm()));

        /* Edit Event Button */
        editEvent.setLayoutY(198.0);
        editEvent.setPrefHeight(46.0);
        editEvent.setPrefWidth(303.0);
        editEvent.setOnMouseEntered(e -> {editEvent.setStyle("-fx-background-color: #2185ff;");});
        editEvent.setOnMouseExited(e -> {editEvent.setStyle("-fx-background-color: #1175f7;");});
        
        /* Edit Evet Text */
        editEventText.setFill(javafx.scene.paint.Color.WHITE);
        editEventText.setLayoutX(83.0);
        editEventText.setLayoutY(30.0);
        editEventText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        editEventText.setStrokeWidth(0.0);
        editEventText.setText("Edit Event");
        editEventText.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));
        
        /* Edit Evet Icon */
        editEventImg.setLayoutX(45.0);
        editEventImg.setLayoutY(9.0);
        editEventImg.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/edit.png").toExternalForm()));
        
        
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
        imageView3.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/bulleted_list.png").toExternalForm()));
        
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
        imageView4.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/star.png").toExternalForm()));

        
        search.getChildren().addAll(searchImg, searchField);
        getChildren().add(search);
        
        newEvent.getChildren().addAll(newEventText, newEventImg);
        getChildren().add(newEvent);
        
        editEvent.getChildren().addAll(editEventText, editEventImg);
        getChildren().add(editEvent);
        
        pane3.getChildren().addAll(text2, imageView3);
        getChildren().add(pane3);
        
        pane4.getChildren().addAll(text3, imageView4);
        getChildren().add(pane4);
    }
}