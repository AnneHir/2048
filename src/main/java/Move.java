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
public class Move {

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
