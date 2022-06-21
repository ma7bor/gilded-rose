package com.gildedrose.domain;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void createItem() {

        Item item = new Item("+5 Dexterity Vest", 10, 20);

        assertEquals("+5 Dexterity Vest", item.getName());
        assertEquals(10, item.getSellIn(), 0);
        assertEquals(20, item.getQuality(), 0);
        System.out.println(item);
    }
}
