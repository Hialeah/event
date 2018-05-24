package blue.mdc.event;

import com.jfoenix.controls.JFXButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Expenses class create a pane and 
 * adds text fields to the pane asking for:
 * 
 * <table border="1" sumary="Expenses Table">
 * <tr>
 *   <td></td><td>Quantity</td><td>Fee</td>
 * </tr>
 * <tr>
 *   <td>Student Registration</td><td>Value</td><td>$0.0</td>
 * </tr>
 * <tr>
 *   <td>Advisor Registration</td><td>Value</td><td>$0.0</td>
 * </tr>
 * <tr>
 *   <td>Meals</td><td>Value</td><td>$0.0</td>
 * </tr>
 * <tr><td>Lodging</td><td>Value</td><td>$0.0</td>
 * </tr>
 * <tr>
 *   <td>Taxis</td><td>Value</td><td>$0.0</td>
 * </tr>
 * <tr>
 *   <td>Gas</td><td>Value</td><td>$0.0</td>
 * </tr>
 * </table>
 * 
 * Also it has a <b>SAVE</b> button to add expenses
 * of the event to the database.
 * 
 * @author Carlos Abraham
 * @see AddTraveler
 * @see AddEvent
 * @see EmergencyContact
 */

public class Expenses extends Pane {

   
    Pane pane;
    Text expensesText;
    Text quantity;
    Text fee;
    Text studentRegistrationText;
    Text advisorText;
    Text mealText;
    Text lodgingText;
    Text taxisText;
    Text gasText;
    TextField studentRegistrationQ;
    TextField studentRegistrationF;
    TextField advisorRegistrationQ;
    TextField advisorRegistrationF;
    TextField mealQ;
    TextField mealF;
    TextField lodgingQ;
    TextField lodgingF;
    TextField taxisQ;
    TextField taxisF;
    TextField gasQ;
    TextField gasF;
    Text totalExpensesText;
    Text student_life_contrib_Text;
    Text clubContributionText;
    TextField totalExpensesField;
    TextField studentLifeContributionField;
    TextField clubContributionField;
    Text minus;
    Text equals;
    JFXButton button;
    
