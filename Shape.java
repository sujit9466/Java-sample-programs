
public class Shape {

	
	
	private int x;
	private int y;
	 
	
	public Shape() {
		x=y=0;
		
	}
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	public void draw() {
		System.out.println("x="+ x + "y"+y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
    public static void main(String[] args) {
        Circle c1 = new Circle(100, 100, 50);
        c1.draw();
        Rectangle r1 = new Rectangle(30, 40, 50, 60);
        r1.draw();

        Shape s;
        s = c1; //Derived to base is valid conversion called as upcasting
        s.setX(111);
        s.getX();
        s.setY(222);
        s.getY();
        s.draw(); //polymorphism
        /*s.setR(50);
        s.getR();*/

        s = r1;
        s.draw(); //polymorphic effect

        Screen.drawToScreen(c1);
        Screen.drawToScreen(r1);

        //c1 = s; //Downcasting shape to Circle conversion is not valid
        //r1 = s;

        /*line();
        Screen.drawCircle(c1);
        Screen.drawRect(r1);*/


    }

    public static void line() {
        System.out.println("--------------------------------");
    }
}


/**
 * An object of derived class can always be treated like an object of Base class.
 * However, an object of base class can not be treated as an object of derived class.
 */
