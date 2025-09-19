package org.example.entities.staticEntities;

import javafx.scene.image.Image;
import org.example.entities.Entity;

import java.util.Objects;

public class Rock extends Entity {
    private static final Image IMAGE = new Image(Objects.requireNonNull(Rock.class.getResource("/icons/rock.png")).toExternalForm());

    public Rock(int x, int y) { super(x, y); }

    @Override
    public Image getImage() { return IMAGE; }
}