package edu.pcc.marc.demoui.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
    private JTextField textField7;
    private JTextField textField14;
    private JRadioButton asamRadioButton;
    private JRadioButton asinRadioButton;
    private JRadioButton gurihRadioButton;
    private JRadioButton manisRadioButton;
    private JRadioButton pahitRadioButton;
    private JRadioButton pedasRadioButton;
    private JRadioButton vegetarianRadioButton;
    private JRadioButton nonVegetarianRadioButton;
    private JRadioButton sehatRadioButton;
    private JRadioButton cepatSajiRadioButton;
    private JTextField minumanTextField;
    private JRadioButton asinRadioButton1;
    private JRadioButton manisRadioButton1;
    private JRadioButton pahitRadioButton1;
    private JRadioButton mRadioButton;
    private JRadioButton sRadioButton;
    private JRadioButton lRadioButton;
    private JRadioButton netralRadioButton;
    private JRadioButton dinginRadioButton;
    private JRadioButton panasRadioButton;
    private JRadioButton kofeinRadioButton;
    private JRadioButton nonKofeinRadioButton;
    private JTextField makananTextField;
    private JButton EXITButton;
    private JButton simpanButton;
    private JButton simpanButton1;
    private JComboBox asalMakanan;
    private JComboBox asalMinuman;
    private JButton RESETButton;
    private JFormattedTextField EXITFormattedTextField;
    public ArrayList<String> pilihanUser = new ArrayList<>();
    public ArrayList<String> pilihanuserMinuman =new ArrayList<>();

    //ArrayList<String> spaghetti = new ArrayList<>(Arrays.asList("a","d","f","i"));
    Object [][] dataMakanan;
    Object [][] dataMinuman;

    //mengisi setiap kolom dalam tabel

    private void createTable(){
        Object[][] data = {
                {"Spaghetti", "10.000", "Non-vegetarian" , "Manis, asam, pedas, sehat", "Italia"},
                {"Nasi goreng", "15.000", "Non-vegetarian", "Asin, asam,gurih, sehat", "Indonesia"},
                {"Roti daging", "5.000", "Non-vegetarian", "Manis, asam, cepat saji", "China"},
                {"Mie kwetiau", "10.000", "Non-vegetarian", "Pedas, gurih, sehat", "China"},
                {"Italian salad", "15.000", "Vegetarian", "Gurih,sehat", "Italia"},
                {"Lasagna", "15.000", "non-vegetarian", "Gurih, manis, pedas, sehat", "Italia"},
                {"Sushi", "17.000", "Non-vegetarian", "Gurih, sehat", "Jepang"},
                {"Kimchi", "15.000", "Non-vegetarian", "Gurih,sehat", "Korea"},
                {"Rendang", "20.000", "Non-vegetarian", "Gurih, sehat, pedas", "Indonesia"},
                {"Chili crab", "18.000", "Non-vegetarian", "Pedas,sehat", "Australia"},
                {"Dimsum", "25.000", "Non-vegetarian", "Gurih,sehat", "Hongkong"},
                {"Tortilla", "17.000", "Vegetarian", "Gurih,sehat,pedas", "Spanyol"}
        };
        dataMakanan=data;

        Object[][] data1 = {
                {"Ocha", "10.000", "M", "Dingin", "Non-coffein", "Pahit", "Jepang"},
                {"Bubble tea", "13.000", "M", "Dingin", "Non-coffein", "Manis" ,"Taiwan"},
                {"Café mexicano", "8.000", "M", "Panas", "Coffein", "Manis", "Mexico"},
                {"Limoncello", "8.000", "L", "Dingin", "Non-coffein",  "Manis", "Italia"},
                {"Kopi sanger", "10.000", "S", "Panas", "Coffein", "Pahit", "Indonesia"},
                {"Thai tea", "15.000", "M", "Dingin", "Coffein", "Manis", "Thailand"},
                {"Espresso", "12.000", "S", "Panas", "Coffein", "Pahit", "Amerika"},
                {"Coklat aztek", "10.000", "M", "Dingin", "Non-Coffein", "Pahit", "Spanyol"},
                {"Cendol", "12.000", "L", "Dingin", "Non-coffein", "Manis", "Indonesia"},
                {"Bajigur", "8.000", "M", "Panas", "Non-coffein", "Manis", "Indonesia"},
                {"Lahang", "8.000", "M", "Panas", "Non-coffein", "Manis", "Indonesia"},
                {"Bir pletok", "10.000", "L", "Panas", "Non-coffein", "Manis", "Indonesia"}
        };
        dataMinuman=data1;

        //nama-nama kolom dari tabel tersebut
        showTable.setModel(new DefaultTableModel(
                data,
                new String[]{"Makanan", "Harga(IDR)", "Jenis", "Tag", "Asal"}
        ));

        showTable2.setModel(new DefaultTableModel(
                data1,
                new String[]{"Minuman", "Harga(IDR)", "Ukuran", "Kondisi", "Jenis", "Tag", "Asal"}
        ));

        //menentukan besar satu kolom dalam tabel
        TableColumnModel coloumns = showTable.getColumnModel();
        coloumns.getColumn(3).setMinWidth(169);
        coloumns.getColumn(2).setMinWidth(105);
        coloumns.getColumn(1).setMinWidth(50);
        coloumns.getColumn(0).setMinWidth(143);


        TableColumnModel coloumns1 = showTable2.getColumnModel();
        coloumns1.getColumn(0).setMinWidth(142);
        coloumns1.getColumn(2).setMinWidth(2);
        coloumns1.getColumn(4).setMinWidth(100);

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

        //method di program rekomendasi

        episodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField7.setText("Halo! mesin siap digunakan...");
            }
        });

        textField14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double uang; // nominal uang
                uang = Double.parseDouble(textField14.getText());
                if (uang < 0){
                    textField14.setEditable(false);
                }else{
                    textField14.setEditable(true);
                }
            }
        });


        //membuat tombol  selain yang dipilih tidak dapat dipilih

        asamRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (asamRadioButton.isSelected()){
                    asinRadioButton.setSelected(false);
                    gurihRadioButton.setSelected(false);
                    manisRadioButton.setSelected(false);
                    pahitRadioButton.setSelected(false);
                    pedasRadioButton.setSelected(false);
                }
            }
        });

        asinRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (asinRadioButton.isSelected()){
                    asamRadioButton.setSelected(false);
                    gurihRadioButton.setSelected(false);
                    manisRadioButton.setSelected(false);
                    pahitRadioButton.setSelected(false);
                    pedasRadioButton.setSelected(false);
                }
            }
        });

        gurihRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gurihRadioButton.isSelected()){
                    asamRadioButton.setSelected(false);
                    asinRadioButton.setSelected(false);
                    manisRadioButton.setSelected(false);
                    pahitRadioButton.setSelected(false);
                    pedasRadioButton.setSelected(false);
                }
            }
        });

        manisRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (manisRadioButton.isSelected()){
                    asamRadioButton.setSelected(false);
                    asinRadioButton.setSelected(false);
                    gurihRadioButton.setSelected(false);
                    pahitRadioButton.setSelected(false);
                    pedasRadioButton.setSelected(false);
                }
            }
        });

        pahitRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pahitRadioButton.isSelected()){
                    asamRadioButton.setSelected(false);
                    asinRadioButton.setSelected(false);
                    gurihRadioButton.setSelected(false);
                    manisRadioButton.setSelected(false);
                    pedasRadioButton.setSelected(false);
                }
            }
        });

        pedasRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pedasRadioButton.isSelected()){
                    asamRadioButton.setSelected(false);
                    asinRadioButton.setSelected(false);
                    gurihRadioButton.setSelected(false);
                    manisRadioButton.setSelected(false);
                    pahitRadioButton.setSelected(false);
                }
            }
        });

        vegetarianRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (vegetarianRadioButton.isSelected()){
                    nonVegetarianRadioButton.setSelected(false);
                }
            }
        });

        nonVegetarianRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nonVegetarianRadioButton.isSelected()){
                    vegetarianRadioButton.setSelected(false);
                }
            }
        });

        sehatRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sehatRadioButton.isSelected()){
                    cepatSajiRadioButton.setSelected(false);
                }
            }
        });

        cepatSajiRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cepatSajiRadioButton.isSelected()){
                    sehatRadioButton.setSelected(false);
                }
            }
        });

        //bagian minuman
        asinRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (asinRadioButton1.isSelected()){
                    manisRadioButton1.setSelected(false);
                    pahitRadioButton1.setSelected(false);
                }
            }
        });

        manisRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (manisRadioButton1.isSelected()){
                    asinRadioButton1.setSelected(false);
                    pahitRadioButton1.setSelected(false);
                }
            }
        });

        pahitRadioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pahitRadioButton1.isSelected()){
                    asinRadioButton1.setSelected(false);
                    manisRadioButton1.setSelected(false);
                }
            }
        });

        mRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mRadioButton.isSelected()){
                    sRadioButton.setSelected(false);
                    lRadioButton.setSelected(false);
                }
            }
        });

        sRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sRadioButton.isSelected()){
                    mRadioButton.setSelected(false);
                    lRadioButton.setSelected(false);
                }
            }
        });

        lRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lRadioButton.isSelected()){
                    mRadioButton.setSelected(false);
                    sRadioButton.setSelected(false);
                }
            }
        });

        /**
        netralRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (netralRadioButton.isSelected()){
                    dinginRadioButton.setSelected(false);
                    panasRadioButton.setSelected(false);
                }
            }
        });**/

        dinginRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dinginRadioButton.isSelected()){
                   // netralRadioButton.setSelected(false);
                    panasRadioButton.setSelected(false);
                }
            }
        });

        panasRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (panasRadioButton.isSelected()){
                    dinginRadioButton.setSelected(false);
                   // netralRadioButton.setSelected(false);
                }
            }
        });

        kofeinRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (kofeinRadioButton.isSelected()){
                    nonKofeinRadioButton.setSelected(false);
                }
            }
        });
        nonKofeinRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nonKofeinRadioButton.isSelected()){
                    kofeinRadioButton.setSelected(false);
                }
            }
        });

        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        asamRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //mesin rekomendasi makanan

                if(vegetarianRadioButton.isSelected()){
                    if(sehatRadioButton.isSelected()){
                        if(gurihRadioButton.isSelected()){
                            if (asalMakanan.getSelectedItem().equals("Italia")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Italian salad");
                            }if(asalMakanan.getSelectedItem().equals("Spanyol")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Tortilla");
                            }
                        }else if(pedasRadioButton.isSelected()){
                            if(asalMakanan.getSelectedItem().equals("Spanyol")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Tortilla");
                            }
                        }
                    }
                }else if(nonVegetarianRadioButton.isSelected()){
                    if(sehatRadioButton.isSelected()){
                        if(asamRadioButton.isSelected()){
                            if (asalMakanan.getSelectedItem().equals("Italia")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Spaghetti");
                            } if(asalMakanan.getSelectedItem().equals("Indonesia")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Nasi goreng");
                            }
                        else if(asinRadioButton.isSelected()){
                                if(asalMakanan.getSelectedItem().equals("Indonesia")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                    pilihanUser.add("Nasi goreng");
                                }
                            }
                        }else if(gurihRadioButton.isSelected()){
                            if (asalMakanan.getSelectedItem().equals("China")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Mie kwetiau");
                            } if(asalMakanan.getSelectedItem().equals("Italia")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Lasagna");
                            } if(asalMakanan.getSelectedItem().equals("Indonesia")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Rendang");
                                pilihanUser.add("Nasi goreng");
                            }if(asalMakanan.getSelectedItem().equals("Jepang")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Sushi");
                            }if(asalMakanan.getSelectedItem().equals("Korea")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Kimchi");
                            }if (asalMakanan.getSelectedItem().equals("Hongkong")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Dimsum");
                            }
                        }else if(manisRadioButton.isSelected()){
                            if (asalMakanan.getSelectedItem().equals("China")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Roti daging");
                            }if(asalMakanan.getSelectedItem().equals("Italia")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Lasagna");
                            }
                        }else if(pedasRadioButton.isSelected()){
                            if(asalMakanan.getSelectedItem().equals("China")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Mie kwetiau");
                            } if(asalMakanan.getSelectedItem().equals("Italia")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Lasagna");
                            }if(asalMakanan.getSelectedItem().equals("Indonesia")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Rendang");
                            }if (asalMakanan.getSelectedItem().equals("Australia")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Chili crab");
                            }
                        }
                    }else if (cepatSajiRadioButton.isSelected()){
                        if (manisRadioButton.isSelected()){
                            if (asalMakanan.getSelectedItem().equals("China")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Roti daging");
                            }
                        }else if (asamRadioButton.isSelected()){
                            if (asalMakanan.getSelectedItem().equals("China")||asalMakanan.getSelectedItem().equals("--Pilih--")){
                                pilihanUser.add("Roti daging");
                            }
                        }
                    }
                }
                Set<String>setPilihanUser = new HashSet<>(pilihanUser);
                pilihanUser = new ArrayList<>(setPilihanUser);
                ArrayList<Integer>hargaMakanan = new ArrayList<>(setPilihanUser.size());
                for (int i = 0; i < setPilihanUser.size(); i++) {
                    for (int j = 0; j < dataMakanan.length; j++) {
                        if (pilihanUser.get(i).equalsIgnoreCase(dataMakanan[j][1].toString())){
                            hargaMakanan.add(i,Integer.parseInt((dataMakanan[j][1].toString())));
                        };
                    }
                }
                int budgetUser = Integer.parseInt(textField14.getText());
                for (int i = 0; i < hargaMakanan.size(); i++) {
                    if (hargaMakanan.get(i) > budgetUser){
                        hargaMakanan.remove(i);
                        pilihanUser.remove(i);
                    }
                }
                String textHasil = "";
                for (int i = 0; i < pilihanUser.size(); i++) {
                    if(i==pilihanUser.size()-1){
                        textHasil+=pilihanUser.get(i);
                    break;
                    }
                    textHasil+=pilihanUser.get(i)+", ";
                }
                textField7.setText(textHasil);
                rootPanel.repaint();
            }
        });

        //mesin rekomendasi minuman


        simpanButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nonKofeinRadioButton.isSelected()){
                    if (dinginRadioButton.isSelected()){
                        if (mRadioButton.isSelected()){
                            if (pahitRadioButton1.isSelected()){
                                if (asalMinuman.getSelectedItem().equals("Jepang")||asalMinuman.getSelectedItem().equals("--Pilih--")){
                                    pilihanuserMinuman.add("Ocha");
                                }if (asalMinuman.getSelectedItem().equals("Spanyol")||asalMinuman.getSelectedItem().equals("--Pilih--")){
                                    pilihanuserMinuman.add("Coklat aztek");
                                }
                            }else if (manisRadioButton1.isSelected()) {
                                if (asalMinuman.getSelectedItem().equals("Taiwan") || asalMinuman.getSelectedItem().equals("--Pilih--")) {
                                    pilihanuserMinuman.add("Bubble tea");
                                }
                            }
                        }else if (lRadioButton.isSelected()){
                            if (manisRadioButton1.isSelected()){
                                if (asalMinuman.getSelectedItem().equals("Indonesia")||asalMinuman.getSelectedItem().equals("--Pilih--")){
                                    pilihanuserMinuman.add("Cendol");
                                }if (asalMinuman.getSelectedItem().equals("Italia")||asalMinuman.getSelectedItem().equals("--Pilih--")){
                                    pilihanuserMinuman.add("Limoncello");
                                }
                            }
                        }
                    }else if (panasRadioButton.isSelected()){
                        if (mRadioButton.isSelected()){
                            if (manisRadioButton1.isSelected()){
                                if (asalMinuman.getSelectedItem().equals("Indonesia")||asalMinuman.getSelectedItem().equals("--Pilih--")){
                                    pilihanuserMinuman.add("Bajigur");
                                    pilihanuserMinuman.add("Lahang");
                                }
                            }
                        }else if (lRadioButton.isSelected()){
                            if (manisRadioButton1.isSelected()){
                                if (asalMinuman.getSelectedItem().equals("Indonesia")||asalMinuman.getSelectedItem().equals("--Pilih--")){
                                    pilihanuserMinuman.add("Bir pletok");
                                }
                            }
                        }
                    }
                }else if (kofeinRadioButton.isSelected()){
                    if(panasRadioButton.isSelected()){
                        if (sRadioButton.isSelected()){
                            if (pahitRadioButton1.isSelected()){
                                if (asalMinuman.getSelectedItem().equals("Indonesia")||asalMinuman.getSelectedItem().equals("--Pilih--")){
                                    pilihanuserMinuman.add("Kopi sanger");
                                }if (asalMinuman.getSelectedItem().equals("Amerika")||asalMinuman.getSelectedItem().equals("--Pilih--")){
                                    pilihanuserMinuman.add("Espresso");
                                }
                            }
                        }else if (mRadioButton.isSelected()){
                            if(manisRadioButton1.isSelected()){
                                if (asalMinuman.getSelectedItem().equals("Mexico")||asalMinuman.getSelectedItem().equals("--Pilih--")){
                                    pilihanuserMinuman.add("Cafe mexicano");
                                }
                            }
                        }
                    }else if (dinginRadioButton.isSelected()){
                        if (mRadioButton.isSelected()){
                            if (manisRadioButton1.isSelected()){
                                if (asalMinuman.getSelectedItem().equals("Thailand")||asalMinuman.getSelectedItem().equals("--Pilih--")){
                                    pilihanuserMinuman.add("Thai tea");
                                }
                            }
                        }
                    }
                }
                Set<String>setPilihanUserMinuman = new HashSet<>(pilihanuserMinuman);
                pilihanuserMinuman = new ArrayList<>(setPilihanUserMinuman);
                ArrayList<Integer>hargaMinuman = new ArrayList<>(setPilihanUserMinuman.size());
                for (int i = 0; i < setPilihanUserMinuman.size(); i++) {
                    for (int j = 0; j < dataMinuman.length; j++) {
                        if (pilihanuserMinuman.get(i).equalsIgnoreCase(dataMinuman[j][1].toString())){
                            hargaMinuman.add(i, Integer.parseInt(dataMinuman[j][1].toString()));
                        }
                    }
                }
                int budgetUser = Integer.parseInt(textField14.getText());
                for (int i = 0; i < hargaMinuman.size(); i++) {
                    if (hargaMinuman.get(i) > budgetUser){
                        hargaMinuman.remove(i);
                        pilihanuserMinuman.remove(i);
                    }
                }
                String textHasils ="";
                for (int i = 0; i < pilihanuserMinuman.size(); i++) {
                    if (i==pilihanuserMinuman.size()-1){
                        textHasils+=pilihanuserMinuman.get(i);
                        break;
                    }
                    textHasils+=pilihanuserMinuman.get(i);
                }
                textField7.setText(textHasils);
                rootPanel.repaint();
            }
        });

        //mereset layar setelah rekomendasi ditampilkan

        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainUI.main(new String[] {});
                /**
                textField7.setText("");
                asamRadioButton.setSelected(false);
                asinRadioButton.setSelected(false);
                gurihRadioButton.setSelected(false);
                pahitRadioButton.setSelected(false);
                pedasRadioButton.setSelected(false);
                manisRadioButton.setSelected(false);
                nonVegetarianRadioButton.setSelected(false);
                vegetarianRadioButton.setSelected(false);
                cepatSajiRadioButton.setSelected(false);
                sehatRadioButton.setSelected(false);
                asalMakanan.setSelectedIndex(0);
                pahitRadioButton1.setSelected(false);
                manisRadioButton1.setSelected(false);
                asinRadioButton1.setSelected(false);
                pahitRadioButton1.setSelected(false);
                nonKofeinRadioButton.setSelected(false);
                kofeinRadioButton.setSelected(false);
                dinginRadioButton.setSelected(false);
                panasRadioButton.setSelected(false);
                mRadioButton.setSelected(false);
                lRadioButton.setSelected(false);
                sRadioButton.setSelected(false);
                asalMinuman.setSelectedIndex(0);
                textField7.setText("");
                 **/
            }
        });
    }


    //String[]question

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




}
