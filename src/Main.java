import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số từ 1 - 999 bất kỳ: ");
        int number = scanner.nextInt();

        int hangDonVi = number % 10;
        int hangChuc = (number % 100) / 10;
        int hangTram = number / 100;

        if (number < 0 || number > 999) {
            System.out.println("Nhập sai giá trị, không đọc được");
        } else if (number == 0) {
            System.out.println("zero");
        } else if (number < 20) {
            String donViWord = "";
            switch (number) {
                case 1:
                    donViWord = "one";
                    break;
                case 2:
                    donViWord = "two";
                    break;
                case 3:
                    donViWord = "three";
                    break;
                case 4:
                    donViWord = "four";
                    break;
                case 5:
                    donViWord = "five";
                    break;
                case 6:
                    donViWord = "six";
                    break;
                case 7:
                    donViWord = "seven";
                    break;
                case 8:
                    donViWord = "eight";
                    break;
                case 9:
                    donViWord = "nine";
                    break;
                case 10:
                    donViWord = "ten";
                    break;
                case 11:
                    donViWord = "eleven";
                    break;
                case 12:
                    donViWord = "twelve";
                    break;
                case 13:
                    donViWord = "thirteen";
                    break;
                case 14:
                    donViWord = "fourteen";
                    break;
                case 15:
                    donViWord = "fifteen";
                    break;
                case 16:
                    donViWord = "sixteen";
                    break;
                case 17:
                    donViWord = "seventeen";
                    break;
                case 18:
                    donViWord = "eighteen";
                    break;
                case 19:
                    donViWord = "nineteen";
                    break;
            }
            System.out.println(donViWord);
        } else {
            String donViWord = "";
            switch (hangDonVi) {
                case 1:
                    donViWord = "one";
                    break;
                case 2:
                    donViWord = "two";
                    break;
                case 3:
                    donViWord = "three";
                    break;
                case 4:
                    donViWord = "four";
                    break;
                case 5:
                    donViWord = "five";
                    break;
                case 6:
                    donViWord = "six";
                    break;
                case 7:
                    donViWord = "seven";
                    break;
                case 8:
                    donViWord = "eight";
                    break;
                case 9:
                    donViWord = "nine";
                    break;
            }
            String hangChucWord = "";
            switch (hangChuc) {
                case 2:
                    hangChucWord = "twenty";
                    break;
                case 3:
                    hangChucWord = "thirty";
                    break;
                case 4:
                    hangChucWord = "fourty";
                    break;
                case 5:
                    hangChucWord = "fifty";
                    break;
                case 6:
                    hangChucWord = "sixty";
                    break;
                case 7:
                    hangChucWord = "seventy";
                    break;
                case 8:
                    hangChucWord = "eighty";
                    break;
                case 9:
                    hangChucWord = "ninety";
                    break;
            }
            String hangTramWord = "";
            switch (hangTram) {
                case 1:
                    hangTramWord = "one";
                    break;
                case 2:
                    hangTramWord = "two";
                    break;
                case 3:
                    hangTramWord = "three";
                    break;
                case 4:
                    hangTramWord = "four";
                    break;
                case 5:
                    hangTramWord = "five";
                    break;
                case 6:
                    hangTramWord = "six";
                    break;
                case 7:
                    hangTramWord = "seven";
                    break;
                case 8:
                    hangTramWord = "eigh";
                    break;
                case 9:
                    hangTramWord = "nine";
                    break;
            }
            String word;
            if (hangTram == 0) {
                word = hangChucWord + " " + donViWord;
            } else if (hangChuc == 1) {
                word = hangTramWord + " hundred " + donViWord;
            } else {
                word = hangTramWord + " hundred " + hangChucWord + " " + donViWord;
            }
            System.out.println(word);
        }
    }
}