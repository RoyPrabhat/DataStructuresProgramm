package string;

public class StringReversal {
    public static void main(String[] args)
    {
        String  input1 = "AB0CD";
        String  input2 = "BCDA";

        System.out.println(reversal(input1));

    }

    private static String reversal(String input1) {
        StringBuffer s = new StringBuffer(input1);
        int startCounter = 0;
        int endCounter = input1.length()-1;
        while (startCounter < endCounter){
            char temp = input1.charAt(startCounter);
            s.setCharAt(startCounter,input1.charAt(endCounter));
            s.setCharAt(endCounter,temp);
            ++startCounter;
            --endCounter;
        }
        return s.toString();
    }
}
