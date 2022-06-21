package com.gildedrose.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AgedBrieTest {

    @Test
    public void createAgedBrie() {

        AgedBrie agedBrie = new AgedBrie("Aged Brie", 2, 0);
        assertEquals("Aged Brie", agedBrie.getName());
        assertEquals(2, agedBrie.getSellIn(), 0);
        assertEquals(0, agedBrie.getQuality(), 0);
    }

    @Test
    public void updateQualityBrie() {

        AgedBrie agedBrie = new AgedBrie("Aged Brie", 2, 0);
        agedBrie.updateQ();
        assertEquals(1, agedBrie.getSellIn(), 0);
        assertEquals(1, agedBrie.getQuality(), 0);
    }

    @Test
    public void checkQualityBrieExpired() {

        AgedBrie agedBrie = new AgedBrie("Aged Brie", 0, 0);
        agedBrie.updateQ();
        assertEquals(-1, agedBrie.getSellIn(), 0);
        assertEquals(2, agedBrie.getQuality(), 0);
    }

    @Test
    public void checkQualityMax() {
        AgedBrie agedBrie = new AgedBrie("Aged Brie", -1, 50);
        agedBrie.updateQ();
        assertEquals(-2, agedBrie.getSellIn(), 0);
        assertEquals(50, agedBrie.getQuality(), 0);

        agedBrie = new AgedBrie("Aged Brie", -1, 49);
        agedBrie.updateQ();
        assertEquals(-2, agedBrie.getSellIn(), 0);
        assertEquals(50, agedBrie.getQuality(), 0);
    }
}
