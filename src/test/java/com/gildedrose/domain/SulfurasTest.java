package com.gildedrose.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SulfurasTest {

    @Test
    public void createSulfuras() {

        Sulfuras sulfuras = new Sulfuras("Sulfuras", 0, 80);
        assertEquals("Sulfuras", sulfuras.getName());
        assertEquals(0, sulfuras.getSellIn(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }

    @Test
    public void updateQualitySulfuras() {

        Sulfuras sulfuras = new Sulfuras("Sulfuras", 0, 80);
        sulfuras.updateQ();
        assertEquals(0, sulfuras.getSellIn(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }
}
