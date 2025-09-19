package org.example.entities.staticEntities;

import javafx.scene.image.Image;
import org.example.entities.Entity;

import java.util.Objects;

public class Tree extends Entity {
    private static final Image IMAGE = new Image(Objects.requireNonNull(Tree.class.getResource("/icons/tree.png")).toExternalForm());

    public Tree(int x, int y) { super(x, y); }

    @Override
    public Image getImage() { return IMAGE; }
}