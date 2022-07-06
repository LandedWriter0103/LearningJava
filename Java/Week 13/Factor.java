import java.util.*;

public class Factor{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("=== 找出所有因數 | 進行質因數分解 ===");    

        int x, temp = 10;

        while(temp>1){

            ArrayList a = new ArrayList();

            System.out.print("輸入整數 | ");
            x = input.nextInt();
            temp = x;

            //at least 2
            if(temp<=1){
                break;
            }

            //find factors
            String result_factor = "所有因數 | 除自身 | ";
            Boolean prime_num = false;
            for(int factor=1;factor<=x;factor++){
                if(factor!=1 && x!=factor && x%factor==0){
                    result_factor += String.valueOf(factor);
                    result_factor += " ";
                }//if
            }//for 

            if(result_factor=="所有因數 | 除自身 | "){
                result_factor = "=== 此數為質數 ===";
                prime_num = true;
            }

            //print factors
            System.out.println(result_factor);

            //find prime factors
            //only when it's not a prime number
            String result_prime_factor = "";
            if(prime_num==false){
                result_prime_factor = "質因數分解 | " + temp + " = ";
                for(int prime_factor=1;x!=1;prime_factor++){
                    if(x%prime_factor==0 && prime_factor!=1){
                        x = x/prime_factor;
                        if(!(x==1)){
                            result_prime_factor += prime_factor + "*";
                        }//if
                        else{
                            result_prime_factor += prime_factor;
                        }//else
                        prime_factor = 1;
                    }//if
                }//for
            }//if

            if(!(result_prime_factor=="")){
                System.out.println(result_prime_factor);
            }
            
        }//while

        System.out.println("=== Bye ===");
        input.close();

    }//main
}//class