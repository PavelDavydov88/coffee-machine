import java.util.Locale;
import java.util.Scanner;

public class Coffee_Machine {
    public static void main(String[] args) {
        String textLine1, textLine2, text;
        boolean b=false;
        Coffee_Machine_Source machine=new Coffee_Machine_Source();
        Scanner scanner=new Scanner(System.in);
        try {
                    machine.setCoffee(Integer.parseInt(args[0]));
                    machine.setWater(Integer.parseInt(args[1]));
                    machine.setMilk(Integer.parseInt(args[2]));
                } catch (Exception e) {
                    System.out.println("Введите целое число");
            while (!b) {
                try {
                    machine.setCoffee(Integer.parseInt(scanner.next()));
                    machine.setWater(Integer.parseInt(scanner.next()));
                    machine.setMilk(Integer.parseInt(scanner.next()));
                    b=true;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Вы опять ввели некорректное число. Введите целое число");
                }
            }
            System.out.println("Вы ввели корректное число, введи программу кофемашины");
        }



        while (true) {
            textLine1=scanner.next().toLowerCase(Locale.ROOT);
            textLine2=scanner.next().toLowerCase(Locale.ROOT);
            text=textLine1+" "+textLine2;

            if ("turn off".equals(text)) break;
            else {
                switch (textLine1) {
                    case  ("water"):
                        machine.water_n(Integer.parseInt(textLine2));
                        break;
                    case ("milk"):
                        machine.milk_n(Integer.parseInt(textLine2));
                        break;
                    case ("coffee"):
                        machine.coffee_n(Integer.parseInt(textLine2));
                        break;

                    case ("latte"):
                        machine.drink_n(Integer.parseInt(textLine2),10,30,60);
                        break;
                    case ("ristretto"):
                        machine.drink_n(Integer.parseInt(textLine2),50,50,0);
                        break;
                    case ("cappuccino"):
                        machine.drink_n(Integer.parseInt(textLine2),15,40,45);
                        break;
                    case ("lungo"):
                        machine.drink_n(Integer.parseInt(textLine2),15,85,0);
                        break;
                    case ("espresso"):
                        machine.drink_n(Integer.parseInt(textLine2),30,70,0);
                        break;
                    default:
                        System.out.println("Вы ввели неопределенную команду");
                        break;
                }
            }
        }
    }
}
