package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldReturnRemain(){
        CashbackHackService service = new CashbackHackService();
        int expected = 400;
        int actual = service.remain(600);

        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    public void shouldReturnZero(){
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(2000);

        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    public void shouldReturn1000(){
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);

        org.junit.Assert.assertEquals(actual, expected);
    }
}