
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.*;


public class hoi6 extends JFrame implements ActionListener { 
    private JTextField textfield;
    private JButton button;
    private JPanel panel;
    private JLabel label;
    JTextField text1  = new JTextField("         ");
    JTextField text2 = new JTextField("         ");
    JPanel hoi = new JPanel();
    
    
    
    public static void main (String[] args) {
        hoi6 frame = new hoi6();
        frame.setSize(2550, 1038);
        frame.setTitle("Watermolecuul generator");
        frame.createGUI();
        frame.setVisible(true);
    }
    private void createGUI(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container window = getContentPane();
    window.setLayout(new FlowLayout());
    window.setBackground(Color.black);
    button = new JButton("Teken water molecuul!");
    button.setForeground(Color.black);
    button.setBackground(Color.green);
    window.add(button);
    button.addActionListener(this);
    label = new JLabel("X");
    label.setForeground(Color.green);
    window.add(label);
    
    window.add(text1);
    label = new JLabel("Y");
    label.setForeground(Color.green);
    window.add(label);
    
    window.add(text2);
    hoi.setPreferredSize(new Dimension(900,900));
    window.add(hoi);
   
    } 
    
    public void actionPerformed (ActionEvent event){
        Graphics paper = hoi.getGraphics();
        paper.clearRect(0, 0, 900, 900);
        button.setBackground(Color.red);
        button.setForeground(Color.black);
        String Xbuffer = text1.getText();
        Xbuffer=Xbuffer.replaceAll("\\s+","");
        int x = Integer.valueOf(Xbuffer);
        String Ybuffer = text2.getText();
        Ybuffer=Ybuffer.replaceAll("\\s+","");
        int y = Integer.valueOf(Ybuffer);
        paper.drawLine(x+63, y+63, x+300, y+300);
        paper.drawLine(x+63,y+563,x+300,y+300);
        paper.setColor(Color.red);
        paper.fillOval(x,y,125, 125);
        paper.setColor(Color.red);
        paper.fillOval(x,y+475,125,125);
        paper.setColor(Color.blue);
        paper.fillOval(x+150, y+150, 300, 300);
    }
    
    
}
