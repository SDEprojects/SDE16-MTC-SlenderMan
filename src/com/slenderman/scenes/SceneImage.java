package com.slenderman.scenes;

import javax.swing.*;
import java.awt.*;

public class SceneImage {
  private JTextArea currentScene = new JTextArea(80, 100);
//    forest.setBackground(Color.BLACK);
//    forest.setForeground(Color.GREEN);
//    forest.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
//    forest.setText(SceneImage.printForest());


  public JTextArea printForest(){
    currentScene.setBackground(Color.BLACK);
    currentScene.setForeground(Color.GREEN);
    currentScene.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
    currentScene.setText("\n" +
      "+-----------+-----------+\n" +
      "|  Forest   |   House   |\n" +
      "|           |           |\n" +
      "|  (Player) |           |\n" +
      "+-----------+-----------+-----------+-----------+----------+ \n" +
      "|   Shed    |    Cave   |    Pond   |   Field   |   Tree    | \n" +
      "|           |           |           |           |  The End  | \n" +
      "|           |           |           |           |           | \n" +
      "+-----------+-----------+-----------+-----------+-----------+");
    return getCurrentScene();
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

  public JTextArea printShed() {
    currentScene.setBackground(Color.BLACK);
    currentScene.setForeground(Color.GREEN);
    currentScene.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
    currentScene.setText("\n" +
      "+-----------+-----------+ \n" +
      "|  Forest   |   House   | \n" +
      "|           |           | \n" +
      "|           |           | \n" +
      "+-----------+-----------+-----------+-----------+----------+ \n" +
      "|   Shed    |    Cave   |    Pond   |   Field   |   Tree    | \n" +
      "|           |           |           |           |  The End  | \n" +
      "|  (Player) |           |           |           |           | \n" +
      "+-----------+-----------+-----------+-----------+-----------+");
    return getCurrentScene();
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

  public JTextArea getCurrentScene() {
    return currentScene;
  }
}
