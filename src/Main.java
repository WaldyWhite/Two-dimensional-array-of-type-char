import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[][] symbols = new char[4][7];
        char l = 'a';
        char k = 'a';
        for (char[] el : symbols) {
            for (int i = 0; i < el.length; i++) {
                if (i == 0) {
                    el[i] = l;
                } else {
                    el[i] = k;
                }
                k += (char) symbols.length;
                System.out.print(el[i] + " ");
            }
            l++;
            k = l;
            System.out.println();
        }
    }
}
