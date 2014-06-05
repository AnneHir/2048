/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
 * Riesaer Str. 5, D-01129 Dresden, Germany
 * All rights reserved.
 */

import java.util.ArrayList;

/**
 * TODO: Comment
 *
 * @author anhi
 * @version $Id$
 */

//set size
public class MyArrayList extends ArrayList {
  public boolean add(Tuple i) {
    if (this.size() < 16) {
      return super.add(i);
    } else {
      return false;
    }
  }

}
