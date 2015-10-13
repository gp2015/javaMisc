import javax.swing.JOptionPane;

public class jOptionPaneandDoubles {
	public static void main(String[] args){
		Double number = Double.parseDouble(JOptionPane.showInputDialog("What is 3/2?"));
		if (Math.abs(number - 1.5) < .00001) {
			JOptionPane.showMessageDialog(null, "You are correct!");
		} else {
			JOptionPane.showMessageDialog(null, "You are incorrect!");
		}
	}
}
