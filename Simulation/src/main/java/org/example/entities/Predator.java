package org.example.entities;

import javafx.scene.image.Image;

import java.util.Objects;

public class Predator extends Creature {
    private int attackPower;
    private static final Image IMAGE = new Image(Objects.requireNonNull(Predator.class.getResource("/icons/wolf.png")).toExternalForm());

    public Predator(int x, int y) { super(x, y); }

    private void attack() {

    }

    @Override
    public Image getImage() { return IMAGE; }
}
