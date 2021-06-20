package string;

public class CheckStringRotation {

    public static void main(String[] args)
    {
        String  input1 = "ABCD";
        String  input2 = "BCDA";
        if(chekIfRotation(input1,input2)){
            System.out.println("ROTATION EXIST");
        } else {
            System.out.println("NO ROTATION");
        }
    }

    private static Boolean chekIfRotation(String input1, String input2) {
        if(input1.length() != input2.length()){
            return false;
        }
        return ((input1 + input2).indexOf(input2) >=0);
    }
}
