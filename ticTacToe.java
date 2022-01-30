//Tic Tac Toe App

import javax.swing.JOptionPane;
import java.util.Random;

public class ticTacToe {

    public static void main(String [] args) {
    
        //Decleration of variables
        String tttBoard;
        String userInput;
        String tttBoardExample;
        String firstPrompt, secondPrompt, thirdPrompt, fourthPrompt, fifthPrompt;
        int option1, option2, option3, option4, option5;
        String a,b,c,d,e,f,g,h,i;
        int cOption1, cOption2, cOption3, cOption4, cOption5;
        Random computer = new Random();
        
        //Initialization of variables
        a = " ";
        b = " ";
        c = " ";
        d = " ";
        e = " ";
        f = " ";
        g = " ";
        h = " ";
        i = " ";
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
       tttBoardExample = "  1 | 2 | 3 \n" 
                       + "  --      -- \n"
                       + "  4 | 5 | 6 \n"
                       + "  --      -- \n"
                       + "  7 | 8 | 9 ";
                        
        //Instructions
        JOptionPane.showMessageDialog(null, "Input number for where you would like to place your marker" + "\n\n\n" + tttBoardExample);
        
        
        
        //Picking the first option
        firstPrompt = JOptionPane.showInputDialog(null, "Choose spot:" + "\n\n\n" + tttBoard + "\n\n\n");
        option1 = Integer.parseInt(firstPrompt);
        if (option1 == 1) {
                a = "X";
        }
                         
        else if (option1 == 2) {
                b = "X";
        }
                         
        else if (option1 == 3) {
                c = "X";
        }
                         
        else if (option1 == 4) {
                d = "X";
        }
                         
        else if (option1 == 5) {
                e = "X";
        }
                         
        else if (option1 == 6) {
                f = "X";
        }
                         
        else if (option1 == 7) {
                g = "X";
        }
                         
        else if (option1 == 8) {
                h = "X";
        }
                         
        else if (option1 == 9) {
                i = "X";
        }
            
        //Computer Option 1
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        cOption1 = computer.nextInt(8 - 1);
        System.out.println(cOption1);
        if (cOption1 == 0){
        cOption1 += 1;
        }
        
        if (cOption1 == option1) {
            cOption1 = cOption1 + 1;
        }
        
        if (cOption1 == 1) {
                a = "O";
        }
                         
        else if (cOption1 == 2) {
                b = "O";
        }
                         
        else if (cOption1 == 3) {
                c = "O";
        }
                         
        else if (cOption1 == 4) {
                d = "O";
        }
                         
        else if (cOption1 == 5) {
                e = "O";
        }
                         
        else if (cOption1 == 6) {
                f = "O";
        }
                         
        else if (cOption1 == 7) {
                g = "O";
        }
                         
        else if (cOption1 == 8) {
                h = "O";
        }
                         
        else if (cOption1 == 9) {
                i = "O";
                }
                
        //Second user input
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        secondPrompt = JOptionPane.showInputDialog(null, "Choose spot:" + "\n\n\n" + tttBoard + "\n\n\n");   
        option2 = Integer.parseInt(secondPrompt);
        if (option2 == 1) {
                a = "X";
        }
                         
        else if (option2 == 2) {
                b = "X";
        }
                         
        else if (option2 == 3) {
                c = "X";
        }
                         
        else if (option2 == 4) {
                d = "X";
        }
                         
        else if (option2 == 5) {
                e = "X";
        }
                         
        else if (option2 == 6) {
                f = "X";
        }
                         
        else if (option2 == 7) {
                g = "X";
        }
                         
        else if (option2 == 8) {
                h = "X";
        }
                         
        else if (option2 == 9) {
                i = "X";
        } 
        
        
        //Second computer input
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        cOption2 = computer.nextInt(6-1);
        System.out.println(cOption2);
        if (cOption2 == 0){
        cOption2 += 1;
        }
        
        if ((cOption2 == cOption1) || (cOption2 == option1) || (cOption2 == option2)) {
            cOption2 = cOption2 + 1;
        }
        
        if ((cOption2 == cOption1) || (cOption2 == option1) || (cOption2 == option2)) {
            cOption2 = cOption2 + 1;
        }
        
        if ((cOption2 == cOption1) || (cOption2 == option1) || (cOption2 == option2)) {
            cOption2 = cOption2 + 1;
        }
        
        if ((cOption2 == cOption1) || (cOption2 == option1) || (cOption2 == option2)) {
            cOption2 = cOption2 + 1;
        }
        
        
        if (cOption2 == 1) {
                a = "O";
        }
                         
        else if (cOption2 == 2) {
                b = "O";
        }
                         
        else if (cOption2 == 3) {
                c = "O";
        }
                         
        else if (cOption2 == 4) {
                d = "O";
        }
                         
        else if (cOption2 == 5) {
                e = "O";
        }
                         
        else if (cOption2 == 6) {
                f = "O";
        }
                         
        else if (cOption2 == 7) {
                g = "O";
        }
                         
        else if (cOption2 == 8) {
                h = "O";
        }
                         
        else if (cOption2 == 9) {
                i = "O";
        }

        //Third User Input
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        thirdPrompt = JOptionPane.showInputDialog(null, "Choose spot:" + "\n\n\n" + tttBoard + "\n\n\n");
        option3 = Integer.parseInt(thirdPrompt);
        if (option3 == 1) {
                a = "X";
        }
                         
        else if (option3 == 2) {
                b = "X";
        }
                         
        else if (option3 == 3) {
                c = "X";
        }
                         
        else if (option3 == 4) {
                d = "X";
        }
                         
        else if (option3 == 5) {
                e = "X";
        }
                         
        else if (option3 == 6) {
                f = "X";
        }
                         
        else if (option3 == 7) {
                g = "X";
        }
                         
        else if (option3 == 8) {
                h = "X";
        }
                         
        else if (option3 == 9) {
                i = "X";
        }
        
        
        //Win Conditions
        if (a == "X" && b == "X" && c == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (d == "X" && e == "X" && f == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "X" && h == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "X" && d == "X" && g == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (b == "X" && e == "X" && h == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "X" && f == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "X" && e == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "X" && e == "X" && g == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "X" && e == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && b == "O" && c == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (d == "O" && e == "O" && f == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "O" && h == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && d == "O" && g == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (b == "O" && e == "O" && h == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "O" && f == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && e == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "O" && e == "O" && g == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "O" && e == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else { //1
        
        //Third computer input
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        cOption3 = computer.nextInt(4-1);
        System.out.println(cOption3);
        if (cOption3 == 0){
        cOption3 += 1;
        }
        
        if ((cOption3 == cOption1) || (cOption3 == cOption2) || (cOption3 == option1) || (cOption3 == option2) || (cOption3 == option3)) {
            cOption3 = cOption3 + 1;
        }
        
        if ((cOption3 == cOption1) || (cOption3 == cOption2) || (cOption3 == option1) || (cOption3 == option2) || (cOption3 == option3)) {
            cOption3 = cOption3 + 1;
        }
        
        if ((cOption3 == cOption1) || (cOption3 == cOption2) || (cOption3 == option1) || (cOption3 == option2) || (cOption3 == option3)) {
            cOption3 = cOption3 + 1;
        }
        
        if ((cOption3 == cOption1) || (cOption3 == cOption2) || (cOption3 == option1) || (cOption3 == option2) || (cOption3 == option3)) {
            cOption3 = cOption3 + 1;
        }
        
        if ((cOption3 == cOption1) || (cOption3 == cOption2) || (cOption3 == option1) || (cOption3 == option2) || (cOption3 == option3)) {
            cOption3 = cOption3 + 1;
        }
        
        if ((cOption3 == cOption1) || (cOption3 == cOption2) || (cOption3 == option1) || (cOption3 == option2) || (cOption3 == option3)) {
            cOption3 = cOption3 + 1;
        }
        
        
        if (cOption3 == 1) {
                a = "O";
        }
                         
        else if (cOption3 == 2) {
                b = "O";
        }
                         
        else if (cOption3 == 3) {
                c = "O";
        }
                         
        else if (cOption3 == 4) {
                d = "O";
        }
                         
        else if (cOption3 == 5) {
                e = "O";
        }
                         
        else if (cOption3 == 6) {
                f = "O";
        }
                         
        else if (cOption3 == 7) {
                g = "O";
        }
                         
        else if (cOption3 == 8) {
                h = "O";
        }
                         
        else if (cOption3 == 9) {
                i = "O";
        }
        
        
        
        //Win Conditions
        if (a == "X" && b == "X" && c == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (d == "X" && e == "X" && f == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "X" && h == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "X" && d == "X" && g == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (b == "X" && e == "X" && h == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "X" && f == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "X" && e == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "X" && e == "X" && g == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "X" && e == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && b == "O" && c == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (d == "O" && e == "O" && f == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "O" && h == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && d == "O" && g == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (b == "O" && e == "O" && h == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "O" && f == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && e == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "O" && e == "O" && g == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "O" && e == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else {//2

        //Fourth user input
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        fourthPrompt = JOptionPane.showInputDialog(null, "Choose spot:" + "\n\n\n" + tttBoard + "\n\n\n");   
        option4 = Integer.parseInt(fourthPrompt);
        if (option4 == 1) {
                a = "X";
        }
                         
        else if (option4 == 2) {
                b = "X";
        }
                         
        else if (option4 == 3) {
                c = "X";
        }
                         
        else if (option4 == 4) {
                d = "X";
        }
                         
        else if (option4 == 5) {
                e = "X";
        }
                         
        else if (option4 == 6) {
                f = "X";
        }
                         
        else if (option4 == 7) {
                g = "X";
        }
                         
        else if (option4 == 8) {
                h = "X";
        }
                         
        else if (option4 == 9) {
                i = "X";
        }
        
        //Win Conditions
        if (a == "X" && b == "X" && c == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (d == "X" && e == "X" && f == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "X" && h == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "X" && d == "X" && g == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (b == "X" && e == "X" && h == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "X" && f == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "X" && e == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "X" && e == "X" && g == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "X" && e == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && b == "O" && c == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (d == "O" && e == "O" && f == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "O" && h == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && d == "O" && g == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (b == "O" && e == "O" && h == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "O" && f == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && e == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "O" && e == "O" && g == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "O" && e == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else {//3
        
        
        //Fourth Computer Input
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        cOption4 = 1;
        System.out.println(cOption4);
        if ((cOption4 == cOption1) || (cOption4 == cOption2) || (cOption4 == cOption3) || (cOption4 == option1) || (cOption4 == option2) || (cOption4 == option3) || (cOption4 == option4)){
        cOption4 += 1;
        }
        
        if ((cOption4 == cOption1) || (cOption4 == cOption2) || (cOption4 == cOption3) || (cOption4 == option1) || (cOption4 == option2) || (cOption4 == option3) || (cOption4 == option4)){
        cOption4 += 1;
        }
        
        if ((cOption4 == cOption1) || (cOption4 == cOption2) || (cOption4 == cOption3) || (cOption4 == option1) || (cOption4 == option2) || (cOption4 == option3) || (cOption4 == option4)){
        cOption4 += 1;
        }
        
        if ((cOption4 == cOption1) || (cOption4 == cOption2) || (cOption4 == cOption3) || (cOption4 == option1) || (cOption4 == option2) || (cOption4 == option3) || (cOption4 == option4)){
        cOption4 += 1;
        }
        
        if ((cOption4 == cOption1) || (cOption4 == cOption2) || (cOption4 == cOption3) || (cOption4 == option1) || (cOption4 == option2) || (cOption4 == option3) || (cOption4 == option4)){
        cOption4 += 1;
        }
        
        if ((cOption4 == cOption1) || (cOption4 == cOption2) || (cOption4 == cOption3) || (cOption4 == option1) || (cOption4 == option2) || (cOption4 == option3) || (cOption4 == option4)){
        cOption4 += 1;
        }
        
        if ((cOption4 == cOption1) || (cOption4 == cOption2) || (cOption4 == cOption3) || (cOption4 == option1) || (cOption4 == option2) || (cOption4 == option3) || (cOption4 == option4)){
        cOption4 += 1;
        }
        
        if ((cOption4 == cOption1) || (cOption4 == cOption2) || (cOption4 == cOption3) || (cOption4 == option1) || (cOption4 == option2) || (cOption4 == option3) || (cOption4 == option4)){
        cOption4 += 1;
        }
        
        if ((cOption4 == cOption1) || (cOption4 == cOption2) || (cOption4 == cOption3) || (cOption4 == option1) || (cOption4 == option2) || (cOption4 == option3) || (cOption4 == option4)){
        cOption4 += 1;
        }
        
        if (cOption4 == 1) {
                a = "O";
        }
                         
        else if (cOption4 == 2) {
                b = "O";
        }
                         
        else if (cOption4 == 3) {
                c = "O";
        }
                         
        else if (cOption4 == 4) {
                d = "O";
        }
                         
        else if (cOption4 == 5) {
                e = "O";
        }
                         
        else if (cOption4 == 6) {
                f = "O";
        }
                         
        else if (cOption4 == 7) {
                g = "O";
        }
                         
        else if (cOption4 == 8) {
                h = "O";
        }
                         
        else if (cOption4 == 9) {
                i = "O";
        }
        
        
        //Win Conditions
        if (a == "X" && b == "X" && c == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (d == "X" && e == "X" && f == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "X" && h == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "X" && d == "X" && g == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (b == "X" && e == "X" && h == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "X" && f == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "X" && e == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "X" && e == "X" && g == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "X" && e == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && b == "O" && c == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (d == "O" && e == "O" && f == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "O" && h == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && d == "O" && g == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (b == "O" && e == "O" && h == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "O" && f == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && e == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "O" && e == "O" && g == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "O" && e == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else {//4
        
        //Fifth user input
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        fourthPrompt = JOptionPane.showInputDialog(null, "Choose spot:" + "\n\n\n" + tttBoard + "\n\n\n");   
        option5 = Integer.parseInt(fourthPrompt);
        if (option5 == 1) {
                a = "X";
        }
                         
        else if (option5 == 2) {
                b = "X";
        }
                         
        else if (option5 == 3) {
                c = "X";
        }
                         
        else if (option5 == 4) {
                d = "X";
        }
                         
        else if (option5 == 5) {
                e = "X";
        }
                         
        else if (option5 == 6) {
                f = "X";
        }
                         
        else if (option5 == 7) {
                g = "X";
        }
                         
        else if (option5 == 8) {
                h = "X";
        }
                         
        else if (option5 == 9) {
                i = "X";
        }
        

        
        
        //Win Conditions
        if (a == "X" && b == "X" && c == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (d == "X" && e == "X" && f == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "X" && h == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "X" && d == "X" && g == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (b == "X" && e == "X" && h == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "X" && f == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "X" && e == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "X" && e == "X" && g == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "X" && e == "X" && i == "X"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Win!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && b == "O" && c == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (d == "O" && e == "O" && f == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "O" && h == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && d == "O" && g == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (b == "O" && e == "O" && h == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "O" && f == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (a == "O" && e == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (c == "O" && e == "O" && g == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else if (g == "O" && e == "O" && i == "O"){
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "You Lose!!!!!!" + "\n\n\n" + tttBoard);
        }
        
        else {
        tttBoard = "  " + a + "  |  " + b + "  |  " + c + "  \n" 
                 + "   --      -- \n"
                 + "  " + d + "  |  " + e + "  |  " + f + "  \n" 
                 + "   --      -- \n"
                 + "  " + g + "  |  " + h + "  |  " + i + "  \n";
        JOptionPane.showMessageDialog(null, "Its a draw" + "\n\n\n" + tttBoard);
        }
        }
        }
        }
        }
        
    }

}//End Class