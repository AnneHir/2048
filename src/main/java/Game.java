/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
 * Riesaer Str. 5, D-01129 Dresden, Germany
 * All rights reserved.
 */


import java.util.*;

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
  MyArrayList allCo = new MyArrayList();


  public void start() {

    newTwo();
    newTwo();
    drawBoard();
    System.out.println("choose direction every time");
    play();
    create();


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

  public void play() {
    choice();
  }

  public void choice() {
    Scanner scan = new Scanner(System.in);
    int direction = scan.nextInt();

    switch (direction) {
      case 8:
        for (int column = board.length-1; column >= 0; column--) {
          for (int row = board.length-1; row >= 0; row--) {
            Tuple co = new Tuple(row, column);
            allCo.add(co);
          }
        }
        System.out.println("up");
        extract();
        break;
      case 2:
        for (int column = 0; column < board.length; column++) {
          for (int row = 0; row < board.length; row++) {
            Tuple co = new Tuple(row, column);
            allCo.add(co);
          }
        }
        System.out.println("down");
        extract();
        break;
      case 6:
        for (int row = board.length-1; row >= 0; row--) {
          for (int column = board.length-1; column >= 0; column--) {
            Tuple co = new Tuple(row, column);
            allCo.add(co);
          }
        }
        System.out.println("right");
        extract();
        break;
      case 4:
        for (int row = 0; row < board.length; row++) {
          for (int column = 0; column < board.length; column++) {
            Tuple co = new Tuple(row, column);
            allCo.add(co);
          }
        }
        System.out.println("left");
        extract();
        break;
      case 5:
        board[0][0] = 2048;//win
        break;
      default:
        System.out.println("wrong choice. choose again");
        play();
        break;
    }
  }

  //list with all coordinates
  private void create() {
    //horizontal
    for (int row = 0; row < board.length; row++) {
      for (int column = 0; column < board.length; column++) {
        Tuple co = new Tuple(row, column);
        allCo.add(co);
      }
    }
    for (int row = board.length-1; row >= 0; row--) {
      for (int column = board.length-1; column >= 0; column--) {
        Tuple co = new Tuple(row, column);
        allCo.add(co);
      }
    }
    //vertical
    for (int column = 0; column < board.length; column++) {
      for (int row = 0; row < board.length; row++) {
        Tuple co = new Tuple(row, column);
        allCo.add(co);
      }
    }
    for (int column = board.length-1; column >= 0; column--) {
      for (int row = board.length-1; row >= 0; row--) {
        Tuple co = new Tuple(row, column);
        allCo.add(co);
      }
    }
  }

  public void extract() {
    for (int i = 0; i < allCo.size(); i += 4) {
      List<Tuple> row = allCo.subList(i, i + 4);
        for (Tuple tuple: row){
          List<Integer> newRow = new ArrayList();
          newRow.add(board[tuple.x][tuple.y]);
          newRow = fold(newRow);
        }


    }
  }

  private List<Integer> fold(List<Integer> newRow) {
    return null;
  }







 /* public void horizontal(){
    for (int x = 0; x < 4; x++) {
      int[] row = new int[4];
      int i = 0;
      for (int y = 0; y < 4 ; y++) {
        row[i++]=board[x][y];

      }

int[] newRow = move(row);
      i = 0;
      for (int y = 0; y < 4; y++) {
        board[x][y]=newRow[i++];
      }
    }
  }

  public  void vertical(){
    for (int y = 0; y < 4; y++) {
    int[] row = new int[4];
    int i = 0;
    for (int x = 0; x < 4 ; x++) {
      row[i++]=board[x][y];

    }

    int[] newRow = move(row);
    i = 0;
    for (int x = 0; x < 4; x++) {
      board[x][y]=newRow[i++];
    }
  }}

  private int[] move(int[] row) {
    return new int[0];
  }*/

}

