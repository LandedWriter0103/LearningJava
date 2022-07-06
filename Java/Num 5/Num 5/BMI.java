import java.util.*;

public class BMI
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        String status = "";
        Double height;
        Double weight;
        Double BMI;
        Boolean health = true;

        while(1==1)
        {
            //input basic information
            System.out.println("=== 計算 BMI ===");
            System.out.print("身高 | 公分 | ");
            height = input.nextDouble();
            System.out.print("體重 | 公斤 | ");
            weight = input.nextDouble();

            //break if <20
            if(height<20||weight<20) break;

            //cal + print BMI
            height = height/100;
            BMI = Math.round(weight/height/height*10)/10.0;
            System.out.println("BMI | " + BMI);

            //judge BMI
            System.out.println("=== 判斷結果 ===");

            if(BMI<18.5){health=false; status="體重過輕 | Under Weight";}
            if(BMI>=18.5&&BMI<25){health=true; status="體重正常 | Normal";}
            if(BMI>=25&&BMI<30){health=false; status="體重過重 | Over Weight";}
            if(BMI>=30&&BMI<35){health=false; status="肥胖 | Obese";}
            if(BMI>=35){health=false; status="重度肥胖 | Extremely Obese";}

            //print result
            if(health==true)
            {
                status = "標準體重 | " + status;
            }//standard
            else
            {
                status = "不標準體重 | " + status;
            }//not standard
            
            System.out.println(status);

        }//infi loop
        
        //program fin
        System.out.println("=== 測驗結束 ===");

    }//main 
}//class