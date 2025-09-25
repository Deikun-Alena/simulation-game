package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import org.example.entities.Entity;

public class Simulation extends Application {
    private int stepCount;
    private static final int ROWS = 20;
    private static final int COLS = 20;
    private static final int CELL_SIZE = 35;

    //map
    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();

        Map map = new Map(ROWS, COLS);
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                Rectangle cellBackground = new Rectangle(CELL_SIZE, CELL_SIZE);
                cellBackground.setFill(Color.WHITE);
                cellBackground.setStroke(Color.GRAY);

                ImageView cellView = new ImageView();
                cellView.setFitWidth(CELL_SIZE);
                cellView.setFitHeight(CELL_SIZE);

                Entity entity = map.getEntityAt(row, col);
                if (entity != null) {
                    cellView.setImage(entity.getImage());
                }

                StackPane cell = new StackPane(cellBackground, cellView);
                grid.add(cell, col, row);
            }
        }

        Button buttonNext = new Button("Next");
        Button buttonStart = new Button("Start");
        Button buttonPause = new Button("Pause");

        buttonNext.setStyle("-fx-font-size: 14px; -fx-padding: 5px 25px; -fx-border-color: #808000;");
        buttonStart.setStyle("-fx-font-size: 14px; -fx-padding: 5px 25px; -fx-border-color: #808000;");
        buttonPause.setStyle("-fx-font-size: 14px; -fx-padding: 5px 25px; -fx-border-color: #808000;");

        BorderPane root = new BorderPane();
        root.setCenter(grid);

        HBox bottomPanel = new HBox();
        bottomPanel.setAlignment(Pos.BOTTOM_CENTER);
        bottomPanel.setSpacing(10);
        bottomPanel.setPadding(new Insets(10));

        bottomPanel.getChildren().addAll(buttonNext, buttonStart, buttonPause);

        HBox.setHgrow(buttonNext, Priority.ALWAYS);
        HBox.setHgrow(buttonStart, Priority.ALWAYS);
        HBox.setHgrow(buttonPause, Priority.ALWAYS);

        buttonNext.setMaxWidth(Double.MAX_VALUE);
        buttonStart.setMaxWidth(Double.MAX_VALUE);
        buttonPause.setMaxWidth(Double.MAX_VALUE);

        root.setBottom(bottomPanel);

        Scene scene = new Scene(root, Color.LIGHTGRAY);
        stage.sizeToScene();
        stage.setScene(scene);
        stage.setTitle("Simulation");
        stage.show();
    }

    //  actions
    Runnable[] initActions = {
        //расставить объекты и существ на карте
    };

    Runnable[] turnActions = {
        //передвижение существ, добавление травы или травоядных, если их осталось слишком мало
    };

    public void nextTurn() {

    }

    public void startSimulation() {

    }

    public void pauseSimulation() {

    }

    public static void main(String[] args) {
        launch(args);
    }
}