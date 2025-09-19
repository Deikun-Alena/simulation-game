package org.example.entities.staticEntities;

import javafx.scene.image.Image;
import org.example.entities.Entity;

import java.util.Objects;

public class Grass extends Entity {
    private static final Image IMAGE = new Image(Objects.requireNonNull(Grass.class.getResource("/icons/grass.png")).toExternalForm());

    public Grass(int x, int y) { super(x, y); }

    @Override
    public Image getImage() { return IMAGE; }
}