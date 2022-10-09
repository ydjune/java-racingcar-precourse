package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {


    @Test
    void 자동차_이름입력(){
        Car car = new Car("pubi");
        String carName = car.getCarName();

        assertThat(carName).isEqualTo("pubi");
    }


    @Test
    void 자동차_이름이_5자_이하인가(){

        Car car = new Car("pubi");

    }
}
