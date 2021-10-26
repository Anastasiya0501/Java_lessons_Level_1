import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main(){
        setTitle("Окно в мир Java");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 150, 400, 400);

        setLayout(null);
        JButton button1 = new JButton("First Button");
        button1.setBounds(0, 0, 400, 50);
        add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("Кнопка изменила свое название :)");
                button1.setBackground(Color.yellow);
            }
        });

        JButton button2 = new JButton("Second Button");
        button2.setBounds(0, 310, 400, 50);
        add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2.setText("И эта кнопка изменила свое название");
                button2.setBackground(Color.cyan);
            }
        });

        JLabel label = new JLabel("Напиши любой текст");
        label.setBounds(35, 50, 300, 100);
        add(label);

        JTextArea area = new JTextArea();
        area.setBounds(30, 120, 300, 100);
        add(area);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();

    }
}
