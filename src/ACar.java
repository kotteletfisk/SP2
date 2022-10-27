public abstract class ACar implements Car
{
    // Car template
    protected String registrationNumber;
    protected String make;
    protected String model;
    protected int numberOfDoors;

    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    public String getMake()
    {
        return make;
    }

    public String getModel()
    {
        return model;
    }

    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }


    @Override
    public String toString()
    {
       return "Car | Make: " + make +
                ", Model: " + model +
                ", Doors: " + numberOfDoors +
                ", Registration Number: " + registrationNumber;
    }
}

