
/**
 * instanceOf
//  */
// public class instanceOf {

//     public static void main(String[] args) {
//         String name = "umi";

//         boolean result = name instanceof String;
//         System.out.println(result);
//     }
// }

class instanceOf {
}

public class Car extends instanceOf {

    public static void main(String args[]) {

        instanceOf a = new Car();
        boolean result = a instanceof Car;
        System.out.println(result);
    }
}