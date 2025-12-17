import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo extends JFrame implements ActionListener {

    private JLabel lable;
    private JTextField textField;
    private JTextArea textArea;
    private JButton startButton, resetButton, exitButton;
    private JLabel statusLabel;
    private JTextField ageField;

    public SwingDemo() {
        setTitle("Basic Swing Out Demo");
        setSize(600,500);
        setLayout(new BorderLayout());

        lable = new JLabel("Enter your name: ");
        textField = new JTextField(30);
        ageField = new JTextField(5);
        textArea = new JTextArea(10,40);
        statusLabel = new JLabel("Ready");

        startButton = new JButton("Start Demo");
        resetButton = new JButton("Reset");
        exitButton = new JButton("Exit");
        //startButton.addActionListener(this);
        //resetButton.addActionListener(this);
        //exitButton.addActionListener(this);

        startButton.addActionListener(new startAction());
        resetButton.addActionListener(new clearAction());
        exitButton.addActionListener(e -> System.exit(0));

        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(lable);
        topPanel.add(textField);
        topPanel.add(new JLabel("Age: "));
        topPanel.add(ageField);

        add(topPanel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel bottompanel = new JPanel(new BorderLayout());

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(startButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(exitButton);
        //add(buttonPanel, BorderLayout.SOUTH);
        bottompanel.add(buttonPanel, BorderLayout.CENTER);
        bottompanel.add(statusLabel, BorderLayout.SOUTH);
        add(bottompanel, BorderLayout.SOUTH);


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            String name = textField.getText();
            if (!name.trim().isEmpty()) {
                textArea.append("Hello " + name);
                textArea.append("5th " + name);
                textArea.append("Test " + name);
                textArea.append("Hello " + name);

            } else {
                textArea.setText("Please enter your name!");
            }
        } else if (e.getSource() == resetButton) {
            textField.setText("");
            textArea.setText("");
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    public class startAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = textField.getText().trim();
            String adeText = ageField.getText();
            if (name.length() < 2) {
                textArea.setText("Error: Name length must be above 2");
                statusLabel.setText("Invalid input");
                return;
            }
            int age;
            try {
                age = Integer.parseInt(adeText);
                if (age < 2 || age > 120) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException exception) {
                textArea.setText("Error! Age should be a number between 2 and 120");
                statusLabel.setText("Invalid input");
                return;
            }
            textArea.append("Hello " + name);
            textArea.append(" You are " + age + " years old");
            statusLabel.setText("Approved..");
        }
    }

    public class clearAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setText("");
            textField.setText("");
            ageField.setText("");
            statusLabel.setText("Cleared!");
        }
    }
}
