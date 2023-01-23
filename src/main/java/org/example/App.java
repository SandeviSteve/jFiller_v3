package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class App {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton buttonSK;
    private JButton buttonCZ;
    private JButton buttonTestFill;
    private JButton buttonManualVendor;
    private JButton buttonClear;
    public String datePurchased;
    public String reference;
    public String serial;
    public String device;
    public String issue;
    public String customer;
    public int vendorSelect;
    public String vendor;
    public String manualVendor;
    public String region;
    public String dateDay, dateMonth, dateYear;
    public String customerName, customerStreet, customerCity, customerBox, customerMail, customerPhone;
    public String vendorName, vendorStreet, vendorCity, vendorBox, vendorMail, vendorPhone;
    public String dateCurrent;

    public App() {
        buttonSK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reference = textField1.getText();
                serial = textField2.getText();
                device = textField3.getText();
                datePurchased = textField4.getText();
                issue = textField5.getText();
                customer = textField6.getText();
                manualVendor = textField7.getText();
//                JOptionPane.showMessageDialog(null, text );
                region = "Slovakia";
                printShitBro();
            }
        });
        buttonCZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reference = textField1.getText();
                serial = textField2.getText();
                device = textField3.getText();
                datePurchased = textField4.getText();
                issue = textField5.getText();
                customer = textField6.getText();
                manualVendor = textField7.getText();
                region = "Czech Republic";
                printShitBro();
            }
        });
        buttonTestFill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("2037SKBAAPL79323");
                textField2.setText("C02BBQJBNTKKT");
                textField3.setText("iWipe, Much Space, 512 WTF, SD-KU, CI/GAN, EU");
                textField4.setText("14.02.2037");
                textField5.setText("I threw it in washing mashine, now its not working, i have lost all hope and trust in apple products im so dissapointed i have everything from apple and i cant believe you would do this to me i am Professional Apple Power User and i will not stand for such atrocity against perfection, i am suing you, your service, your mom, and hip hop for ruining everything that was ever good");
                textField6.setText("Igor Pistak, Fakraská 599/1, 90638 Rohostík 7 , pistak.igor@gmail.com , +421 / 903 7451688");
                textField7.setText("Alza.SK, Bottova 6654/7, 81109 Bratislava, alza@alza.sk, +02/571 018 00");
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(null);
                textField2.setText(null);
                textField3.setText(null);
                textField4.setText(null);
                textField5.setText(null);
                textField6.setText(null);
                textField7.setText(null);
            }
        });
        buttonManualVendor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 100;
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 0;
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 1;
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 2;
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 3;
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 4;
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 5;
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 6;
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 7;
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 8;
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 9;
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 10;
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 11;
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 12;
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 13;
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 14;
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 15;
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 16;
            }
        });
        button18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 17;
            }
        });
        button19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 18;
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vendorSelect = 19;
            }
        });


    }
    public void printShitBro() {
        parseShit();
        try {
//            String path = new File(App.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getAbsolutePath(); /* BUILD */
            String path = new File(App.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent(); /* COMP */



            JOptionPane.showMessageDialog(null,path);

            String path1 = path + "/BaseForm/WCR.jpg";
            String path2 = path + "/BaseForm/LCF01.jpg";
            String path3 = path + "/BaseForm/LCF02.jpg";

            Font font = new Font("Arial", Font.TYPE1_FONT, 25);

            final BufferedImage wcr = ImageIO.read(new File(path1));

            Graphics g = wcr.getGraphics();
            g.setFont(font);
            g.setColor(Color.BLACK);
            g.drawString(serial, 564, 495);
            g.drawString(device, 564, 590);
            g.drawString(vendorName, 564, 879);
            g.drawString(vendorPhone, 664, 965);
            g.drawString(vendorStreet, 664, 1025);
            g.drawString(vendorCity, 664, 1087);
            g.drawString(vendorBox, 664, 1149);
            g.drawString(region, 664, 1211);
            g.drawString(vendorMail, 664, 1279);
            g.drawString(dateYear, 736, 799);
            g.drawString(dateMonth, 1100, 799);
            g.drawString(dateDay, 1312, 799);

            ImageIO.write(wcr, "jpg", new File(path, reference + " WCR.jpg"));

            final BufferedImage elcf1 = ImageIO.read(new File(path2));

            Graphics g1 = elcf1.getGraphics();
            g1.setFont(font);
            g1.setColor(Color.BLACK);
            g1.drawString(customerName, 391, 564);
            g1.drawString(customerStreet, 391, 620);
            g1.drawString(customerCity, 198, 684);
            g1.drawString(region, 909, 684);
            g1.drawString(customerBox, 223, 742);
            g1.drawString(customerMail, 790, 742);
            g1.drawString(customerPhone, 493, 800);
            g1.drawString(serial, 253, 920);
            g1.drawString(device, 846, 920);
            g1.drawString(datePurchased, 286, 979);
            g1.drawString(vendorName, 901, 979);
            g1.drawString(issue, 396, 1035);

            ImageIO.write(elcf1, "jpg", new File(path, reference + " LCF01.jpg"));

            final BufferedImage elcf2 = ImageIO.read(new File(path3));

            Graphics g2 = elcf2.getGraphics();
            g2.setFont(font);
            g2.setColor(Color.BLACK);
            g2.drawString(issue, 423, 489);
            g2.drawString(vendorName, 739, 760);
            g2.drawString(dateCurrent, 700, 1157);


            ImageIO.write(elcf2, "jpg", new File(path, reference + " LCF02.jpg"));


        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Input files not found, make sure they are in correct format - LCF01.jpg, WCR.jpg - and inside /BaseForm");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void parseShit() {
        if (datePurchased != null && !datePurchased.isEmpty())
        {
            try
            {
                String[] dates = datePurchased.split("[.]");
                dateDay = dates[0];
                dateMonth = dates[1];
                dateYear = dates[2];
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Incorrect date format - DD.MM.YYYY - (.) is important. This can also be left empty" );
            }
        }
        else
        {
            dateDay = dateMonth = dateYear = " ";
        }

        if (customer != null && !customer.isEmpty())
        {
            try {
                String[] customers = customer.split(", ");
                customerName = customers[0];
                customerStreet = customers[1];
                String customerBoxCity = customers[2];
                customerMail = customers[3];
                customerPhone = customers[4];
                customerBox = customerBoxCity.substring(0,5);
                customerCity = customerBoxCity.substring(6);
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Incorrect customer format - NAME, STREET, POST CITY xyz, MAIL, PHONE - (, ) is important. This can also be left empty" );
            }
        }
        else
        {
            customerName = customerStreet = customerCity = customerMail = customerPhone = " ";
        }

        if (manualVendor != null && !manualVendor.isEmpty() && vendorSelect == 100)
        {
            try {
                String[] vendors = manualVendor.split(", ");
                vendorName = vendors[0];
                vendorStreet = vendors[1];
                String vendorBoxCity = vendors[2];
                vendorMail = vendors[3];
                vendorPhone = vendors[4];
                vendorBox = vendorBoxCity.substring(0,5);
                vendorCity = vendorBoxCity.substring(6);

            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Incorrect Manual vendor format - NAME, STREET, POST CITY xyz, MAIL, PHONE - (, ) is important. This can also be left empty" );
            }
        }
        else
        {
            try {
                int vb = vendorSelect * 5;
                int ve = (vendorSelect * 5) + 5;
                
                String[] svend = Arrays.copyOfRange(vendorlist, vb, ve);

                vendor = Arrays.toString(svend);
                vendor = vendor.substring(1, vendor.length() - 1);

                String[] vendors = vendor.split(", ");
                vendorName = vendors[0];
                vendorStreet = vendors[1];
                String vendorBoxCity = vendors[2];
                vendorMail = vendors[3];
                vendorPhone = vendors[4];
                vendorBox = vendorBoxCity.substring(0,5);
                vendorCity = vendorBoxCity.substring(6);
            }

            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Vendor not selected" );
            }

        }
        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        dateCurrent = formatter.format(today).substring(0,9);

    }

    String[] vendorlist = {
                "Alza.SK", "Bottova 6654/7", "81109 Bratislava", "alza@alza.sk", "+02/571 018 00",
                "Alza.cz a.s.", "Jankovcova  1522/53 17000", "82106 Praha 7", "alza@alza.cz", "+421 / 905 550633",
                "WESTech, spol. s r.o.", "Stará Vajnorská 17", "83104 Bratislava", "reklamacie@westech.sk", "+421 / 2 20901518",
                "ARAŠID spol. s r.o.", "Lazovná 69", "97401 Banská Bystrica", "reklamacne@arasid.sk", "+421 / 125 911 173",
                "iStore", "Tuhovská 15", "82106 Bratislava", "refused@apple.com", "+421 / 903 7453288",
                "NAY a.s. ", "Tuhovská 15", "83006 Bratislava 36", "reklamacie@nay.sk", "+421 / 2 49449239",
                "ANDREA SHOP, s.r.o.", "Galantská cesta 5855/22", "92901 Dunajská Streda", "eshop@andreashop.sk", "+421 / 915 575055",
                "iStyle s.r.o.", "Lamač 6780", "84103 Bratislava", "eshop@istyleslovakia.sk", "+421 / 091 492710",
                "Elektrosped a.s.", "Pestovateľská 13", "82104 Bratislava", "eshop@elektrosped.sk", "+421 / 125491173",
                "Planeo - Fast Plus", "Na Pántoch 18", "83106 Bratislava", "nfo@planeo.sk", "+421412901510",
                "Internet Mall, a.s.,", "U garáží 1611/7", "170 00 Praha", "servis@mall.cz", "+420 / 702 270938",
                "Internet Mall Slovakia, s.r.o.", "Galvaniho 6", "82104 Bratislava", "info@mall.sk", "02/5826 7310",
                "Asbis SK", "Tuhovská 33", "83106 Bratislava", "info@asbis.sk", "02/321 65 111",
                "Euronics TPD", "Farského 26", "85101 Bratislava ", "ekonom@tpd.sk", "02/6252 5508",
                "Mironet.cz", "Hráského 2231/25", "14800 Praha ", "ekonom@tpd.sk", "02/6252 5508",
                "CZC.cz s.r.o. ", "1. máje 3236/103 ", "70300 Ostrava", "reklamace@czc.cz", "02/313110000",
                "M:Zone", "Pribylinská 2", "831 04 Bratislava", "mzone@mzone.sk", "+ 421 2 5564 8694",
                "Placeholder a. s.", "Uhlavna 600000", "82 106 Blava", "ekvador@tumapromi.com", "+421 / 903 7451688"};


    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
            frame.setContentPane(new App().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
    }
}
