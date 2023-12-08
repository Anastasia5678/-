import java.util.ArrayList;
import java.util.List;

// Основной класс "Payment"
public class Payment {
    private List<Item> items;

    public Payment() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        Item newItem = new Item(name, price, quantity);
        items.add(newItem);
    }

    public double getTotalAmount() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    // Внутренний класс "Item" для представления товара
    private class Item {
        private String name;
        private double price;
        private int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    // Пример использования класса
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addItem("Товар1", 10.0, 2);
        payment.addItem("Товар2", 20.0, 1);
        payment.addItem("Товар3", 5.0, 3);

        double totalAmount = payment.getTotalAmount();
        System.out.println("Общая сумма покупки: " + totalAmount);
    }
}
