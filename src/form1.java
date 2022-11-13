import com.sun.media.jfxmedia.events.NewFrameEvent;

import javax.swing.*;
import javax.swing.event.*;

public class form1 {
    public void main(String[]a) {
        JPanel panel1;
        JTabbedPane tabbedPane1;
        JPanel taborder;
        JPanel tabclientdetails;
        JTextField clientcontacttextfield;
        JTextField clientnametextfield;
        JTextField clientaddresstextfield;
        JTextField deliverydaystextfield;
        JButton saveCustomerInfoButton;
        JButton resetButton;
        JComboBox comboboxclientpreset;
        JLabel labelclientpreset;
        JSpinner spinnercucumbers;
        JTextPane additionalCustomOrderWillTextPane;
        JButton saveOrderButton;
        JButton resetOrderButton;
        JCheckBox haveCustomOrderCheckBox;
        JTable tableordertotalandtransport;
        String data[][] = {{"Transport", "1", "20$"},
                {"Oil bottles", "2", "40$"}};
        String collumn[] = {"ID", "Number", "Value"};
        JFrame f;
        f = new JFrame();
        JTable jt = new JTable(data, collumn);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);


     JButton deleteOrderButton;
     JButton saveOrderButton1;
     JLabel labeldeliverydays;
     JLabel labelclientaddress;
     JLabel labelclientname;
     JLabel labelclientcontact;
     JPanel tabtotals;
     JSpinner spinnerdetergentbags;
     JSpinner spinnerapples;
     JSpinner spinnerbread;
     JSpinner spinneroil;
     JSpinner spinnertomatoes;
     JSpinner spinnerapricots;
     JLabel labelcucumbers;
     JLabel labelapples;
     JLabel labelbread;
     JLabel labeloil;
     JLabel labelwater;
     JSpinner spinnerwater;
     JLabel labeldetergent;
    JLabel labelapricots;
     JLabel labeltomatoes;
     JLabel labelcopyright2022;
};}
