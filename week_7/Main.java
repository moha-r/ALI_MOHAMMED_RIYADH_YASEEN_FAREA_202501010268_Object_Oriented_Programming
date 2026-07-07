public class Main {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine("LG");
        Appliance refrigerator = new Refrigerator("Panasonic");

        washingMachine.displayBrand();
        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.turnOff();

        System.out.println();

        refrigerator.displayBrand();
        refrigerator.turnOn();
        refrigerator.operate();
        refrigerator.turnOff();
    }
}
