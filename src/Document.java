import java.util.Locale;

public class Document {
    String st = "";

    public Document() {
    }

    public Document(String st) {
        this.st = st;
    }

    public static void twoString(String st) {
        String[] stmas = st.split("-");
        System.out.println("2 первых блока по 4 цыфры: " + stmas[0] + " " + stmas[2]);
    }

    public static void stStar2x3(String st) {
        System.out.println(st.replaceAll("[a-zA-Z]{3}", "***"));
    }

    public static void stLetters(String st) {
        System.out.println(st.replaceAll("[0-9]", "-")
                .replaceAll("-----", "")
                .strip().replaceAll("-", "/")
                .replaceAll("//", "/")
                .toLowerCase());
    }

    public static void stBildLetters(String st) {
        StringBuilder stBL = new StringBuilder(st);
        stBL.replace(0, 5, "") //обрезка 5556-
                .replace(3, 9, "/") //замена -0289- на /
                .replace(7, 9, "/") //замена -1 на /
                .replace(9, 10, "/") //замена 2 на /
                .insert(0, "Letters: "); // вставили вначало текст Letters:
        String stN = new String(stBL);
        System.out.println(stN);
    }

    public static void stScreach(String st) throws AbcExeption {
            if (AbcExeption.abcEx(st)) {
                throw new AbcExeption("В строке присутствует последовательность abc(ABC)!");
            }
    }

    public static void stStart555(String st) throws FiveFiveFiveExeption {
        if (FiveFiveFiveExeption.fiveEx(st)) {
            throw new FiveFiveFiveExeption("Строка начинается с 555!!!");
        }
    }

    public static void stLast1a2b(String st) throws OneATwoBExeption {
        StringBuilder stN = new StringBuilder(st);
        stN.reverse();
        String stN1 = new String(stN);
        if (OneATwoBExeption.oATBEx(stN1)) {
            throw new OneATwoBExeption("Строка заканчивается на 1a2b!");
        }
    }

    public static void screachShortL(String st) {
        String[] masSL = st.split("-");
        for (int i = 0; i < masSL.length; i++) {
            masSL[i] = masSL[i].strip();
        }
        for (int i = 1; i < masSL.length; i++) {
            for (int j = 1; j < masSL.length - 1; j++) {
                if (masSL[j - 1].length() > masSL[i].length()) {
                    String n = masSL[i - 1]; // больше
                    masSL[i - 1] = masSL[i];
                    masSL[i] = n;
                }
            }
        }
        System.out.println("Самое короткое слово: " + masSL[0]);
        System.out.println("Самое Длинное слово: " + (masSL[masSL.length - 1]));
    }

    public static void dubleLetters(String st) {
        String[] st1 = st.split("");
        StringBuilder st2 = new StringBuilder();
        for (int i = 0; i<st.length(); i++){
            st2.append(st1[i]).append(st1[i]);
        }
        System.out.println(st2);
    }

    public void stStar() {
        String[] stmas = st.split("-");
        for (int i = 0; i < stmas.length; i++) {
            String[] chMas = stmas[i].split("");
            stmas[i] = "";
            for (int j = 0; j < chMas.length; j++) {

                if (!(chMas[j].toUpperCase(Locale.ROOT)).equals(chMas[j].toLowerCase(Locale.ROOT))) {
                    stmas[i] += "*";
                } else {
                    stmas[i] += chMas[j];
                }
            }
        }
        System.out.print(String.join("-", stmas[0], stmas[1], stmas[2], stmas[3], stmas[4]));
    }
}

