import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class okno extends JFrame {
    private int count = 0, count2 = 1, count3 = 0;

    private JTextField fio = new JTextField(20);
    private JLabel metka = new JLabel("Ваше имя?");
    private JLabel metkaDva = new JLabel("");
    private JLabel metkaTri = new JLabel("Тут будет висеть counter 2-й кнопки");

    class PushingListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Object button = e.getSource();

            if(button instanceof JButton){
                count++;
                ((JButton)button).setText("Нажато " + count + " раз");
                metkaDva.setText("Спасибо, "+fio.getText()+"!");
            }
        }
    }

    class FrameSize implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            Object button = event.getSource();

            if(button instanceof JButton) {
                count2++;
                count3++;
                ((JButton)button).setText("Изменить размер окна");
                ((JButton)button).setBounds(170,60,180,40);
                metkaTri.setText("Нажато " + count3 + " раз");
                if (count2%2 ==0){
                    setSize(500, 500);
                }
                else setSize(400, 200);
            }
        }
    }

    public okno(String title)
    {
        super(title);
        SozdatxOkno();
    }

    private void SozdatxOkno(){

        JButton button = new JButton(" Нажми меня! ");
        button.setBounds(20,60,150,40);

        JButton butto = new JButton(" Размер окна ");
        butto.setBounds(170,60,150,40);

        button.addActionListener(new PushingListener());
        butto.addActionListener(new FrameSize());

        metka.setBounds(15,15,150,30);
        metkaDva.setBounds(15,115,250,30);
        metkaTri.setBounds(15,130,250,30);

        fio.setBounds(120, 15, 200, 30);

        getContentPane().setLayout(null);
        getContentPane().add(button);
        getContentPane().add(butto);
        getContentPane().add(metka);
        getContentPane().add(metkaDva);
        getContentPane().add(metkaTri);
        getContentPane().add(fio);

        setLocationRelativeTo(null);
    }
}