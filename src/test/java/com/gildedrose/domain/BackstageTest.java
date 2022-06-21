package com.gildedrose.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackstageTest {

    @Test
    public void createBackstage() {

        Backstage backstage = new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", backstage.getName());
        assertEquals(15, backstage.getSellIn(), 0);
        assertEquals(20, backstage.getQuality(), 0);
    }

    @Test
    public void updateQualityOverTEN() {
        Backstage backstage = new Backstage("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        backstage.updateQ();
        assertEquals(14, backstage.getSellIn(), 0);
        assertEquals(21, backstage.getQuality(), 0);
    }

    @Test
    public void updateQualityOverFIVE() {

        Backstage backstage = new Backstage("Backstage passes to a TAFKAL80ETC concert", 6, 20);
        backstage.updateQ();
        assertEquals(5, backstage.getSellIn(), 0);
        assertEquals(22, backstage.getQuality(), 0);
    }

    @Test
    public void updateQualityOverZERO() {

        Backstage pass = new Backstage("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        pass.updateQ();
        assertEquals(4, pass.getSellIn(), 0);
        assertEquals(23, pass.getQuality(), 0);
    }

    @Test
    public void updateQualityPassExpired() {

        Backstage pass = new Backstage("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        pass.updateQ();
        assertEquals(-1, pass.getSellIn(), 0);
        assertEquals(0, pass.getQuality(), 0);
    }

    @Test
    public void qualityMax50() {

        Backstage pass = new Backstage("Backstage passes to a TAFKAL80ETC concert", 5, 49);
        pass.updateQ();
        assertEquals(4, pass.getSellIn(), 0);
        assertEquals(50, pass.getQuality(), 0);

        pass = new Backstage("Backstage passes to a TAFKAL80ETC concert", 9, 49);
        pass.updateQ();
        assertEquals(8, pass.getSellIn(), 0);
        assertEquals(50, pass.getQuality(), 0);
    }
}
