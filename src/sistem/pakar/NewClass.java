/*
 * Netbeans 8.0 
 * JDK 1.7  
 */
package sistem.pakar;

import static java.lang.Double.NaN;

/**
 *
 * @author casper
 */
public class NewClass {

    public void gejala3() {
        String[][] string = {
            {"3;0;0", "2"},
            {"2;1;0", "2"},
            {"2;0;1", "2"},
            {"1;2;0", "5"},
            {"1;1;1", "5"},
            {"0;3;0", "5"},
            {"0;2;1", "5"},
            {"1;0;2", "8"},
            {"0;1;2", "8"},
            {"0;0;3", "8"}};

        String[] match = {
            "3;0;0",
            "2;1;0",
            "2;0;1",
            "2;1;0",
            "1;2;0",
            "1;1;1",
            "2;0;1",
            "1;1;1",
            "1;0;2",
            "2;1;0",
            "1;2;0",
            "1;1;1",
            "1;2;0",
            "0;3;0",
            "0;2;1",
            "1;1;1",
            "0;2;1",
            "0;1;2",
            "2;0;1",
            "1;1;1",
            "1;0;2",
            "1;1;1",
            "0;2;1",
            "0;1;2",
            "1;0;2",
            "0;1;2",
            "0;0;3",
            "3;0;0",
            "2;1;0",
            "2;0;1",
            "2;1;0",
            "1;2;0",
            "1;1;1",
            "2;0;1",
            "1;1;1",
            "1;0;2",
            "2;1;0",
            "1;2;0",
            "1;1;1",
            "1;2;0",
            "0;3;0",
            "0;2;1",
            "1;1;1",
            "0;2;1",
            "0;1;2",
            "2;0;1",
            "1;1;1",
            "1;0;2",
            "1;1;1",
            "0;2;1",
            "0;1;2",
            "1;0;2",
            "0;1;2",
            "0;0;3",
            "3;0;0",
            "2;1;0",
            "2;0;1",
            "2;1;0",
            "1;2;0",
            "1;1;1",
            "2;0;1",
            "1;1;1",
            "1;0;2",
            "2;1;0",
            "1;2;0",
            "1;1;1",
            "1;2;0",
            "0;3;0",
            "0;2;1",
            "1;1;1",
            "0;2;1",
            "0;1;2",
            "2;0;1",
            "1;1;1",
            "1;0;2",
            "1;1;1",
            "0;2;1",
            "0;1;2",
            "1;0;2",
            "0;1;2",
            "0;0;3"};

        System.out.println("jumlah:" + match.length);
        System.out.println("=====");
        for (int i = 0; i < match.length; i++) {
            for (int j = 0; j < string.length; j++) {
                if (match[i].equals(string[j][0])) {
                    System.out.println(string[j][1]);
                    break;
                }
            }
        }

    }

