package org.example.entities;

import javafx.scene.image.Image;

import java.util.Objects;

public class Herbivore extends Creature {
    private static final Image IMAGE = new Image(Objects.requireNonNull(Herbivore.class.getResource("/icons/rabbit.png")).toExternalForm());

    public Herbivore(int x, int y) { super(x, y); }

    private void eat() {

    }

    @Override
    public Image getImage() { return IMAGE; }
}
