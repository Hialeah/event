package blue.mdc.event;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * <b>Side Button</b> creates a pane that represents
 * the buttons in the bar side of the application.
 * 
 * Those buttons will be use inside {@link Side}
 * @author Carlos Abraham
 */
public class SideButton extends Pane{
        
        private Pane button = new Pane();
        private Text buttonText = new Text();
        private ImageView buttonIcon = new ImageView();
    
    /**
     * Constructs the side bar buttons. 
     * 
     * @param buttonName String with the name of the button.
     * @param iconPath String with the path of the image.
     *                 Assume that all images are inside the
     *                 project directories.
     *                 
     * 
     * @see Side
     */
    public SideButton(String buttonName, String iconPath){
        
        /* Create new Button */
        button.setPrefHeight(46.0);
        button.setPrefWidth(303.0);
        button.setOnMouseEntered(e -> {button.setStyle("-fx-background-color: #2185ff;");});
        button.setOnMouseExited(e -> {button.setStyle("-fx-background-color: #1175f7;");});
        
        /* Create text inside the button */
        buttonText.setFill(javafx.scene.paint.Color.WHITE);
        buttonText.setLayoutX(83.0);
        buttonText.setLayoutY(30.0);
        buttonText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        buttonText.setStrokeWidth(0.0);
        buttonText.setText(buttonName);
        buttonText.setFont(new Font("Apple SD Gothic Neo Regular", 20.0));
        
        /* Create icon inside the button */
        buttonIcon.setLayoutX(45.0);
        buttonIcon.setLayoutY(11.0);
        buttonIcon.setImage(new Image(getClass().getResource("/blue/mdc/event/images/"+ iconPath).toExternalForm()));
        
        button.getChildren().addAll(buttonText, buttonIcon);
        getChildren().add(button);
        
    }
}
