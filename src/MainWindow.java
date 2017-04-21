import taskPack.GeneralTask;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kolja on 21.04.2017.
 */
public class MainWindow extends JFrame
{
    private JPanel panel1;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    private JTextPane textPane1;
    private GeneralTask localTask;

    //Main window
    public MainWindow()
    {
        setContentPane(panel1);
        setResizable(false);
        setVisible(true);
        setSize(600, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //show description
        comboBox1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                for (GeneralTask task : Main.generalTaskList)
                {
                    String str = (String) comboBox1.getSelectedItem();
                    if (str.equalsIgnoreCase(task.getName()))
                        textPane1.setText(task.getDescription());
                }
            }
        });

        //button to run task method
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                for (GeneralTask task : Main.generalTaskList)
                {
                    String str = (String) comboBox1.getSelectedItem();
                    if (str.equalsIgnoreCase(task.getName()))
                    {
                        localTask = task;
                        localTask.setInput(textField1.getText());
                        localTask.countResult();
                        textField2.setText(localTask.getResult());
                    }
                }
            }
        });
    }

    private void createUIComponents()
    {
        comboBox1 = new JComboBox(Main.allNames.toArray());
    }
}
