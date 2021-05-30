package string;

public class StringCopyUsingRecursion {
    public static void main(String[] args)
    {
        char s1[] = "GEEKSFORGEEKS".toCharArray();
        char s2[] = new char[s1.length];
        int index = 0;
        myCopy(s1, s2, index);
        System.out.println(String.valueOf(s2));
    }

    private static void myCopy(char[] s1, char[] s2, int index) {
        s2[index] = s1[index];
        if(index == s1.length -1){
            return;
        }

        myCopy(s1,s2, index+1);
    }
}
