/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
 * Riesaer Str. 5, D-01129 Dresden, Germany
 * All rights reserved.
 */

import java.util.Arrays;

/**
 * TODO: Comment
 *
 * @author anhi
 * @version $Id$
 */
public class Print {

  public void drawBoard(int[][] board) {
    System.out.println(Arrays.deepToString(board).replaceAll("],", "],\r\n"));
  }
}
