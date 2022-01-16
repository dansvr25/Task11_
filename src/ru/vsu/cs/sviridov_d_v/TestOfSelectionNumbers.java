package ru.vsu.cs.sviridov_d_v;

import org.junit.Test;
import org.junit.Assert;

public class TestOfSelectionNumbers {

    @Test
    public void testOfSelectionNumbers1() {
        String testedTest = "В моей группе 34 человека.";
        String expectedResult = "34";
        String realResult = SelectNumbersFromText.selectNumbers(testedTest);

        Assert.assertEquals(expectedResult, realResult);

    }

    @Test
    public void testOfSelectionNumbers2() {
        String testedTest = "В России проживает больше 140 миллионов жителей";
        String expectedResult = "140";
        String realResult = SelectNumbersFromText.selectNumbers(testedTest);

        Assert.assertEquals(expectedResult, realResult);
    }

    @Test
    public void testOfSelectionNumbers3() {
        String testedTest = "Я получил 2000 рублей";
        String expectedResult = "2000";
        String realResult = SelectNumbersFromText.selectNumbers(testedTest);

        Assert.assertEquals(expectedResult, realResult);
    }

    @Test
    public void testOfSelectionNumbers4() {
        String testedTest = "В пенале лежат 2 ручки";
        String expectedResult = "2";
        String realResult = SelectNumbersFromText.selectNumbers(testedTest);

        Assert.assertEquals(expectedResult, realResult);
    }

    @Test
    public void testOfSelectionNumbers5() {
        String testedTest = "Мой средний балл составляет 73.75";
        String expectedResult = "73.75";
        String realResult = SelectNumbersFromText.selectNumbers(testedTest);

        Assert.assertEquals(expectedResult, realResult);
    }

}
