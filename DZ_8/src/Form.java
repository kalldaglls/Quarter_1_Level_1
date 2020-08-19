import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Form extends JFrame {
    public final StringBuilder sb = new StringBuilder();
    public String [] result1;
    public String sign;
    public int calculation = 0;
    public Form(String title) {
        setTitle(title);
        setBounds(50,30, 300, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(100, 226, 47));

        /*setLayout(new GridLayout(2,2));

        for (int i = 1; i <= 4;i++) {//Закоментить?
            JPanel jPanel = new JPanel();
            JButton b = new JButton(String.valueOf(i));
            jPanel.add(b);
            jPanel.setBackground(new Color(22*i,72*i/2,10 + i));
            add(jPanel);
        }

        setVisible(true);


        if (true) return;

         */

        setLayout(new GridLayout(2,1));

        JTextField inputField = new JTextField();
        //submit.setBackground(new Color(0,0,0));
        inputField.setEditable(false);

        ButtonListener buttonListener = new ButtonListener(inputField);

        JPanel buttonPanel = new JPanel(new GridLayout(5, 3));

        for(int i = 9; i >= 0; i--) {
            JButton digits = new JButton(String.valueOf(i));
            digits.addActionListener(buttonListener);
            buttonPanel.add(digits);
            digits.setBackground(new Color(111, 111, 111, 91));
        }

        JButton submit = new JButton("Submit");
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                /*JButton jButton = (JButton) e.getSource();
                String strText = jButton.getText();
                System.out.println(" Input Field " + inputField.toString());
                System.out.println("Str Text " + strText);

                 */
                if (inputField.getText().contains("+")) {
                    sign = inputField.getText();
                    result1 = sign.trim().split("\\+");
                    for (int i = 0; i < result1.length; i++) {
                        System.out.println(result1[i]);
                        calculation = calculation + Integer.parseInt(result1[i]);
                    }
                    System.out.println(calculation);
                    inputField.setText(String.valueOf(calculation));
                    calculation = 0;
                }
                if (inputField.getText().contains("-")) {
                    sign = inputField.getText();
                    result1 = sign.trim().split("\\-");
                    for (int i = 0; i < result1.length; i++) {
                        System.out.println(result1[i]);
                    }
                    calculation = Integer.parseInt(result1[0]) - Integer.parseInt(result1[1]);
                    inputField.setText(String.valueOf(calculation));
                    calculation = 0;
                }

                if (inputField.getText().contains("*")) {
                    sign = inputField.getText();
                    result1 = sign.trim().split("\\*");
                    calculation = Integer.parseInt(result1[0]) * Integer.parseInt(result1[1]);
                    inputField.setText(String.valueOf(calculation));
                    calculation = 0;
                }
                if (inputField.getText().contains("/")) {
                    sign = inputField.getText();
                    result1 = sign.trim().split("\\/");
                    if (Integer.parseInt(result1[1]) == 0) {
                        inputField.setText("Делить на ноль нельзя!");
                    }
                    calculation = Integer.parseInt(result1[0]) / Integer.parseInt(result1[1]);
                    inputField.setText(String.valueOf(calculation));
                    calculation = 0;
                }
            }
        });

        JButton plus = new JButton("+");
        plus.addActionListener(buttonListener);
          //  @Override
            //public void actionPerformed (ActionEvent e) {
                //JButton jButton = (JButton) e.getSource();
                // String b = sb.toString();
                // b = b.replaceAll("[+]", "");
                // System.out.println(b);
                //result1 = inputField.getText();
                //String c = jButton.getText().replaceAll("[+]", "");
                //inputField.setText("");
               // sign = "+";
              // plus.addActionListener(buttonListener);
               // System.out.println("Result is " + result1);
                //inputField.setText("");
               // System.out.println(result1);
                //int d = Integer.parseInt(a) + Integer.parseInt(c);
                //int a = Integer.parseInt(inputField.getText()) + Integer.parseInt(jButton.getText());
                //a = a.replaceAll("[+]", "");
                //System.out.println(c);
                //System.out.println(d);
                //result1 = result1 + Integer.parseInt(a);
                //String c = Integer.toString(a);
                //inputField.setText(c);
                //System.out.println(charRemoveAt(b,1));
                //sb.setLength(0);
          //  }
       // });
        JButton min = new JButton("-");
        min.addActionListener(buttonListener);
        JButton multiple = new JButton("*");
        multiple.addActionListener(buttonListener);
        JButton devide = new JButton("/");
        devide.addActionListener(buttonListener);
        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
            }
        });
        plus.setBackground(new Color(255,255,255));
        add(submit);
        buttonPanel.add(plus);
        buttonPanel.add(min);
        buttonPanel.add(multiple);
        buttonPanel.add(devide);
        buttonPanel.add(clear);

        add(buttonPanel);

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(submit, BorderLayout.EAST);

        add(inputPanel);

        setVisible(true);
    }

    public String charRemoveAt(String a, int b) {
        return a.substring(0,b) + a.substring(b + 1);
    }

}
