package web.config.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(Long.valueOf(1), "Audi", "TT"));
        carList.add(new Car(Long.valueOf(2), "Skoda", "Octavia"));
        carList.add(new Car(Long.valueOf(3), "Huyndai", "Solaris"));
        carList.add(new Car(Long.valueOf(4), "Lada", "Sedan"));
        carList.add(new Car(Long.valueOf(5), "Suzuki", "Vitara"));
    }

    @Override
    public List<Car> returnCars(int number) {
        List<Car> returnList = new ArrayList<>();
        int count = 0;
        for (Car car : carList) {
            if (count < number) {
                returnList.add(car);
                count++;
            }
        }
        return returnList;
    }
}
