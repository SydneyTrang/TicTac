/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTac;

import java.awt.*;
import javax.swing.*;

/**
 * Filename: sTrangWk7TicTacToe
 *
 * Programmer: Sydney Trang
 *
 * Course: ICS4UE
 *
 * Date Started: Sat. Mar. 28/18
 *
 * Description: This program uses arrays to personalize a tic tac toe game.
 *
 * Due Date: Mon. Apr. 2/18
 *
 * Modifications: 4x4 game board
 *                counts number of wins and ties
 *                changed card images from x and o's to apples and oranges
 *                changed card background
 *                added a reset button
 *
 * Finished: Mon. Apr. 2/18
 *
 */
public class sTrangWk7TicTac extends JFrame {

    sTrangWk7TicTacEvent tictac = new sTrangWk7TicTacEvent(this); //Adds TicTacEvent file

    JPanel row1 = new JPanel();
    JButton[][] boxes = new JButton[4][4];  //4x4 gameboard
    JButton play = new JButton("Play");
    JButton reset = new JButton("Reset");
    JTextField blank1 = new JTextField();
    JTextField blank2 = new JTextField();
    JOptionPane win = new JOptionPane("Winner");
    ImageIcon back = new ImageIcon("cardback2.jpg ");

    //Sets up GUI
    public sTrangWk7TicTac() {
        super("Tic Tac Toe");
        setSize(700, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;

        GridLayout layout1 = new GridLayout(5, 3, 10, 10);
        row1.setLayout(layout1);
        //Sets up buttons
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 3; y++) {
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]);
            }
        }
        //Sets up text areas, play button, and reset button
        row1.add(blank1);
        row1.add(play);
        row1.add(reset);
        row1.add(blank2);
        add(row1);
        //Listens for play button to be clicked
        play.addActionListener(tictac);
        //Listens for any button to be clicked
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 3; y++) {
                boxes[x][y].addActionListener(tictac);
            }
        }
        //Listens for reset button to be clicked
        reset.addActionListener(tictac);

        setVisible(true);

    }

    public static void main(String[] arguments) {
        sTrangWk7TicTac frame = new sTrangWk7TicTac();
    }
}
