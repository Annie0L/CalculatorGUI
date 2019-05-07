import javax.swing.JFrame;

public class Test {
	
	public static void main(String[] args){
		Test test = new Test();
		test.run();
	}
	
	public void run() {
		JFrame frame = new JFrame();
		new Interface(frame);
		frame.setVisible(true);
	}
}
