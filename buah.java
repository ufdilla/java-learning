
/**
 * buah
 */

class jusBuah {
    enum sizeBuah {small, medium, large}
    sizeBuah size;
}

public class buah {

    public static void main(String[] args) {
        jusBuah jus = new jusBuah();
        jus.size = jusBuah.sizeBuah.small;
        System.out.println("ukuran buah : " + jus.size);
    }
}