package string;

//Given two strings S and T of length N and M respectively,
// the task is to find the smallest string that is divisible
// by both the two strings. If no such string exists, then print -1.

// Dream 11 Question


public class StringDivisiblity {

    public static void main(String[] args)
    {

        String S = "bcdbcdbcdbcd", T = "bcd";
        int divisor = findSmallestString(S, T);
        System.out.println("Divisor = " + divisor);
    }

    private static int findSmallestString(String s, String t) {
        int factor = isDivisible(s,t);
        if(factor > 0){
            String temp = "";
            for (int i = 1; i <= factor; i ++){
                temp += t;
            }
            if(temp.equals(s)){
                System.out.println("DIVIDES");
                int minDivisor = getMinimumStringDivisor(s,t);
            } else {
                System.out.println("DOES NOT DIVIDE");
                factor = -1;
            }
        }
        return factor;
    }

    private static int getMinimumStringDivisor(String s, String t) {
        int lcm = lcm(s.length(),t.length());
        String s1 = "", s2 = "";
        for (int i = 0; i < lcm; i ++){
            s1 += s1;
            s2 += s2;
        }
        if(s.equals(s2)){
            return  lcm;
        } else  {
            return -1;
        }
    }

    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Function to calculate
    // LCM of two numbers
    static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }


    private static int isDivisible(String s, String t) {
        if(s.length()%t.length() == 0)
            return s.length()/t.length();
        else {
            return -1;
        }
    }
}
