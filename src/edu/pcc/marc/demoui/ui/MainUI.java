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
    private JTextField textField9;
    private JLabel Label;
    private JTextField textField8;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField crKetuaTsaniAflahTextField;
    private JButton ASIANFOODButton;
    private JButton WESTERNFOODButton;
    private JTextArea textArea1;
    private JButton resetButton;

    //mengisi text field sesuai dengan check box yang di centang
    public MainUI(){
        createTable();
        asamCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (asamCheckBox.isSelected()){
                    textField1.setText("MAKANAN : Spaghetti, nasi goreng, roti daging");
                    textField8.setText("MINUMAN : Limoncello");
                    asamCheckBox.setSelected(true);
                }else{
                    textField1.setText("");
                    textField8.setText("");
                    asamCheckBox.setSelected(false);
                }
            }
        });

        asinCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (asinCheckBox.isSelected()){
                    textField2.setText("Naci goyeng");
                    textField11.setText("Minuman asin tidak ditemukan");
                    asinCheckBox.setSelected(true);
                }else{
                    textField2.setText("");
                    textField11.setText("");
                    asinCheckBox.setSelected(false);
                }
            }
        });

        gurihCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gurihCheckBox.isSelected()){
                    textField3.setText("MAKANAN : Nasi goreng, mie kwetiau, italian salad, lasagna, kimchi, rendang, dimsum, tortilla");
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
                    textField4.setText("MAKANAN : Spaghetti, roti daging, lasagna");
                    textField10.setText("MINUMAN :Bubble tea, cafe mexicano,thai tea, cendol, lahang, bir pletok");
                    manisCheckBox.setSelected(true);
                }else{
                    textField4.setText("");
                    textField10.setText("");
                    manisCheckBox.setSelected(false);
                }
            }
        });

        pahitCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pahitCheckBox.isSelected()){
                    textField5.setText("Makanan pahit tidak ditemukan");
                    textField9.setText("MINUMAN : ocha, kopi sanger, espresso, coklat aztek");
                    pahitCheckBox.setSelected(true);
                }else{
                    textField5.setText("");
                    textField9.setText("");
                    pahitCheckBox.setSelected(false);
                }
            }
        });

        pedasCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pedasCheckBox.isSelected()){
                    textField6.setText("MAKANAN : Mie kwetiau, lasagna, rendang, chili crab,atau tortilla");
                    pedasCheckBox.setSelected(true);
                }else{
                    textField6.setText("");
                    pedasCheckBox.setSelected(false);
                }
            }
        });

        //scroll pane belum siap

        ASIANFOODButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("MAKANAN : nasi goreng, roti daging,  " +
                        "\nMie kwetiau, sushi, kimchi, rendang, dimsum" +
                        " \n\nMINUMAN  : ocha, bubble tea, kopi sanger,  " +
                        "\nthai tea, cendol, bajigur, lahang, bir pletok");
            }
        });

        WESTERNFOODButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("MAKANAN : spaghetti, italian salad, lasagna, " +
                        "\nchili crab, tortila" +
                        " \n\nMINUMAN  : Café mexicano, Limoncello, " +
                        "\nEspresso, Coklat aztek");
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
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
                {"Coklat aztek", "10.000", "M", "Dingin", "Non-Coffein", "Pahit", "Spanyol"},
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
