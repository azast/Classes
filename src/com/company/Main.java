
package com.company;

import static ibio.Helpers.*;


public class Main {

    public static void main(String[] args) {


        //HOMEWORK 1
        int k = 0;

        //HOMEWORK 2
        boolean running = true;

        //HOMEWORK 3
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        String aaa = args[0];
        String bbb = args[1];
        StringBuffer sb = new StringBuffer(aaa);

        for (int i = 0; i < aaa.length(); i++) {
            if (args[i].contentEquals("r")) {
                if (args[i + 1].contentEquals("s")) {
                    sb.delete(i, i + 2);
                }
            }


            System.out.println("this is the solution: " + sb);


            //HOMEWORK 2
            while (running) {
                String operation = input("Give operation: ");
                if (operation.equals("end")) {
                    running = false;
                    System.out.println("stopped running");
                } else {
                    int A = inputInt("Give first integer operand: ");
                    int B = inputInt("");
                }
            }

            //HOMEWORK 1
            for (int ii = 0; ii < 11; ii++) {
                double a = (double) (k * (Math.PI / 5));
                System.out.println("This is a: " + a);
                System.out.println("This is sin: " + Math.sin(a));
                System.out.println("This is cos: " + Math.cos(a));
                k = k + 1;
            }
        }
    }
}
