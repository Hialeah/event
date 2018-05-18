package event.fxml;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public abstract class FXMLDocumentBase extends Pane {

    protected final Pane pane;
    protected final Text text;
    protected final ImageView imageView;
    protected final Pane pane0;

    public FXMLDocumentBase() {

        pane = new Pane();
        text = new Text();
        imageView = new ImageView();
        pane0 = new Pane();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(700.0);
        setPrefWidth(900.0);
        setStyle("-fx-background-color: #ffffff;");

        pane.setLayoutX(-1.0);
        pane.setPrefHeight(700.0);
        pane.setPrefWidth(304.0);
        pane.setStyle("-fx-background-color: #1175f7;");

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(98.0);
        text.setLayoutY(672.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Event © MDC Blue");

        imageView.setFitHeight(96.0);
        imageView.setFitWidth(79.0);
        imageView.setLayoutX(117.0);
        imageView.setLayoutY(542.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("../../images/event/event-logo.png").toExternalForm()));

        pane0.setLayoutX(303.0);
        pane0.setPrefHeight(700.0);
        pane0.setPrefWidth(607.0);

        pane.getChildren().add(text);
        pane.getChildren().add(imageView);
        getChildren().add(pane);
        getChildren().add(pane0);

    }
}
