package Inheretence2;



public class Circle extends Shape {
    private int r;

    public Circle() {
        r = 0;
    }

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("r = " + r);
        System.out.println("---------------------------");
    }
}


