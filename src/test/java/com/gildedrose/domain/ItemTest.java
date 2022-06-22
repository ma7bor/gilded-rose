package com.gildedrose.domain;

import com.gildedrose.interfaces.ItemNames;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void createItem() {

        Item item = new Item(ItemNames.NORMAL_ITEM, 10, 20);

        assertEquals(ItemNames.NORMAL_ITEM, item.getName());
        assertEquals(10, item.getSellIn(), 0);
        assertEquals(20, item.getQuality(), 0);
        System.out.println(item);
    }
}
