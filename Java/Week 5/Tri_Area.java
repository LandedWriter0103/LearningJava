import java.util.*; // 導入 Java

public class Tri_Area{ // 宣告 | 命名 => 一個類 => [ 須與檔名完全相同 ]
  public static void main(String args[]){ // 主方法 [ Method ]
    int num_1, num_2, num_3; // 宣告 三邊長
    double area; // 宣告 面積
    Scanner input; // 宣告 input => 為可掃描鍵盤輸入的物件

    input = new Scanner(System.in); // 將 input 建立成掃瞄器
      
    System.out.println("輸入邊長 | 1 || ");
    num_1 = input.nextInt();

    System.out.println("輸入邊長 | 2 || ");
    num_2 = input.nextInt();

    System.out.println("輸入邊長 | 3 || ");
    num_3 = input.nextInt();

    input.close();
  }//main()
}//class