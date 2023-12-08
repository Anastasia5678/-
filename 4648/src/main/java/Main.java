import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Программы 1-6");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 3)); // 2 строки, 4 столбца

        for (int i = 1; i <= 6; i++) {
            JButton button = new JButton("Кнопка " + i);
            button.addActionListener(new ButtonClickListener());
            frame.add(button);
        }

        frame.pack();
        frame.setLocationRelativeTo(null); // Центрирование окна
        frame.setVisible(true);
    }

    private static class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

// Определение, какую программу запускать в зависимости от текста кнопки
            switch (buttonText) {
                case "Кнопка 1":
                    zadanie1.main(new String[]{});
                    break;
                case "Кнопка 2":
                    Customer.main(new String[]{});
                    break;
                case "Кнопка 3":
                    zadanie3.main(new String[]{});
                    break;
                case "Кнопка 4":
                    Payment.main(new String[]{});
                    break;
                case "Кнопка 5":
                    zadanie5.main(new String[]{});
                    break;
                case "Кнопка 6":
                    zadanie6.main(new String[]{});
                    break;
// Добавьте дополнительные case для остальных кнопок

                default:
                    System.out.println("Неопределенная кнопка: " + buttonText);
            }
        }
    }
}