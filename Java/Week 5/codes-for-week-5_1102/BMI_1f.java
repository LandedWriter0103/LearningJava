import java.util.Scanner;
public class BMI_1f {
public static void main(String[] args) {	
    double height,weight, bmi;
    String status;
    Scanner input = new Scanner(System.in);
    System.out.println("��J�����G");
    height = input.nextDouble();
    System.out.print("��J�魫�G");
    weight = input.nextDouble();
    bmi = weight/ (height*height);
    //if (bmi < 18.5 || bmi >= 24) 
    if (bmi >= 18.5 && bmi < 24)  
      {
	status = "�魫���`";
	}
    else 
	status = "�魫�����`";

   System.out.println("BMI�G"+bmi+"�A���A: "+status);
  }//main
}//class
