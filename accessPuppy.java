/**
 * accessPuppy
 * Mengakses Variabel Instance dan Metode
 */
public class accessPuppy {

    int puppyAge;

   public accessPuppy(String name) {
      // This constructor has one parameter, name.
      System.out.println("Name chosen is :" + name );
   }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        /* Object creation */
        accessPuppy myPuppy = new accessPuppy("tommy");

        /* Call class method to set puppy's age */
        myPuppy.setAge(2);

        /* Call another class method to get puppy's age */
        myPuppy.getAge();

        /* juga bisa mengakses instance variable sebagai berikut */
        System.out.println("Variable Value :" + myPuppy.puppyAge);
    }
}