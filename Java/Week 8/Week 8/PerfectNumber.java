import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num_input = 1;
		int num_break = -1;
		
		System.out.println("=== 判斷數值是否為完全數 | 輸入 -1 來結束程序 ===");
		
		while(num_input != num_break){
			System.out.println("=======================");
			System.out.print("輸入一個正整數 | ");

			num_input = input.nextInt();

			ArrayList num_factors = new ArrayList();
			
			// Find All Factors => Add to Array [ num_factors ]
			num_factors.add(1);
			if(num_input >= 1){ 
				for(int num = 2;num < num_input;num++){
					if(num_input%num == 0){
						num_factors.add(num);
					}//if(secondary)
					else{
						continue;
					}//else(secondary)
				}//for(find factors)

				// Add All Elements into [ result ]
				int result = 0;
				System.out.println("===================");
				for(int count = 0;count < num_factors.size();count++){
					int temp = (int) num_factors.get(count);
					result += temp;
					System.out.println(num_input + " | 可被 | " + num_factors.get(count) + " | 整除");
				}//for(add results)

				if(result == num_input){
					System.out.println("===================");
					System.out.println("輸入 | " + num_input + " | 等於 | " + result + " | 結果");
					System.out.println("===================");
					System.out.println(num_input + " | 為完全數");
				}
				else{
					System.out.println("===================");
					System.out.println("輸入 | " + num_input + " | 不等於 | " + result + " | 結果");
					System.out.println("===================");
					System.out.println(num_input + " | 非完全數");
				}
			}//if(primary)
			else if(!(num_input == -1)){
				System.out.println("=== 輸入錯誤了喔 | 請輸入正整數 ===");
				continue;
			}//else(primary)
		}//while
		System.out.println("=== 程序已結束 ===");
		input.close();
	}//main
}//class()