
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class GUICalculator implements ActionListener {

    double num1 = 0, num2 = 0, result = 0;
    int calc = 0;

    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonDiv = new JButton("/");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonSqrt = new JButton("\u221A");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSub = new JButton("-");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonZero = new JButton("0");
    JButton buttonDot = new JButton(".");
    JButton buttonEqual = new JButton("=");
    JButton buttonAdd = new JButton("+");
    JButton buttonMul = new JButton("X");
    JButton buttonPercentage = new JButton("%");

    // colors for UI

    Color pink = new Color(239, 71, 111);
    Color yellow = new Color(255, 209, 104);
    Color green = new Color(6, 214, 160);
    Color pastel = new Color(7, 59, 76);

    public GUICalculator() {

        prepareGUI();
        addComponents();
        addActionEvent();
    }

    // outline of GUI calculator

    public void prepareGUI() {

        frame.setSize(300, 490);
        frame.setTitle("Calculator");
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(yellow);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // adding components to GUI Calculator

    public void addComponents() {

        label.setBounds(250, 0, 50, 50);
        label.setBackground(Color.black);
        frame.add(label);

        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 90, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFocusable(false);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(yellow);
        onRadioButton.setForeground(Color.black);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFocusable(true);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(yellow);
        offRadioButton.setForeground(Color.black);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonClear.setBounds(80, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setFocusable(false);
        buttonClear.setBackground(pink);
        buttonClear.setForeground(Color.white);
        frame.add(buttonClear);

        buttonDelete.setBounds(150, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setFocusable(false);
        buttonDelete.setBackground(pink);
        buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);

        buttonDiv.setBounds(220, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setFocusable(false);
        buttonDiv.setBackground(green);
        buttonDiv.setForeground(Color.black);
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        buttonSqrt.setFocusable(false);
        buttonSqrt.setBackground(green);
        buttonSqrt.setForeground(Color.black);
        frame.add(buttonSqrt);

        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSquare.setFocusable(false);
        buttonSquare.setBackground(green);
        buttonSquare.setForeground(Color.black);
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 14));
        buttonReciprocal.setFocusable(false);
        buttonReciprocal.setBackground(green);
        buttonReciprocal.setForeground(Color.black);
        frame.add(buttonReciprocal);

        buttonSub.setBounds(220, 170, 60, 40);
        buttonSub.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSub.setFocusable(false);
        buttonSub.setBackground(green);
        buttonSub.setForeground(Color.black);
        frame.add(buttonSub);

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSeven.setFocusable(false);
        buttonSeven.setBackground(pastel);
        buttonSeven.setForeground(Color.white);
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEight.setFocusable(false);
        buttonEight.setBackground(pastel);
        buttonEight.setForeground(Color.white);
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNine.setFocusable(false);
        buttonNine.setBackground(pastel);
        buttonNine.setForeground(Color.white);
        frame.add(buttonNine);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setFocusable(false);
        buttonMul.setBackground(green);
        buttonMul.setForeground(Color.black);
        frame.add(buttonMul);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFour.setFocusable(false);
        buttonFour.setBackground(pastel);
        buttonFour.setForeground(Color.white);
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFive.setFocusable(false);
        buttonFive.setBackground(pastel);
        buttonFive.setForeground(Color.white);
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSix.setFocusable(false);
        buttonSix.setBackground(pastel);
        buttonSix.setForeground(Color.white);
        frame.add(buttonSix);

        buttonAdd.setBounds(220, 290, 60, 40);
        buttonAdd.setFont(new Font("Arial", Font.BOLD, 20));
        buttonAdd.setFocusable(false);
        buttonAdd.setBackground(green);
        buttonAdd.setForeground(Color.black);
        frame.add(buttonAdd);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        buttonOne.setFocusable(false);
        buttonOne.setBackground(pastel);
        buttonOne.setForeground(Color.white);
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        buttonTwo.setFocusable(false);
        buttonTwo.setBackground(pastel);
        buttonTwo.setForeground(Color.white);
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        buttonThree.setFocusable(false);
        buttonThree.setBackground(pastel);
        buttonThree.setForeground(Color.white);
        frame.add(buttonThree);

        buttonEqual.setBounds(220, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setFocusable(false);
        buttonEqual.setBackground(green);
        buttonEqual.setForeground(Color.black);
        frame.add(buttonEqual);

        buttonPercentage.setBounds(10, 410, 60, 40);
        buttonPercentage.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPercentage.setFocusable(false);
        buttonPercentage.setBackground(pastel);
        buttonPercentage.setForeground(Color.white);
        frame.add(buttonPercentage);

        buttonZero.setBounds(80, 410, 60, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.setFocusable(false);
        buttonZero.setBackground(pastel);
        buttonZero.setForeground(Color.white);
        frame.add(buttonZero);

        buttonDot.setBounds(150, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setFocusable(false);
        buttonDot.setBackground(pastel);
        buttonDot.setForeground(Color.white);
        frame.add(buttonDot);

    }

    // adding ActionListeners to buttons

    public void addActionEvent() {

        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonPercentage.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == onRadioButton) {
            enable();
        } else if (source == offRadioButton) {
            disable();
        } else if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder str = new StringBuilder(textField.getText());
                str.deleteCharAt(number);
                textField.setText(str.toString());
            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == buttonPercentage) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            double number = num1 / 100;
            String string = Double.toString(number);
            textField.setText(string);
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == buttonAdd) {
            String text = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(text + "+");
            calc = 1;
        } else if (source == buttonSub) {
            String text = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(text + "-");
            calc = 2;

        } else if (source == buttonMul) {
            String text = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(text + "*");
            calc = 3;

        } else if (source == buttonDiv) {
            String text = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(text + "/");
            calc = 4;
        } else if (source == buttonSquare) {
            double value = Double.parseDouble(textField.getText());
            double pow = Math.pow(value, 2);
            String str = Double.toString(pow);
            if (str.endsWith(".0")) {
                textField.setText(str.replace(".0", ""));
            } else {
                textField.setText(str);
            }
        } else if (source == buttonSqrt) {
            double value = Double.parseDouble(textField.getText());
            double pow = Math.sqrt(value);
            String str = Double.toString(pow);
            textField.setText(str);
        } else if (source == buttonReciprocal) {
            double value = Double.parseDouble(textField.getText());
            double pow = 1 / value;
            String str = Double.toString(pow);
            if (str.endsWith(".0")) {
                textField.setText(str.replace(".0", ""));
            } else {
                textField.setText(str);
            }
        } else if (source == buttonEqual) {
            num2 = Double.parseDouble(textField.getText());
            switch (calc) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    result = num1 / num2;
                    break;
            }
            if (Double.toString(result).endsWith(".0")) {
                textField.setText(Double.toString(result).replace(".0", ""));
            } else {
                textField.setText(Double.toString(result));
            }
            label.setText("");
        }
    }

    private void enable() {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        label.setEnabled(true);
        textField.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonAdd.setEnabled(true);
        buttonSub.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);

    }

    private void disable() {

        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        label.setText("");
        textField.setText("");
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonAdd.setEnabled(false);
        buttonSub.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);

    }

    public static void main(String args[]) {

        new GUICalculator();
    }
}
