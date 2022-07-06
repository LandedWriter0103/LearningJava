import java.util.*;
import java.security.SecureRandom;

public class PhraseTest{
    public static void main(String args[]){
        System.out.println("--- 英文片語測驗 ---");
        
        ArrayList<String> MainEnAr = new ArrayList();
        ArrayList<String> MainChAr = new ArrayList();

        MainEnAr.add("blow up"); MainEnAr.add("bring up"); MainEnAr.add("call off"); MainEnAr.add("do over"); MainEnAr.add("fill out"); MainEnAr.add("fill up"); MainEnAr.add("find out"); MainEnAr.add("give away"); MainEnAr.add("give back"); MainEnAr.add("hand in"); MainEnAr.add("hang up"); MainEnAr.add("hold up"); MainEnAr.add("leave out"); MainEnAr.add("look over"); MainEnAr.add("look up"); MainEnAr.add("make up"); MainEnAr.add("make out"); MainEnAr.add("pick out"); MainEnAr.add("pick up"); MainEnAr.add("point out"); MainEnAr.add("put away"); MainEnAr.add("put off"); MainEnAr.add("put on"); MainEnAr.add("put out"); MainEnAr.add("read over"); MainEnAr.add("set up"); MainEnAr.add("take down"); MainEnAr.add("take off"); MainEnAr.add("talk over"); MainEnAr.add("throw away");
        MainChAr.add("爆炸"); MainChAr.add("提起"); MainChAr.add("取消"); MainChAr.add("重做"); MainChAr.add("填好"); MainChAr.add("填滿"); MainChAr.add("發現"); MainChAr.add("贈送"); MainChAr.add("歸還"); MainChAr.add("繳交"); MainChAr.add("懸掛"); MainChAr.add("使延遲"); MainChAr.add("省略，遺漏"); MainChAr.add("檢查，查看"); MainChAr.add("尋找某物"); MainChAr.add("虛構，捏造"); MainChAr.add("聽到，瞭解"); MainChAr.add("挑選"); MainChAr.add("舉起，抬起"); MainChAr.add("引起注意"); MainChAr.add("儲蓄，儲存"); MainChAr.add("延期"); MainChAr.add("穿戴衣物"); MainChAr.add("熄滅"); MainChAr.add("詳讀"); MainChAr.add("佈置，開始"); MainChAr.add("記下"); MainChAr.add("脫去衣帽"); MainChAr.add("討論"); MainChAr.add("丟棄，拋棄");

        ArrayList<String> WrongEnAr = new ArrayList();
        ArrayList<String> WrongChAr = new ArrayList();
        ArrayList<String> WrongChTempAr = new ArrayList();
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        String value;
        String hint;
        String ans;

        int rn;
        int round=2;
        int WrongCnt=0;
        int x=30;
        
        //Main Round
        for(int cnt=1;cnt<=20;cnt++){
            rn = random.nextInt(x);
            hint = MainEnAr.get(rn).charAt(0) + " ... " + MainEnAr.get(rn).charAt(MainEnAr.get(rn).length()-1);

            System.out.print("第 "+String.valueOf(cnt)+" 題 | "+MainChAr.get(rn)+" | "+hint+" | ");
            ans = input.nextLine();

            if(!(ans.toLowerCase().equals(MainEnAr.get(rn)))){
                WrongChAr.add(MainChAr.get(rn));
                WrongEnAr.add(MainEnAr.get(rn));
                WrongCnt++;
            }//if
            MainChAr.remove(rn);
            MainEnAr.remove(rn);
            x--;
        }//for

        MainChAr.clear();
        MainEnAr.clear();

        for(int cnt=0;cnt<=WrongChAr.size()-1;cnt++) WrongChTempAr.add(WrongChAr.get(cnt));

        //Round 2 ~ ?
        while(!(WrongChTempAr.isEmpty())){
            //print wrong
            System.out.println("----- 答錯題目 -----");
            for(int cnt=1;cnt<=WrongCnt;cnt++){
                System.out.println("錯題 "+String.valueOf(cnt)+" | "+WrongChAr.get(cnt-1)+" | "+WrongEnAr.get(cnt-1));
            }//for

            System.out.println("----- 試題結束 -----");
            System.out.print("是否再次挑戰 (y/n) | ");

            if(input.nextLine().toLowerCase().equals("y")){
                //Challenge
                System.out.println("----- Round "+String.valueOf(round)+" -----");
                int y = WrongCnt;
                int z = WrongCnt;
                for(int cnt=1;cnt<=y;cnt++){
                    rn = random.nextInt(z);
                    hint = WrongEnAr.get(rn).charAt(0) + " ... " + WrongEnAr.get(rn).charAt(WrongEnAr.get(rn).length()-1);

                    System.out.print("第 "+String.valueOf(cnt)+" 題 | "+WrongChAr.get(rn)+" | "+hint+" | ");
                    ans = input.nextLine();

                    if(!(ans.toLowerCase().equals(WrongEnAr.get(rn)))){
                        MainChAr.add(WrongChAr.get(rn));
                        MainEnAr.add(WrongEnAr.get(rn));
                    }//if
                    else{
                        WrongChTempAr.remove(rn);                           
                        WrongCnt--;
                    }//else
                    WrongChAr.remove(rn);
                    WrongEnAr.remove(rn);
                    z--;
                }//for
            }//if
            else break;
            round++;
            WrongChAr.clear();
            WrongEnAr.clear();
            for(int cnt=0;cnt<=MainChAr.size()-1;cnt++){
                WrongChAr.add(MainChAr.get(cnt));
                WrongEnAr.add(MainEnAr.get(cnt));
            }//for
        }//while
        System.out.println("---- 試題結束 ----");
    }//main
}//class