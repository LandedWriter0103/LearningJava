import java.util.*; 
public class area_1{ 
public static void main(String args[]){
  int base, height;
  float area;
  Scanner keyb;
  keyb = new Scanner(System.in);//����Scanner����
  System.out.print("��J�T���Ϊ���:");//printf()
  base = keyb.nextInt();//scanf()
  System.out.print("��J�T���Ϊ���:");
  height = keyb.nextInt();
  //double area=((double)(height*base))/2; 
  area=((float)(height*base))/2; //type casting,�ରfloat
  System.out.println("���n:"+area+"!!");
 }//main()
}//class