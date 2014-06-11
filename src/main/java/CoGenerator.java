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
public class CoGenerator {

  MyArrayList allCo = new MyArrayList();

  public MyArrayList up() {
    for (int column = 0; column < Game.BOARDSIZE; column++) {
      for (int row = 0; row < Game.BOARDSIZE; row++) {
        Tuple co = new Tuple(row, column);
        allCo.add(co);
      }
    }
    return allCo;
  }

  public MyArrayList down() {
    for (int column = Game.BOARDSIZE - 1; column >= 0; column--) {
      for (int row = Game.BOARDSIZE - 1; row >= 0; row--) {
        Tuple co = new Tuple(row, column);
        allCo.add(co);
      }
    }
    return allCo;
  }

  public MyArrayList right() {
    for (int row = Game.BOARDSIZE - 1; row >= 0; row--) {
      for (int column = Game.BOARDSIZE - 1; column >= 0; column--) {
        Tuple co = new Tuple(row, column);
        allCo.add(co);
      }
    }
    return allCo;
  }

  public MyArrayList left() {
    for (int row = 0; row < Game.BOARDSIZE; row++) {
      for (int column = 0; column < Game.BOARDSIZE; column++) {
        Tuple co = new Tuple(row, column);
        allCo.add(co);
      }
    }
    return allCo;
  }


}
