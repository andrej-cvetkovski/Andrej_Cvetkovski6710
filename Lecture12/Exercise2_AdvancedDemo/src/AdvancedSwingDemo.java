import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedSwingDemo extends JFrame implements ActionListener {

    private JCheckBox checkBox1, checkBox2, checkBox3;
    private JRadioButton radio1, radio2, radio3;
    private JComboBox<String> comboBox;
    private JList<String> list;
    private JSlider slider;
    private JProgressBar progressBar;
    private JButton startButton, resetButton;

    public AdvancedSwingDemo() {
        setTitle("Advanced Java GUI Demo");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBorder(BorderFactory.createTitledBorder("Multi tab app"));

        JPanel selectionPanel = createSelectionPanel();
        tabbedPane.addTab("Selection components", selectionPanel);

        JPanel valuePanel = createValuePanel();
        tabbedPane.addTab();
    }

    public JPanel createValuePanel() {
        JPanel panel = new JPanel(new GridLayout(2,1,10,10));
        panel.setBorder(BorderFactory.createTitledBorder("Value components"));

        JPanel slidePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        slidePanel.add(new JLabel("Slider (0-100:" ));
        slider = new JSlider(0,100,50);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slidePanel.add(slider);
        panel.add(slidePanel);

        JPanel progressPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        progressPanel.add(new JLabel("Progress bar: "));
        progressBar = new JProgressBar(0,100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressPanel.add(progressBar);
        panel.add(progressPanel);
        return panel;
    }

    public JPanel createSelectionPanel() {
        JPanel panel = new JPanel(new GridLayout(4,1, 10, 10));
        panel.setBorder(BorderFactory.createTitledBorder("Selection Panel"));

        JPanel checkPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        checkPanel.add(new JLabel("CheckBox"));
        checkBox1 = new JCheckBox("Option 1");
        checkBox2 = new JCheckBox("Option 2");
        checkBox3 = new JCheckBox("Option 3");

        checkPanel.add(checkBox1);
        checkPanel.add(checkBox2);
        checkPanel.add(checkBox3);

        panel.add(checkPanel);

        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        radioPanel.add(new JLabel("Radio Options: "));
        radio1 = new JRadioButton("Choise A");
        radio2 = new JRadioButton("Choise B");
        radio3 = new JRadioButton("Choise C");
        radioPanel.add(radio1);
        radioPanel.add(radio2);
        radioPanel.add(radio3);
        panel.add(radioPanel);

        JPanel comboPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        comboPanel.add(new JLabel("Combobox: "));
        String[] options = {"Item 1", "Item 2", "Item 3"};
        comboBox = new JComboBox<>(options);
        comboPanel.add(comboBox);
        panel.add(comboPanel);

        JPanel listPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        listPanel.add(new JLabel("List: "));
        String[] value = {"Apple", "Orange", "Blueberry"};
        list.
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