    public void gejala4() {
        String[][] string = {
            {"4;0;0", "2"},
            {"3;1;0", "2"},
            {"3;0;1", "2"},
            {"2;2;0", "2"},
            {"0;4;0", "5"},
            {"2;1;1", "5"},
            {"2;0;2", "5"},
            {"1;3;0", "5"},
            {"1;2;1", "5"},
            {"1;1;2", "5"},
            {"0;3;1", "5"},
            {"0;0;4", "8"},
            {"1;0;3", "8"},
            {"0;1;3", "8"},
            {"0;2;2", "8"}};
        String[] match = {
            "4;0;0",
            "3;1;0",
            "3;0;1",
            "3;1;0",
            "2;2;0",
            "2;1;1",
            "3;0;1",
            "2;1;1",
            "2;0;2",
            "3;1;0",
            "2;2;0",
            "2;1;1",
            "2;2;0",
            "1;3;0",
            "1;2;1",
            "2;1;1",
            "1;2;1",
            "1;1;2",
            "3;0;1",
            "2;1;1",
            "2;0;2",
            "2;1;1",
            "1;2;1",
            "1;1;2",
            "2;0;2",
            "1;1;2",
            "1;0;3",
            "3;1;0",
            "2;2;0",
            "2;1;1",
            "2;2;0",
            "1;3;0",
            "1;2;1",
            "2;1;1",
            "1;2;1",
            "1;1;2",
            "2;2;0",
            "1;3;0",
            "1;2;1",
            "1;3;0",
            "0;4;0",
            "0;3;1",
            "1;2;1",
            "0;3;1",
            "0;2;2",
            "2;1;1",
            "1;2;1",
            "1;1;2",
            "1;2;1",
            "0;3;1",
            "0;2;2",
            "1;1;2",
            "0;2;2",
            "0;1;3",
            "3;0;1",
            "2;1;1",
            "2;0;2",
            "2;1;1",
            "1;2;1",
            "1;1;2",
            "2;0;2",
            "1;1;2",
            "1;0;3",
            "2;1;1",
            "1;2;1",
            "1;1;2",
            "1;2;1",
            "0;3;1",
            "0;2;2",
            "1;1;2",
            "0;2;2",
            "0;1;3",
            "2;0;2",
            "1;1;2",
            "1;0;3",
            "1;1;2",
            "0;2;2",
            "0;1;3",
            "1;0;3",
            "0;1;3",
            "0;0;4",
            "4;0;0",
            "3;1;0",
            "3;0;1",
            "3;1;0",
            "2;2;0",
            "2;1;1",
            "3;0;1",
            "2;1;1",
            "2;0;2",
            "3;1;0",
            "2;2;0",
            "2;1;1",
            "2;2;0",
            "1;3;0",
            "1;2;1",
            "2;1;1",
            "1;2;1",
            "1;1;2",
            "3;0;1",
            "2;1;1",
            "2;0;2",
            "2;1;1",
            "1;2;1",
            "1;1;2",
            "2;0;2",
            "1;1;2",
            "1;0;3"};

        System.out.println("jumlah:" + match.length);
        System.out.println("=====");
        for (int i = 0; i < match.length; i++) {
            for (int j = 0; j < string.length; j++) {
                if (match[i].equals(string[j][0])) {
                    System.out.println(string[j][1]);
                    break;
                }
            }
        }

    }

