/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
 * Riesaer Str. 5, D-01129 Dresden, Germany
 * All rights reserved.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Comment
 *
 * @author anhi
 * @version $Id$
 */
public class Rows {

  Move move = new Move();

  public void extract(int[][] board, MyArrayList allCo) {
    for (int i = 0; i < allCo.size(); i += 4) {
      List<Tuple> row = allCo.subList(i, i + 4);
      List<Integer> newRow = new ArrayList();
      for (Tuple tuple : row) {
        newRow.add(board[tuple.x][tuple.y]);
      }
      newRow = move.fold(newRow);

      for (int j = 0; j < newRow.size(); j++) {
        Tuple tuple = row.get(j);
        board[tuple.x][tuple.y] = newRow.get(j);


      }

    }
  }
}
