public class Seven {
    public static void main(String[] args) {
        int a,b,c,d,e,f,g,h,i,j;
        int resultA, resultB, resultC, resultD, resultE; 
        
        
        //a
        a = 4;
        b = 12;
        resultA = a + b / 3;

        //b
        c = 3;
        c = c + 3;
        d = 2;
        resultB = c -d;

        //c
        e = 2;
        f = e + 1;
        e = f + 2;
        resultCS = e + f + e;
        resultC = -resultC;

        //d
        g = 3;
        h = 11;
        resultD = (h % g) + 1;

        //e
        i = 3;
        j = i++;
        resultE = 1;
        resultE += i - j;

        //f
        String s = "jjj";
        String t = "xxx";
        String resultF = s + s + t;

        //Print result
        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);
        System.out.println(resultD);
        System.out.println(resultE);
        System.out.println(resultF);
      }
}
   
