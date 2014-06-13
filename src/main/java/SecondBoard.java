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
public class SecondBoard implements Render {


  public void drawBoard(int[][] board) {

    String line = "-----------------------------------------";
    System.out.println(line);

    for (int x = 0; x < Game.BOARDSIZE; x++) {

      for (int y = 0; y < Game.BOARDSIZE; y++) {
        System.out.printf("|%5d    ", board[x][y]);
      }

      System.out.println("|");
      System.out.println(line);
    }


  }

}