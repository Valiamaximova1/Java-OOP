package test06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Направете клас Car с полета: марка, година на производство и цена.
        // Да се предефинира метода toString(). В метода main да се и направи списък от автомобили,
        // в който да се въведат поне 5 елемента. Списъкът да се сортира в низходящ ред спрямо цената.
        // За целта може да се използва подходяща библиотечна функция и класът Car да имплементира интерфейса Comparable.
        ArrayList<Car> cars = new ArrayList<Car>();
        Car car1 = new Car("Audi", 2000, 2100);
        Car car2 = new Car("Mercedes", 2019, 19000);
        Car car3 = new Car("Ford", 2015, 15000);
        Car car4 = new Car("BMV", 2020, 21000);
        Car car5 = new Car("Opel", 2003, 5000);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car.toString());

        }

    }
}
