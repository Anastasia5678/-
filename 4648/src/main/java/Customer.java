import java.util.Arrays;

public class Customer implements Comparable<Customer> {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String creditCardNumber;
    private String bankAccountNumber;

    // Конструктор
    public Customer(int id, String lastName, String firstName, String middleName, String address, String creditCardNumber, String bankAccountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    // Геттеры и сеттеры

    public String getLastName() {
        return lastName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    // Реализация метода интерфейса Comparable для сортировки
    @Override
    public int compareTo(Customer other) {
        return this.lastName.compareTo(other.lastName);
    }

    // Метод для вывода информации о покупателе
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber='" + creditCardNumber + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Создаем массив объектов Customer
        Customer[] customers = {
                new Customer(1, "Бордукова", "Анастасия", "Павловна", "ул. Пушкина, д. Колотушкина", "1111222233334444", "ACC123456789"),
                new Customer(2, "Петров", "Петр", "Петрович", "ул. Лермонтова, д. Герцена", "5555666677778888", "ACC987654321"),
                new Customer(3, "Шушлейбина", "Александра", "Сергеевна", "ул. Кирова, д. Рон", "6774883838993976", "ABC9876543765")
        };

        // сортировка покупателей в алфавитном порядке
        Arrays.sort(customers);

        // вывод списка покупателей в алфавитном порядке
        System.out.println("Список покупателей в алфавитном порядке:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        // вывод списка покупателей с номерами кредитных карт в интервале [start, end]

        String start = "1111222233330000";
        String end = "1111222233339999";

        System.out.println("\nСписок покупателей, у которых номер кредитной карточки находится в заданном интервале:");
        for (Customer customer : customers) {
            if (customer.getCreditCardNumber().compareTo(start) >= 0 && customer.getCreditCardNumber().compareTo(end) <= 0) {
                System.out.println(customer);
            }
        }
    }
}
