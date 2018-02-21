package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LoteryNumbers {
	public static void main(String[] args) {
		
Random Jacob = new Random();
int num = Jacob.nextInt(101);
int num2 = Jacob.nextInt(277);
int num3 = Jacob.nextInt((150-50)+1)+50;
int num4 = Jacob.nextInt((387-92)+1)+92;
int num5 = Jacob.nextInt(666);
JOptionPane.showMessageDialog(null, "Your numbers are " +  num + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);

}
}