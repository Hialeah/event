package blue.mdc.event;

import blue.mdc.event.constants.Constants;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.io.IOException;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

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
        
        SideButton a = new SideButton("New", "icons/add.png");
        SideButton b = new SideButton("New sd", "icons/add.png");
        SideButton c = new SideButton("Newds", "icons/add.png");
        SideButton d = new SideButton("Newsgg", "icons/add.png");
        SideButton e = new SideButton("Newsfd", "icons/add.png");
        SideButton f = new SideButton("Create File", "icons/add.png");
        
        Pane search = new Pane();
        ImageView searchImg = new ImageView();
        JFXTextField searchField = new JFXTextField();
        
        /**
        * Constructor for {@link Side} class.
        * 
        * @see Side
        */
        public Side(){
            
        setPrefHeight(Constants.SIDE_HEIGHT);
        setPrefWidth(Constants.SIDE_WIDTH);
        
         /* Create new Event Button */
        a.setLayoutY(Constants.SIDE_BUTTON_Y);
        a.setOnMouseClicked(e ->{
            AddEvent addEvent = new AddEvent();
            getChildren().add(addEvent);
        });
        b.setLayoutY(Constants.SIDE_BUTTON_Y + Constants.DISTANCE_BTW_BUTTONS);
        b.setOnMouseClicked(e ->{
            AddTraveler addTraveler = new AddTraveler();
            getChildren().add(addTraveler);
        });
        c.setLayoutY(Constants.SIDE_BUTTON_Y + Constants.DISTANCE_BTW_BUTTONS*2);
        d.setLayoutY(Constants.SIDE_BUTTON_Y + Constants.DISTANCE_BTW_BUTTONS*3);
        e.setLayoutY(Constants.SIDE_BUTTON_Y + Constants.DISTANCE_BTW_BUTTONS*4);
        f.setLayoutY(Constants.SIDE_BUTTON_Y + Constants.DISTANCE_BTW_BUTTONS*5);
        f.setOnMouseClicked(e ->{
            
            String EventName = "EventDB";
            try{
                File file = new File("src/blue/mdc/event/db/" + EventName +".accdb");
                if(file.createNewFile()) System.out.println("File created!");
                else System.out.println("File already exist");
            }catch(IOException exception){
             exception.printStackTrace();
            }
        });
        
      
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
       
       
//        setOnMouseClicked(e ->{
//                
//                Pane pane = new Pane();
//                Scene scene = new Scene(pane, 600, 400);
//                Stage stage = new Stage();
//                stage.setTitle("Preview");
//                stage.setScene(scene);
//                stage.show();
//        }); 
        
        
        getChildren().add(a);
        getChildren().add(b);
        getChildren().add(c);
        getChildren().add(d);
        getChildren().add(e);
        getChildren().add(f);       
    }
}