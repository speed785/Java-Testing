public class TestProj {

    double length,width;
    static String name;

    //default arg constructor
    public TestProj(double length, double width) {

        this.length = length;
        this.width = width;
        name = "Rectangle";

    }
    //no argument constructor (default)
    public TestProj() {
        //TODO Auto-generated constructor stub
        name = "Rectangle";
    }
    public static void main(String[] args) {
        TestProj tp = new TestProj(10,10); //starter values
        TestProj tp2 = new TestProj(); //defualt values
        System.out.println("Who am I?" + TestProj.name);
        System.out.println("TP object area " + (tp.length*tp.width));
        System.out.println("TP2 object area " + (tp2.length*tp2.width));

    }

}