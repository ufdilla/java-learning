
/**
 * random
 */
public class random {

    int value = 27992;
    String floatVar, intVar, StringVar;

    public static void main(String[] args) {
        String fs = String.format("The value of the float variable is " + "%f, while the value of the integer "
                + "variable is %d, and the string " + "is %s");
        System.out.println( Math.random() );
        System.out.println(fs);
    }
}