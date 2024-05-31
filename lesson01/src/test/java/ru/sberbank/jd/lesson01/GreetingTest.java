package ru.sberbank.jd.lesson01;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class GreetingTest {
    private final Greeting gr = new MyGreeting();
    @Test
    public void test01(){
        Assert.assertEquals(1985, gr.getBirthYear());
        Assert.assertEquals("Mikhail", gr.getFirstName() );

        Assert.assertEquals(3,gr.getCourseExpectations().size());
    }
}
