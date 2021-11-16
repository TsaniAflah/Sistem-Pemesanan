package edu.pcc.marc.demoui.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;

public class MainUI {
    private JPanel rootPanel;
    private JTable showTable;
    private JComboBox genreCombo;
    private JComboBox typeCombo;
    private JTextField minVotesField;
    private JButton episodeButton;
    private JButton imdbButton;
    private JTable showTable2;

    public MainUI(){
        createTable();
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createTable(){
        Object[][] data = {
                {"Spaghetti", "10.000", "Non-vegetarian" , "Manis, asam, pedas, sehat", "Italia"},
                {"Nasi goreng", "15.000", "Non-vegetarian", "Asin, asam,gurih, sehat", "Indonesia"},
                {"Roti daging", "5.000", "Non-vegetarian", "Manis, asam, cepat saji", "China"},
                {"Mie kwetiau", "10.000", "Non-vegetarian", "Pedas, gurih", "China"},
                {"Italian salad", "15.000", "Vegetarian", "Gurih,sehat", "Italia"}
        };

        Object[][] data1 = {
                {"Ocha", "10.000", "M", "Dingin", "Non-coffein", "Pahit", "Jepang"},
                {"Bubble tea", "13.000", "M", "Dingin", "Non-coffein", "Manis" ,"Taiwan"},
                {"Café mexicano", "8.000", "M", "Panas", "Coffein", "Manis", "Mexico"},
                {"Limoncello", "8.000", "L", "Netral", "Non-coffein",  "Asam", "Italia"},
                {"Kopi sanger", "10.000", "S", "Panas", "Coffein", "Pahit", "Indonesia"}
        };

        showTable.setModel(new DefaultTableModel(
                data,
                new String[]{"Makanan", "Harga(IDR)", "Jenis", "Tag", "Asal"}
        ));

        showTable2.setModel(new DefaultTableModel(
                data1,
                new String[]{"Minuman", "Harga(IDR)", "Ukuran", "kondisi", "Jenis", "Tag", "Asal"}
        ));

        TableColumnModel coloumns = showTable.getColumnModel();
        coloumns.getColumn(3).setMinWidth(180);
        coloumns.getColumn(2).setMinWidth(125);
        coloumns.getColumn(0).setMinWidth(143);


        TableColumnModel coloumns1 = showTable2.getColumnModel();
        coloumns1.getColumn(0).setMinWidth(147);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        coloumns.getColumn(1).setCellRenderer(centerRenderer);
        coloumns.getColumn(2).setCellRenderer(centerRenderer);
        coloumns.getColumn(3).setCellRenderer(centerRenderer);
        coloumns.getColumn(4).setCellRenderer(centerRenderer);

        //tabel 2 belum center


    }
}
