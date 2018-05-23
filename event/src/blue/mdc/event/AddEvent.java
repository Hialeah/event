package blue.mdc.event;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Add Event class create a pane and 
 * adds text fields to the pane asking for:
 * 
 * <ul>
 *  <li>Event Name</li>
 *  <li>Organization Name</li>
 *  <li>Advisor</li>
 *  <li>Transportation</li>
 *  <li>Number of Students in Organization</li>
 *  <li>Number of Students attending event</li>
 *  <li>Number of chaperones attending event</li>
 *  <li>Start Date <small>and</small> End Date</li>
 *  <li>Location</li>
 * </ul>
 * 
 * Also it has a <b>SAVE</b> button
 * to save the information to the database
 * 
 * @author Carlos Abraham
 * @see AddTraveler
 */
public class AddEvent extends Pane {

    /**
     * Name of the Event that the students
     * will attend.
     */
    Text eventName;
    
    /** 
     * Name of the organization that will
     * participate in the event.
     */
    Text orgName;
    
    /**
     * Advisor name of the organization, or
     * advisor in charge of the students in
     * the event.
     */
    Text advisor;
    
    /**
     * Type of transportation used to travel 
     * to the event.
     */
    Text transportation;
    
    /**
     * Number of students in the organization
     * in total.
     */
    Text no_students_in_org;
    
    /**
     * Number of students in the organization
     * that will be going to the event.
     */
    Text no_students_attending;
    
    /**
     * Number of chaperones that will be going
     * to the event.
     * 
     * <b>NOTE:</b> they aren't students or 
     * they aren't organization members
     */
    Text no_chaperones;
    
    /**
     * Text date label.
     */
    Text date;
    
    /**
     * Text to label.
     */
    Text toText;
    
    /**
     * Date picker.
     * This is the start date of the event.
     * 
     * @see JFXDatePicker
     */
    JFXDatePicker start_date;
    
    /**
     * Date picker.
     * This is the end date of the event.
     * 
     * @see JFXDatePicker
     */
    JFXDatePicker end_date;
    
    /**
     * Location of the event
     */
    Text location;
    
    /**
     * Save fields button.
     */
    JFXButton button;
    
    /* TextFields */
    TextField eventField;
    TextField orgField;
    TextField advisorField;
    TextField transportationField;
    TextField students_in_org_Field;
    TextField students_attending_Field;
    TextField num_of_chaperones_Field;
    TextField locationField;

