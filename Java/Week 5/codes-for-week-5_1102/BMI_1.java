import java.util.Scanner;

public class BMI_1 {
 public static void main(String[] args) {
  int x=3, y=4; 
  float z1;
  z1=(x+y)/2;
  System.out.println(z1);
  z1=((float)(x+y))/2;
  System.out.println(z1);
  float height, weight, bmi;
   Scanner input = new Scanner(System.in);
   System.out.print("��J����(����)�G");
   height = input.nextFloat();
   System.out.print("��J�魫(����)�G");
   weight = input.nextFloat();
   //bmi = Math.round((weight/ (height*height) )* 100) / 100.00;
   bmi = weight/ (height*height);
   System.out.println("�����G"+height+"����, �魫�G"+weight+"����");
   System.out.println("BMI�G"+bmi);
	}//end of main
}//end of class
