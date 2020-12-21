package eu.bmoll.daw.programming;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class NonsenseApp {
    private  static  String EXIT_KEY = "9";
    public static void main(String[] args) {
        System.out.println("hola mundo");
        boolean aux = StringUtils.equals("a", "A");
        System.out.println("hola mundo" + aux);
        Scanner in = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            String s = in.nextLine();
            System.out.println("you entered string" + s);
            isExit = StringUtils.equals(s, EXIT_KEY);
        }
        System.out.println("-END-");
    }
}
