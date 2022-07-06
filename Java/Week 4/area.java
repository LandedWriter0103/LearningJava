import java.util.*; // 導入 Java

public class area{ // 宣告 | 命名 => 一個類 => [ 須與檔名完全相同 ]
    public static void main(String args[]){ // 主方法 [ Method ]
        
        float top, bottom, height; // 宣告 上底 | 下底 | 高 => 為浮點數
        float area; // 宣告 最後面積 => 為浮點數
        Scanner input; // 宣告 input => 為可掃描鍵盤輸入的物件

        input = new Scanner(System.in); // 將 input 建立成掃瞄器

        // 輸入 上底 => 為浮點數 || 且先將字串輸出
        System.out.print("輸入梯形上底 | 可以是小數 | 公分 || ");
        top = input.nextFloat();
        
        // 輸入 下底 => 為浮點數 || 且先將字串輸出
        System.out.print("輸入梯形下底 | 可以是小數 | 公分 || ");
        bottom = input.nextFloat();

        // 輸入 高 => 為浮點數 || 且先將字串輸出
        System.out.print("輸入梯形高 | 可以是小數 | 公分 || ");
        height = input.nextFloat();
        
        // 算出 ( 上底 + 下底 ) x 高 / 2 => 並輸出
        area = ((float)(top + bottom))*height/2;
        System.out.println("結果 | 平方公分 || "+ area +" ！！");

        // 將 Scanner 關閉
        input.close();

    }//main() 結尾
}//class 結尾
