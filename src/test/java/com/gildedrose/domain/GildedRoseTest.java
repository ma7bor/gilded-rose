package com.gildedrose.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GildedRoseTest {

    private GildedRose gildedRose = null;
    private NormalItem normalItem = null;
    private AgedBrie agedBrie = null;

    @Before
    public void setupItemList() {
        gildedRose = new GildedRose();
        normalItem = new NormalItem("+5 Dexterity Vest", 10, 20);
        agedBrie = new AgedBrie("Aged Brie", 2, 0);
    }

    @Test
    public void addItemTest() {
        gildedRose.addItem(normalItem);
        gildedRose.addItem(agedBrie);
        assertEquals(2, gildedRose.inventory().size(), 0);

        List<NormalItem> items = List.of(normalItem, agedBrie);
        assertArrayEquals(items.toArray(), gildedRose.inventory().toArray());

        System.out.println("GildedRose addItem test:");
        System.out.println(gildedRose.toString());
    }

    @Test
    public void updateQuality() {
        gildedRose.addItem(normalItem);
        gildedRose.addItem(agedBrie);
        assertEquals(2, gildedRose.inventory().size(), 0);
        System.out.println("Day 0:" + '\n' + gildedRose.toString());
        gildedRose.updateQuality();

        NormalItem item = (NormalItem) gildedRose.inventory().get(0);
        assertEquals(19, item.getQuality(), 0);
        assertEquals(1, ((NormalItem) (gildedRose.inventory().get(1))).getQuality(), 0);
        System.out.println("Day 1:" + '\n' + gildedRose.toString());
    }
}
