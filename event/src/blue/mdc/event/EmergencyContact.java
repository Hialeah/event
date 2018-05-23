package blue.mdc.event;

import com.jfoenix.controls.JFXButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Emergency Contact class create a pane and 
 * adds text fields to the pane asking for:
 * 
 * <ul>
 *  <li>Name</li>
 *  <li>Last Name</li>
 *  <li>Relationship</li>
 *  <li>Phone</li>
 *  <li>Email</li>
 *  <li>Address</li>
 *  <li>City</li>
 *  <li>Zip Code</li>
 * </ul>
 * 
 * Also it has a button to add emergency contact information
 * of the student, and a <b>SAVE</b> button
 * to save the information to the database
 * 
 * @author Carlos Abraham
 * @see AddTraveler
 */

public class EmergencyContact extends Pane {

   
    Pane pane;
    Text emergencyContact;
    
    Text name;
    Text lastName;
    Text relationship;
    Text phone;
    Text email;
    Text address;
    Text city;
    Text zip;
    
    TextField nameField;
    TextField lastNameField;
    TextField relationshipField;
    TextField phoneField;
    TextField emailField;
    TextField addressField;
    TextField cityField;
    TextField campusField;
    
    JFXButton button;
    
    /**
     * Constructor to {@link EmergencyContact} to the the {@link blue.mdc.event.MainView}.
     */
    public EmergencyContact() {
        
        setStyle("-fx-background-color: #ffffff;");
        setLayoutX(304.0);
        setPrefHeight(700.0);
        setPrefWidth(599.0);
        
        pane = new Pane();
        emergencyContact = new Text();
        name = new Text();
        lastName = new Text();
        relationship = new Text();
        phone = new Text();
        email = new Text();
        address = new Text();
        city = new Text();
        zip = new Text();

        nameField = new TextField();
        lastNameField = new TextField();
        relationshipField = new TextField();
        phoneField = new TextField();
        emailField = new TextField();
        addressField = new TextField();
        cityField = new TextField();
        campusField = new TextField();
               
        button = new JFXButton("Save");
    
        /* Name Label */
        name.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        name.setLayoutX(56.0);
        name.setLayoutY(159.0);
        name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        name.setStrokeWidth(0.0);
        name.setText("Name");
        name.setFont(new Font(17.0));
        
        /* Last Name Label */
        lastName.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        lastName.setLayoutX(56.0);
        lastName.setLayoutY(211.0);
        lastName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        lastName.setStrokeWidth(0.0);
        lastName.setText("Last Name");
        lastName.setFont(new Font(17.0));
        
        /* Relationship Label */
        relationship.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        relationship.setLayoutX(56.0);
        relationship.setLayoutY(275.0);
        relationship.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        relationship.setStrokeWidth(0.0);
        relationship.setText("Relationship");
        relationship.setFont(new Font(17.0));
        
        /* Phone Number Label */
        phone.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        phone.setLayoutX(56.0);
        phone.setLayoutY(339.0);
        phone.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        phone.setStrokeWidth(0.0);
        phone.setText("Phone");
        phone.setFont(new Font(17.0));
        
        /* Email Label Label */
        email.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        email.setLayoutX(56.0);
        email.setLayoutY(392.0);
        email.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        email.setStrokeWidth(0.0);
        email.setText("Email");
        email.setFont(new Font(17.0));
        
        /* Name Label */
        address.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        address.setLayoutX(56.0);
        address.setLayoutY(448.0);
        address.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        address.setStrokeWidth(0.0);
        address.setText("Address");
        address.setFont(new Font(17.0));
        
        /* City Label */
        city.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        city.setLayoutX(56.0);
        city.setLayoutY(505.0);
        city.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        city.setStrokeWidth(0.0);
        city.setText("City");
        city.setFont(new Font(17.0));
        
        /* Zip Code Label */
        zip.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        zip.setLayoutX(284.0);
        zip.setLayoutY(505.0);
        zip.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        zip.setStrokeWidth(0.0);
        zip.setText("Zip Code");
        zip.setFont(new Font(17.0));
        
        /* Save button */
        button.setLayoutX(479.0);
        button.setLayoutY(614.0);
        button.setStyle("-fx-background-color: #1175f7;"
                          +"-fx-text-fill: WHITE;");
        
        /* Name Text Field */
        nameField.setLayoutX(160.0);
        nameField.setLayoutY(131.0);
        
        /* Last Name Text Field */
        lastNameField.setLayoutX(160.0);
        lastNameField.setLayoutY(179.0);
        
        /* Relationship Text Field */
        relationshipField.setLayoutX(160.0);
        relationshipField.setLayoutY(246.0);
        
        /* Phone Number Text Field */
        phoneField.setLayoutX(160.0);
        phoneField.setLayoutY(310.0);
        
        /* Email Text Field */
        emailField.setLayoutX(160.0);
        emailField.setLayoutY(363.0);
        emailField.setPrefHeight(26.0);
        emailField.setPrefWidth(264.0);
        
        /* Address Text Field */
        addressField.setLayoutX(160.0);
        addressField.setLayoutY(419.0);
        addressField.setPrefHeight(26.0);
        addressField.setPrefWidth(264.0);
        
        /* City Text Field */
        cityField.setLayoutX(111.0);
        cityField.setLayoutY(478.0);
        cityField.setPrefHeight(26.0);
        cityField.setPrefWidth(145.0);

        /* Main Campus Text Field */
        campusField.setLayoutX(379.0);
        campusField.setLayoutY(478.0);
        campusField.setPrefHeight(26.0);
        campusField.setPrefWidth(109.0);
        
        /* Add Traveler Label */
        emergencyContact.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        emergencyContact.setLayoutX(58.0);
        emergencyContact.setLayoutY(86.0);
        emergencyContact.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        emergencyContact.setStrokeWidth(0.0);
        emergencyContact.setText("Emergency contact");
        emergencyContact.setWrappingWidth(205.0);
        emergencyContact.setFont(new Font("System Bold", 22.0));
        
        pane.getChildren().add(emergencyContact);
        pane.getChildren().add(name);
        pane.getChildren().add(lastName);
        pane.getChildren().add(relationship);
        pane.getChildren().add(phone);
        pane.getChildren().add(email);
        pane.getChildren().add(address);
        pane.getChildren().add(city);
        pane.getChildren().add(zip);
        pane.getChildren().add(button);
        pane.getChildren().add(nameField);
        pane.getChildren().add(lastNameField);
        pane.getChildren().add(relationshipField);
        pane.getChildren().add(phoneField);
        pane.getChildren().add(emailField);
        pane.getChildren().add(addressField);
        pane.getChildren().add(cityField);
        pane.getChildren().add(campusField);
        
        getChildren().add(pane);
    }
}
