package com.gildedrose.domain;

import com.gildedrose.interfaces.ItemNames;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackstageTest {

    @Test
    public void createBackstage() {

        Backstage backstage = new Backstage(ItemNames.BACKSTAGE, 15, 20);
        assertEquals(ItemNames.BACKSTAGE, backstage.getName());
        assertEquals(15, backstage.getSellIn(), 0);
        assertEquals(20, backstage.getQuality(), 0);
    }

    @Test
    public void updateQualityOverTEN() {
        Backstage backstage = new Backstage(ItemNames.BACKSTAGE , 15, 20);
        backstage.updateQ();
        assertEquals(14, backstage.getSellIn(), 0);
        assertEquals(21, backstage.getQuality(), 0);
    }

    @Test
    public void updateQualityOverFIVE() {

        Backstage backstage = new Backstage(ItemNames.BACKSTAGE ,  6, 20);
        backstage.updateQ();
        assertEquals(5, backstage.getSellIn(), 0);
        assertEquals(22, backstage.getQuality(), 0);
    }

    @Test
    public void updateQualityOverZERO() {

        Backstage pass = new Backstage(ItemNames.BACKSTAGE , 5, 20);
        pass.updateQ();
        assertEquals(4, pass.getSellIn(), 0);
        assertEquals(23, pass.getQuality(), 0);
    }

    @Test
    public void updateQualityPassExpired() {

        Backstage pass = new Backstage(ItemNames.BACKSTAGE ,0, 20);
        pass.updateQ();
        assertEquals(-1, pass.getSellIn(), 0);
        assertEquals(0, pass.getQuality(), 0);
    }

    @Test
    public void qualityMax50() {

        Backstage pass = new Backstage(ItemNames.BACKSTAGE , 5, 49);
        pass.updateQ();
        assertEquals(4, pass.getSellIn(), 0);
        assertEquals(50, pass.getQuality(), 0);

        pass = new Backstage(ItemNames.BACKSTAGE ,9, 49);
        pass.updateQ();
        assertEquals(8, pass.getSellIn(), 0);
        assertEquals(50, pass.getQuality(), 0);
    }
}
