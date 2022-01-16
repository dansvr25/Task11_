package ru.vsu.cs.sviridov_d_v;

 public class SelectNumbersFromText {
    public static String selectNumbers(String str) {
        String[] strs = str.split(" ");
        String result = "";

        for (String string:strs) {
            if (string.matches("\\d+(?:\\.\\d+)?"))
                result += string;
        }
        return result;
    }
}
