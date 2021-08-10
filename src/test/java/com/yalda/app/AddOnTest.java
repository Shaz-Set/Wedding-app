package com.yalda.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddOnTest {

    @Test
    void testAddOnToString() {
        AddOn itemOne = new AddOn(1, 3, "GOLD CANDLE HOLDERS",
                "Comes with the white candles, $3 each");
        assertEquals("Add On number 1\n" +
                "Name: GOLD CANDLE HOLDERS\n" +
                "Details: Comes with the white candles, $3 each\n" +
                "Price: $3.0\n",itemOne.toString());

    }
}