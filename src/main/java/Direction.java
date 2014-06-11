/*
 * Copyright (c) 2014 T-Systems Multimedia Solutions GmbH
 * Riesaer Str. 5, D-01129 Dresden, Germany
 * All rights reserved.
 */

import java.util.Scanner;

/**
 * TODO: Comment
 *
 * @author anhi
 * @version $Id$
 */
public class Direction {

  public MyArrayList choice() {
    Scanner scan = new Scanner(System.in);
    int direction = scan.nextInt();
    CoGenerator coGenerator = new CoGenerator();
    MyArrayList arrayList = new MyArrayList();

    switch (direction) {
      case 8:
       arrayList = coGenerator.up();
        System.out.println("up");
        break;
      case 2:
        arrayList =coGenerator.down();
        System.out.println("down");
        break;
      case 6:
        arrayList =coGenerator.right();
        System.out.println("right");
        break;
      case 4:
        arrayList =coGenerator.left();
        System.out.println("left");
        break;
      default:
        System.out.println("wrong choice. choose again");
        break;
    }
    return arrayList;
  }

}
