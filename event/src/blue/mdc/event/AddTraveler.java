package blue.mdc.event;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import blue.mdc.event.constants.Constants;
import java.sql.*;

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
 * @see EmergencyContact
 * @see Expenses
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
    TextField zipField;
    
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
        zipField = new TextField();
        
        comboBox = new JFXComboBox();        
        button = new JFXButton("Next");
    
        /* Name Label */
        name.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        name.setLayoutX(Constants.LABELS_LAYOUT_X);
        name.setLayoutY(Constants.LABELS_LAYOUT_Y);
        name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        name.setStrokeWidth(0.0);
        name.setText("Name");
        name.setFont(new Font(17.0));
        
        /* Last Name Label */
        lastName.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        lastName.setLayoutX(Constants.LABELS_LAYOUT_X);
        lastName.setLayoutY(Constants.LABELS_LAYOUT_Y + Constants.DISTANCE_BTW_LABELS);
        lastName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        lastName.setStrokeWidth(0.0);
        lastName.setText("Last Name");
        lastName.setFont(new Font(17.0));
        
        /* MDC ID Label */
        mdcID.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        mdcID.setLayoutX(Constants.LABELS_LAYOUT_X);
        mdcID.setLayoutY(Constants.LABELS_LAYOUT_Y + Constants.DISTANCE_BTW_LABELS * 2);
        mdcID.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        mdcID.setStrokeWidth(0.0);
        mdcID.setText("MDC ID");
        mdcID.setFont(new Font(17.0));
        
        /* Phone Number Label */
        phone.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        phone.setLayoutX(Constants.LABELS_LAYOUT_X);
        phone.setLayoutY(Constants.LABELS_LAYOUT_Y + Constants.DISTANCE_BTW_LABELS * 3);
        phone.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        phone.setStrokeWidth(0.0);
        phone.setText("Phone");
        phone.setFont(new Font(17.0));
        
        /* Email Label Label */
        email.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        email.setLayoutX(Constants.LABELS_LAYOUT_X);
        email.setLayoutY(Constants.LABELS_LAYOUT_Y + Constants.DISTANCE_BTW_LABELS * 4);
        email.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        email.setStrokeWidth(0.0);
        email.setText("Email");
        email.setFont(new Font(17.0));
        
        /* Name Label */
        address.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        address.setLayoutX(Constants.LABELS_LAYOUT_X);
        address.setLayoutY(Constants.LABELS_LAYOUT_Y + Constants.DISTANCE_BTW_LABELS * 5);
        address.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        address.setStrokeWidth(0.0);
        address.setText("Address");
        address.setFont(new Font(17.0));
        
        /* City Label */
        city.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        city.setLayoutX(Constants.LABELS_LAYOUT_X);
        city.setLayoutY(Constants.LABELS_LAYOUT_Y + Constants.DISTANCE_BTW_LABELS * 6);
        city.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        city.setStrokeWidth(0.0);
        city.setText("City");
        city.setFont(new Font(17.0));
        
        /* Main Campus Label */
        campus.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        campus.setLayoutX(Constants.LABELS_LAYOUT_X);
        campus.setLayoutY(Constants.LABELS_LAYOUT_Y + Constants.DISTANCE_BTW_LABELS * 7);
        campus.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        campus.setStrokeWidth(0.0);
        campus.setText("Main Campus");
        campus.setFont(new Font(17.0));
        
        /* Zip Code Label */
        zip.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        zip.setLayoutX(284.0);
        zip.setLayoutY(Constants.LABELS_LAYOUT_Y + Constants.DISTANCE_BTW_LABELS * 6);
        zip.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        zip.setStrokeWidth(0.0);
        zip.setText("Zip Code");
        zip.setFont(new Font(17.0));
        
        /* Name Text Field */
        nameField.setLayoutX(Constants.TEXT_FIELD_LAYOUT_X);
        nameField.setLayoutY(Constants.TEXT_FIELD_INITIAL_LAYOUT_Y);
        
        /* Last Name Text Field */
        lastNameField.setLayoutX(Constants.TEXT_FIELD_LAYOUT_X);
        lastNameField.setLayoutY(
                        Constants.TEXT_FIELD_INITIAL_LAYOUT_Y +
                        Constants.DISTANCE_BTW_TEXT_FIELDS
        );
        
        /* MDC ID Text Field */
        mdcIDField.setLayoutX(Constants.TEXT_FIELD_LAYOUT_X);
        mdcIDField.setLayoutY(
                Constants.TEXT_FIELD_INITIAL_LAYOUT_Y +
                Constants.DISTANCE_BTW_TEXT_FIELDS * 2
        );
        
        /* Phone Number Text Field */
        phoneField.setLayoutX(Constants.TEXT_FIELD_LAYOUT_X);
        phoneField.setLayoutY(
                Constants.TEXT_FIELD_INITIAL_LAYOUT_Y +
                Constants.DISTANCE_BTW_TEXT_FIELDS * 3);
        
        /* Email Text Field */
        emailField.setLayoutX(Constants.TEXT_FIELD_LAYOUT_X);
        emailField.setLayoutY(
                Constants.TEXT_FIELD_INITIAL_LAYOUT_Y +
                Constants.DISTANCE_BTW_TEXT_FIELDS * 4
        );
        emailField.setPrefHeight(26.0);
        emailField.setPrefWidth(264.0);
        
        /* Address Text Field */
        addressField.setLayoutX(Constants.TEXT_FIELD_LAYOUT_X);
        addressField.setLayoutY(
                Constants.TEXT_FIELD_INITIAL_LAYOUT_Y +
                Constants.DISTANCE_BTW_TEXT_FIELDS * 5
        );
        addressField.setPrefHeight(26.0);
        addressField.setPrefWidth(264.0);
        
        /* City Text Field */
        cityField.setLayoutX(111.0);
        cityField.setLayoutY(
                Constants.TEXT_FIELD_INITIAL_LAYOUT_Y +
                Constants.DISTANCE_BTW_TEXT_FIELDS * 6);
        cityField.setPrefHeight(26.0);
        cityField.setPrefWidth(145.0);

        /* ZipCode Text Field */
        zipField.setLayoutX(379.0);
        zipField.setLayoutY(
                Constants.TEXT_FIELD_INITIAL_LAYOUT_Y +
                Constants.DISTANCE_BTW_TEXT_FIELDS * 6
        );
        zipField.setPrefHeight(26.0);
        zipField.setPrefWidth(109.0);
        
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
                          + "-jfx-button-type: RAISED;"
                          +"-fx-text-fill: WHITE;");
        button.setOnMouseClicked(e->{
            saveToDB();
            EmergencyContact emergency = new EmergencyContact();
            pane.getChildren().add(emergency);
        });
        
        /* Menu ComboBox (List of MDC Campuses) */
        comboBox.setLayoutX(191.0);
        comboBox.setLayoutY(
                Constants.TEXT_FIELD_INITIAL_LAYOUT_Y +
                Constants.DISTANCE_BTW_TEXT_FIELDS * 7
        );
        
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
        pane.getChildren().add(zipField);
        pane.getChildren().add(comboBox);
        
        getChildren().add(pane);
    }

    private void saveToDB() {
        try{
            Connection connection;
            connection = DriverManager.getConnection("jdbc:ucanaccess://" + Constants.db_path);
            Statement add = connection.createStatement();
            
            add.executeUpdate(
                " INSERT INTO Students_info" +
                    
                    " ( Name, Last_Name, MDC_id, Phone, Email, Address, Campus)" +
                    
                " VALUES(" +
                        "'" + nameField.getText() + "'," +
                        "'" + lastNameField.getText() + "'," +
                        "'" + mdcIDField.getText() + "'," +
                        "'" + phoneField.getText() + "'," +
                        "'" + emailField.getText() + "'," +
                        "'" + addressField.getText() + ", FL " + zipField.getText() + "'," +
                        "'" + comboBox.getValue() + "'" +
                ")"
            );
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
