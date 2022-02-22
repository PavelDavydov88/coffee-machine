import java.util.Arrays;
import java.util.Scanner;

public class Coffee_Machine {
    public static void main(String[] args) {
        String text_line_1, text_line_2, text;
        Coffee_Machine_Source machine=new Coffee_Machine_Source();
        machine.setCoffee(Integer.parseInt(args[0]));
        machine.setWater(Integer.parseInt(args[1]));
        machine.setMilk(Integer.parseInt(args[2]));
        Scanner scanner=new Scanner(System.in);


        while (true) {
            text_line_1=scanner.next();
            text_line_2=scanner.next();
            text=text_line_1+" "+text_line_2;
            if (text.equals("turn off")) break;
            if (text_line_1.equals("water")) {
                machine.water_n(Integer.parseInt(text_line_2));
            }
            if (text_line_1.equals("milk")) {
                machine.milk_n(Integer.parseInt(text_line_2));
            }
            if (text_line_1.equals("coffee")) {
                machine.coffee_n(Integer.parseInt(text_line_2));
            }
            if (text_line_1.equals("latte")) {
                machine.drink_n(Integer.parseInt(text_line_2),10,30,60);
            }
            if (text_line_1.equals("ristretto")) {
                machine.drink_n(Integer.parseInt(text_line_2),50,50,0);
            }
            if (text_line_1.equals("cappuccino")) {
                machine.drink_n(Integer.parseInt(text_line_2),15,40,45);
            }
            if (text_line_1.equals("lungo")) {
                machine.drink_n(Integer.parseInt(text_line_2),15,85,0);
            }
            if (text_line_1.equals("espresso")) {
                machine.drink_n(Integer.parseInt(text_line_2),30,70,0);
            }

        }



    }



}