    public void gejala5() {
        String[][] string = {
            {"5;0;0", "2"},
            {"4;1;0", "2"},
            {"4;0;1", "2"},
            {"3;2;0", "2"},
            {"3;1;1", "2"},
            {"0;5;0", "5"},
            {"1;4;0", "5"},
            {"0;4;1", "5"},
            {"2;3;0", "5"},
            {"1;3;1", "5"},
            {"2;2;1", "5"},
            {"2;1;2", "5"},
            {"2;0;3", "5"},
            {"3;0;2", "5"},
            {"1;2;2", "5"},
            {"0;0;5", "8"},
            {"1;0;4", "8"},
            {"0;1;4", "8"},
            {"0;2;3", "8"},
            {"1;1;3", "8"},
            {"0;3;2", "8"},};

        String[] match = {
            "5;0;0",
            "4;1;0",
            "4;0;1",
            "4;1;0",
            "3;2;0",
            "3;1;1",
            "4;0;1",
            "3;1;1",
            "3;0;2",
            "4;1;0",
            "3;2;0",
            "3;1;1",
            "3;2;0",
            "2;3;0",
            "2;2;1",
            "3;1;1",
            "2;2;1",
            "2;1;2",
            "4;0;1",
            "3;1;1",
            "3;0;2",
            "3;1;1",
            "2;2;1",
            "2;1;2",
            "3;0;2",
            "2;1;2",
            "2;0;3",
            "4;1;0",
            "3;2;0",
            "3;1;1",
            "3;2;0",
            "2;3;0",
            "2;2;1",
            "3;1;1",
            "2;2;1",
            "2;1;2",
            "3;2;0",
            "2;3;0",
            "2;2;1",
            "2;3;0",
            "1;4;0",
            "1;3;1",
            "2;2;1",
            "1;3;1",
            "1;2;2",
            "3;1;1",
            "2;2;1",
            "2;1;2",
            "2;2;1",
            "1;3;1",
            "1;2;2",
            "2;1;2",
            "1;2;2",
            "1;1;3",
            "4;0;1",
            "3;1;1",
            "3;0;2",
            "3;1;1",
            "2;2;1",
            "2;1;2",
            "3;0;2",
            "2;1;2",
            "2;0;3",
            "3;1;1",
            "2;2;1",
            "2;1;2",
            "2;2;1",
            "1;3;1",
            "1;2;2",
            "2;1;2",
            "1;2;2",
            "1;1;3",
            "3;0;2",
            "2;1;2",
            "2;0;3",
            "2;1;2",
            "1;2;2",
            "1;1;3",
            "2;0;3",
            "1;1;3",
            "1;0;4",
            "4;1;0",
            "3;2;0",
            "3;1;1",
            "3;2;0",
            "2;3;0",
            "2;2;1",
            "3;1;1",
            "2;2;1",
            "2;1;2",
            "3;2;0",
            "2;3;0",
            "2;2;1",
            "2;3;0",
            "1;4;0",
            "1;3;1",
            "2;2;1",
            "1;3;1",
            "1;2;2",
            "3;1;1",
            "2;2;1",
            "2;1;2",
            "2;2;1",
            "1;3;1",
            "1;2;2",
            "2;1;2",
            "1;2;2",
            "1;1;3",
            "3;2;0",
            "2;3;0",
            "2;2;1",
            "2;3;0",
            "1;4;0",
            "1;3;1",
            "2;2;1",
            "1;3;1",
            "1;2;2",
            "2;3;0",
            "1;4;0",
            "1;3;1",
            "1;4;0",
            "0;5;0",
            "0;4;1",
            "1;3;1",
            "0;4;1",
            "0;3;2",
            "2;2;1",
            "1;3;1",
            "1;2;2",
            "1;3;1",
            "0;4;1",
            "0;3;2",
            "1;2;2",
            "0;3;2",
            "0;2;3",
            "3;1;1",
            "2;2;1",
            "2;1;2",
            "2;2;1",
            "1;3;1",
            "1;2;2",
            "2;1;2",
            "1;2;2",
            "1;1;3",
            "2;2;1",
            "1;3;1",
            "1;2;2",
            "1;3;1",
            "0;4;1",
            "0;3;2",
            "1;2;2",
            "0;3;2",
            "0;2;3",
            "2;1;2",
            "1;2;2",
            "1;1;3",
            "1;2;2",
            "0;3;2",
            "0;2;3",
            "1;1;3",
            "0;2;3",
            "0;1;4",
            "4;0;1",
            "3;1;1",
            "3;0;2",
            "3;1;1",
            "2;2;1",
            "2;1;2",
            "3;0;2",
            "2;1;2",
            "2;0;3",
            "3;1;1",
            "2;2;1",
            "2;1;2",
            "2;2;1",
            "1;3;1",
            "1;2;2",
            "2;1;2",
            "1;2;2",
            "1;1;3",
            "3;0;2",
            "2;1;2",
            "2;0;3",
            "2;1;2",
            "1;2;2",
            "1;1;3",
            "2;0;3",
            "1;1;3",
            "1;0;4",
            "3;1;1",
            "2;2;1",
            "2;1;2",
            "2;2;1",
            "1;3;1",
            "1;2;2",
            "2;1;2",
            "1;2;2",
            "1;1;3",
            "2;2;1",
            "1;3;1",
            "1;2;2",
            "1;3;1",
            "0;4;1",
            "0;3;2",
            "1;2;2",
            "0;3;2",
            "0;2;3",
            "2;1;2",
            "1;2;2",
            "1;1;3",
            "1;2;2",
            "0;3;2",
            "0;2;3",
            "1;1;3",
            "0;2;3",
            "0;1;4",
            "3;0;2",
            "2;1;2",
            "2;0;3",
            "2;1;2",
            "1;2;2",
            "1;1;3",
            "2;0;3",
            "1;1;3",
            "1;0;4",
            "2;1;2",
            "1;2;2",
            "1;1;3",
            "1;2;2",
            "0;3;2",
            "0;2;3",
            "1;1;3",
            "0;2;3",
            "0;1;4",
            "2;0;3",
            "1;1;3",
            "1;0;4",
            "1;1;3",
            "0;2;3",
            "0;1;4",
            "1;0;4",
            "0;1;4",
            "0;0;5",};

        System.out.println("jumlah:" + match.length);
        System.out.println("=====");
        for (int i = 0; i < match.length; i++) {
            for (int j = 0; j < string.length; j++) {
                if (match[i].equals(string[j][0])) {
                    System.out.println(string[j][1]);
                    break;
                }
            }
        }

    }

