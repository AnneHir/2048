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
public class FinalTile {



  public boolean win(int[][] board) {
    for (int[] array : board) {
      for (Integer number : array) {
        if (number.equals(16)) {
          System.out.println("you've got 2048");
          return false;

        }
      }
    }
    return true;
  }
}
