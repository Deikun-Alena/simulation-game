package org.example.entities;

public abstract class Creature extends Entity {
    private int speed;
    private int amountHP;

    protected Creature(int x, int y) { super(x, y); }

    public void makeMove() {

    }
}
