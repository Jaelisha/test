import java.awt.*;
import java.awt.event.*;
public class test{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MainFrame mFrm = new MainFrame();
        mFrm.setVisible(true);
	}

}
class MainFrame extends Frame{
	private TextField tf1 = new TextField("0");
	private TextField tfOP = new TextField("+");
	private TextField tf2 = new TextField("0");
	private Button btnRun = new Button("¿é¤J");
	private Button btnExit = new Button("µ²§ô");
	private TextArea ta = new TextArea();
	
	
	public MainFrame(){
		initComp();
	}
	
/**
 * 
 */
private void initComp(){
	this.setLayout(null);
	this.setBounds(200,100,500,300);
	this.setBackground(new Color(128,200,200));
	this.addWindowListener(new WindowAdapter(){
		pudlic void windowEvent we){
		 System.exit(0);
	   }
	 ));
	 tf1.setBounds(50,50,80,25);
	 tf1.setBackground(Color.green);
	 tfOP.setB
	    
	
}
