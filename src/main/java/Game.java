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

  public static final int BOARDSIZE = 4;

  private Game() {
  }

  private static Game INSTANCE = null;

  public static void main(String[] args) {
    getInstance().start();
  }


  int[][] board = new int[BOARDSIZE][BOARDSIZE];
  RandomTwo randomTwo = new RandomTwo();
  Direction direction = new Direction();
  FinalTile finalTile = new FinalTile();
  Rows rows = new Rows();
  Print render = new Print();


  public static Game getInstance() {

    if (INSTANCE == null) {
      INSTANCE = new Game();
    }
    return INSTANCE;
  }


  public void start() {

    randomTwo.newTwo(board);
    randomTwo.newTwo(board);
    render.drawBoard(board);
    System.out.println("choose direction every time");
    play();

  }

  public void playAgain(MyArrayList arrayList) {

    finalTile.win(board);
    rows.extract(board, arrayList);
    randomTwo.newTwo(board);
    render.drawBoard(board);
    play();

  }


  public void play() {
    MyArrayList arrayList = direction.choice();
    playAgain(arrayList);
  }

}