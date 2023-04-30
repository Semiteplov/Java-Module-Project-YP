public class Formatter {
    public static String getFormattedRubles(double price) {
        String formattedRubles = "рублей";
        int intPrice = (int) Math.floor(price);
        int lastDigit = intPrice % 10;
        if (intPrice % 100 >= 11 && intPrice % 100 <= 19) {
            formattedRubles = "рублей";
        } else if (lastDigit == 1) {
            formattedRubles = "рубль";
        } else if (lastDigit > 1 && lastDigit < 5) {
            formattedRubles = "рубля";
        }
        return formattedRubles;
    }
}
