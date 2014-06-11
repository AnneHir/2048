/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
 * Riesaer Str. 5, D-01129 Dresden, Germany
 * All rights reserved.
 */

import java.util.Arrays;
import java.util.Random;

/**
 * TODO: Comment
 *
 * @author anhi
 * @version $Id$
 */
public class RandomTwo {

  public void newTwo(int[][] board) {



    if (freeSpace(board) < 1) {
      System.out.println("you've lost");
    }

    int x;
    int y;

    do {
      x = place();
      y = place();
    } while (board[x][y] > 0);
//verschiedene Implementationen
    board[x][y] = 2;
  }

public int freeSpace(int[][] board) {


    for (int[] array : board)
      for (int x : array)
        if (x < 2) {
          return 1;
        }
    return 0;
  }

 public int place() {
    return (new Random()).nextInt(4);
  }

}