    public AddEvent() {
        
        setStyle("-fx-background-color: #ffffff;");
        setLayoutX(304.0);
        setPrefHeight(700.0);
        setPrefWidth(599.0);
        
        eventName = new Text();
        orgName = new Text();
        advisor = new Text();
        transportation = new Text();
        no_students_in_org = new Text();
        no_students_attending = new Text();
        no_chaperones = new Text();
        date = new Text();
        toText = new Text();
        start_date = new JFXDatePicker();
        end_date = new JFXDatePicker();
        location = new Text();
        button = new JFXButton("Save");
        eventField = new TextField();
        orgField = new TextField();
        advisorField = new TextField();
        transportationField = new TextField();
        students_in_org_Field = new TextField();
        students_attending_Field = new TextField();
        num_of_chaperones_Field = new TextField();
        locationField = new TextField();


        eventName.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        eventName.setLayoutX(60.0);
        eventName.setLayoutY(110.0);
        eventName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        eventName.setStrokeWidth(0.0);
        eventName.setText("Event Name");
        eventName.setFont(new Font(17.0));

        orgName.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        orgName.setLayoutX(60.0);
        orgName.setLayoutY(158.0);
        orgName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        orgName.setStrokeWidth(0.0);
        orgName.setText("Organization");
        orgName.setFont(new Font(17.0));

        advisor.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        advisor.setLayoutX(60.0);
        advisor.setLayoutY(211.0);
        advisor.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        advisor.setStrokeWidth(0.0);
        advisor.setText("Advisor");
        advisor.setFont(new Font(17.0));

        transportation.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        transportation.setLayoutX(60.0);
        transportation.setLayoutY(262.0);
        transportation.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        transportation.setStrokeWidth(0.0);
        transportation.setText("Transportation");
        transportation.setFont(new Font(17.0));

        no_students_in_org.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        no_students_in_org.setLayoutX(60.0);
        no_students_in_org.setLayoutY(319.0);
        no_students_in_org.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        no_students_in_org.setStrokeWidth(0.0);
        no_students_in_org.setText("Number of Students in Organization");
        no_students_in_org.setFont(new Font(17.0));

        no_students_attending.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        no_students_attending.setLayoutX(60.0);
        no_students_attending.setLayoutY(382.0);
        no_students_attending.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        no_students_attending.setStrokeWidth(0.0);
        no_students_attending.setText("Number of Students Attending Event");
        no_students_attending.setFont(new Font(17.0));

        no_chaperones.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        no_chaperones.setLayoutX(60.0);
        no_chaperones.setLayoutY(443.0);
        no_chaperones.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        no_chaperones.setStrokeWidth(0.0);
        no_chaperones.setText("Number of Chaperones Attending Event");
        no_chaperones.setFont(new Font(17.0));

        date.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        date.setLayoutX(60.0);
        date.setLayoutY(512.0);
        date.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        date.setStrokeWidth(0.0);
        date.setText("Date");
        date.setFont(new Font(17.0));

        toText.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        toText.setLayoutX(320.0);
        toText.setLayoutY(509.0);
        toText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toText.setStrokeWidth(0.0);
        toText.setText("to");
        toText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        toText.setFont(new Font(17.0));

        start_date.setLayoutX(122.0);
        start_date.setLayoutY(489.0);
        start_date.setStyle("-jfx-default-color: #1175f7");
        
        end_date.setLayoutX(377.0);
        end_date.setLayoutY(489.0);
        end_date.setStyle("-jfx-default-color: #1175f7");
        
        location.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        location.setLayoutX(63.0);
        location.setLayoutY(574.0);
        location.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        location.setStrokeWidth(0.0);
        location.setText("Location");
        location.setFont(new Font(17.0));

        button.setLayoutX(479.0);
        button.setLayoutY(614.0);
        button.setStyle("-fx-background-color: #1175f7;"
                          +"-fx-text-fill: WHITE;");

        eventField.setLayoutX(207.0);
        eventField.setLayoutY(83.0);

        orgField.setLayoutX(207.0);
        orgField.setLayoutY(126.0);

        advisorField.setLayoutX(207.0);
        advisorField.setLayoutY(182.0);

        transportationField.setLayoutX(207.0);
        transportationField.setLayoutY(233.0);

        students_in_org_Field.setLayoutX(405.0);
        students_in_org_Field.setLayoutY(290.0);
        students_in_org_Field.setPrefHeight(26.0);
        students_in_org_Field.setPrefWidth(61.0);

        students_attending_Field.setLayoutX(405.0);
        students_attending_Field.setLayoutY(353.0);
        students_attending_Field.setPrefHeight(26.0);
        students_attending_Field.setPrefWidth(61.0);

        num_of_chaperones_Field.setLayoutX(405.0);
        num_of_chaperones_Field.setLayoutY(414.0);
        num_of_chaperones_Field.setPrefHeight(26.0);
        num_of_chaperones_Field.setPrefWidth(61.0);

        locationField.setLayoutX(60.0);
        locationField.setLayoutY(588.0);
        locationField.setPrefHeight(26.0);
        locationField.setPrefWidth(213.0);
        
        getChildren().add(eventName);
        getChildren().add(orgName);
        getChildren().add(advisor);
        getChildren().add(transportation);
        getChildren().add(no_students_in_org);
        getChildren().add(no_students_attending);
        getChildren().add(no_chaperones);
        getChildren().add(date);
        getChildren().add(toText);
        getChildren().add(start_date);
        getChildren().add(end_date);
        getChildren().add(location);
        getChildren().add(button);
        getChildren().add(eventField);
        getChildren().add(orgField);
        getChildren().add(advisorField);
        getChildren().add(transportationField);
        getChildren().add(students_in_org_Field);
        getChildren().add(students_attending_Field);
        getChildren().add(num_of_chaperones_Field);
        getChildren().add(locationField);
    }
}
