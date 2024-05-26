package ru.sberbank.jd.lesson02;

import org.junit.Assert;
import org.junit.Test;

public class NodCalculatorTest {
    Nod nod = new NodCalculator();

    @Test
    public void calculate() {
        Assert.assertEquals(5, nod.calculate(10, 5));
        Assert.assertEquals(3, nod.calculate(9, 30));
        Assert.assertEquals(13, nod.calculate(13, 26));
        Assert.assertEquals(5, nod.calculate(100, 5));
    }
}