import java.util.Scanner;
public class evennumber_1b {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
    System.out.print("��J�ƭȡG");
    int n = input.nextInt();
    if (n%2==0) 
       System.out.println(n+"�O����!");
    else
       System.out.println(n+"�O�_��!");   
    if (n%2==1)
       System.out.println(n+"�O�_��!");
    else
       System.out.println(n+"�O����!");
    if (!(n%2==0)) 
       System.out.println(n+"�O�_��!");
    else
       System.out.println(n+"�O����!");  
    if (n%2!=0) 
       System.out.println(n+"�O�_��!");
    else
       System.out.println(n+"�O����!");  
    if (!(n%2==1))
       System.out.println(n+"�O����!");
    else
       System.out.println(n+"�O�_��!");
    if (n%2!=1)
       System.out.println(n+"�O����!");
    else
       System.out.println(n+"�O�_��!");
//=========================
    System.out.println("(n%2==0):"+(n%2==0));
    System.out.println("(n%2==1):"+(n%2==1));
    System.out.println("(!(n%2==0)):"+(!(n%2==0)));
    System.out.println("(!(n%2==1)):"+(!(n%2==1)));
    System.out.println("(n%2!=0):"+(n%2!=0));
    System.out.println("(n%2!=1):"+(n%2!=1));

  }
}