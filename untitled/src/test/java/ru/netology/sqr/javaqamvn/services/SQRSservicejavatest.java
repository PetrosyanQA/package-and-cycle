package ru.netology.sqr.javaqamvn.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRSservicejavatest {
    @ParameterizedTest
    @CsvFileSource(files = "scr/test/resources/SQRT.ccv")
    public void calcSqrt(int expected, int start, int finish) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(start, finish);

    }
}