    /**
     * Constructor to {@link Expenses} to the the {@link blue.mdc.event.MainView}.
     */
    public Expenses() {
        
        setStyle("-fx-background-color: #ffffff;");
        setLayoutX(304.0);
        setPrefHeight(700.0);
        setPrefWidth(599.0);
        
        pane = new Pane();
        totalExpensesText = new Text();
        studentRegistrationText = new Text();
        student_life_contrib_Text = new Text();
        studentRegistrationQ = new TextField();
        totalExpensesField = new TextField();
        expensesText = new Text();
        studentRegistrationF = new TextField();
        advisorText = new Text();
        advisorRegistrationQ = new TextField();
        advisorRegistrationF = new TextField();
        mealText = new Text();
        mealQ = new TextField();
        mealF = new TextField();
        lodgingText = new Text();
        lodgingQ = new TextField();
        lodgingF = new TextField();
        taxisText = new Text();
        gasText = new Text();
        taxisQ = new TextField();
        taxisF = new TextField();
        gasQ = new TextField();
        gasF = new TextField();
        studentLifeContributionField = new TextField();
        clubContributionField = new TextField();
        
        clubContributionText = new Text();
        minus = new Text();
        equals = new Text();
        quantity = new Text();
        fee = new Text();
        button = new JFXButton("Save");
        
        expensesText.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        expensesText.setLayoutX(54.0);
        expensesText.setLayoutY(85.0);
        expensesText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        expensesText.setStrokeWidth(0.0);
        expensesText.setText("Expenses");
        expensesText.setWrappingWidth(107.69999983906746);
        expensesText.setFont(new Font("System Bold", 22.0));
        
        quantity.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        quantity.setLayoutX(259.0);
        quantity.setLayoutY(140.0);
        quantity.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        quantity.setStrokeWidth(0.0);
        quantity.setText("Quantity");
        quantity.setFont(new Font("System Bold", 18.0));

        fee.setFill(javafx.scene.paint.Color.valueOf("#1175f7"));
        fee.setLayoutX(418.0);
        fee.setLayoutY(140.0);
        fee.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        fee.setStrokeWidth(0.0);
        fee.setText("Fee");
        fee.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        fee.setFont(new Font("System Bold", 18.0));
        
        
        totalExpensesText.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        totalExpensesText.setLayoutX(55.0);
        totalExpensesText.setLayoutY(535.0);
        totalExpensesText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        totalExpensesText.setStrokeWidth(0.0);
        totalExpensesText.setText("Total Expenses");
        totalExpensesText.setFont(new Font("System Bold", 14.0));

        studentRegistrationText.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        studentRegistrationText.setLayoutX(56.0);
        studentRegistrationText.setLayoutY(171.0);
        studentRegistrationText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        studentRegistrationText.setStrokeWidth(0.0);
        studentRegistrationText.setText("Student Registration");
        studentRegistrationText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        studentRegistrationText.setWrappingWidth(107.69999983906746);
        studentRegistrationText.setFont(new Font("System Bold", 17.0));

        student_life_contrib_Text.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        student_life_contrib_Text.setLayoutX(200.0);
        student_life_contrib_Text.setLayoutY(535.0);
        student_life_contrib_Text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        student_life_contrib_Text.setStrokeWidth(0.0);
        student_life_contrib_Text.setText("Student Life Contribution");
        student_life_contrib_Text.setFont(new Font("System Bold", 14.0));
        
        
        /* Student Registration Fields */
        studentRegistrationQ.setLayoutX(250.0);
        studentRegistrationQ.setLayoutY(166.0);
        studentRegistrationQ.setPrefHeight(26.0);
        studentRegistrationQ.setPrefWidth(90.0);
        
        studentRegistrationF.setLayoutX(388.0);
        studentRegistrationF.setLayoutY(166.0);
        studentRegistrationF.setPrefHeight(26.0);
        studentRegistrationF.setPrefWidth(90.0);
        

        advisorText.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        advisorText.setLayoutX(54.0);
        advisorText.setLayoutY(225.0);
        advisorText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        advisorText.setStrokeWidth(0.0);
        advisorText.setText("Advisor Registration");
        advisorText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        advisorText.setWrappingWidth(108.20313718914986);
        advisorText.setFont(new Font("System Bold", 17.0));

        advisorRegistrationQ.setLayoutX(250.0);
        advisorRegistrationQ.setLayoutY(226.0);
        advisorRegistrationQ.setPrefHeight(26.0);
        advisorRegistrationQ.setPrefWidth(90.0);

        advisorRegistrationF.setLayoutX(388.0);
        advisorRegistrationF.setLayoutY(226.0);
        advisorRegistrationF.setPrefHeight(26.0);
        advisorRegistrationF.setPrefWidth(90.0);

        mealText.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        mealText.setLayoutX(74.0);
        mealText.setLayoutY(308.0);
        mealText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        mealText.setStrokeWidth(0.0);
        mealText.setText("Meals");
        mealText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        mealText.setFont(new Font("System Bold", 17.0));

        mealQ.setLayoutX(250.0);
        mealQ.setLayoutY(276.0);
        mealQ.setPrefHeight(26.0);
        mealQ.setPrefWidth(90.0);

        mealF.setLayoutX(388.0);
        mealF.setLayoutY(276.0);
        mealF.setPrefHeight(26.0);
        mealF.setPrefWidth(90.0);

        lodgingText.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        lodgingText.setLayoutX(73.0);
        lodgingText.setLayoutY(358.0);
        lodgingText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        lodgingText.setStrokeWidth(0.0);
        lodgingText.setText("Lodging");
        lodgingText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        lodgingText.setFont(new Font("System Bold", 17.0));

        lodgingQ.setLayoutX(250.0);
        lodgingQ.setLayoutY(326.0);
        lodgingQ.setPrefHeight(26.0);
        lodgingQ.setPrefWidth(90.0);

        lodgingF.setLayoutX(388.0);
        lodgingF.setLayoutY(326.0);
        lodgingF.setPrefHeight(26.0);
        lodgingF.setPrefWidth(90.0);

        taxisText.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        taxisText.setLayoutX(77.0);
        taxisText.setLayoutY(408.0);
        taxisText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        taxisText.setStrokeWidth(0.0);
        taxisText.setText("Taxis");
        taxisText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        taxisText.setFont(new Font("System Bold", 17.0));
        
        taxisQ.setLayoutX(250.0);
        taxisQ.setLayoutY(376.0);
        taxisQ.setPrefHeight(26.0);
        taxisQ.setPrefWidth(90.0);

        taxisF.setLayoutX(388.0);
        taxisF.setLayoutY(376.0);
        taxisF.setPrefHeight(26.0);
        taxisF.setPrefWidth(90.0);

        gasText.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        gasText.setLayoutX(83.0);
        gasText.setLayoutY(458.0);
        gasText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        gasText.setStrokeWidth(0.0);
        gasText.setText("Gas");
        gasText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        gasText.setFont(new Font("System Bold", 17.0));
        
        gasQ.setLayoutX(250.0);
        gasQ.setLayoutY(426.0);
        gasQ.setPrefHeight(26.0);
        gasQ.setPrefWidth(90.0);

        gasF.setLayoutX(388.0);
        gasF.setLayoutY(426.0);
        gasF.setPrefHeight(26.0);
        gasF.setPrefWidth(90.0);
        
        /* Theree Text Labels of the button */
        clubContributionText.setFill(javafx.scene.paint.Color.valueOf("#7c7979"));
        clubContributionText.setLayoutX(412.0);
        clubContributionText.setLayoutY(535.0);
        clubContributionText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        clubContributionText.setStrokeWidth(0.0);
        clubContributionText.setText("Club Contribution");
        clubContributionText.setFont(new Font("System Bold", 14.0));
        
        /* Theree TextFields of the button */
        totalExpensesField.setLayoutX(57.0);
        totalExpensesField.setLayoutY(548.0);
        totalExpensesField.setPrefHeight(26.0);
        totalExpensesField.setPrefWidth(100.0);
        
        studentLifeContributionField.setLayoutX(233.0);
        studentLifeContributionField.setLayoutY(548.0);
        studentLifeContributionField.setPrefHeight(26.0);
        studentLifeContributionField.setPrefWidth(100.0);

        clubContributionField.setLayoutX(424.0);
        clubContributionField.setLayoutY(547.0);
        clubContributionField.setPrefHeight(26.0);
        clubContributionField.setPrefWidth(100.0);
        
        /* Minus (-) and Equals (=) Labels */
        minus.setFill(javafx.scene.paint.Color.valueOf("#c71e1eab"));
        minus.setLayoutX(172.0);
        minus.setLayoutY(566.0);
        minus.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        minus.setStrokeWidth(0.0);
        minus.setText("minus");

        equals.setFill(javafx.scene.paint.Color.valueOf("#c71e1eab"));
        equals.setLayoutX(366.0);
        equals.setLayoutY(565.0);
        equals.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        equals.setStrokeWidth(0.0);
        equals.setText("equals");
        
        button.setLayoutX(479.0);
        button.setLayoutY(614.0);
        button.setStyle("-fx-background-color: #1175f7;"
                          +"-fx-text-fill: WHITE;");
        
        pane.getChildren().add(expensesText);
        pane.getChildren().add(quantity);
        pane.getChildren().add(fee);
        pane.getChildren().add(studentRegistrationText);
        pane.getChildren().add(advisorText);
        pane.getChildren().add(mealText);
        pane.getChildren().add(lodgingText);
        pane.getChildren().add(taxisText);
        pane.getChildren().add(gasText);
        pane.getChildren().add(studentRegistrationQ);
        pane.getChildren().add(studentRegistrationF);
        pane.getChildren().add(advisorRegistrationQ);
        pane.getChildren().add(advisorRegistrationF);
        pane.getChildren().add(mealQ);
        pane.getChildren().add(mealF);
        pane.getChildren().add(lodgingQ);
        pane.getChildren().add(lodgingF);
        pane.getChildren().add(taxisQ);
        pane.getChildren().add(taxisF);
        pane.getChildren().add(gasQ);
        pane.getChildren().add(gasF);
        pane.getChildren().add(totalExpensesText);
        pane.getChildren().add(student_life_contrib_Text);
        pane.getChildren().add(clubContributionText);
        pane.getChildren().add(totalExpensesField);
        pane.getChildren().add(studentLifeContributionField);
        pane.getChildren().add(clubContributionField);
        pane.getChildren().add(minus);
        pane.getChildren().add(equals);
        pane.getChildren().add(button);
        getChildren().add(pane);
    }
}
