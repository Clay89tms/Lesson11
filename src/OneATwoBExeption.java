public class OneATwoBExeption extends Exception {
    String stN1 = "";

    public OneATwoBExeption(String message) {
        super(message);
    }

    public static boolean oATBEx(String stN1){
        return (stN1.startsWith("b2a1", 0));
    }
}
