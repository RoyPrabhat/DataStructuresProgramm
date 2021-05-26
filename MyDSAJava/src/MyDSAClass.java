//import com.sun.codemodel.internal.JForEach;
//
//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;
//
//public class MyDSAClass {
//    public static void main(String[] args){
//        println("Hello World");
//        // cannot do this
////        MOVE m = new MOVE(0);
//        MOVE m = MOVE.getRock();
//        MOVE.values();
//        println(m.toString());
//    }
//}
//
//enum MOVE {
//    ROCK(0), PAPER(1), SCISSOR(2);
//
//    private int value;
//
//    MOVE(int i) {
//        this.value = i;
//    }
//
//    MOVE Move(int value){
//        return MOVE.ROCK;
//    }
//
//    public static MOVE getRock(){
//        return  MOVE.ROCK;
//    }
//}
//
//enum ExpandedMove extends Enum<MOVE> {
//
//}
