public class enemy {
    private int x, y;
    private int speed = 1;
    private int maxWidth, maxHeight;
    private boolean alive = true;

    public enemy(int startX, int startY, int maxWidth, int maxHeight) {
        this.x = startX;
        this.y = startY;
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
    }

   
    public void moveDown() {
        if (y + speed < maxHeight) {
            y += speed;
        } else {
            alive = false; 
        }
    }

   
    public void hit() {
        alive = false;
        System.out.println("Enemy was hit and destroyed!");
    }

   
    public boolean collidesWith(int otherX, int otherY) {
        return this.x == otherX && this.y == otherY;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Enemy at (" + x + ", " + y + "), Alive: " + alive;
    }
}
