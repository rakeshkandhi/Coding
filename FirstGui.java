import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
class A extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField tf1;
    JButton button;
    A() {
    	l1=new JLabel("first step");//Label name
    	add(l1);
    	tf1=new JTextField(10);//TextField size
    	add(tf1);
    	button=new JButton("test");
    	add(button);
    	button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
    	tf1.setText("Your message");
    }
}
    
public class FirstGui {
	public static void main(String[] args) {
		A gui = new A();
		gui.setLayout(new FlowLayout());
    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setSize(400, 400);
    gui.setTitle("Title");
    gui.setVisible(true);
	}

}
