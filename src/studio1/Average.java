package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);
        int x = ap.nextInt("Value for x?");
        int y = ap.nextInt("Value for y?");

        double avg = (x + y) / 2.0;
        System.out.println("Average of " + x + " and " + y + " is " + avg + ". ");


    }
}