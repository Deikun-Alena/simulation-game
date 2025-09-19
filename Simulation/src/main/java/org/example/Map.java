package org.example;

import org.example.entities.Entity;
import org.example.entities.Herbivore;
import org.example.entities.Predator;
import org.example.entities.staticEntities.Grass;
import org.example.entities.staticEntities.Rock;
import org.example.entities.staticEntities.Tree;

import java.util.ArrayList;

public class Map {
    private final int rows;
    private final int cols;
    private final ArrayList<Entity> entities = new ArrayList<>();

    public Map(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        generate();
    }

    public void generate() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                double random = Math.random();
                Entity entity;

                if (random < 0.6) {
                    entity = null;
                } else if (random < 0.8) {
                    entity = new Grass(row, col);
                } else if (random < 0.88) {
                    entity = new Rock(row, col);
                } else if (random < 0.94) {
                    entity = new Herbivore(row, col);
                } else if (random < 0.98) {
                    entity = new Tree(row, col);
                } else {
                    entity = new Predator(row, col);
                }

                if (entity != null) entities.add(entity);
            }
        }
    }

    public Entity getEntityAt(int row, int col) {
        for (Entity entity : entities) {
            if (entity.getX() == row && entity.getY() == col) {
                return entity;
            }
        }
        return null;
    }
}
