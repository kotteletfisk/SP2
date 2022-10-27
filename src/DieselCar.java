public class DieselCar extends AFuelCar
{
    boolean particleFilter;

    boolean hasParticleFilter()
    {
        return particleFilter;
    }

    public DieselCar(String make, String model, int numberOfDoors, String registrationNumber, boolean particleFilter, int kmPrLiter)
    {
        super.make = make;
        super.model = model;
        super.numberOfDoors = numberOfDoors;
        super.registrationNumber = registrationNumber;
        this.particleFilter = particleFilter;
        super.kmPrLitre = kmPrLiter;
    }

    public String getFuelType()
    {
        return "Diesel";
    }


    public int getRegistrationFee()
    {
        int fee = 0;

        if (kmPrLitre > 20)
        {
            fee = 330 + 130;
        }

        else if (kmPrLitre > 15 && kmPrLitre < 20)
        {
            fee = 1050 + 1390;
        }

        else if (kmPrLitre > 10 && kmPrLitre < 15)
        {
            fee = 2340 + 1850;
        }

        else if (kmPrLitre > 5 && kmPrLitre < 10)
        {
            fee = 5500 + 2770;
        }

        else fee =  10470 + 15260;

        if (!hasParticleFilter())
        {
            fee += 1000;
        }

        return fee;
    }

    @Override
    public String toString()
    {
        return super.toString() +
                ", Type: " + this.getFuelType() +
                ", Km Pr. Litre: " + kmPrLitre +
                ", Particle Filter: " + particleFilter;
    }
}
