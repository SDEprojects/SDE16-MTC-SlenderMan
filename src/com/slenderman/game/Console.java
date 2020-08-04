package com.slenderman.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

class Console extends JFrame implements ActionListener, PropertyChangeListener {
  JTextField tfIn;
  JLabel lblOut;
  JTextArea outText;
  Game game;
  JPanel locMap;
  GameMap gMap = new GameMap();
  JPanel panel = new JPanel(new BorderLayout());

  private final PipedInputStream inPipe = new PipedInputStream();
  private final PipedInputStream outPipe = new PipedInputStream();
  //placeholder boolean;
  private boolean clicked = false;

  PrintWriter inWriter;

  public Console(Game game) {
    super("SlenderMan");
    this.game = game;
    setFocusable(true);

    System.setIn(inPipe);

    try {
      inWriter = new PrintWriter(new PipedOutputStream(inPipe), true);
    } catch (IOException e) {
      System.out.println("Error: " + e);
      return;
    }



    locMap = new JPanel(new BorderLayout());
    locMap.setBounds(100,100,200,200);
    locMap.setBackground(Color.BLACK);

    System.out.println("current scene: " + game.getPlayer().getCurrentSceneName());
    if (game.getPlayer().getCurrentSceneName() != null) {
      locMap.add(gMap.makeMap(game.getPlayer().getCurrentSceneName()));
    } else {
      locMap.add(gMap.makeMap(""));
    }
    panel.add(locMap, BorderLayout.EAST);

// Property change listener for scene change
    game.getPlayer().addPropertyChangeListener(evt -> {
      if(evt.getPropertyName().equals(game.getPlayer().getCurrentSceneName())){
        locMap.add(gMap.makeMap(game.getPlayer().getCurrentSceneName()));
        panel.add(locMap, BorderLayout.EAST);
      }
    });

//    makePanelUpdate();


//ADDING TOP SET PANEL FOR INSTRUCTIONS
    //TODO adjust size of JPanel to make text look cleaner
//    JTextArea instructions = new JTextArea(5, 10);
//    instructions.setBackground(Color.black);
//    instructions.setForeground(Color.white);
    JPanel instructions = new JPanel();
    instructions.setBounds(300, 100, 400, 350);
    instructions.setBackground(Color.black);


    JLabel instructionsText = new JLabel("Commands: \n\n " +
      "Travel: go + direction, \n"
      + " Check Inventory: I/Inventory");
    instructionsText.setForeground(Color.white);
    instructions.add(instructionsText);
    panel.add(instructions, BorderLayout.NORTH);

    //End of instructions panel





    int jColumns = 80;
    int jRows = 100;

    outText = new JTextArea(jRows, jColumns);
    outText.setBackground(Color.BLACK);
    outText.setForeground(Color.WHITE);
    outText.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

    //This prevents users from deleting text from this JTextArea
    outText.setEditable(false);

    JScrollPane scroll =
        new JScrollPane(
            outText,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    panel.add(scroll, BorderLayout.CENTER);

    System.setOut(
        new PrintStream(
            new OutputStream() {
              @Override
              public void write(int b)  {
                  outText.append(String.valueOf((char) b));
                  outText.setCaretPosition(outText.getDocument().getLength());

              }
            }));

    tfIn = new JTextField();
    //trying placeholder here
    tfIn.setText("Enter Game Commands Here");
    tfIn.addMouseListener(new MouseAdapter(){
      @Override
      public void mousePressed(MouseEvent e){
        if(!clicked){
          clicked = true;
          tfIn.setText("");
        }
      }
    });
    tfIn.setBackground(Color.LIGHT_GRAY);

    //ending placeholder logic



    tfIn.addActionListener(this);

    tfIn.setToolTipText("Please type your command here (such as go *direction* or quit) and then press ENTER/RETURN on your keyboard");

    panel.add(tfIn, BorderLayout.SOUTH);
    add(panel);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    int jframeWidth = 800;
    int jframeHeight = 800;

    setSize(jframeWidth, jframeHeight);

    new SwingWorker<Void, String>() {
      protected Void doInBackground() throws Exception {
        Scanner s = new Scanner(outPipe);

        while (s.hasNextLine()) {
          String line = s.nextLine();
          publish(line);
        }

        return null;
      }
    }.execute();

  }

  private void makePanelUpdate() {
//    locMap.addPropertyChangeListener(evt -> {
////      if(evt.getPropertyName().equals(game.currentScene)){
//      if (evt.getNewValue().equals(game.getPlayer().getCurrentSceneName())) {
//        locMap.add(gMap.makeMap(game.getPlayer().getCurrentSceneName()));
//        panel.add(locMap, BorderLayout.EAST);
//      }
//    });
    System.out.println("current scene: " + game.getPlayer().getCurrentSceneName());
    if (game.getPlayer().getCurrentSceneName() != null) {
      locMap.add(gMap.makeMap(game.getPlayer().getCurrentSceneName()));
    } else {
      locMap.add(gMap.makeMap(""));
    }
    panel.add(locMap, BorderLayout.EAST);

    game.getPlayer().addPropertyChangeListener(new PropertyChangeListener() {
      @Override
      public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals(game.getPlayer().getCurrentSceneName())){
          locMap.add(gMap.makeMap(game.getPlayer().getCurrentSceneName()));
          panel.add(locMap, BorderLayout.EAST);
        }
      }
    });

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String text = tfIn.getText();
    tfIn.setText("");

    inWriter.println(text);
  }

  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    System.out.println("I hit the propertyChangeEvent");
    evt.getNewValue();
  }

}
