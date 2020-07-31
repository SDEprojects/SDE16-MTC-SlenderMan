package com.slenderman.game;

import com.slenderman.scenes.SceneImage;

import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

class TestingJFrame {

  static GraphicsConfiguration gc;

  public static void main(String[] args) {
    JPanel contentPanel = new JPanel();
    contentPanel.setLayout(new BorderLayout());
    SceneImage scene = new SceneImage();

    JTextArea forest = new JTextArea(80, 100);
    forest.setBackground(Color.BLACK);
    forest.setForeground(Color.GREEN);
    forest.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
//    forest.setText(SceneImage.printForest());

    JTextArea shed = new JTextArea(80, 100);
    shed.setBackground(Color.BLACK);
    shed.setForeground(Color.RED);
    shed.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
//    shed.setText(SceneImage.printShed());

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    if(input.equals("forest")){
      contentPanel.add(scene.printForest(), BorderLayout.CENTER);
    }
    else {
      contentPanel.add(scene.printShed(), BorderLayout.CENTER);
    }
sc.close();
    JFrame frame = new JFrame(gc);
    frame.setTitle("Welecome to JavaTutorial.net");
    frame.setContentPane(contentPanel);
    frame.setSize(600, 400);
    frame.setLocation(200, 200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
  }
}

