import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        long big1 = Long.MAX_VALUE; //long al suo valore massimo
        long result = big1 * 10;
        BigInteger big = BigInteger.valueOf(big1);
        BigInteger resultBig = big.multiply(BigInteger.TEN);

        System.out.println("result: " + result + ", resultBig: " + resultBig); //result: -10, resultBig: 92233720368547758070

        double totale = 0;
        totale = totale + 3.4;
        totale = totale + 3.8;

        System.out.println("Totale: " + totale); //Totale: 7.199999999999999

        BigDecimal totaleBig = BigDecimal.valueOf(0);
        totaleBig = totaleBig.add(BigDecimal.valueOf(3.4));
        totaleBig = totaleBig.add(BigDecimal.valueOf(3.8));
        BigDecimal totaleScaled = totaleBig.setScale(2, RoundingMode.HALF_EVEN);

        System.out.println("Totale Big: " + totaleBig); //Totale Big: 7.2
        System.out.println("Totale Scaled: " + totaleScaled); //Totale Scaled: 7.20

        int minore = Math.min(1, 5);
        System.out.println("Minore: " + minore); //Minore: 1
        int maggiore = Math.max(1, 5);
        System.out.println("Maggiore: " + maggiore); //Maggiore: 5
        double radice = Math.sqrt(4);
        System.out.println("radice: " + radice); //radice: 2.0
        double abs = Math.abs(4);
        System.out.println("abs: " + abs); //abs: 4.0
        int random = (int) (Math.random() * 100); //casting da double
        System.out.println("random: " + random); //random: 15


        //Operatorio ternario
        int number = 5;
//        String message = "";
//        if(number < 5) {
//            message = "minore di 5";
//        } else {
//            message = "maggiore o uguale a 5";
//        }
//        System.out.println(message);
        final String message = number < 5 ? "minore di 5" : "maggiore o uguale a 5";
        System.out.println(message);
        final boolean possoEseguire = number < 5 ? true : false;
        System.out.println(possoEseguire);
        final int possoEseguire1 = number < 5 ? 0 : 100;
    }
}