    public void gejala6() {
        String[][] string = {
            {"6;0;0", "2"},
            {"5;1;0", "2"},
            {"5;0;1", "2"},
            {"4;2;0", "2"},
            {"4;0;2", "2"},
            {"4;1;1", "2"},
            {"3;3;0", "2"},
            {"0;6;0", "5"},
            {"1;5;0", "5"},
            {"0;5;1", "5"},
            {"1;4;1", "5"},
            {"2;4;0", "5"},
            {"0;4;2", "5"},
            {"2;3;1", "5"},
            {"1;3;2", "5"},
            {"3;2;1", "5"},
            {"2;2;2", "5"},
            {"3;1;2", "5"},
            {"2;1;3", "5"},
            {"3;0;3", "5"},
            {"0;0;6", "8"},
            {"1;0;5", "8"},
            {"0;1;5", "8"},
            {"2;0;4", "8"},
            {"0;2;4", "8"},
            {"1;1;4", "8"},
            {"1;2;3", "8"},
            {"0;3;3", "8"}
        };

        String[] match = {
            "6;0;0",
            "5;1;0",
            "5;0;1",
            "5;1;0",
            "4;2;0",
            "4;1;1",
            "5;0;1",
            "4;1;1",
            "4;0;2",
            "5;1;0",
            "4;2;0",
            "4;1;1",
            "4;2;0",
            "3;3;0",
            "3;2;1",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "5;0;1",
            "4;1;1",
            "4;0;2",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "4;0;2",
            "3;1;2",
            "3;0;3",
            "5;1;0",
            "4;2;0",
            "4;1;1",
            "4;2;0",
            "3;3;0",
            "3;2;1",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "4;2;0",
            "3;3;0",
            "3;2;1",
            "3;3;0",
            "2;4;0",
            "2;3;1",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "5;0;1",
            "4;1;1",
            "4;0;2",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "4;0;2",
            "3;1;2",
            "3;0;3",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "4;0;2",
            "3;1;2",
            "3;0;3",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "3;0;3",
            "2;1;3",
            "2;0;4",
            "5;1;0",
            "4;2;0",
            "4;1;1",
            "4;2;0",
            "3;3;0",
            "3;2;1",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "4;2;0",
            "3;3;0",
            "3;2;1",
            "3;3;0",
            "2;4;0",
            "2;3;1",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "4;2;0",
            "3;3;0",
            "3;2;1",
            "3;3;0",
            "2;4;0",
            "2;3;1",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;3;0",
            "2;4;0",
            "2;3;1",
            "2;4;0",
            "1;5;0",
            "1;4;1",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "5;0;1",
            "4;1;1",
            "4;0;2",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "4;0;2",
            "3;1;2",
            "3;0;3",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "4;0;2",
            "3;1;2",
            "3;0;3",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "3;0;3",
            "2;1;3",
            "2;0;4",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "4;0;2",
            "3;1;2",
            "3;0;3",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "3;0;3",
            "2;1;3",
            "2;0;4",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "3;0;3",
            "2;1;3",
            "2;0;4",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "2;0;4",
            "1;1;4",
            "1;0;5",
            "5;1;0",
            "4;2;0",
            "4;1;1",
            "4;2;0",
            "3;3;0",
            "3;2;1",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "4;2;0",
            "3;3;0",
            "3;2;1",
            "3;3;0",
            "2;4;0",
            "2;3;1",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "4;2;0",
            "3;3;0",
            "3;2;1",
            "3;3;0",
            "2;4;0",
            "2;3;1",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;3;0",
            "2;4;0",
            "2;3;1",
            "2;4;0",
            "1;5;0",
            "1;4;1",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "4;2;0",
            "3;3;0",
            "3;2;1",
            "3;3;0",
            "2;4;0",
            "2;3;1",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;3;0",
            "2;4;0",
            "2;3;1",
            "2;4;0",
            "1;5;0",
            "1;4;1",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "3;3;0",
            "2;4;0",
            "2;3;1",
            "2;4;0",
            "1;5;0",
            "1;4;1",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;4;0",
            "1;5;0",
            "1;4;1",
            "1;5;0",
            "0;6;0",
            "0;5;1",
            "1;4;1",
            "0;5;1",
            "0;4;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "1;4;1",
            "0;5;1",
            "0;4;2",
            "1;3;2",
            "0;4;2",
            "0;3;3",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "1;4;1",
            "0;5;1",
            "0;4;2",
            "1;3;2",
            "0;4;2",
            "0;3;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "1;3;2",
            "0;4;2",
            "0;3;3",
            "1;2;3",
            "0;3;3",
            "0;2;4",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "1;4;1",
            "0;5;1",
            "0;4;2",
            "1;3;2",
            "0;4;2",
            "0;3;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "1;3;2",
            "0;4;2",
            "0;3;3",
            "1;2;3",
            "0;3;3",
            "0;2;4",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "1;3;2",
            "0;4;2",
            "0;3;3",
            "1;2;3",
            "0;3;3",
            "0;2;4",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "1;2;3",
            "0;3;3",
            "0;2;4",
            "1;1;4",
            "0;2;4",
            "0;1;5",
            "5;0;1",
            "4;1;1",
            "4;0;2",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "4;0;2",
            "3;1;2",
            "3;0;3",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "4;0;2",
            "3;1;2",
            "3;0;3",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "3;0;3",
            "2;1;3",
            "2;0;4",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "4;0;2",
            "3;1;2",
            "3;0;3",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "3;0;3",
            "2;1;3",
            "2;0;4",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "3;0;3",
            "2;1;3",
            "2;0;4",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "2;0;4",
            "1;1;4",
            "1;0;5",
            "4;1;1",
            "3;2;1",
            "3;1;2",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "3;2;1",
            "2;3;1",
            "2;2;2",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;3;1",
            "1;4;1",
            "1;3;2",
            "1;4;1",
            "0;5;1",
            "0;4;2",
            "1;3;2",
            "0;4;2",
            "0;3;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "1;3;2",
            "0;4;2",
            "0;3;3",
            "1;2;3",
            "0;3;3",
            "0;2;4",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "1;3;2",
            "0;4;2",
            "0;3;3",
            "1;2;3",
            "0;3;3",
            "0;2;4",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "1;2;3",
            "0;3;3",
            "0;2;4",
            "1;1;4",
            "0;2;4",
            "0;1;5",
            "4;0;2",
            "3;1;2",
            "3;0;3",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "3;0;3",
            "2;1;3",
            "2;0;4",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "3;0;3",
            "2;1;3",
            "2;0;4",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "2;0;4",
            "1;1;4",
            "1;0;5",
            "3;1;2",
            "2;2;2",
            "2;1;3",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "2;2;2",
            "1;3;2",
            "1;2;3",
            "1;3;2",
            "0;4;2",
            "0;3;3",
            "1;2;3",
            "0;3;3",
            "0;2;4",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "1;2;3",
            "0;3;3",
            "0;2;4",
            "1;1;4",
            "0;2;4",
            "0;1;5",
            "3;0;3",
            "2;1;3",
            "2;0;4",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "2;0;4",
            "1;1;4",
            "1;0;5",
            "2;1;3",
            "1;2;3",
            "1;1;4",
            "1;2;3",
            "0;3;3",
            "0;2;4",
            "1;1;4",
            "0;2;4",
            "0;1;5",
            "2;0;4",
            "1;1;4",
            "1;0;5",
            "1;1;4",
            "0;2;4",
            "0;1;5",
            "1;0;5",
            "0;1;5",
            "0;0;6",};
        
        System.out.println("jumlah:" + match.length);
        System.out.println("=====");
        for (int i = 0; i < match.length; i++) {
            for (int j = 0; j < string.length; j++) {
                if (match[i].equals(string[j][0])) {
                    System.out.println(string[j][1]);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
//        NewClass main = new NewClass();
//        main.gejala6();
        
        
//        DecimalFormat format = new DecimalFormat("#0000");
//        int a1=675;
//        int a2=a1+729;
//        
//        for (int i = a1; i < a2; i++) {
//            System.out.println(format.format(i));
//        }

    }

}