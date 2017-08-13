import javax.swing.JOptionPane;

public class U1L01Warmup {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter a positive, nonnegative integer: ");
		int number = Integer.parseInt(input);
		int answer = 1;
		
		while (number > 0){
			answer = answer * number;
			number--;
		}
		
		System.out.println("The result is: " + answer);

	}

}
