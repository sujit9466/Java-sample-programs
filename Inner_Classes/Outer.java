package Inner_Classes;
public class Outer {

    private int out;

    public Outer(int out) {
        this.out = out;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    public void display() {
        //System.out.println("in = " + in);
        System.out.println("outers = " + out);
        System.out.println("_____________*1*___________");
    }

    public class Inner {
        private int in;

        public Inner(int in) {
            this.in = in;
        }

        public int getIn() {
            return in;
        }

        public void setIn(int in) {
            this.in = in;
        }

        public void display() {
        //   System.out.println("out = " + out + " in = " + in);
          //  System.out.println();
            Outer.this.display();
            
            System.out.println("sujit");
            System.out.println("******2***");
            //System.out.println("out = " + getOut() + " in = " + in);
            //System.out.println();

        }

        public void increment() {
            out++;
            in++;
        }
    }
}















