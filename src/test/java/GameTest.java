import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class GameTest {
Game game;
  @org.junit.Before
  public void setUp() throws Exception {
      game = new Game();
  }

  @org.junit.Test
  public void testFold0000() throws Exception {
    List<Integer> list = list(0, 0, 0, 0);

    assertEquals(list, game.fold(list));

  }
  @org.junit.Test
  public void testFold24816() throws Exception {
    List<Integer> list = list(2, 4, 8, 16);

    assertEquals(list, game.fold(list));

  }
  @org.junit.Test
  public void testFold2000() throws Exception {
    List<Integer> list = list(2, 0, 0, 0);

    assertEquals(list, game.fold(list));

  }
  @org.junit.Test
  public void testFold2400() throws Exception {
    List<Integer> list = list(2, 4, 0, 0);

    assertEquals(list, game.fold(list));

  }
  @org.junit.Test
   public void testFold0200() throws Exception {
    List<Integer> list = list(0, 2, 0, 0);
    List<Integer> result = list(2,0,0, 0);

    assertEquals(result, game.fold(list));

  }
  @org.junit.Test
  public void testFold0020() throws Exception {
    List<Integer> list = list(0, 0, 2, 0);
    List<Integer> result = list(2,0,0, 0);

    assertEquals(result, game.fold(list));

  }
  @org.junit.Test
  public void testFold0002() throws Exception {
    List<Integer> list = list(0, 0, 0, 2);
    List<Integer> result = list(2,0,0, 0);

    assertEquals(result, game.fold(list));

  }
  @org.junit.Test
  public void testFold0248() throws Exception {
    List<Integer> list = list(0, 2, 4, 8);
    List<Integer> result = list(2,4,8, 0);

    assertEquals(result, game.fold(list));

  }
  @org.junit.Test
  public void testFold0028() throws Exception {
    List<Integer> list = list(0, 0, 2, 8);
    List<Integer> result = list(2, 8, 0, 0);

    assertEquals(result, game.fold(list));

  }
  @org.junit.Test
  public void testFold2004() throws Exception {
    List<Integer> list = list(2, 0, 0, 4);
    List<Integer> result = list(2,4,0, 0);

    assertEquals(result, game.fold(list));

  }
  @org.junit.Test
  public void testFold2200() throws Exception {
    List<Integer> list = list(2, 2, 0, 0);
    List<Integer> result = list(4,0,0, 0);

    assertEquals(result, game.fold(list));

  }
  @org.junit.Test
  public void testFold2220() throws Exception {
    List<Integer> list = list(2, 2, 2, 0);
    List<Integer> result = list(4,2,0, 0);

    assertEquals(result, game.fold(list));

  }
  @org.junit.Test
  public void testFold2222() throws Exception {
    List<Integer> list = list(2, 2, 2, 2);
    List<Integer> result = list(4,4,0, 0);

    assertEquals(result, game.fold(list));

  }
  @org.junit.Test
  public void testFold2440() throws Exception {
    List<Integer> list = list(2, 4, 4, 0);
    List<Integer> result = list(2,8,0, 0);

    assertEquals(result, game.fold(list));

  }
  @org.junit.Test
  public void testFold2020() throws Exception {
    List<Integer> list = list(2, 0, 2, 0);
    List<Integer> result = list(4,0,0, 0);

    assertEquals(result, game.fold(list));

  }
  @org.junit.Test
  public void testFold0202() throws Exception {
    List<Integer> list = list(0, 2, 0, 2);
    List<Integer> result = list(4,0,0, 0);

    assertEquals(result, game.fold(list));

  }
  public List<Integer> list(int a, int b, int c, int d ){
    List<Integer> integers = new ArrayList<Integer>();
    integers.add(a);
    integers.add(b);
    integers.add(c);
    integers.add(d);
    return Collections.unmodifiableList(integers);
  }
}