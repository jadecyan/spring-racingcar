package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.domain.Car;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    Car cars;

    @BeforeEach
    void setUp() {
        this.cars = new Car ("cyan", 0); //test란 이름의 차가 참여
    }

    @Test
    @DisplayName("전진 테스트")
    void Move(){
        cars.move(8);    //4보다 크므로 전진
        assertEquals(1, cars.getPosition());
    }

    @Test
    @DisplayName("멈춤 테스트")
    void Stop(){
        cars.move(3);    //4보다 크므로 멈춤
        assertEquals(0, cars.getPosition());
    }

    @Test
    @DisplayName("자동차 위치 구하기")
    void getPosition(){
        assertEquals(0, cars.getPosition());
    }

    @Test
    @DisplayName("자동차 이름 구하기")
    void getName(){
        assertEquals("cyan", cars.getName());
    }
}
