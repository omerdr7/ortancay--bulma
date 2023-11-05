package medyanı.bulma;

public class MedyanıBulma {

    public static void main(String[] args) {

        int a = 40;
        int b = 50;
        int c = 60;

        int ortanca = mid(a, b, c);
        System.out.println("Ortanca: " + ortanca);
    }

    public static int mid(int a, int b, int c) {

        if ((a <= b && a >= c) || (a >= b && a <= c)) {

            return a;
        } else if ((b <= a && b >= c) || (b >= a && b <= c)) {

            return b;
        } else {

            return c;
        }
    }

}
