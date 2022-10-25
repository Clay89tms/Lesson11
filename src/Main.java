import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ЗАДАНИЕ №1
//        System.out.println("1) Основное задание");
        String number = "5556-ABc-0289-ddA-1a2b";
//        Document.twoString(number);
//        Document.stStar2x3(number);
//        Document.stLetters(number);
//        Document.stBildLetters(number);

        try {
            Document.stScreach(number);
        } catch (AbcExeption abcExeption) {
            System.out.println(abcExeption.getMessage());
        }

        try {
            Document.stStart555(number);
        } catch (FiveFiveFiveExeption fiveFiveFiveExeption) {
            System.out.println(fiveFiveFiveExeption.getMessage());
        }

        try {
            Document.stLast1a2b(number);
        } catch (OneATwoBExeption oneATwoBExeption) {
            System.out.println(oneATwoBExeption.getMessage());
        }

        //ЗАДАНИЕ №2
//        System.out.println("2) Дополнительное задание");
//        String numberRundom = "12диннадцать -5один-7четере-6Шесть-4два";
//        Document.screachShortL(numberRundom);
        //ЗАДАНИЕ №3
//        System.out.println("3) Дополнительное задание");
//        String numberRundom1 = "hellow World";
//        Document.dubleLetters(numberRundom1);

    }
}