package com.gildedrose;


import com.gildedrose.domain.Conjured;
import com.gildedrose.domain.GildedRose;
import com.gildedrose.domain.ItemFactory;
import com.gildedrose.interfaces.ItemNames;
import com.gildedrose.interfaces.UpdateQuality;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        GildedRose gildedRose = new GildedRose();

        ItemFactory itemFactory =new ItemFactory();


        UpdateQuality item1=itemFactory.getItem(ItemNames.AGED_BRIE,"Aged Brie", 2, 0);
        UpdateQuality item2=itemFactory.getItem(ItemNames.CONJURED,ItemNames.CONJURED, 15, 20);
        UpdateQuality item3=itemFactory.getItem(ItemNames.SULFURAS,"Sulfuras", 0, 80);
        UpdateQuality item4=itemFactory.getItem(ItemNames.SULFURAS,"Sulfuras", 0, 80);
        UpdateQuality item5=itemFactory.getItem(ItemNames.BACKSTAGE,ItemNames.BACKSTAGE, 15, 20);
        UpdateQuality item6=itemFactory.getItem(ItemNames.BACKSTAGE,ItemNames.BACKSTAGE, 15, 20);
        UpdateQuality item7=itemFactory.getItem(ItemNames.BACKSTAGE,ItemNames.BACKSTAGE, 15, 20);

        List<UpdateQuality> items = List.of(item1,item2,item3,item4,item5,item6,item7);
        for (UpdateQuality item : items) {
            gildedRose.addItem(item);
        }

        System.out.println("\t ####  DAY 1 ####");
        System.out.println(gildedRose.toString());


        gildedRose.updateQuality();

        System.out.println("\t ####  DAY 2 ####");
        System.out.println(gildedRose.toString());

        gildedRose.addItem(new Conjured("Conjured", 3, 6));
        System.out.println("\t ####  New item conjured added ####");
        System.out.println(gildedRose.toString());


        gildedRose.updateQuality();
        System.out.println("\t ####  DAY 3 ####");
        System.out.println(gildedRose.toString());
    }
}
