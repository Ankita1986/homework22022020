package homework22022020;

// Declaration of user define method
public class Wall {
    double width;
    double height;

    // Declaration of user define method
    public Wall(double width, double height) {
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        this.width = width;
        this.height = height;
    }

    // Constructors declaration
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Constructors declaration
    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
    }

    // Constructors declaration
    public void setHeight(double height) {
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    // Main method declaration
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());

    }
}