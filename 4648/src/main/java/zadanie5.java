public class zadanie5 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        text = text.toLowerCase(); // Приводим все буквы к нижнему регистру для упрощения вычислений

        StringBuilder result = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                result.append((int)(c - 'a') + 1).append("  "); // Заменяем букву ее порядковым номером в алфавите
                numbers.append(c).append("   ");
            }
        }

        System.out.println(result.toString());
        System.out.println(numbers.toString());
    }
}
