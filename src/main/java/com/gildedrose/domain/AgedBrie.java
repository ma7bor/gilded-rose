package com.gildedrose.domain;

public class AgedBrie extends NormalItem {

    public AgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQ() {

        if (getsellIn() > 0) {
            calculateQuality(1);
        } else {
            calculateQuality(2);
        }
        setsellIn();
    }
}