package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random numbers = new Random();
	int num= 0;
	num=numbers.nextInt(100);
	
	int num1= 0;
	num1=numbers.nextInt(100);
	
	int num2= 0;
	num2=numbers.nextInt(100);
	
	int num3= 0;
	num3=numbers.nextInt(100);
	
	int num4= 0;
	num4=numbers.nextInt(100);
	JOptionPane.showMessageDialog(null, "Your lottery numbers are: " +num+", "+num1+", "+num2+", "+num3+", "+num4);
}
}
