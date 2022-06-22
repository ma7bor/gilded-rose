package com.gildedrose.domain;

import com.gildedrose.interfaces.ItemNames;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SulfurasTest {

    @Test
    public void createSulfuras() {

        Sulfuras sulfuras = new Sulfuras(ItemNames.SULFURAS, 0, 80);
        assertEquals(ItemNames.SULFURAS, sulfuras.getName());
        assertEquals(0, sulfuras.getSellIn(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }

    @Test
    public void updateQualitySulfuras() {

        Sulfuras sulfuras = new Sulfuras(ItemNames.SULFURAS, 0, 80);
        sulfuras.updateQ();
        assertEquals(0, sulfuras.getSellIn(), 0);
        assertEquals(80, sulfuras.getQuality(), 0);
    }
}
