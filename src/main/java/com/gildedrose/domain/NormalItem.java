package com.gildedrose.domain;

import com.gildedrose.interfaces.UpdateQuality;

public class NormalItem implements UpdateQuality {
    
    private final Item item;

    public NormalItem(String name, int sellIn, int quality) {
        this.item = new Item(name, sellIn, quality);
    }

    @Override
    public String toString() {
        return item.toString();
    }

    public Item getItem() {
        return this.item;
    }

    public String getName() {
        return item.getName();
    }

    public int getsellIn() {
        return item.getSellIn();
    }

    public void setsellIn() {
        item.setSellIn();
    }

    public int getQuality() {
        return item.getQuality();
    }

    public void calculateQuality(int value) {

        if (getQuality() + value > 50) {
            item.setQuality(50);
        }
        else if (getQuality() + value >= 0) {
            item.setQuality(getQuality() + value);
        }
        else {
            item.setQuality(0);
        }
    }

    @Override
    public void updateQ() {
        if (getsellIn() > 0) {
            calculateQuality(-1);
        } else {
            calculateQuality(-2);
        }
        setsellIn();
    }
}