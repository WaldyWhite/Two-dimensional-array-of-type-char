import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        char [][] symbols = new char[4][6];
        char l = 'a';

        for (char[] el : symbols) {
            for (int i = 0; i < el.length; i++) {
                el[i] = l;
                l++;
                System.out.print(el[i]+" ");
            }
            System.out.println();
        }
    }
}
