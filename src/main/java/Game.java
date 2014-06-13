/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
 * Riesaer Str. 5, D-01129 Dresden, Germany
 * All rights reserved.
 */


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
  Render render;


  public static Game getInstance() {

    if (INSTANCE == null) {
      INSTANCE = new Game();
    }
    return INSTANCE;
  }


  public void start() {

    randomTwo.newTwo(board);
    randomTwo.newTwo(board);
    render = new FirstBoard();
    render.drawBoard(board);
    System.out.println("choose direction every time");
    play();

  }

  public void playAgain(MyArrayList arrayList) {

    render = new SecondBoard();

    while (finalTile.win(board)) {

      rows.extract(board, arrayList);
      randomTwo.newTwo(board);
      render.drawBoard(board);
      play();
    }
    render.drawBoard(board);

  }


  public void play() {
    MyArrayList arrayList = direction.choice();
    // board[0][0]=2048;
    playAgain(arrayList);
  }

}