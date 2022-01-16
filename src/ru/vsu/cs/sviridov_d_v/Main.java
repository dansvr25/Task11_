package ru.vsu.cs.sviridov_d_v;

import java.util.Scanner;

public class Main {

    public void main(String[] args) {
        String str = readText();
        SelectNumbersFromText.selectNumbers(str);
    }

    private static String readText() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the text from which you want to select all numbers: ");
        return scn.nextLine();
    }
}
