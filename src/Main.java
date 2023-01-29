/*
 * Authors: Zayaan and Brandon
 * Date: Jan 17 2023
 * Program Name: PVZ Main Program
 * Program Description: Main JFrame and cards layout
 */

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    static CardLayout cardsL;
    static Container c;


    public Main(){    //constructor
        c=getContentPane();
        cardsL=new CardLayout();
        c.setLayout(cardsL);


        Menu menuP = new Menu();


        c.add("Main Menu", menuP);
    }

    public static void main(String[] args){
        Main screen = new Main();
        screen.setSize(600, 800);
        screen.setVisible(true);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}// end class