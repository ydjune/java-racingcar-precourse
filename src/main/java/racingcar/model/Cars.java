package racingcar.model;

import racingcar.functions.ValidationFunction;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    List<Car> carsList;
    String inputCars;
    public Cars(String strInputCars) {
        this.inputCars = strInputCars;
        carsList = new ArrayList<>();
    }

    public List<Car> splitCars(Cars cars) {
        String[] splitCar = cars.inputCars.split(",");

        if(splitCar.length<2){
            throw new IllegalArgumentException("최소 2대 이상 입력해야 합니다.");
        }

        this.carsList = cars.carsList;
        for (String carName : splitCar) {
            Car car = new Car(carName);
            carsList.add(car);
        }

        return carsList;
    }
}
