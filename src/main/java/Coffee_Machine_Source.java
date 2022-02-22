import java.text.DecimalFormat;

public class Coffee_Machine_Source {
    private double coffee, water, milk;
    DecimalFormat format = new DecimalFormat("#.00");
    public double getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    void water_n (int n) {

        if (n>0) {
            water+=n;
            System.out.println(format.format(coffee)+" "+format.format(water)+" "+format.format(milk));

        } else {
            System.out.println("Пожалуйста, введите объем больше 10");
        }
    }

    void milk_n (int n) {
        if (n>0) {
            milk+=n;
            System.out.println(format.format(coffee)+" "+format.format(water)+" "+format.format(milk));
        } else {
            System.out.println("Пожалуйста, введите объем больше 10");
        }
    }

    void coffee_n (int n) {
        if (n>0) {
            coffee+=n;
            System.out.println(format.format(coffee)+" "+format.format(water)+" "+format.format(milk));
        } else {
            System.out.println("Пожалуйста, введите объем больше 10");
        }
    }

    void drink_n(int n, int coffee, int water, int milk){
        double coffeeDrink=n*coffee*0.01;
        double waterDrink=n*water*0.01;
        double milkDrink=n*milk*0.01;

        if (n<10) {
            System.out.println("Пожалуйста, введите объем напитка больше 10");
        }
        else {
            if ((coffeeDrink>this.coffee)|(waterDrink>this.water)|(milkDrink>this.milk)) {
                System.out.println("Нехватает объема ингредиентов для напитка");
            }
            else {
                this.coffee-=coffeeDrink;
                this.water-=waterDrink;
                this.milk-=milkDrink;
                System.out.println(format.format(this.coffee)+" "+format.format(this.water)+" "+format.format(this.milk));
            }

        }
    }


}
