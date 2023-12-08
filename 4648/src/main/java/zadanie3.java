// Класс "Колесо"
class Wheel {
    // Здесь могут быть поля и методы для описания колеса
}

// Класс "Двигатель"
class Engine {
    // Здесь могут быть поля и методы для описания двигателя
}

// Класс "Автомобиль"
class Car {
    private String brand;
    private Engine engine;
    private Wheel[] wheels;

    public Car(String brand, Engine engine, Wheel[] wheels) {
        this.brand = brand;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        // Логика для метода "ехать"
        System.out.println("Автомобиль едет.");
    }

    public void refuel() {
        // Логика для метода "заправляться"
        System.out.println("Автомобиль заправляется.");
    }

    public void changeWheel() {
        // Логика для метода "менять колесо"
        System.out.println("Меняются колеса автомобиля.");
    }

    public void printBrand() {
        System.out.println("Марка автомобиля: " + this.brand);
    }

    public void checkIOStreams() {
    }

    public void handleExceptions() {
    }
}

// Пример использования классов и методов
public class zadanie3 {
    public static void main(String[] args) {
        Engine carEngine = new Engine();
        Wheel[] carWheels = {new Wheel(), new Wheel(), new Wheel(), new Wheel()}; // Предполагается, что автомобиль имеет 4 колеса
        Car myCar = new Car("Toyota", carEngine, carWheels);

        myCar.printBrand(); // Выводит марку автомобиля
        myCar.drive(); // Запуск метода "ехать"
        myCar.refuel(); // Запуск метода "заправляться"
        myCar.changeWheel(); // Запуск метода "менять колесо"
    }
}
