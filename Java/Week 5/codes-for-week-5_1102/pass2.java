import java.util.*; 
public class pass2{ 
public static void main(String args[]){ 
 int math, chin;
  Scanner inp;
  inp = new Scanner(System.in);
  System.out.print("Please input your math score:");
  math = inp.nextInt();
  System.out.print("Please input your Chinese score:");
  chin = inp.nextInt();
  String feed=""; //empty string, not space character
  System.out.print("�P�_���G:"+feed+"\n");
  if (math<60)
     feed="�ƾǤ��ή�,";
  else 
     feed="�ƾǤή�,";
  System.out.print("�P�_���G:"+feed+"\n");
  if (chin<60)
     feed=feed+"��y���ή�";
  else 
     feed=feed+"��y�ή�";
  System.out.print("�P�_���G:"+feed+"\n");
 }//main()
}