package ru.kpakulov.calculator;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


/**
 * @author kpakulov
 * @version 10/14/2016
 */


//@Ignore

public class CalculatorTest {

    @Test
    public void whenAddOneOnOneThenResultTwo() throws Exception {
        Calculator calc = new Calculator();
        calc.add(1d, 1d);
        assertThat(calc.getResult(), is(2d));
    }

    @Test
    public void whenSubstractOneOnOneThenResultZero() throws Exception {
        Calculator calc = new Calculator();
        calc.substract(1d, 1d);
        assertThat(calc.getResult(), is(0d));
    }

    @Test
    public void whenMultipleOneOnOneThenResultOne() throws Exception {
        Calculator calc = new Calculator();
        calc.multiple(1d, 1d);
        assertThat(calc.getResult(), is(1d));
    }

    @Test
    public void whenDivOneOnOneThenResultOne() throws Exception {
        Calculator calc = new Calculator();
        calc.div(1d, 1d);
        assertThat(calc.getResult(), is(1d));
    }

}
