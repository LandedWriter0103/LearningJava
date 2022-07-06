import java.util.*;

public class Tri
{
    public static void main(String args[])
    {
        //base var
        ArrayList<Integer> side = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        Boolean tri = true;
        String triType = "";
        Double area;

        int perimeter;
        int S, a, b, c;

        //input side into side => ArrayList
        for(int i=1;i<=3;i++)
        {
            System.out.print("輸入邊長 " + i + " | ");
            side.add(input.nextInt());
        }//for input

        //sort ArrayList
        Collections.sort(side);

        //store into var
        a = side.get(0);
        b = side.get(1);
        c = side.get(2);

        //cal perimeter
        perimeter = a + b + c;

        //cal area
        S = perimeter/2;
        area = Math.sqrt(S*(S-a)*(S-b)*(S-c));

        //detect type
        if(a*a+b*b<c*c)
        {
            triType = "因 " + a + "平方+ " + b + "平方 < " + c + "平方 | 所以此為銳角三角形";
        }//is acu tri

        if(a*a+b*b>c*c)
        {
            triType = "因 " + a + "平方+ " + b + "平方 > " + c + "平方 | 所以此為鈍角三角形";
        }//is obt tri
        
        if(a*a+b*b==c*c)
        {
            triType = "因 " + a + "平方+ " + b + "平方 = " + c + "平方 | 所以此為直角三角形";
        }//is right tri

        if(a==b)
        {
            triType = "因 " + a + "=" + b + " | 所以此為等腰三角形";
        }
        else if(b==c)
        {
            triType = "因 " + b + "=" + c + " | 所以此為等腰三角形";
        }
        else if(a==c)
        {
            triType = "因 " + a + "=" + c + " | 所以此為等腰三角形";
        }//is iso tri

        if(a==b&&b==c)
        {
            triType = "因 " + a + "=" + b + "=" + c + " | 所以此為正三角形";
        }//is equ tri

        if(a+b<=c)
        {
            triType = "因 " + a + "+" + b + "<=" + c + " | 所以此不為三角形";
            tri = false;
        }//is tri

        //print result
        System.out.println("判斷結果 | " + triType);
        if(tri==true)
        {
            System.out.println("周長 | " + perimeter);
            System.out.println("面積 | " + area);
        }//is tri

    }//main
}//class