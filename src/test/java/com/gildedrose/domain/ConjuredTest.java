package com.gildedrose.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConjuredTest {

    @Test
    public void createConjured() {

        Conjured conjured = new Conjured("Conjured", 3, 6);
        assertEquals("Conjured", conjured.getName());
        assertEquals(3, conjured.getSellIn(), 0);
        assertEquals(6, conjured.getQuality(), 0);
    }

    @Test
    public void updateQualityConjured() {

        Conjured conjured = new Conjured("Conjured", 3, 6);
        conjured.updateQ();
        assertEquals(2, conjured.getSellIn(), 0);
        assertEquals(4, conjured.getQuality(), 0);
    }

    @Test
    public void updateQualityConjuredJustExpired() {

        Conjured conjured = new Conjured("Conjured", 0, 6);
        conjured.updateQ();
        assertEquals(-1, conjured.getSellIn(), 0);
        assertEquals(2, conjured.getQuality(), 0);    
    }

    @Test
    public void updateQualityConjuredExpired() {

        Conjured conjured = new Conjured("Conjured Mana Cake", -1, 6);
        conjured.updateQ();
        assertEquals(-2, conjured.getSellIn(), 0);
        assertEquals(2, conjured.getQuality(), 0);
    }

    @Test
    public void qualityMinZERO() {

        Conjured conjured = new Conjured("Conjured Mana Cake", 1, 1);
        conjured.updateQ();
        assertEquals(0, conjured.getSellIn(), 0);
        assertEquals(0, conjured.getQuality(), 0);

        conjured = new Conjured("Conjured Mana Cake", -1, 0);
        conjured.updateQ();
        assertEquals(-2, conjured.getSellIn(), 0);
        assertEquals(0, conjured.getQuality(), 0);
    }
}
