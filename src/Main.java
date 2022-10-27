public class Main
{
    public static void main(String[] args)
    {
        Car c1 = new GasolineCar("Audi", "A38", 5, "AP95847", 17);
        Car c2 = new DieselCar("VolksWagen", "Transporter", 6, "HW42069", false, 4);
        Car c3 = new ElectricCar("Hope Motors", "Hope Whisper", 4, "DW41883", 30, 50);
        Car c4 = new DieselCar("Renault", "Clio", 5, "FARSDYT", true, 24);

        FleetOfCars fleet = new FleetOfCars();

        fleet.addCar(c1);
        fleet.addCar(c2);
        fleet.addCar(c3);
        fleet.addCar(c4);


        // Test call. Uncomment to test

        System.out.println(fleet);

        //System.out.println(fleet.FleetRegistrationFees());

        //System.out.println(fleet.getTotalRegistrationFeeForFleet());
    }
}
