public class FiveFiveFiveExeption extends Exception{
    String st = "";

    public FiveFiveFiveExeption(String message) {
        super(message);
    }
    public static boolean fiveEx(String st){
return (st.startsWith("555", 0));
    }
}
