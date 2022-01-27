package FarihaChowdhury;

import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String str = "Our University https://www.lus.ac.bd  is very glorious which  was established in 2001  https://www.lus.ac.bd/  ";

        Pattern pat = Pattern.compile("https?://(www.)([a-zA-Z0-9)]+\\.[a-zA-Z.]+)");
    }
}
