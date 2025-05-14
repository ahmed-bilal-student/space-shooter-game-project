class player {
    private int x, y;
    private int speed = 1;
    private int maxWidth, maxHeight;

    public player(int startX, int startY, int maxWidth, int maxHeight) {
        this.x = startX;
        this.y = startY;
        this.maxWidth = maxWidth;
        this.maxHeight = maxHeight;
    }

    public void moveLeft() {
        if (x - speed >= 0) {
            x -= speed;
        }
    }

    public void moveRight() {
        if (x + speed < maxWidth) {
            x += speed;
        }
    }

    public void moveUp() {
        if (y - speed >= 0) {
            y -= speed;
        }
    }

    public void moveDown() {
        if (y + speed < maxHeight) {
            y += speed;
        }
    }

    public int getX() {
         return x; 
    }
    public int getY() {
         return y; 
    }

    @Override
    public String toString() {
        return "Player at (" + x + ", " + y + ")";
    }
}


