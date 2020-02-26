import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.FileLock;

public class MyFrame extends JFrame implements ActionListener {

    public static final int HEIGHT = 300;
    public static final int WIDTH = 250;
    private JButton firstButton;
    private JButton secondButton;
    private JButton thirdButton;
    private JButton fourthButton;
    private JButton fifthButtton;
    private JButton sixthButton;
    private JButton seventhButton;
    private JButton eighthButton;
    private JButton ninethButton;
    private JButton zeroButton;
    private JButton addition;
    private JButton subtraction;
    private JButton multiplication;
    private JButton division;
    private JButton delete;
    private JButton result;
    private JButton negation;
    private JButton comma;
    private JLabel text;
    private String firstNumber ="";
    private String secondNumber ="";
    private String sign = "";
    private boolean isFirstComma = false;
    private boolean isSecondComma = false;

    public double operation(double firstNumber, String sign, double secondNumber){
        if(sign.equals("/"))
            return firstNumber/secondNumber;
        else if(sign.equals("*"))
            return firstNumber*secondNumber;
        else if(sign.equals("+"))
            return firstNumber+secondNumber;
        else
            return firstNumber-secondNumber;
    }

    public MyFrame() {
        super("Test akcji");
        firstButton = new JButton("1");
        secondButton = new JButton("2");
        thirdButton = new JButton("3");
        fourthButton = new JButton("4");
        fifthButtton = new JButton("5");
        sixthButton = new JButton("6");
        seventhButton = new JButton("7");
        eighthButton = new JButton("8");
        ninethButton = new JButton("9");
        zeroButton = new JButton("0");
        addition = new JButton("+");
        subtraction = new JButton("-");
        multiplication = new JButton("*");
        division = new JButton("/");
        delete = new JButton("C");
        result = new JButton("=");
        negation = new JButton("-");
        comma = new JButton(",");


        firstButton.addActionListener(this);
        secondButton.addActionListener(this);
        thirdButton.addActionListener(this);
        fourthButton.addActionListener(this);
        fifthButtton.addActionListener(this);
        sixthButton.addActionListener(this);
        seventhButton.addActionListener(this);
        eighthButton.addActionListener(this);
        ninethButton.addActionListener(this);
        zeroButton.addActionListener(this);
        delete.addActionListener(this);
        subtraction.addActionListener(this);
        division.addActionListener(this);
        result.addActionListener(this);
        addition.addActionListener(this);
        multiplication.addActionListener(this);
        negation.addActionListener(this);
        comma.addActionListener(this);

        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(4, 4));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        //add(text);
        buttons.add(firstButton);
        buttons.add(secondButton);
        buttons.add(thirdButton);
        buttons.add(multiplication);
        buttons.add(division);
        buttons.add(fourthButton);
        buttons.add(fifthButtton);
        buttons.add(sixthButton);
        buttons.add(addition);
        buttons.add(subtraction);
        buttons.add(seventhButton);
        buttons.add(eighthButton);
        buttons.add(ninethButton);
        buttons.add(delete);
        buttons.add(comma);
        buttons.add(result);
        buttons.add(zeroButton);
        buttons.add(negation);

        text = new JLabel();
        setLayout(new GridLayout(2, 1));
        add(text);
        add(buttons);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == firstButton) {
            if(sign.isEmpty()) {
                firstNumber += "1";
                text.setText("" + firstNumber + "");
            }
            else {
                secondNumber += "1";
                text.setText("" + secondNumber + "");
            }
        }
        if(source == secondButton) {
            if(sign.isEmpty()) {
                firstNumber += "2";
                text.setText("" + firstNumber + "");
            }
            else {
                secondNumber += "2";
                text.setText("" + secondNumber + "");
            }
        }
        if(source == thirdButton){
            if(sign.isEmpty()) {
                firstNumber += "3";
                text.setText("" + firstNumber + "");
            }
            else {
                secondNumber += "3";
                text.setText("" + secondNumber + "");
            }
        }
        if(source == fourthButton){
            if(sign.isEmpty()) {
                firstNumber += "4";
                text.setText("" + firstNumber + "");
            }
            else {
                secondNumber += "4";
                text.setText("" + secondNumber + "");
            }
        }
        if(source == fifthButtton){
            if(sign.isEmpty()) {
                firstNumber += "5";
                text.setText("" + firstNumber + "");
            }
            else {
                secondNumber += "5";
                text.setText("" + secondNumber + "");
            }
        }
        if(source == sixthButton){
            if(sign.isEmpty()) {
                firstNumber += "6";
                text.setText("" + firstNumber + "");
            }
            else {
                secondNumber += "6";
                text.setText("" + secondNumber + "");
            }
        }
        if(source == seventhButton){
            if(sign.isEmpty()) {
                firstNumber += "7";
                text.setText("" + firstNumber + "");
            }
            else {
                secondNumber += "7";
                text.setText("" + secondNumber + "");
            }
        }
        if(source == eighthButton){
            if(sign.isEmpty()) {
                firstNumber += "8";
                text.setText("" + firstNumber + "");
            }
            else {
                secondNumber += "8";
                text.setText("" + secondNumber + "");
            }
        }
        if(source == ninethButton){
            if(sign.isEmpty()) {
                firstNumber += "9";
                text.setText("" + firstNumber + "");
            }
            else {
                secondNumber += "9";
                text.setText("" + secondNumber + "");
            }
        }
        if(source == zeroButton){
            if(sign.isEmpty()) {
                firstNumber += "0";
                text.setText("" + firstNumber + "");
            }
            else {
                secondNumber += "0";
                text.setText("" + secondNumber + "");
            }
        }
        if(source == division){
            text.setText("/");
            sign = "/";
        }
        if(source == multiplication){
            text.setText("*");
            sign = "*";
        }
        if(source == addition){
            text.setText("+");
            sign = "+";
        }
        if(source == subtraction){
            text.setText("-");
            sign = "-";
        }
        if(source == result){
            if(!sign.isEmpty() && secondNumber != "") {
                text.setText("" + operation(Double.parseDouble(firstNumber), sign, Double.parseDouble(secondNumber)) + "");
            }
            firstNumber = "";
            secondNumber = "";
            sign = "";
            isFirstComma = false;
            isSecondComma = false;
        }
        if(source == delete){
            firstNumber = "";
            secondNumber = "";
            sign = "";
            isFirstComma = false;
            isSecondComma = false;
            text.setText(""+firstNumber+"");
        }
        if(source == negation) {
            if (sign.isEmpty()) {
                double number = 0;
                number = Double.parseDouble(firstNumber) * (-1);
                firstNumber = Double.toString(number);
                text.setText("" + firstNumber + "");
            }else{
                double number = 0;
                number = Double.parseDouble(secondNumber) * (-1);
                secondNumber = Double.toString(number);
                text.setText("" + secondNumber + "");
            }
        }
        if(source == comma){
            if (sign.isEmpty() && isFirstComma == false) {
                firstNumber += ".";
                isFirstComma = true;
                text.setText(firstNumber);
            }else if(!sign.isEmpty() && isSecondComma == false){
                secondNumber += ".";
                isSecondComma = true;
                text.setText(secondNumber);
            }
        }
    }
}//możliwośc wykonywania więcej niż dwóch działań na przykładzie5+7-2, problem ze znakiem równości