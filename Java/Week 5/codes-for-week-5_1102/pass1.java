import java.util.*; 
public class pass1{ 
public static void main(String args[]){   
 
 int sc;
  Scanner inp = new Scanner(System.in);
  System.out.print("Please input your score:");
  sc = inp.nextInt();
  if (sc>=60)
     System.out.println("�ή�");
  else 
     System.out.println("���ή�");
  if (!(sc>=60))
     System.out.println("���ή�");
  else 
     System.out.println("�ή�");

 }//main()
}
