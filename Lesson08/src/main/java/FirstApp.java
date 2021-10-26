import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstApp extends JFrame {

    private int value;

    public FirstApp(int initialValue) {
        setBounds(500, 200, 300, 250);
        setTitle("Простой счётчик");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);
        counterValueView.setBackground(Color.WHITE);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("-");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);
        decrementButton.setBackground(Color.CYAN);

        JButton incrementButton = new JButton("+");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);
        incrementButton.setBackground(Color.PINK);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FirstApp(0);
    }
}
