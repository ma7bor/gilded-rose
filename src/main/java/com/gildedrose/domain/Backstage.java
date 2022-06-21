package com.gildedrose.domain;

public class Backstage extends NormalItem {

    public Backstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQ() {
        if (getSellIn() > 10) {
            calculateQuality(1);
        }
        else if (getSellIn() > 5) {
            calculateQuality(2);
        }
        else if (getSellIn() > 0) {
            calculateQuality(3);
        }
        else {
            getItem().setQuality(0);
        }
        setSellIn();
    }
}