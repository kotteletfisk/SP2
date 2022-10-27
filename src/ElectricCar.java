public class ElectricCar extends ACar
{
    double batteryCapacityKwh;
    int maxRangeKm;

    public ElectricCar(String make, String model, int numberOfDoors, String registrationNumber,  double batteryCapacityKwh, int maxRangeKm)
    {
        super.make = make;
        super.model = model;
        super.numberOfDoors = numberOfDoors;
        super.registrationNumber = registrationNumber;
        this.batteryCapacityKwh = batteryCapacityKwh;
        this.maxRangeKm = maxRangeKm;
    }


    double getBatteryCapacityKwh()
    {
        return batteryCapacityKwh;
    }

    public int getMaxRangeKm()
    {
        return maxRangeKm;
    }

    public double getWhPrKm()
    {
        return (batteryCapacityKwh*1000) / maxRangeKm;
    }

    public int getRegistrationFee()
    {
        double pr100 = getWhPrKm() / 91.25;
        double kmPrLitre  = (100 / pr100);

        if (kmPrLitre > 20)
        {
            return 330;
        }

        if (kmPrLitre > 15 && kmPrLitre < 20)
        {
            return 1050;
        }

        if (kmPrLitre > 10 && kmPrLitre < 15)
        {
            return 2340;
        }

        if (kmPrLitre > 5 && kmPrLitre < 10)
        {
            return 5500;
        }

        return 10470;
    }

    @Override
    public String toString()
    {
        return  super.toString() +
                ", Type: Electric" +
                ", Battery Capacity: " + batteryCapacityKwh + "kwh" +
                ", Max Range: " + maxRangeKm;
    }
}
