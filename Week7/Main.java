public class Main {

    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine("LG");
        Television tv = new Television("Samsung");

        wm.displayBrand();
        wm.turnOn();
        wm.operate();
        wm.turnOff();

        System.out.println();

        tv.displayBrand();
        tv.turnOn();
        tv.operate();
        tv.turnOff();
    }
}
