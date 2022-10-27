import java.util.ArrayList;

public class FleetOfCars
{
    private ArrayList<Car> cars = new ArrayList<>();

    void addCar(Car car)
    {
        cars.add(car);
    }

    int getTotalRegistrationFeeForFleet()
    {
        int total = 0;
        for (Car car: cars)
        {
            total = total + car.getRegistrationFee();
        }
        return total;
    }

    public String FleetRegistrationFees()
    {
        String str = "";
        for (Car car: cars)
        {
            str += car.toString() + '\n' +
                    car.getRegistrationFee() + '\n';
        }
        return str;
    }

    @Override
    public String toString()
    {
        String result = "";
        for (Car car: cars)
        {
            result += car.toString() + '\n';
        }
        return result;
    }
}
