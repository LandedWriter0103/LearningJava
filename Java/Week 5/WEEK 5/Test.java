import java.util.*; // 導入 Java

public class Test{ // 宣告 | 命名 => 一個類 => [ 須與檔名完全相同 ]
  public static void main(String args[]){ // 主方法 [ Method ]
    int sc_1, sc_2, sc_3, sum; // 宣告 成績 | 總成績
    double avg; // 宣告 平均
    String result = ""; // 宣告 是否及格
    Scanner input; // 宣告 input => 為可掃描鍵盤輸入的物件

    input = new Scanner(System.in); // 將 input 建立成掃瞄器

    // 輸入 一段成績 || 且先將字串輸出
    System.out.print("輸入數學段考成績 | 1 || ");
    sc_1 = input.nextInt();

    // 輸入 二段成績 || 且先將字串輸出
    System.out.print("輸入數學段考成績 | 2 || ");
    sc_2 = input.nextInt();

    // 輸入 三段成績 || 且先將字串輸出
    System.out.print("輸入數學段考成績 | 3 || ");
    sc_3 = input.nextInt();

    // 算 | 輸出 => 總成績 | 平均
    sum = sc_1 + sc_2 + sc_3;
    avg = sum / 3;
    System.out.println("總分 || " + sum + "分");
    System.out.println("平均 || " + avg + "分");

    // 判斷一段 => 是否及格
    if (sc_1 > 59)
      result = "第一次段考 | 數學 || 及格";
    else
      result = "第一次段考 | 數學 || 不及格";
    System.out.println(result);

    // 判斷二段 => 是否及格
    if (sc_2 > 59)
      result = "第二次段考 | 數學 || 及格";
    else
      result = "第二次段考 | 數學 || 不及格";
    System.out.println(result);

    // 判斷三段 => 是否及格
    if (sc_3 > 59)
      result = "第三次段考 | 數學 || 及格";
    else
      result = "第三次段考 | 數學 || 不及格";
    System.out.println(result);

    // 判斷平均 => 是否及格
    if (sc_3 > 59)
      result = "第三次段考 | 數學 || 及格";
    else
      result = "第三次段考 | 數學 || 不及格";
    System.out.println(result);

    // 判斷哪一次段考最低分
    if (sc_1 < sc_2 && sc_1 < sc_3)
      result = "最低的分數 | 第一次段考";  
    if (sc_2 < sc_1 && sc_2 < sc_3)
      result = "最低的分數 | 第二次段考";
    if (sc_3 < sc_1 && sc_3 < sc_2)
      result = "最低的分數 | 第三次段考"; 
    System.out.println(result);
    
    // 將 Scanner 關閉
    input.close();

  }//main() 結尾
}//class 結尾
