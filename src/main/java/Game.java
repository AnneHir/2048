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

  private Game() {
  }

  private static Game INSTANCE = null;

  public static void main(String[] args) {
    getInstance().start();
  }


  int[][] board = new int[4][4];
  MyArrayList allCo = new MyArrayList();
  RandomTwo randomTwo = new RandomTwo();

  public int[][] getBoard() {
    return board;
  }

  public static Game getInstance() {

    if (INSTANCE == null) {
      INSTANCE = new Game();
    }
    return INSTANCE;
  }


  public void start() {

    randomTwo.newTwo();
    randomTwo.newTwo();
    drawBoard();
    System.out.println("choose direction every time");
    play();

  }

  public void playAgain() {

    win();
    extract();
    randomTwo.newTwo();
    drawBoard();
    play();


  }

  public void win() {
    for (int[] array : board) {
      for (Integer number : array) {
        if (number.equals(2048)) {
          System.out.println("you've got 2048 but keep playing");

        }
      }
    }
  }

  public void newTwo() {

    if (randomTwo.freeSpace() < 1) {
      System.out.println("you've lost");
    }

    int x;
    int y;

    do {
      x = randomTwo.place();
      y = randomTwo.place();
    } while (board[x][y] > 0);
//verschiedene Implementationen
    board[x][y] = 2;
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
    allCo.clear();

    switch (direction) {
      case 8:
        for (int column = 0; column < board.length; column++) {
          for (int row = 0; row < board.length; row++) {
            Tuple co = new Tuple(row, column);
            allCo.add(co);
          }
        }
        System.out.println("up");
        playAgain();
        break;
      case 2:
        for (int column = board.length - 1; column >= 0; column--) {
          for (int row = board.length - 1; row >= 0; row--) {
            Tuple co = new Tuple(row, column);
            allCo.add(co);
          }
        }
        System.out.println("down");
        playAgain();
        break;
      case 6:
        for (int row = board.length - 1; row >= 0; row--) {
          for (int column = board.length - 1; column >= 0; column--) {
            Tuple co = new Tuple(row, column);
            allCo.add(co);
          }
        }
        System.out.println("right");
        playAgain();
        break;
      case 4:
        for (int row = 0; row < board.length; row++) {
          for (int column = 0; column < board.length; column++) {
            Tuple co = new Tuple(row, column);
            allCo.add(co);
          }
        }
        System.out.println("left");
        playAgain();
        break;
      case 5:

        board[0][0] = 2048;
        playAgain();
      default:
        System.out.println("wrong choice. choose again");
        play();
        break;
    }
  }


  public void extract() {
    for (int i = 0; i < allCo.size(); i += 4) {
      List<Tuple> row = allCo.subList(i, i + 4);
      List<Integer> newRow = new ArrayList();
      for (Tuple tuple : row) {
        newRow.add(board[tuple.x][tuple.y]);
      }
      newRow = fold(newRow);

      for (int j = 0; j < newRow.size(); j++) {
        Tuple tuple = row.get(j);
        board[tuple.x][tuple.y] = newRow.get(j);


      }

    }
  }


  public List<Integer> fold(List<Integer> newRow) {
    List<Integer> newList = new ArrayList<Integer>();
    List<Integer> newNewList = new ArrayList<Integer>();

    for (int i : newRow) {
      if (i != 0) {
        newList.add(i);
      }
    }
    if (newList.size() != 4) {
      int fill = 4 - newList.size();
      for (int j = 0; j < fill; j++) {
        newList.add(0);
      }
    }

    for (int i = 0; i < newList.size(); i++) {
      if (i + 1 < newList.size() && newList.get(i).equals(newList.get(i + 1))) {
        newNewList.add(newList.get(i) + newList.get(i + 1));
        i++;
      } else {
        newNewList.add(newList.get(i));
      }
    }
    if (newNewList.size() != 4) {
      int fill = 4 - newNewList.size();
      for (int j = 0; j < fill; j++) {
        newNewList.add(0);
      }
    }
    return newNewList;


  }

}