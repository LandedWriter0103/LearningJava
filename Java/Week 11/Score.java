import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Score {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList scores = new ArrayList();

        String level;
        int sum = 0, stu, num_input;

        System.out.print("輸入人數 | ");
        stu = input.nextInt();
        if(stu >= 1){
            for(int num = 0;num != stu;){
                num += 1;
                System.out.print("輸入第" + num + "位數學段考成績 | 整數 | ");
                num_input = input.nextInt();
                switch((99-num_input)/10){
                    case 0: level = "優"; break;
                    case 1: level = "甲"; break; 
                    case 2: level = "乙"; break; 
                    case 3: level = "丙"; break; 
                    case 4: level = "丁"; break; 
                    default: level = "戊"; break;
                }//switch
                scores.add(num_input);
                System.out.println("第" + num + "位數學段考成績" + num_input + ", 等第：" + level);
                sum += num_input;
            }//for
            System.out.println("=== result ===");
            System.out.println("平均 | " + sum/stu);
            switch((99-(sum/stu))/10){
                case 0: level = "優"; break;
                case 1: level = "甲"; break; 
                case 2: level = "乙"; break; 
                case 3: level = "丙"; break; 
                case 4: level = "丁"; break; 
                default: level = "戊"; break;
            }//level
            System.out.println("平均之等第 | " + level);
            var max = Collections.max(scores);
            var min = Collections.min(scores);
            System.out.println("最高分 | " + max);
            System.out.println("最低分 | " + min);
            System.out.println("輸入人數 | " + stu);
            System.out.println("Bye");
        }//if
        else{
            System.out.println("輸入錯誤 | Bye Bye");
        }//else
        input.close();
    }//main
}//class(
