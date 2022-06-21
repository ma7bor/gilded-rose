package com.gildedrose.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormalItemTest {

    @Test
    public void createNormalItem() {

        NormalItem normal = new NormalItem("Samsung TV", 10, 20);
        assertEquals("Samsung TV", normal.getName());
        assertEquals(10, normal.getsellIn(), 0);
        assertEquals(20, normal.getQuality(), 0);
    }


    @Test
    public void updateQualityNormalItem() {

        NormalItem normal = new NormalItem("Samsung TV", 10, 20);
        normal.updateQ();
        assertEquals(9, normal.getsellIn(), 0);
        assertEquals(19, normal.getQuality(), 0);
    }

    @Test
    public void updateQualityNormalItemExpired() {

        NormalItem normal = new NormalItem("Samsung TV", 0, 20);
        normal.updateQ();
        assertEquals(-1, normal.getsellIn(), 0);
        assertEquals(18, normal.getQuality(), 0);    
    }

    @Test
    public void qualityMinZERO() {

        NormalItem normal = new NormalItem("flower item", 10, 0);
        normal.updateQ();
        assertEquals(9, normal.getsellIn(), 0);
        assertEquals(0, normal.getQuality(), 0);
    }
}
