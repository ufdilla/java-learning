/**
 * condiOprtr
 * variable x = (expression) ? (value if TRUE) : (value if FALSE)

 */
public class condiOprtr {

    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b + " \\ because the value of a is false");

        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is : " + b + " \\ because the value of a is false");
    }
}