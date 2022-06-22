package com.gildedrose.domain;

import com.gildedrose.interfaces.ItemNames;
import com.gildedrose.interfaces.UpdateQuality;

public class ItemFactory {
    /**
     *
     * @param itemType
     * @param name
     * @param sellIn
     * @param quality
     * @return
     */
    public UpdateQuality getItem(String itemType, String name, int sellIn, int quality) {
        switch (itemType) {
            case ItemNames.BACKSTAGE:
                return new Backstage(name, sellIn, quality);
            case ItemNames.AGED_BRIE:
                return new AgedBrie(name, sellIn, quality);
            case ItemNames.CONJURED:
                return new Conjured(name, sellIn, quality);
            case ItemNames.SULFURAS:
                return new Sulfuras(name, sellIn, quality);
            case ItemNames.NORMAL_ITEM:
                return new NormalItem(name, sellIn, quality);
            default:
                return null;
        }
    }
}