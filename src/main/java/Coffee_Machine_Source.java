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

    public double getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public double getMilk() {
        return milk;
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
        double coffee_drink=n*coffee*0.01;
        double water_drink=n*water*0.01;
        double milk_drink=n*milk*0.01;

        if (n<10) {
            System.out.println("Пожалуйста, введите объем напитка больше 10");
        }
        else {
            if ((coffee_drink>this.coffee)|(water_drink>this.water)|(milk_drink>this.milk)) {
                System.out.println("Нехватает объема ингредиентов для напитка");
            }
            else {
                this.coffee-=coffee_drink;
                this.water-=water_drink;
                this.milk-=milk_drink;
                System.out.println(format.format(this.coffee)+" "+format.format(this.water)+" "+format.format(this.milk));
            }

        }
    }


}
