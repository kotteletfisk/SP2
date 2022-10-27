public class GasolineCar extends AFuelCar
{

    public int getRegistrationFee()
    {
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
    String getFuelType()
    {
        return "Gasoline";
    }

    public GasolineCar(String make, String model, int numberOfDoors, String registrationNumber, int kmPrLitre)
    {
        super.make = make;
        super.model = model;
        super.numberOfDoors = numberOfDoors;
        super.registrationNumber = registrationNumber;
        super.kmPrLitre = kmPrLitre;
    }


    @Override
    public String toString()
    {
        return super.toString() +
                ", Type: " + this.getFuelType() +
                ", Km Pr. Litre: " + kmPrLitre;
    }
}
