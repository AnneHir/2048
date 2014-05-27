/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
 * Riesaer Str. 5, D-01129 Dresden, Germany
 * All rights reserved.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * TODO: Comment
 *
 * @author anhi
 * @version $Id$
 */
public class Game {

  public static void main(String[] args) {
    new Game().start();
  }

  int[][] board = new int[4][4];

  public void start() {

    newTwo();
    newTwo();
    drawBoard();
    System.out.println("choose direction");
    play();
  }

  public void newTwo() {

    if (freeSpace() < 1) {
      System.out.println("you've lost");
    }

    int x;
    int y;

    do {
      x = place();
      y = place();
    } while (board[x][y] > 0);

    board[x][y] = 2;
  }

  int freeSpace() {
    for (int[] array : board)
      for (int x : array)
        if (x < 2) {
          return 1;
        }
    return 0;
  }

  int place() {
    return (new Random()).nextInt(4);
  }

  public void drawBoard() {
    System.out.println(Arrays.deepToString(board).replaceAll("],", "],\r\n"));
  }
  public void play(){
    choice();
  }
  public void choice(){
    Scanner scan = new Scanner(System.in);
    int direction = scan.nextInt();

    switch (direction){
      case 8:
        System.out.println("up");
        break;
      case 2:
        System.out.println("down");
        break;
      case 6:
        System.out.println("right");
        break;
      case 4:
        System.out.println("left");
        break;
      default:
        System.out.println("wrong choice. choose again");
        play();
        break;
    }

  }
}

