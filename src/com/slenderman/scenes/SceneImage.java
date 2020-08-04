package com.slenderman.scenes;

import javax.swing.*;

public class SceneImage {
  public static JTextArea printForest(){

    JTextArea result = new JTextArea();
    result.append("\n" +
      "+-----------+-----------+\n" +
      "|  Forest   |   House   |\n" +
      "|           |           |\n" +
      "|  (Player) |           |\n" +
      "+-----------+-----------+-----------+-----------+----------+ \n" +
      "|   Shed    |    Cave   |    Pond   |   Field   |   Tree    | \n" +
      "|           |           |           |           |  The End  | \n" +
      "|           |           |           |           |           | \n" +
      "+-----------+-----------+-----------+-----------+-----------+");
    return result;
  }
  public static void printHouse() {
    System.out.println("\n" +
      "+-----------+-----------+\n" +
      "|  Forest   |   House   |\n" +
      "|           |           |\n" +
      "|           |  (Player) |\n" +
      "+-----------+-----------+-----------+-----------+----------+ \n" +
      "|   Shed    |    Cave   |    Pond   |   Field   |   Tree    | \n" +
      "|           |           |           |           |  The End  | \n" +
      "|           |           |           |           |           | \n" +
      "+-----------+-----------+-----------+-----------+-----------+");
  }

  public static void printShed() {
    System.out.println("\n" +
      "+-----------+-----------+ \n" +
      "|  Forest   |   House   | \n" +
      "|           |           | \n" +
      "|           |           | \n" +
      "+-----------+-----------+-----------+-----------+----------+ \n" +
      "|   Shed    |    Cave   |    Pond   |   Field   |   Tree    | \n" +
      "|           |           |           |           |  The End  | \n" +
      "|  (Player) |           |           |           |           | \n" +
      "+-----------+-----------+-----------+-----------+-----------+");
  }

  public static void printCave() {
    System.out.println("\n" +
      "+-----------+-----------+ \n" +
      "|  Forest   |   House   | \n" +
      "|           |           | \n" +
      "|           |           | \n" +
      "+-----------+-----------+-----------+-----------+----------+ \n" +
      "|   Shed    |    Cave   |    Pond   |   Field   |   Tree    | \n" +
      "|           |           |           |           |  The End  | \n" +
      "|           |  (Player) |           |           |           | \n" +
      "+-----------+-----------+-----------+-----------+-----------+");
  }

  public static void printPond() {
    System.out.println("\n" +
      "+-----------+-----------+ \n" +
      "|  Forest   |   House   | \n" +
      "|           |           |  \n" +
      "|           |           | \n" +
      "+-----------+-----------+-----------+-----------+----------+ \n" +
      "|   Shed    |    Cave   |    Pond   |   Field   |   Tree    | \n" +
      "|           |           |           |           |  The End  | \n" +
      "|           |           |  (Player) |           |           | \n" +
      "+-----------+-----------+-----------+-----------+-----------+");
  }

  public static void printField() {
    System.out.println("\n" +
      "+-----------+-----------+ \n" +
      "|  Forest   |   House   | \n" +
      "|           |           | \n" +
      "|           |           | \n" +
      "+-----------+-----------+-----------+-----------+----------+ \n" +
      "|   Shed    |    Cave   |    Pond   |   Field   |   Tree    | \n" +
      "|           |           |           |           |  The End  | \n" +
      "|           |           |           |  (Player) |           | \n" +
      "+-----------+-----------+-----------+-----------+-----------+");
  }

  public static void printTree() {
    System.out.println("\n" +
      "+-----------+-----------+ \n" +
      "|  Forest   |   House   | \n" +
      "|           |           |  \n" +
      "|           |           | \n" +
      "+-----------+-----------+-----------+-----------+----------+ \n" +
      "|   Shed    |    Cave   |    Pond   |   Field   |   Tree    | \n" +
      "|           |           |           |           |  The End  | \n" +
      "|           |           |           |           |  (Player) | \n" +
      "+-----------+-----------+-----------+-----------+-----------+");
  }
}
