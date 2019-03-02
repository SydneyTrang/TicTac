package TicTac;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//Creates class that responds to mouse and keyboard input
public class sTrangWk7TicTacEvent implements ItemListener, ActionListener, Runnable {

    sTrangWk7TicTac gui;     //Associates gameboard with event
    Thread playing;
    ImageIcon a = new ImageIcon("apple.png");
    ImageIcon b = new ImageIcon("orange.jpg");
    ImageIcon back = new ImageIcon("cardback2.jpg ");
    int clicks = 0; //Counts number of mouse clicks
    int win = 0;    //Helps to determine if a tie has occurred
    int[][] check = new int[4][4];
    int appleWinCount = 0;
    int orangeWinCount = 0;
    int tieWinCount = 0;

    public void itemStateChanged(ItemEvent event) {
    }

    public void run() {
    }

    public sTrangWk7TicTacEvent(sTrangWk7TicTac in) {
        gui = in;
        for (int row = 0; row <= 3; row++) {
            for (int col = 0; col <= 3; col++) {
                check[row][col] = 0;
            }
        }
    }

    //If any button is pressed redirects to given method
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();

        if (command.equals("Play")) {
            startPlaying();
        }
        if (command.equals("1")) {
            b1();
        }
        if (command.equals("2")) {
            b2();
        }
        if (command.equals("3")) {
            b3();
        }
        if (command.equals("4")) {
            b4();
        }
        if (command.equals("5")) {
            b5();
        }
        if (command.equals("6")) {
            b6();
        }
        if (command.equals("7")) {
            b7();
        }
        if (command.equals("8")) {
            b8();
        }
        if (command.equals("9")) {
            b9();
        }
        if (command.equals("10")) {
            b10();
        }
        if (command.equals("11")) {
            b11();
        }
        if (command.equals("12")) {
            b12();
        }
        if (command.equals("13")) {
            b13();
        }
        if (command.equals("14")) {
            b14();
        }
        if (command.equals("15")) {
            b15();
        }
        if (command.equals("16")) {
            b16();
        }
        if (command.equals("Reset")) {
            startReset();
        }
    }

    //If button 1 is pressed
    void b1() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[0][0].setIcon(a); //Sets icon to player 1 image
            check[0][0] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[0][0].setIcon(b); //Sets icon to player 2 image
            check[0][0] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 2 is pressed
    void b2() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[0][1].setIcon(a); //Sets icon to player 1 image
            check[0][1] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[0][1].setIcon(b); //Sets icon to player 2 image
            check[0][1] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 3 is pressed
    void b3() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[0][2].setIcon(a); //Sets icon to player 1 image
            check[0][2] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[0][2].setIcon(b); //Sets icon to player 2 image
            check[0][2] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 4 is pressed
    void b4() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[0][3].setIcon(a); //Sets icon to player 1 image
            check[0][3] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[0][3].setIcon(b); //Sets icon to player 2 image
            check[0][3] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 5 is pressed
    void b5() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[1][0].setIcon(a); //Sets icon to player 1 image
            check[1][0] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[1][0].setIcon(b); //Sets icon to player 2 image
            check[1][0] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 6 is pressed
    void b6() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[1][1].setIcon(a); //Sets icon to player 1 image
            check[1][1] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[1][1].setIcon(b); //Sets icon to player 2 image
            check[1][1] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 7 is pressed
    void b7() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[1][2].setIcon(a); //Sets icon to player 1 image
            check[1][2] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[1][2].setIcon(b); //Sets icon to player 2 image
            check[1][2] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 8 is pressed
    void b8() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[1][3].setIcon(a); //Sets icon to player 1 image
            check[1][3] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[1][3].setIcon(b); //Sets icon to player 2 image
            check[1][3] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 8 is pressed
    void b9() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[2][0].setIcon(a); //Sets icon to player 1 image
            check[2][0] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[2][0].setIcon(b); //Sets icon to player 2 image
            check[2][0] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 10 is pressed
    void b10() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[2][1].setIcon(a); //Sets icon to player 1 image
            check[2][1] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[2][1].setIcon(b); //Sets icon to player 2 image
            check[2][1] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 11 is pressed
    void b11() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[2][2].setIcon(a); //Sets icon to player 1 image
            check[2][2] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[2][2].setIcon(b); //Sets icon to player 2 image
            check[2][2] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 12 is pressed
    void b12() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[2][3].setIcon(a); //Sets icon to player 1 image
            check[2][3] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[2][3].setIcon(b); //Sets icon to player 2 image
            check[2][3] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 13 is pressed
    void b13() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[3][0].setIcon(a); //Sets icon to player 1 image
            check[3][0] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[3][0].setIcon(b); //Sets icon to player 2 image
            check[3][0] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 14 is pressed
    void b14() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[3][1].setIcon(a); //Sets icon to player 1 image
            check[3][1] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[3][1].setIcon(b); //Sets icon to player 2 image
            check[3][1] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 15 is pressed
    void b15() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[3][2].setIcon(a); //Sets icon to player 1 image
            check[3][2] = 1;     //Sets check array to player 1 value
        } else {    //If player 2 clicks
            gui.boxes[3][2].setIcon(b); //Sets icon to player 2 image
            check[3][2] = 2;     //Sets check array to player 2 value
        }
        winner();   //Checks for a winner
    }

    //If button 16 is pressed
    void b16() {
        clicks = clicks + 1;
        if ((clicks % 2) == 1) {    //If player 1 clicks
            gui.boxes[3][3].setIcon(a); //Sets icon to player 1 image
            check[3][3] = 1;
        } else {    //If player 2 clicks
            gui.boxes[3][3].setIcon(b); //Sets icon to player 2 image
            check[3][3] = 2;
        }
        winner();   //Checks for a winner
    }

    //If play button is pressed
    void startPlaying() {
        playing = new Thread(this); //Thread: the execution of program
        playing.start();    //Starts the game
        gui.play.setEnabled(false);     //Disables play button after game started
        gui.reset.setEnabled(false);    //Disables reset button after game started
    }

    //Checks for a winner
    void winner() {
        //Checks for horizaontal wins
        for (int x = 0; x <= 3; x++) {
            if ((check[x][0] == check[x][1]) && (check[x][0] == check[x][2]) && (check[x][0] == check[x][3])) {
                if (check[x][0] == 1) {
                    JOptionPane.showMessageDialog(null, "Apple is the winner");
                    win = 1;
                    appleWinCount += 1;
                    gui.reset.setEnabled(true);    //Enables reset button after game won
                    gui.blank1.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
                    gui.blank2.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
                } else if (check[x][0] == 2) {
                    JOptionPane.showMessageDialog(null, "Orange is the winner");
                    win = 1;
                    orangeWinCount += 1;
                    gui.reset.setEnabled(true);    //Enables reset button after game won
                    gui.blank1.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
                    gui.blank2.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
                }
            }
        }
        //Checks for vertical wins
        for (int x = 0; x <= 3; x++) {
            if ((check[0][x] == check[1][x]) && (check[0][x] == check[2][x]) && (check[0][x] == check[3][x])) {
                if (check[0][x] == 1) {
                    JOptionPane.showMessageDialog(null, "Apple is the winner");
                    win = 1;
                    appleWinCount += 1;
                    gui.reset.setEnabled(true);    //Enables reset button after game won
                    gui.blank1.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
                    gui.blank2.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
                } else if (check[0][x] == 2) {
                    JOptionPane.showMessageDialog(null, "Orange is the winner");
                    win = 1;
                    orangeWinCount += 1;
                    gui.reset.setEnabled(true);    //Enables reset button after game won
                    gui.blank1.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
                    gui.blank2.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
                }
            }
        }
        //Checks for diagonal wins
        if ((check[0][0] == check[1][1]) && (check[0][0] == check[2][2]) && (check[0][0] == check[3][3])) {
            if (check[0][0] == 1) {
                JOptionPane.showMessageDialog(null, "Apple is the winner");
                win = 1;
                appleWinCount += 1;
                gui.reset.setEnabled(true);    //Enables reset button after game won
                gui.blank1.setText("X has " + appleWinCount + " win(s)." + "\n"
                        + "O has " + orangeWinCount + " win(s)." + "\n"
                        + tieWinCount + " ties have occurred.");
                gui.blank2.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
            } else if (check[0][0] == 2) {
                JOptionPane.showMessageDialog(null, "Orange is the winner");
                win = 1;
                orangeWinCount += 1;
                gui.reset.setEnabled(true);    //Enables reset button after game won
                gui.blank1.setText("X has " + appleWinCount + " win(s)." + "\n"
                        + "O has " + orangeWinCount + " win(s)." + "\n"
                        + tieWinCount + " ties have occurred.");
                gui.blank2.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
            }
        } else if ((check[3][0] == check[2][1]) && (check[3][0] == check[1][2]) && (check[3][0] == check[0][3])) {
            if (check[3][0] == 1) {
                JOptionPane.showMessageDialog(null, "Apple is the winner");
                win = 1;
                appleWinCount += 1;
                gui.reset.setEnabled(true);    //Enables reset button after game won
                gui.blank1.setText("X has " + appleWinCount + " win(s)." + "\n"
                        + "O has " + orangeWinCount + " win(s)." + "\n"
                        + tieWinCount + " ties have occurred.");
                gui.blank2.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
            } else if (check[3][0] == 2) {
                JOptionPane.showMessageDialog(null, "Orange is the winner");
                win = 1;
                orangeWinCount += 1;
                gui.reset.setEnabled(true);    //Enables reset button after game won
                gui.blank1.setText("X has " + appleWinCount + " win(s)." + "\n"
                        + "O has " + orangeWinCount + " win(s)." + "\n"
                        + tieWinCount + " ties have occurred.");
                gui.blank2.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
            }
        }
        //Checks for tie
        if ((clicks == 16) && (win == 0)) {
            JOptionPane.showMessageDialog(null, "The game is a tie");
            tieWinCount++;
            gui.reset.setEnabled(true);    //Enables reset button after game tied
            gui.blank1.setText("X has " + appleWinCount + " win(s)." + "\n"
                    + "O has " + orangeWinCount + " win(s)." + "\n"
                    + tieWinCount + " tie(s) have occurred.");
            gui.blank2.setText("X has " + appleWinCount + " win(s)." + "\n"
                            + "O has " + orangeWinCount + " win(s)." + "\n"
                            + tieWinCount + " ties have occurred.");
        }
    }

    //If reset button is pressed
    void startReset() {
        gui.reset.setEnabled(false);    //Disables reset button after game started
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 3; y++) {
                check[x][y] = 0;    //Resets array not to be claimed by player 1 or 2
                gui.boxes[x][y].setIcon(back);  //Resets to card backgrounds
            }
        }
        clicks = 0; //Resets number of clicks
        win = 0;//Resets number of wins to detemine tie
        gui.blank1.setText(null);
        gui.blank2.setText(null);
    }
}
