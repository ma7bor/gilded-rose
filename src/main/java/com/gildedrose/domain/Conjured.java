package com.gildedrose.domain;

public class Conjured extends NormalItem {

    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQ() {

        if (getsellIn() > 0) {
            calculateQuality(-2);
        } else {
            calculateQuality(-4);
        }
        setsellIn();
    }
}