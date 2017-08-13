import javax.swing.JOptionPane;

public class U1L01Warmup {

	public static void main(String[] args) {
		//set-up variables and ask for input
		String input = JOptionPane.showInputDialog(null, "Enter a positive, nonnegative integer: ");
		int number = Integer.parseInt(input);
		int answer = 1;
		
		//calculate
		while (number > 0){
			answer = answer * number;
			number--;
		}
		
		//print out result
		System.out.println("The result is: " + answer);

	}

}
