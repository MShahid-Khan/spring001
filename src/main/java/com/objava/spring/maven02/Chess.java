/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objava.spring.maven02;

import java.util.Scanner;

/**
 *
 * @author shahzad
 */
public class Chess {

    String[][] chessBoard = new String[8][8];

    void userInput(String[][] chessBoard) {

        try {
            int xPos = 0, yPos = 0, xCurrentPos = 0, yCurrentPos = 0,commaIndex=0;
            String input = new String();
            String commaInput = new String();
            System.out.print("Which Player Do you want to Play with(Enter X or Y): ");
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            if (input.contains("X")) {
                System.out.print("Choose the piece of X player to move(seperated by ,):");
                input = scan.nextLine();
                if (input.contains(",")) {
                    commaIndex = input.indexOf(',');
                    xCurrentPos = Integer.parseInt(input.substring(0, commaIndex));
                    yCurrentPos = Integer.parseInt(input.substring(commaIndex + 1));

                }
                System.out.print("Choose the location(seperated by ,):");
                commaInput = scan.nextLine();
                if (input.contains(",")) {
                     commaIndex = commaInput.indexOf(',');
                    xPos = Integer.parseInt(commaInput.substring(0, commaIndex));
                    yPos = Integer.parseInt(commaInput.substring(commaIndex + 1));

                }
                if ((xPos <= 7) && (xPos >= 0) && (yPos <= 7) && (yPos >= 0) && (xCurrentPos <= 7) && (xCurrentPos >= 0) && (yCurrentPos <= 7) && (yCurrentPos >= 0)) {
                    moveX(chessBoard, xCurrentPos, yCurrentPos, xPos, yPos);
                } else {
                    System.out.println("Invalid Data entered. Game Ended!");
                }

            } else //for Input Y player
            {
                System.out.print("Choose the piece of Y player to move(seperated by ,):");
                input = scan.nextLine();
                if (input.contains(",")) {
                    commaIndex = input.indexOf(',');
                    xCurrentPos = Integer.parseInt(input.substring(0, commaIndex));
                    yCurrentPos = Integer.parseInt(input.substring(commaIndex + 1));

                }
                System.out.print("Choose the location(seperated by ,):");
                commaInput = scan.nextLine();
                if (input.contains(",")) {
                    commaIndex = input.indexOf(',');
                    xPos = Integer.parseInt(commaInput.substring(0, commaIndex));
                    yPos = Integer.parseInt(commaInput.substring(commaIndex + 1));

                }
                if ((xPos <= 7) && (xPos >= 0) && (yPos <= 7) && (yPos >= 0) && (xCurrentPos <= 7) && (xCurrentPos >= 0) && (yCurrentPos <= 7) && (yCurrentPos >= 0)) {
                    moveY(chessBoard, xCurrentPos, yCurrentPos, xPos, yPos);
                } else {
                    System.out.println("Invalid Data entered. Game Ended!");
                }

            }

        }//end of try
        catch (Exception e) {
            e.printStackTrace();
        }

    }//end of userInput Function 

    public String[][] gameBoard(String[][] chessBoard) {

        for (int iteratorX = 0; iteratorX < 8; iteratorX++) {
            for (int iteratorY = 0; iteratorY < 8; iteratorY++) {
                if ((iteratorX == 0) || (iteratorX == 1)) {
                    chessBoard[iteratorX][iteratorY] = "X";
                } else if ((iteratorX == 6) || (iteratorX == 7)) {
                    chessBoard[iteratorX][iteratorY] = "Y";
                } else {
                    chessBoard[iteratorX][iteratorY] = ".";
                }

            }

        }

        return chessBoard;
    }

    public void displayChessBoard(String[][] chessBoard) {
        for (int iteratorX = 0; iteratorX < 8; iteratorX++) {
            for (int iteratorY = 0; iteratorY < 8; iteratorY++) {

                System.out.print(chessBoard[iteratorX][iteratorY]);
                if (iteratorY == 7) {
                    System.out.println("");
                }

            }

        }

    }//end of function

    public void moveX(String[][] chessBoard, int xCurrent, int yCurrent, int xMove, int yMove) {

        chessBoard[xCurrent][yCurrent] = ".";
        chessBoard[xMove][yMove] = "X";
        displayChessBoard(chessBoard);
    }

    public void moveY(String[][] chessBoard, int xCurrent, int yCurrent, int xMove, int yMove) {

        chessBoard[xCurrent][yCurrent] = ".";
        chessBoard[xMove][yMove] = "Y";
        displayChessBoard(chessBoard);
    }
    
    
    public static void main(String stg[]) {

        String[][] chessBoard = new String[8][8];

        try {
            Chess obj = new Chess();
            chessBoard = obj.gameBoard(chessBoard);
            System.out.println("######################## Welcome To Chess##################### ");
            System.out.println("............................................................. ");
            System.out.println("current Board Postion is:");
            System.out.println("                                             ");
            obj.displayChessBoard(chessBoard);
            obj.userInput(chessBoard);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
