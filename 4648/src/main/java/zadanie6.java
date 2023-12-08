import java.io.IOException;

// Класс "Колесо"
class Wheel1 {
    // Здесь могут быть поля и методы для описания колеса
}

// Класс "Двигатель"
class Engine1 {
    // Здесь могут быть поля и методы для описания двигателя
}

// Класс "Автомобиль"
class Car1 {
    private String brand;
    private Engine engine;
    private Wheel[] wheels;

    public Car1 (String brand, Engine engine, Wheel[] wheels) {
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
        // Код для заправки автомобиля
    }

    public void changeWheel() {
        // Логика для метода "менять колесо"
        System.out.println("Меняются колеса автомобиля.");
    }

    public void printBrand() {
        System.out.println("Марка автомобиля: " + this.brand);
    }

    // Метод для контроля состояния потоков ввода/вывода
    public void checkIOStreams() {
        // Логика для контроля состояния потоков ввода/вывода
    }

    // Пример обработки исключений
    public void handleExceptions() {
        try {
            // Код, генерирующий ошибку, связанную с математическими операциями
        } catch (ArithmeticException e) {
            System.err.println("Ошибка при выполнении математических операций: " + e.getMessage());
        } catch (OutOfMemoryError e) {
            System.err.println("Ошибка: Нехватка памяти - " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }
}

// Пример использования классов и методов
public class zadanie6 {
    public static void main(String[] args) {
        Engine carEngine = new Engine();
        Wheel[] carWheels = {new Wheel(), new Wheel(), new Wheel(), new Wheel()}; // Предполагается, что автомобиль имеет 4 колеса
        Car myCar = new Car("Toyota", carEngine, carWheels);

        myCar.printBrand(); // Выводит марку автомобиля
        myCar.drive(); // Запуск метода "ехать"
        myCar.refuel(); // Запуск метода "заправляться"
        myCar.changeWheel(); // Запуск метода "менять колесо"
        myCar.checkIOStreams(); // Проверка состояния потоков ввода/вывода
        myCar.handleExceptions(); // Обработка исключений
    }
}
