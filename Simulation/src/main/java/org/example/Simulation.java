package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import org.example.entities.Entity;

public class Simulation extends Application {
    private int stepCount;
    private static final int ROWS = 15;
    private static final int COLS = 15;
    private static final int CELL_SIZE = 40;

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

        Scene scene = new Scene(grid, Color.LIGHTGRAY);
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
