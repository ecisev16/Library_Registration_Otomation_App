/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject2;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.awt.Color;
import org.bson.Document;

/**
 *
 * @author ayse
 */
public class Menu extends javax.swing.JFrame {

    static String userName = "";
    Color deskBaseColor = new Color(204, 204, 255);
    Color deskFilledColor = new Color(153, 0, 255);
    Color roomFilledColor = new Color(217, 166, 166);
    Color roomBaseColor = new Color(248, 226, 226);

    public void fillDesk(int i) {
        // TODO add your handling code here:
        switch (i) {
            case 1:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 2:
                r1d1.setBackground(deskBaseColor);
                r1d2.setBackground(deskFilledColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 3:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 4:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 5:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 6:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 7:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 8:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 9:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 10:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 11:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 12:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 13:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 14:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 15:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 16:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            case 17:
                r1d1.setBackground(deskFilledColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
            default:
                r1d1.setBackground(deskBaseColor);
                r1d2.setBackground(deskBaseColor);
                r1d3.setBackground(deskBaseColor);
                r1d4.setBackground(deskBaseColor);
                r1d5.setBackground(deskBaseColor);
                r1d6.setBackground(deskBaseColor);
                r1d7.setBackground(deskBaseColor);
                r1d8.setBackground(deskBaseColor);
                r1d9.setBackground(deskBaseColor);
                r1d10.setBackground(deskBaseColor);
                r1d11.setBackground(deskBaseColor);
                r1d12.setBackground(deskBaseColor);
                r1d13.setBackground(deskBaseColor);
                r1d14.setBackground(deskBaseColor);
                r1d15.setBackground(deskBaseColor);
                r1d16.setBackground(deskBaseColor);
                r1d17.setBackground(deskBaseColor);
                r1d18.setBackground(deskBaseColor);
                r1d19.setBackground(deskBaseColor);
                r1d20.setBackground(deskBaseColor);
                r1d21.setBackground(deskBaseColor);
                break;
        }

    }

    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftbar = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        homeTitle = new javax.swing.JLabel();
        seat = new javax.swing.JPanel();
        seatTitle = new javax.swing.JLabel();
        breaktime = new javax.swing.JPanel();
        breaktimeTitle = new javax.swing.JLabel();
        page = new javax.swing.JPanel();
        homePage = new javax.swing.JPanel();
        welcomeTitle = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        rateBar = new javax.swing.JProgressBar();
        rateTitle = new javax.swing.JLabel();
        rate = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        seatPage = new javax.swing.JPanel();
        room_header7 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel92 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jPanel93 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jPanel96 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        room = new javax.swing.JPanel();
        seat_area1 = new javax.swing.JPanel();
        r1d7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        r1d5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        r1d4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        r1d3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        r1d1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        r1d6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        r1d2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        r1d14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        r1d8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        r1d10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        r1d11 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        r1d13 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        r1d12 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        r1d9 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        r1d15 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        r1d16 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        r1d17 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        r1d18 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        r1d19 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        r1d20 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        r1d21 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        seat_area2 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jPanel54 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jPanel66 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        seat_area3 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jPanel74 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jPanel76 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jPanel78 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jPanel79 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jPanel80 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jPanel81 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jPanel82 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jPanel83 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jPanel85 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jPanel86 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jPanel87 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jPanel88 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jPanel89 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jPanel90 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        breaktimePage = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftbar.setBackground(new java.awt.Color(153, 0, 255));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        homeTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        homeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeTitle.setText("Anasayfa");
        homeTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        homeTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        seat.setBackground(new java.awt.Color(204, 204, 255));
        seat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seatMouseClicked(evt);
            }
        });

        seatTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        seatTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seatTitle.setText("Masa Seç");
        seatTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        seatTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout seatLayout = new javax.swing.GroupLayout(seat);
        seat.setLayout(seatLayout);
        seatLayout.setHorizontalGroup(
            seatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seatTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
        );
        seatLayout.setVerticalGroup(
            seatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seatTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        breaktime.setBackground(new java.awt.Color(204, 204, 255));
        breaktime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                breaktimeMouseClicked(evt);
            }
        });

        breaktimeTitle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        breaktimeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        breaktimeTitle.setText("Mola Al/Bitir");
        breaktimeTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        breaktimeTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout breaktimeLayout = new javax.swing.GroupLayout(breaktime);
        breaktime.setLayout(breaktimeLayout);
        breaktimeLayout.setHorizontalGroup(
            breaktimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(breaktimeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        breaktimeLayout.setVerticalGroup(
            breaktimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breaktimeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(breaktimeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout leftbarLayout = new javax.swing.GroupLayout(leftbar);
        leftbar.setLayout(leftbarLayout);
        leftbarLayout.setHorizontalGroup(
            leftbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(seat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(breaktime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftbarLayout.setVerticalGroup(
            leftbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftbarLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(breaktime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setLayout(new javax.swing.OverlayLayout(page));

        homePage.setBackground(new java.awt.Color(255, 255, 255));

        welcomeTitle.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        welcomeTitle.setText("Hoş Geldin");

        logOutButton.setBackground(new java.awt.Color(255, 51, 51));
        logOutButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("Çıkış Yap");
        logOutButton.setAutoscrolls(true);
        logOutButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logOutButton.setFocusPainted(false);
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        rateBar.setBackground(new java.awt.Color(204, 204, 255));
        rateBar.setForeground(new java.awt.Color(153, 0, 255));
        rateBar.setValue(60);

        rateTitle.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        rateTitle.setText("Çalışma Alanlarındaki Doluluk Oranı");

        rate.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        rate.setText("%75");

        line.setBackground(new java.awt.Color(204, 204, 255));
        line.setPreferredSize(new java.awt.Dimension(281, 4));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        name.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        name.setText("\"");

        javax.swing.GroupLayout homePageLayout = new javax.swing.GroupLayout(homePage);
        homePage.setLayout(homePageLayout);
        homePageLayout.setHorizontalGroup(
            homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homePageLayout.createSequentialGroup()
                        .addComponent(welcomeTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(homePageLayout.createSequentialGroup()
                        .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(line, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                            .addGroup(homePageLayout.createSequentialGroup()
                                .addGap(0, 181, Short.MAX_VALUE)
                                .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logOutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePageLayout.createSequentialGroup()
                                        .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(rateTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rateBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rate)))))
                        .addGap(24, 24, 24))))
        );
        homePageLayout.setVerticalGroup(
            homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePageLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeTitle)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePageLayout.createSequentialGroup()
                        .addComponent(rateTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rateBar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        page.add(homePage);

        seatPage.setBackground(new java.awt.Color(255, 255, 255));
        seatPage.setPreferredSize(new java.awt.Dimension(547, 434));

        room_header7.setBackground(new java.awt.Color(255, 255, 255));
        room_header7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel65.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel65.setText("EEF Salonu");

        jLabel66.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel66.setText("0/21");

        jPanel45.setBackground(new java.awt.Color(153, 0, 255));
        jPanel45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel67.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Onayla");
        jLabel67.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel42.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel42.setText("Seçtiğin masa:");

        jLabel43.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel43.setText("-1");

        jPanel92.setBackground(new java.awt.Color(217, 166, 166));
        jPanel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel92MouseClicked(evt);
            }
        });

        jLabel110.setBackground(new java.awt.Color(204, 204, 255));
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("1");

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel92Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel93.setBackground(new java.awt.Color(248, 226, 226));
        jPanel93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel93MouseClicked(evt);
            }
        });

        jLabel111.setBackground(new java.awt.Color(204, 204, 255));
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("2");

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel93Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel96.setBackground(new java.awt.Color(248, 226, 226));
        jPanel96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel96MouseClicked(evt);
            }
        });

        jLabel114.setBackground(new java.awt.Color(204, 204, 255));
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("3");

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel96Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel44.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel44.setText("Salonlar");

        javax.swing.GroupLayout room_header7Layout = new javax.swing.GroupLayout(room_header7);
        room_header7.setLayout(room_header7Layout);
        room_header7Layout.setHorizontalGroup(
            room_header7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(room_header7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(room_header7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(room_header7Layout.createSequentialGroup()
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(room_header7Layout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(room_header7Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        room_header7Layout.setVerticalGroup(
            room_header7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, room_header7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(room_header7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(room_header7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, room_header7Layout.createSequentialGroup()
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, room_header7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43)
                        .addComponent(jLabel42))
                    .addComponent(jPanel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        room.setLayout(new javax.swing.OverlayLayout(room));

        seat_area1.setBackground(new java.awt.Color(242, 233, 233));

        r1d7.setBackground(new java.awt.Color(204, 204, 255));
        r1d7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d7MouseClicked(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("7");

        javax.swing.GroupLayout r1d7Layout = new javax.swing.GroupLayout(r1d7);
        r1d7.setLayout(r1d7Layout);
        r1d7Layout.setHorizontalGroup(
            r1d7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d7Layout.setVerticalGroup(
            r1d7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d5.setBackground(new java.awt.Color(204, 204, 255));
        r1d5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d5MouseClicked(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("5");

        javax.swing.GroupLayout r1d5Layout = new javax.swing.GroupLayout(r1d5);
        r1d5.setLayout(r1d5Layout);
        r1d5Layout.setHorizontalGroup(
            r1d5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d5Layout.setVerticalGroup(
            r1d5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d4.setBackground(new java.awt.Color(204, 204, 255));
        r1d4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d4MouseClicked(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("4");

        javax.swing.GroupLayout r1d4Layout = new javax.swing.GroupLayout(r1d4);
        r1d4.setLayout(r1d4Layout);
        r1d4Layout.setHorizontalGroup(
            r1d4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d4Layout.setVerticalGroup(
            r1d4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d3.setBackground(new java.awt.Color(204, 204, 255));
        r1d3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d3MouseClicked(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("3");

        javax.swing.GroupLayout r1d3Layout = new javax.swing.GroupLayout(r1d3);
        r1d3.setLayout(r1d3Layout);
        r1d3Layout.setHorizontalGroup(
            r1d3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d3Layout.setVerticalGroup(
            r1d3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d1.setBackground(new java.awt.Color(204, 204, 255));
        r1d1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d1MouseClicked(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("1");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout r1d1Layout = new javax.swing.GroupLayout(r1d1);
        r1d1.setLayout(r1d1Layout);
        r1d1Layout.setHorizontalGroup(
            r1d1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d1Layout.setVerticalGroup(
            r1d1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d6.setBackground(new java.awt.Color(204, 204, 255));
        r1d6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d6MouseClicked(evt);
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("6");

        javax.swing.GroupLayout r1d6Layout = new javax.swing.GroupLayout(r1d6);
        r1d6.setLayout(r1d6Layout);
        r1d6Layout.setHorizontalGroup(
            r1d6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d6Layout.setVerticalGroup(
            r1d6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d2.setBackground(new java.awt.Color(204, 204, 255));
        r1d2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d2MouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("2");

        javax.swing.GroupLayout r1d2Layout = new javax.swing.GroupLayout(r1d2);
        r1d2.setLayout(r1d2Layout);
        r1d2Layout.setHorizontalGroup(
            r1d2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d2Layout.setVerticalGroup(
            r1d2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d14.setBackground(new java.awt.Color(204, 204, 255));
        r1d14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d14MouseClicked(evt);
            }
        });

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("14");

        javax.swing.GroupLayout r1d14Layout = new javax.swing.GroupLayout(r1d14);
        r1d14.setLayout(r1d14Layout);
        r1d14Layout.setHorizontalGroup(
            r1d14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d14Layout.setVerticalGroup(
            r1d14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d8.setBackground(new java.awt.Color(153, 0, 255));
        r1d8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d8MouseClicked(evt);
            }
        });

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("8");

        javax.swing.GroupLayout r1d8Layout = new javax.swing.GroupLayout(r1d8);
        r1d8.setLayout(r1d8Layout);
        r1d8Layout.setHorizontalGroup(
            r1d8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d8Layout.setVerticalGroup(
            r1d8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d10.setBackground(new java.awt.Color(204, 204, 255));
        r1d10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d10MouseClicked(evt);
            }
        });

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("10");

        javax.swing.GroupLayout r1d10Layout = new javax.swing.GroupLayout(r1d10);
        r1d10.setLayout(r1d10Layout);
        r1d10Layout.setHorizontalGroup(
            r1d10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d10Layout.setVerticalGroup(
            r1d10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d11.setBackground(new java.awt.Color(204, 204, 255));
        r1d11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d11MouseClicked(evt);
            }
        });

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("11");

        javax.swing.GroupLayout r1d11Layout = new javax.swing.GroupLayout(r1d11);
        r1d11.setLayout(r1d11Layout);
        r1d11Layout.setHorizontalGroup(
            r1d11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d11Layout.setVerticalGroup(
            r1d11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d13.setBackground(new java.awt.Color(204, 204, 255));
        r1d13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d13MouseClicked(evt);
            }
        });

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("13");

        javax.swing.GroupLayout r1d13Layout = new javax.swing.GroupLayout(r1d13);
        r1d13.setLayout(r1d13Layout);
        r1d13Layout.setHorizontalGroup(
            r1d13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d13Layout.setVerticalGroup(
            r1d13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d12.setBackground(new java.awt.Color(204, 204, 255));
        r1d12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d12MouseClicked(evt);
            }
        });

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("12");

        javax.swing.GroupLayout r1d12Layout = new javax.swing.GroupLayout(r1d12);
        r1d12.setLayout(r1d12Layout);
        r1d12Layout.setHorizontalGroup(
            r1d12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d12Layout.setVerticalGroup(
            r1d12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d9.setBackground(new java.awt.Color(204, 204, 255));
        r1d9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d9MouseClicked(evt);
            }
        });

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("9");

        javax.swing.GroupLayout r1d9Layout = new javax.swing.GroupLayout(r1d9);
        r1d9.setLayout(r1d9Layout);
        r1d9Layout.setHorizontalGroup(
            r1d9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d9Layout.setVerticalGroup(
            r1d9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d15.setBackground(new java.awt.Color(204, 204, 255));
        r1d15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d15MouseClicked(evt);
            }
        });

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("15");

        javax.swing.GroupLayout r1d15Layout = new javax.swing.GroupLayout(r1d15);
        r1d15.setLayout(r1d15Layout);
        r1d15Layout.setHorizontalGroup(
            r1d15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d15Layout.setVerticalGroup(
            r1d15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d16.setBackground(new java.awt.Color(204, 204, 255));
        r1d16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d16MouseClicked(evt);
            }
        });

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("16");

        javax.swing.GroupLayout r1d16Layout = new javax.swing.GroupLayout(r1d16);
        r1d16.setLayout(r1d16Layout);
        r1d16Layout.setHorizontalGroup(
            r1d16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d16Layout.setVerticalGroup(
            r1d16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d17.setBackground(new java.awt.Color(204, 204, 255));
        r1d17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d17MouseClicked(evt);
            }
        });

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("17");

        javax.swing.GroupLayout r1d17Layout = new javax.swing.GroupLayout(r1d17);
        r1d17.setLayout(r1d17Layout);
        r1d17Layout.setHorizontalGroup(
            r1d17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d17Layout.setVerticalGroup(
            r1d17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d18.setBackground(new java.awt.Color(204, 204, 255));
        r1d18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d18MouseClicked(evt);
            }
        });

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("18");

        javax.swing.GroupLayout r1d18Layout = new javax.swing.GroupLayout(r1d18);
        r1d18.setLayout(r1d18Layout);
        r1d18Layout.setHorizontalGroup(
            r1d18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d18Layout.setVerticalGroup(
            r1d18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d19.setBackground(new java.awt.Color(204, 204, 255));
        r1d19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d19MouseClicked(evt);
            }
        });

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("19");

        javax.swing.GroupLayout r1d19Layout = new javax.swing.GroupLayout(r1d19);
        r1d19.setLayout(r1d19Layout);
        r1d19Layout.setHorizontalGroup(
            r1d19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d19Layout.setVerticalGroup(
            r1d19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d20.setBackground(new java.awt.Color(204, 204, 255));
        r1d20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d20MouseClicked(evt);
            }
        });

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("20");

        javax.swing.GroupLayout r1d20Layout = new javax.swing.GroupLayout(r1d20);
        r1d20.setLayout(r1d20Layout);
        r1d20Layout.setHorizontalGroup(
            r1d20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d20Layout.setVerticalGroup(
            r1d20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        r1d21.setBackground(new java.awt.Color(204, 204, 255));
        r1d21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1d21MouseClicked(evt);
            }
        });

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("21");

        javax.swing.GroupLayout r1d21Layout = new javax.swing.GroupLayout(r1d21);
        r1d21.setLayout(r1d21Layout);
        r1d21Layout.setHorizontalGroup(
            r1d21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, r1d21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        r1d21Layout.setVerticalGroup(
            r1d21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(r1d21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel38.setBackground(new java.awt.Color(230, 248, 248));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel36.setBackground(new java.awt.Color(153, 153, 153));
        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout seat_area1Layout = new javax.swing.GroupLayout(seat_area1);
        seat_area1.setLayout(seat_area1Layout);
        seat_area1Layout.setHorizontalGroup(
            seat_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seat_area1Layout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(seat_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seat_area1Layout.createSequentialGroup()
                        .addComponent(r1d15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seat_area1Layout.createSequentialGroup()
                        .addComponent(r1d8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seat_area1Layout.createSequentialGroup()
                        .addComponent(r1d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(r1d6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(seat_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r1d7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        seat_area1Layout.setVerticalGroup(
            seat_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(seat_area1Layout.createSequentialGroup()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(seat_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1d7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seat_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1d14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seat_area1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1d21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1d15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        room.add(seat_area1);

        seat_area2.setBackground(new java.awt.Color(242, 233, 233));

        jPanel46.setBackground(new java.awt.Color(204, 204, 255));
        jPanel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel46MouseClicked(evt);
            }
        });

        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("7");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel47.setBackground(new java.awt.Color(204, 204, 255));
        jPanel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel47MouseClicked(evt);
            }
        });

        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("5");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel48.setBackground(new java.awt.Color(204, 204, 255));
        jPanel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel48MouseClicked(evt);
            }
        });

        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("4");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel49.setBackground(new java.awt.Color(204, 204, 255));
        jPanel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel49MouseClicked(evt);
            }
        });

        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("3");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel50.setBackground(new java.awt.Color(204, 204, 255));
        jPanel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel50MouseClicked(evt);
            }
        });

        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("1");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel51.setBackground(new java.awt.Color(204, 204, 255));
        jPanel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel51MouseClicked(evt);
            }
        });

        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("6");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel52.setBackground(new java.awt.Color(204, 204, 255));
        jPanel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel52MouseClicked(evt);
            }
        });

        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("2");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel53.setBackground(new java.awt.Color(204, 204, 255));
        jPanel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel53MouseClicked(evt);
            }
        });

        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("14");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel54.setBackground(new java.awt.Color(204, 204, 255));
        jPanel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel54MouseClicked(evt);
            }
        });

        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("8");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel55.setBackground(new java.awt.Color(204, 204, 255));
        jPanel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel55MouseClicked(evt);
            }
        });

        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("10");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel56.setBackground(new java.awt.Color(204, 204, 255));
        jPanel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel56MouseClicked(evt);
            }
        });

        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("11");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel57.setBackground(new java.awt.Color(204, 204, 255));
        jPanel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel57MouseClicked(evt);
            }
        });

        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("13");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel58.setBackground(new java.awt.Color(204, 204, 255));
        jPanel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel58MouseClicked(evt);
            }
        });

        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("12");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel59.setBackground(new java.awt.Color(204, 204, 255));
        jPanel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel59MouseClicked(evt);
            }
        });

        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("9");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel60.setBackground(new java.awt.Color(204, 204, 255));
        jPanel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel60MouseClicked(evt);
            }
        });

        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("15");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel61.setBackground(new java.awt.Color(204, 204, 255));
        jPanel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel61MouseClicked(evt);
            }
        });

        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("16");

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel62.setBackground(new java.awt.Color(204, 204, 255));
        jPanel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel62MouseClicked(evt);
            }
        });

        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("17");

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel63.setBackground(new java.awt.Color(204, 204, 255));
        jPanel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel63MouseClicked(evt);
            }
        });

        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("18");

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel64.setBackground(new java.awt.Color(204, 204, 255));
        jPanel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel64MouseClicked(evt);
            }
        });

        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("19");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel65.setBackground(new java.awt.Color(204, 204, 255));
        jPanel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel65MouseClicked(evt);
            }
        });

        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("20");

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel66.setBackground(new java.awt.Color(204, 204, 255));
        jPanel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel66MouseClicked(evt);
            }
        });

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("21");

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel67.setBackground(new java.awt.Color(230, 248, 248));

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel68.setBackground(new java.awt.Color(153, 153, 153));
        jPanel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel68.setPreferredSize(new java.awt.Dimension(70, 12));

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout seat_area2Layout = new javax.swing.GroupLayout(seat_area2);
        seat_area2.setLayout(seat_area2Layout);
        seat_area2Layout.setHorizontalGroup(
            seat_area2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seat_area2Layout.createSequentialGroup()
                .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(seat_area2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seat_area2Layout.createSequentialGroup()
                        .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seat_area2Layout.createSequentialGroup()
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seat_area2Layout.createSequentialGroup()
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(seat_area2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        seat_area2Layout.setVerticalGroup(
            seat_area2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seat_area2Layout.createSequentialGroup()
                .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(seat_area2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seat_area2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seat_area2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addComponent(jPanel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        room.add(seat_area2);

        seat_area3.setBackground(new java.awt.Color(242, 233, 233));

        jPanel69.setBackground(new java.awt.Color(204, 204, 255));
        jPanel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel69MouseClicked(evt);
            }
        });

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("7");

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel70.setBackground(new java.awt.Color(204, 204, 255));
        jPanel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel70MouseClicked(evt);
            }
        });

        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("5");

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel71.setBackground(new java.awt.Color(204, 204, 255));
        jPanel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel71MouseClicked(evt);
            }
        });

        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("4");

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel72.setBackground(new java.awt.Color(204, 204, 255));
        jPanel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel72MouseClicked(evt);
            }
        });

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("3");

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel73.setBackground(new java.awt.Color(204, 204, 255));
        jPanel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel73MouseClicked(evt);
            }
        });

        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("1");

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel74.setBackground(new java.awt.Color(204, 204, 255));
        jPanel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel74MouseClicked(evt);
            }
        });

        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("6");

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel75.setBackground(new java.awt.Color(204, 204, 255));
        jPanel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel75MouseClicked(evt);
            }
        });

        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("2");

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel76.setBackground(new java.awt.Color(204, 204, 255));
        jPanel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel76MouseClicked(evt);
            }
        });

        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("14");

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel77.setBackground(new java.awt.Color(204, 204, 255));
        jPanel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel77MouseClicked(evt);
            }
        });

        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("8");

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel78.setBackground(new java.awt.Color(204, 204, 255));
        jPanel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel78MouseClicked(evt);
            }
        });

        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("10");

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel79.setBackground(new java.awt.Color(204, 204, 255));
        jPanel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel79MouseClicked(evt);
            }
        });

        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("11");

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel79Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel80.setBackground(new java.awt.Color(204, 204, 255));
        jPanel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel80MouseClicked(evt);
            }
        });

        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("13");

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel81.setBackground(new java.awt.Color(204, 204, 255));
        jPanel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel81MouseClicked(evt);
            }
        });

        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("12");

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel82.setBackground(new java.awt.Color(204, 204, 255));
        jPanel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel82MouseClicked(evt);
            }
        });

        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("9");

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel83.setBackground(new java.awt.Color(204, 204, 255));
        jPanel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel83MouseClicked(evt);
            }
        });

        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("15");

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel83Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel84.setBackground(new java.awt.Color(204, 204, 255));
        jPanel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel84MouseClicked(evt);
            }
        });

        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("16");

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel85.setBackground(new java.awt.Color(204, 204, 255));
        jPanel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel85MouseClicked(evt);
            }
        });

        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("17");

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel86.setBackground(new java.awt.Color(204, 204, 255));
        jPanel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel86MouseClicked(evt);
            }
        });

        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("18");

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel87.setBackground(new java.awt.Color(204, 204, 255));
        jPanel87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel87MouseClicked(evt);
            }
        });

        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("19");

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel88.setBackground(new java.awt.Color(204, 204, 255));
        jPanel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel88MouseClicked(evt);
            }
        });

        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("20");

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel88Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel88Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel89.setBackground(new java.awt.Color(204, 204, 255));
        jPanel89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel89MouseClicked(evt);
            }
        });

        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("21");

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel90.setBackground(new java.awt.Color(230, 248, 248));

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel91.setBackground(new java.awt.Color(153, 153, 153));
        jPanel91.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout seat_area3Layout = new javax.swing.GroupLayout(seat_area3);
        seat_area3.setLayout(seat_area3Layout);
        seat_area3Layout.setHorizontalGroup(
            seat_area3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seat_area3Layout.createSequentialGroup()
                .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(seat_area3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seat_area3Layout.createSequentialGroup()
                        .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seat_area3Layout.createSequentialGroup()
                        .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(seat_area3Layout.createSequentialGroup()
                        .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(seat_area3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        seat_area3Layout.setVerticalGroup(
            seat_area3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel90, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seat_area3Layout.createSequentialGroup()
                .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(seat_area3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seat_area3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seat_area3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        room.add(seat_area3);

        javax.swing.GroupLayout seatPageLayout = new javax.swing.GroupLayout(seatPage);
        seatPage.setLayout(seatPageLayout);
        seatPageLayout.setHorizontalGroup(
            seatPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(room, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(room_header7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        seatPageLayout.setVerticalGroup(
            seatPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatPageLayout.createSequentialGroup()
                .addComponent(room_header7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(room, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        page.add(seatPage);

        breaktimePage.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mola Al");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.getAccessibleContext().setAccessibleDescription("");

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Molayı Bitir");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setText("Kalan Mola Hakkı:");

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setText("3");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setText("Kredi:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setText("10");

        javax.swing.GroupLayout breaktimePageLayout = new javax.swing.GroupLayout(breaktimePage);
        breaktimePage.setLayout(breaktimePageLayout);
        breaktimePageLayout.setHorizontalGroup(
            breaktimePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, breaktimePageLayout.createSequentialGroup()
                .addGroup(breaktimePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(breaktimePageLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(breaktimePageLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(breaktimePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(breaktimePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62))
        );
        breaktimePageLayout.setVerticalGroup(
            breaktimePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breaktimePageLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(breaktimePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(breaktimePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGap(98, 98, 98)
                .addGroup(breaktimePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        page.add(breaktimePage);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(page, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        homePage.setVisible(true);
        seatPage.setVisible(false);
        breaktimePage.setVisible(false);
        home.setBackground(Color.WHITE);
        seat.setBackground(deskBaseColor);
        breaktime.setBackground(deskBaseColor);

    }//GEN-LAST:event_homeMouseClicked

    private void seatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seatMouseClicked
        homePage.setVisible(false);
        seatPage.setVisible(true);
        breaktimePage.setVisible(false);
        seat.setBackground(Color.WHITE);
        home.setBackground(deskBaseColor);
        breaktime.setBackground(deskBaseColor);


    }//GEN-LAST:event_seatMouseClicked

    private void breaktimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breaktimeMouseClicked
        homePage.setVisible(false);
        seatPage.setVisible(false);
        breaktimePage.setVisible(true);
        breaktime.setBackground(Color.WHITE);
        home.setBackground(deskBaseColor);
        seat.setBackground(deskBaseColor);

    }//GEN-LAST:event_breaktimeMouseClicked

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void r1d21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_r1d21MouseClicked

    private void r1d20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_r1d20MouseClicked

    private void r1d19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d19MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskFilledColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d19MouseClicked

    private void r1d18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d18MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskFilledColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d18MouseClicked

    private void r1d17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d17MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskFilledColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d17MouseClicked

    private void r1d16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d16MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskFilledColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d16MouseClicked

    private void r1d15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d15MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskFilledColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d15MouseClicked

    private void r1d9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d9MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskFilledColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d9MouseClicked

    private void r1d12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d12MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskFilledColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d12MouseClicked

    private void r1d13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d13MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskFilledColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d13MouseClicked

    private void r1d11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d11MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskFilledColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d11MouseClicked

    private void r1d10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d10MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskFilledColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d10MouseClicked

    private void r1d8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d8MouseClicked
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskFilledColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d8MouseClicked

    private void r1d14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d14MouseClicked
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskFilledColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskBaseColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d14MouseClicked

    private void r1d2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d2MouseClicked
        fillDesk(2);
    }//GEN-LAST:event_r1d2MouseClicked

    private void r1d6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d6MouseClicked
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskFilledColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskBaseColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
        // TODO add your handling code here:
    }//GEN-LAST:event_r1d6MouseClicked

    private void r1d1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d1MouseClicked
        fillDesk(1);
    }//GEN-LAST:event_r1d1MouseClicked

    private void r1d3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d3MouseClicked
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskFilledColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskBaseColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d3MouseClicked

    private void r1d4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d4MouseClicked
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskFilledColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskBaseColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d4MouseClicked

    private void r1d5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d5MouseClicked
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskFilledColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskBaseColor);
        r1d8.setBackground(deskBaseColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d5MouseClicked

    private void r1d7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1d7MouseClicked
        // TODO add your handling code here:
        r1d1.setBackground(deskBaseColor);
        r1d2.setBackground(deskBaseColor);
        r1d3.setBackground(deskBaseColor);
        r1d4.setBackground(deskBaseColor);
        r1d5.setBackground(deskBaseColor);
        r1d6.setBackground(deskBaseColor);
        r1d7.setBackground(deskFilledColor);
        r1d8.setBackground(deskBaseColor);
        r1d9.setBackground(deskBaseColor);
        r1d10.setBackground(deskBaseColor);
        r1d11.setBackground(deskBaseColor);
        r1d12.setBackground(deskBaseColor);
        r1d13.setBackground(deskBaseColor);
        r1d14.setBackground(deskBaseColor);
        r1d15.setBackground(deskBaseColor);
        r1d16.setBackground(deskBaseColor);
        r1d17.setBackground(deskBaseColor);
        r1d18.setBackground(deskBaseColor);
        r1d19.setBackground(deskBaseColor);
        r1d20.setBackground(deskBaseColor);
        r1d21.setBackground(deskBaseColor);
    }//GEN-LAST:event_r1d7MouseClicked

    private void jPanel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel46MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel46MouseClicked

    private void jPanel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel47MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel47MouseClicked

    private void jPanel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel48MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel48MouseClicked

    private void jPanel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel49MouseClicked

    private void jPanel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel50MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel50MouseClicked

    private void jPanel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel51MouseClicked

    private void jPanel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel52MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel52MouseClicked

    private void jPanel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel53MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel53MouseClicked

    private void jPanel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel54MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel54MouseClicked

    private void jPanel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel55MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel55MouseClicked

    private void jPanel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel56MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel56MouseClicked

    private void jPanel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel57MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel57MouseClicked

    private void jPanel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel58MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel58MouseClicked

    private void jPanel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel59MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel59MouseClicked

    private void jPanel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel60MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel60MouseClicked

    private void jPanel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel61MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel61MouseClicked

    private void jPanel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel62MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel62MouseClicked

    private void jPanel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel63MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel63MouseClicked

    private void jPanel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel64MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel64MouseClicked

    private void jPanel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel65MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel65MouseClicked

    private void jPanel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel66MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel66MouseClicked

    private void jPanel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel69MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel69MouseClicked

    private void jPanel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel70MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel70MouseClicked

    private void jPanel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel71MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel71MouseClicked

    private void jPanel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel72MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel72MouseClicked

    private void jPanel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel73MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel73MouseClicked

    private void jPanel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel74MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel74MouseClicked

    private void jPanel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel75MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel75MouseClicked

    private void jPanel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel76MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel76MouseClicked

    private void jPanel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel77MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel77MouseClicked

    private void jPanel78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel78MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel78MouseClicked

    private void jPanel79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel79MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel79MouseClicked

    private void jPanel80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel80MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel80MouseClicked

    private void jPanel81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel81MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel81MouseClicked

    private void jPanel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel82MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel82MouseClicked

    private void jPanel83MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel83MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel83MouseClicked

    private void jPanel84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel84MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel84MouseClicked

    private void jPanel85MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel85MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel85MouseClicked

    private void jPanel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel86MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel86MouseClicked

    private void jPanel87MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel87MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel87MouseClicked

    private void jPanel88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel88MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel88MouseClicked

    private void jPanel89MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel89MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel89MouseClicked

    private void jPanel93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel93MouseClicked
        jPanel93.setBackground(roomFilledColor);
        jPanel92.setBackground(roomBaseColor);
        jPanel96.setBackground(roomBaseColor);
    }//GEN-LAST:event_jPanel93MouseClicked

    private void jPanel92MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel92MouseClicked
        jPanel93.setBackground(roomBaseColor);
        jPanel92.setBackground(roomFilledColor);
        jPanel96.setBackground(roomBaseColor);    }//GEN-LAST:event_jPanel92MouseClicked

    private void jPanel96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel96MouseClicked
        jPanel93.setBackground(roomBaseColor);
        jPanel92.setBackground(roomBaseColor);
        jPanel96.setBackground(roomFilledColor);
    }//GEN-LAST:event_jPanel96MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    public static void main(String args[]) {
        String fakeEmail = "ibrahim2001sahin@hotmail.com";
        try (MongoClient mongoClient = MongoClients.create("mongodb+srv://Ibrahim:ibrahimU123@cluster0.y3msch8.mongodb.net/Registered?retryWrites=true&w=majority")) {
            MongoDatabase database = mongoClient.getDatabase("Library");
            MongoCollection<Document> collection = database.getCollection("users");
            Document document = collection.find(Filters.eq("email", fakeEmail)).first();
            if (document != null) {
                System.out.println(document.toJson());
                userName = document.getString("name");
            } else {
                userName = "arabam";
            }
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel breaktime;
    private javax.swing.JPanel breaktimePage;
    private javax.swing.JLabel breaktimeTitle;
    private javax.swing.JPanel home;
    private javax.swing.JPanel homePage;
    private javax.swing.JLabel homeTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel leftbar;
    private javax.swing.JPanel line;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel name;
    private javax.swing.JPanel page;
    private javax.swing.JPanel r1d1;
    private javax.swing.JPanel r1d10;
    private javax.swing.JPanel r1d11;
    private javax.swing.JPanel r1d12;
    private javax.swing.JPanel r1d13;
    private javax.swing.JPanel r1d14;
    private javax.swing.JPanel r1d15;
    private javax.swing.JPanel r1d16;
    private javax.swing.JPanel r1d17;
    private javax.swing.JPanel r1d18;
    private javax.swing.JPanel r1d19;
    private javax.swing.JPanel r1d2;
    private javax.swing.JPanel r1d20;
    private javax.swing.JPanel r1d21;
    private javax.swing.JPanel r1d3;
    private javax.swing.JPanel r1d4;
    private javax.swing.JPanel r1d5;
    private javax.swing.JPanel r1d6;
    private javax.swing.JPanel r1d7;
    private javax.swing.JPanel r1d8;
    private javax.swing.JPanel r1d9;
    private javax.swing.JLabel rate;
    private javax.swing.JProgressBar rateBar;
    private javax.swing.JLabel rateTitle;
    private javax.swing.JPanel room;
    private javax.swing.JPanel room_header;
    private javax.swing.JPanel room_header1;
    private javax.swing.JPanel room_header2;
    private javax.swing.JPanel room_header3;
    private javax.swing.JPanel room_header4;
    private javax.swing.JPanel room_header5;
    private javax.swing.JPanel room_header6;
    private javax.swing.JPanel room_header7;
    private javax.swing.JPanel seat;
    private javax.swing.JPanel seatPage;
    private javax.swing.JLabel seatTitle;
    private javax.swing.JPanel seat_area1;
    private javax.swing.JPanel seat_area2;
    private javax.swing.JPanel seat_area3;
    private javax.swing.JLabel welcomeTitle;
    // End of variables declaration//GEN-END:variables
}
