public class AbcExeption extends Exception {
    String st = "";

    public AbcExeption(String message) {
        super(message);
    }

    public static boolean abcEx(String st) {
        return (st.contains("abc") || st.contains("ABC"));
    }
}
