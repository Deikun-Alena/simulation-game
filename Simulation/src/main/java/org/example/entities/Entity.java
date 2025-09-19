package org.example.entities;

import javafx.scene.image.Image;

public abstract class Entity {
    private int x;
    private int y;

    protected Entity(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    public abstract Image getImage();
}
