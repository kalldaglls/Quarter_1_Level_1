import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private final JTextField inputField;
    public final StringBuilder sb = new StringBuilder();
    public int result = 0;

    public ButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }


    @Override
    public void actionPerformed(ActionEvent e) {//Похоже на то, что этот метод срабатывает каждый раз при нажатии кнопки!!!!!
       JButton jButton = (JButton) e.getSource();//Что значит кастить?
        //if (jButton.getText().equals("+")) {
            sb.append(inputField.getText()).append(jButton.getText());//Как это работает?
            String search = sb.toString();
            inputField.setText(search);
            if (search.contains("-")) {
                String deleteAll = jButton.getText().replaceAll("-","0");
                result = Integer.parseInt(search.replaceAll("-","0")) - Integer.parseInt(deleteAll);
                System.out.println(result);
            }
      //  }
        /*String a = jButton.getText();
        if (jButton.getText().equals("+")) {
            while (!jButton.getText().equals("+")) {
                String b = jButton.getText();
                System.out.println(a+b);
            }

         */
            /*int result = Integer.parseInt(jButton.getText());
            String a = String.valueOf(inputField.getText());
            System.out.println(a);
            int result = Integer.parseInt(a);
            result = result + Integer.parseInt(a);
            System.out.println(result);

             */

        /*if (jButton.getText() == "+") {
            String a = String.valueOf(inputField.getText());
            String b = String.valueOf(inputField.getText());
            System.out.println(a+b);
            inputField.setText(a);
            inputField.setText(b);
        }

         */
        sb.setLength(0);
    }
}
