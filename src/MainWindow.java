import taskPack.GeneralTask;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;

/**
 * Created by Kolja on 21.04.2017.
 */
public class MainWindow extends JFrame
{
    private JPanel panel1;
    private JComboBox comboBox1;
    private JTextField inputField;
    private JButton button1;
    private JTextField resultField;
    private JTextPane textPane1;
    private GeneralTask localTask;
    private static String dropDown;

    //Main window
    public MainWindow()
    {
        setContentPane(panel1);
        setResizable(false);
        setVisible(true);
        setSize(600, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        resultField.setFocusable(false);


        //show description
        comboBox1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dropDown = (String) comboBox1.getSelectedItem();
                for (GeneralTask task : Main.generalTaskList)
                {
                    if (dropDown.equalsIgnoreCase(task.getName()))
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
                    if (dropDown.equalsIgnoreCase(task.getName()))
                    {
                        localTask = task;
                        localTask.setInput(inputField.getText());
                        localTask.countResult();
                        resultField.setText(localTask.getResult());
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
