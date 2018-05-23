package blue.mdc.event;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Add Traveler class create a pane and 
 * adds text fields to the pane asking for:
 * 
 * <ul>
 *  <li>Name</li>
 *  <li>Last Name</li>
 *  <li>MDC IDC</li>
 *  <li>Phone</li>
 *  <li>Email</li>
 *  <li>Address</li>
 *  <li>City</li>
 *  <li>Campus</li>
 *  <li>Zip Code</li>
 * </ul>
 * 
 * Also it has a button to add contact information
 * of the student, and a <b>NEXT</b> button
 * to save and proceed to fill the {@link EmergencyContact}
 * information to the database.
 * 
 * @author Carlos Abraham
 * @see AddEvent
 */

public class AddTraveler extends Pane {

   
    Pane pane;
    Text addTraveler;
    
    /**
     * Name of the Student.
     */
    Text name;
    
    /**
     * Last Name of the Student.
     */
    Text lastName;
    
    /**
     * Miami Dade College ID Number
     * 10 digits ID.
     * 
     * @see <a href="https://faq.mdc.edu/knowledgebase/what-is-my-student-id-number/">MDC ID information.</a>
     */
    Text mdcID;
    
    /**
     * Student Phone Number.
     * Example: (123) 456 - 7989
     */
    Text phone;
    
    /**
     * Student Email Address.
     * Example: example@mymdc.net
     */
    Text email;
    
    /**
     * Student House Address
     */
    Text address;
    
    /**
     * Student City
     */
    Text city;
    
    /**
     * Student Main Campus
     */
    
    Text campus;
    
    /**
     * Student Zip Code
     */
    Text zip;
    
    TextField nameField;
    TextField lastNameField;
    TextField mdcIDField;
    TextField phoneField;
    TextField emailField;
    TextField addressField;
    TextField cityField;
    TextField campusField;
    
    JFXComboBox comboBox;
    MenuItem Hialeah;
    MenuItem Homestead;
    MenuItem InterAmerican;
    MenuItem Kendall;
    MenuItem Medical;
    MenuItem North;
    MenuItem NWSA;
    MenuItem West;
    MenuItem Wolfson;
    
    JFXButton button;
    
    /**
     * Constructor to {@link AddTraveler} to the the {@link blue.mdc.event.MainView}.
     */
    public AddTraveler() {
        
        setStyle("-fx-background-color: #ffffff;");
        setLayoutX(304.0);
        setPrefHeight(700.0);
        setPrefWidth(599.0);
        
        pane = new Pane();
        addTraveler = new Text();
        name = new Text();
        lastName = new Text();
        mdcID = new Text();
        phone = new Text();
        email = new Text();
        address = new Text();
        city = new Text();
        campus = new Text();
        zip = new Text();

        nameField = new TextField();
        lastNameField = new TextField();
        mdcIDField = new TextField();
        phoneField = new TextField();
        emailField = new TextField();
        addressField = new TextField();
        cityField = new TextField();
        campusField = new TextField();
        
        comboBox = new JFXComboBox();        
        button = new JFXButton("Next");
    
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
        
        /* MDC ID Label */
        mdcID.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        mdcID.setLayoutX(56.0);
        mdcID.setLayoutY(275.0);
        mdcID.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        mdcID.setStrokeWidth(0.0);
        mdcID.setText("MDC ID");
        mdcID.setFont(new Font(17.0));
        
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
        
        /* Main Campus Label */
        campus.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        campus.setLayoutX(56.0);
        campus.setLayoutY(565.0);
        campus.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        campus.setStrokeWidth(0.0);
        campus.setText("Main Campus");
        campus.setFont(new Font(17.0));
        
        /* Zip Code Label */
        zip.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        zip.setLayoutX(284.0);
        zip.setLayoutY(505.0);
        zip.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        zip.setStrokeWidth(0.0);
        zip.setText("Zip Code");
        zip.setFont(new Font(17.0));
        
        /* Name Text Field */
        nameField.setLayoutX(160.0);
        nameField.setLayoutY(131.0);
        
        /* Last Name Text Field */
        lastNameField.setLayoutX(160.0);
        lastNameField.setLayoutY(179.0);
        
        /* MDC ID Text Field */
        mdcIDField.setLayoutX(160.0);
        mdcIDField.setLayoutY(246.0);
        
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
        addTraveler.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        addTraveler.setLayoutX(58.0);
        addTraveler.setLayoutY(93.0);
        addTraveler.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        addTraveler.setStrokeWidth(0.0);
        addTraveler.setText("Add Traveler");
        addTraveler.setWrappingWidth(151.5982458628714);
        addTraveler.setFont(new Font("System Bold", 22.0));
        
         /* Next button */
        button.setLayoutX(479.0);
        button.setLayoutY(614.0);
        button.setStyle("-fx-background-color: #1175f7;"
                          +"-fx-text-fill: WHITE;");
        button.setOnMouseClicked(e->{ 
            
        });
        
        /* Menu ComboBox (List of MDC Campuses) */
        comboBox.setLayoutX(191.0);
        comboBox.setLayoutY(539.0);
        
        comboBox.getItems().add("Hialeah");
        comboBox.getItems().add("Homestead");
        comboBox.getItems().add("InterAmerican");
        comboBox.getItems().add("Medical");
        comboBox.getItems().add("Kendall");
        comboBox.getItems().add("North");
        comboBox.getItems().add("NWSA");
        comboBox.getItems().add("West");
        comboBox.getItems().add("Wolfson");
        comboBox.getItems().add("Homestead");
        
        pane.getChildren().add(addTraveler);
        pane.getChildren().add(name);
        pane.getChildren().add(lastName);
        pane.getChildren().add(mdcID);
        pane.getChildren().add(phone);
        pane.getChildren().add(email);
        pane.getChildren().add(address);
        pane.getChildren().add(city);
        pane.getChildren().add(campus);
        pane.getChildren().add(zip);
        pane.getChildren().add(button);
        pane.getChildren().add(nameField);
        pane.getChildren().add(lastNameField);
        pane.getChildren().add(mdcIDField);
        pane.getChildren().add(phoneField);
        pane.getChildren().add(emailField);
        pane.getChildren().add(addressField);
        pane.getChildren().add(cityField);
        pane.getChildren().add(campusField);
        pane.getChildren().add(comboBox);
        
        getChildren().add(pane);
    }
}
