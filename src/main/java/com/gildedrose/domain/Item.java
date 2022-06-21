package com.gildedrose.domain;


final class Item {

    private final String name;

    private int sellIn = 0;

    private int quality = 0;

    String getName() {
        return this.name;
    }

    int getSellIn() {
        return this.sellIn;
    }

    void setSellIn() {
        this.sellIn = this.getSellIn() - 1;
    }

    int getQuality() {
        return this.quality;
    }

    void setQuality(int value) {
        this.quality = value;
    }


    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        StringBuilder itemDescription = new StringBuilder();
        itemDescription.append("name=" + getName());
        itemDescription.append(", sellIn=" + getSellIn());
        itemDescription.append(", quality=" + getQuality());
        return itemDescription.toString();
    }
}