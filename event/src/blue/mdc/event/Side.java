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
        Pane addTraveler = new Pane();
        Text addTravelerText = new Text();
        ImageView addTravelerImg = new ImageView();
        Pane editTraveler = new Pane();
        Text editTravelerText = new Text();
        ImageView editTravelerImg = new ImageView();
        Pane viewEvent = new Pane();
        Text viewEventText = new Text();
        ImageView viewEventImg = new ImageView();
        Pane info = new Pane();
        Text infoText = new Text();
        ImageView infoImg = new ImageView();
        
        /**
        * Constructor for {@link Side} class.
        * 
        * @see Side
        */
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
        editEvent.setLayoutY(197.0);
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
        
        /* Add Traveler Button */
        addTraveler.setLayoutY(257.0);
        addTraveler.setPrefHeight(46.0);
        addTraveler.setPrefWidth(303.0);
        addTraveler.setOnMouseEntered(e -> {addTraveler.setStyle("-fx-background-color: #2185ff;");});
        addTraveler.setOnMouseExited(e -> {addTraveler.setStyle("-fx-background-color: #1175f7;");});
        addTraveler.setOnMouseClicked(e ->{
            AddTraveler addTraveler = new AddTraveler();
            getChildren().add(addTraveler);
        });
        
        /* Add Traveler Text */
        addTravelerText.setFill(javafx.scene.paint.Color.WHITE);
        addTravelerText.setLayoutX(83.0);
        addTravelerText.setLayoutY(30.0);
        addTravelerText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        addTravelerText.setStrokeWidth(0.0);
        addTravelerText.setText("Add Traveler");
        addTravelerText.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));
        
        /* Add Traveler Icon */
        addTravelerImg.setLayoutX(45.0);
        addTravelerImg.setLayoutY(9.0);
        addTravelerImg.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/addUser.png").toExternalForm()));
        
        /* Edit Traveler Button */
        editTraveler.setLayoutY(317.0);
        editTraveler.setPrefHeight(46.0);
        editTraveler.setPrefWidth(303.0);
        editTraveler.setOnMouseEntered(e -> {editTraveler.setStyle("-fx-background-color: #2185ff;");});
        editTraveler.setOnMouseExited(e -> {editTraveler.setStyle("-fx-background-color: #1175f7;");});
        
        /* Edit Traveler Text */
        editTravelerText.setFill(javafx.scene.paint.Color.WHITE);
        editTravelerText.setLayoutX(83.0);
        editTravelerText.setLayoutY(30.0);
        editTravelerText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        editTravelerText.setStrokeWidth(0.0);
        editTravelerText.setText("Edit Traveler");
        editTravelerText.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));

        /* Edit Traveler Icon */
        editTravelerImg.setLayoutX(45.0);
        editTravelerImg.setLayoutY(9.0);
        editTravelerImg.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/editUser.png").toExternalForm()));
        
        /* View Event Button */
        viewEvent.setLayoutY(377.0);
        viewEvent.setPrefHeight(46.0);
        viewEvent.setPrefWidth(303.0);
        viewEvent.setOnMouseEntered(e -> {viewEvent.setStyle("-fx-background-color: #2185ff;");});
        viewEvent.setOnMouseExited(e -> {viewEvent.setStyle("-fx-background-color: #1175f7;");});
        
        
        /* View Event Text */
        viewEventText.setFill(javafx.scene.paint.Color.WHITE);
        viewEventText.setLayoutX(83.0);
        viewEventText.setLayoutY(30.0);
        viewEventText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        viewEventText.setStrokeWidth(0.0);
        viewEventText.setText("View Event");
        viewEventText.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));
        
        /* View Event Icon */
        viewEventImg.setLayoutX(45.0);
        viewEventImg.setLayoutY(9.0);
        viewEventImg.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/star.png").toExternalForm()));
        
        /* Information Button */
        info.setLayoutY(437.0);
        info.setPrefHeight(46.0);
        info.setPrefWidth(303.0);
        info.setOnMouseEntered(e -> {info.setStyle("-fx-background-color: #2185ff;");});
        info.setOnMouseExited(e -> {info.setStyle("-fx-background-color: #1175f7;");});
        
        /* Information Text */
        infoText.setFill(javafx.scene.paint.Color.WHITE);
        infoText.setLayoutX(83.0);
        infoText.setLayoutY(30.0);
        infoText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        infoText.setStrokeWidth(0.0);
        infoText.setText("Instructions");
        infoText.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));
        
        /* Information Icon */
        infoImg.setLayoutX(45.0);
        infoImg.setLayoutY(9.0);
        infoImg.setImage(new Image(getClass().getResource("/blue/mdc/event/images/icons/bulleted-list.png").toExternalForm()));
        
        
        search.getChildren().addAll(searchImg, searchField);
        getChildren().add(search);
        
        newEvent.getChildren().addAll(newEventText, newEventImg);
        getChildren().add(newEvent);
        
        editEvent.getChildren().addAll(editEventText, editEventImg);
        getChildren().add(editEvent);
        
        addTraveler.getChildren().addAll(addTravelerText, addTravelerImg);
        getChildren().add(addTraveler);
        
        editTraveler.getChildren().addAll(editTravelerText, editTravelerImg);
        getChildren().add(editTraveler);
        
        viewEvent.getChildren().addAll(viewEventText, viewEventImg);
        getChildren().add(viewEvent);

        info.getChildren().addAll(infoText, infoImg);
        getChildren().add(info);
        
        
    }
}