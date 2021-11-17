package edu.pcc.marc.demoui.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI {
    private JPanel rootPanel;
    private JTable showTable;
    private JButton episodeButton;
    private JTable showTable2;
    private JComboBox comboBox1;
    private JCheckBox asamCheckBox;
    private JCheckBox asinCheckBox;
    private JCheckBox gurihCheckBox;
    private JCheckBox manisCheckBox;
    private JCheckBox pahitCheckBox;
    private JCheckBox pedasCheckBox;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JCheckBox asamCheckBox1;
    private JCheckBox pahitCheckBox1;
    private JCheckBox manisCheckBox1;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JButton button1;

    //mengisi text field sesuai dengan check box yang di centang
    public MainUI(){
        createTable();
        asamCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (asamCheckBox.isSelected()){
                    textField1.setText("Spaghetti, nasi goreng atau roti daging");
                    asamCheckBox.setSelected(true);
                }else{
                    textField1.setText("");
                    asamCheckBox.setSelected(false);
                }
            }
        });

        asinCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (asinCheckBox.isSelected()){
                    textField2.setText("Naci goyeng");
                    asinCheckBox.setSelected(true);
                }else{
                    textField2.setText("");
                    asinCheckBox.setSelected(false);
                }
            }
        });

        gurihCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gurihCheckBox.isSelected()){
                    textField3.setText("Nasi goreng, mie kwetiau, italian salad, lasagna, kimchi, rendang, dimsum, atau tortilla");
                    gurihCheckBox.setSelected(true);
                }else{
                    textField3.setText("");
                    gurihCheckBox.setSelected(false);
                }
            }
        });

        manisCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (manisCheckBox.isSelected()){
                    textField4.setText("Spaghetti, roti daging, atau lasagna");
                    manisCheckBox.setSelected(true);
                }else{
                    textField4.setText("");
                    manisCheckBox.setSelected(false);
                }
            }
        });

        pahitCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pahitCheckBox.isSelected()){
                    textField5.setText("Sayangnya belum ada 'pahit' didalam menu. Mungkin minuman?");
                    pahitCheckBox.setSelected(true);
                }else{
                    textField5.setText("");
                    pahitCheckBox.setSelected(false);
                }
            }
        });

        pedasCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pedasCheckBox.isSelected()){
                    textField6.setText("Mie kwetiau, lasagna, rendang, chili crab,atau tortilla");
                    pedasCheckBox.setSelected(true);
                }else{
                    textField6.setText("");
                    pedasCheckBox.setSelected(false);
                }
            }
        });

        asamCheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (asamCheckBox1.isSelected()){
                    textField7.setText("Limoncello");
                    asamCheckBox1.setSelected(true);
                }else{
                    textField7.setText("");
                    asamCheckBox1.setSelected(false);
                }
            }
        });

        manisCheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (manisCheckBox1.isSelected()){
                    textField8.setText("Bubble tea, cafe mexicano,thai tea, cendol, lahang, bir pletok ");
                    manisCheckBox1.setSelected(true);
                }else{
                    textField8.setText("");
                    manisCheckBox1.setSelected(false);
                }
            }
        });


        pahitCheckBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pahitCheckBox1.isSelected()){
                    textField9.setText("Sayangnya belum ada 'pahit' didalam menu. Mungkin minuman?");
                    pahitCheckBox1.setSelected(true);
                }else{
                    textField9.setText("");
                    pahitCheckBox1.setSelected(false);
                }
            }
        });

        //tag negara belum selesai

    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    //method main
    public static void main(String[] args) {
        JFrame frame = new JFrame("MainUI");
        frame.setContentPane(new MainUI().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    //mengisi setiap kolom dalam tabel
    private void createTable(){
        Object[][] data = {
                {"Spaghetti", "10.000", "Non-vegetarian" , "Manis, asam, pedas, sehat", "Italia"},
                {"Nasi goreng", "15.000", "Non-vegetarian", "Asin, asam,gurih, sehat", "Indonesia"},
                {"Roti daging", "5.000", "Non-vegetarian", "Manis, asam, cepat saji", "China"},
                {"Mie kwetiau", "10.000", "Non-vegetarian", "Pedas, gurih", "China"},
                {"Italian salad", "15.000", "Vegetarian", "Gurih,sehat", "Italia"},
                {"Lasagna", "15.000", "non-vegetarian", "Gurih, manis, pedas", "Italia"},
                {"Sushi", "17.000", "Non-vegetarian", "sehat", "Jepang"},
                {"Kimchi", "15.000", "Non-vegetarian", "Gurih,sehat", "Korea"},
                {"Rendang", "20.000", "Non-vegetarian", "Gurih, sehat, pedas", "Indonesia"},
                {"Chili crab", "18.000", "Non-vegetarian", "Pedas,sehat", "Australia"},
                {"Dimsum", "25.000", "Non-vegetarian", "Gurih,sehat", "Hongkong"},
                {"Tortilla", "17.000", "Vegetarian", "Gurih,sehat,pedas", "Spanyol"}
        };

        Object[][] data1 = {
                {"Ocha", "10.000", "M", "Dingin", "Non-coffein", "Pahit", "Jepang"},
                {"Bubble tea", "13.000", "M", "Dingin", "Non-coffein", "Manis" ,"Taiwan"},
                {"Café mexicano", "8.000", "M", "Panas", "Coffein", "Manis", "Mexico"},
                {"Limoncello", "8.000", "L", "Netral", "Non-coffein",  "Asam", "Italia"},
                {"Kopi sanger", "10.000", "S", "Panas", "Coffein", "Pahit", "Indonesia"},
                {"Thai tea", "15.000", "M", "Dingin", "Coffein", "Manis", "Thailand"},
                {"Espresso", "12.000", "S", "Panas", "Coffein", "Pahit", "Amerika"},
                {"Mazagran", "10.000", "M", "Dingin", "Coffein", "Pahit", "Algeria"},
                {"Cendol", "12.000", "L", "Dingin", "Non-coffein", "Manis", "Indonesia"},
                {"Bajigur", "8.000", "M", "Panas", "Non-coffein", "Manis", "Indonesia"},
                {"Lahang", "8.000", "M", "Panas", "Non-coffein", "Manis", "Indonesia"},
                {"Bir pletok", "10.000", "L", "Panas", "Non-coffein", "Manis", "Indonesia"}

        };

        //nama-nama kolom dari tabel tersebut
        showTable.setModel(new DefaultTableModel(
                data,
                new String[]{"Makanan", "Harga(IDR)", "Jenis", "Tag", "Asal"}
        ));

        showTable2.setModel(new DefaultTableModel(
                data1,
                new String[]{"Minuman", "Harga(IDR)", "Ukuran", "kondisi", "Jenis", "Tag", "Asal"}
        ));

        //menentukan besar satu kolom dalam tabel
        TableColumnModel coloumns = showTable.getColumnModel();
        coloumns.getColumn(3).setMinWidth(180);
        coloumns.getColumn(2).setMinWidth(125);
        coloumns.getColumn(0).setMinWidth(143);


        TableColumnModel coloumns1 = showTable2.getColumnModel();
        coloumns1.getColumn(0).setMinWidth(142);

        //membuat align center
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        coloumns.getColumn(1).setCellRenderer(centerRenderer);
        coloumns.getColumn(2).setCellRenderer(centerRenderer);
        coloumns.getColumn(3).setCellRenderer(centerRenderer);
        coloumns.getColumn(4).setCellRenderer(centerRenderer);

        coloumns1.getColumn(1).setCellRenderer(centerRenderer);
        coloumns1.getColumn(2).setCellRenderer(centerRenderer);
        coloumns1.getColumn(3).setCellRenderer(centerRenderer);
        coloumns1.getColumn(4).setCellRenderer(centerRenderer);
        coloumns1.getColumn(5).setCellRenderer(centerRenderer);
        coloumns1.getColumn(6).setCellRenderer(centerRenderer);

    }
}
