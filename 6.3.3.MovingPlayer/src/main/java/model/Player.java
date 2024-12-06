package model;

import utils.Direction;

public class Player {
    private int x;
    private int y;
    private static final int GRID_SIZE = 10;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(Direction direction) {
        switch (direction) {
            case UP -> {
                // if set the condition to this.y >= 0;
                // when player position is -1, it will be outside th canvas area
                if (this.y >= 0) {
                    System.out.println("this y before" + this.y);
                    this.y--;
                    System.out.println("this y after" + this.y);
                }
            }
            case DOWN -> {
                if (this.y < GRID_SIZE - 1) {
                    this.y++;
                }
            }
            case LEFT -> {
                if (this.x >= 1) {
                    System.out.println("this x before" + this.x);
                    this.x--;
                    System.out.println("this x after" + this.x);
                }
            }
            case RIGHT -> {
                if (this.x < GRID_SIZE - 1) {
                    this.x++;
                }
            }
//            System.out.println(this.x + "," + this.y);
        }
        System.out.println("Player moved to (" + this.x + "," + this.y + ")");
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public static int getGridSize() {
        return GRID_SIZE;
    }
}
