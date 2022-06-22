package com.gildedrose.domain;

import com.gildedrose.interfaces.UpdateQuality;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    private List<UpdateQuality> itemList = new ArrayList<>();
   
    public List<UpdateQuality> itemList() {
        return this.itemList;
    }

    public void addItem(UpdateQuality item) {
        itemList().add(item);
    }

    public void updateQuality() {
        for (UpdateQuality item : itemList()) {
            item.updateQ();
        }
    }

    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();
        for (UpdateQuality item : itemList()) {
            representation.append(item.toString());
            representation.append('\n');
        }
        return representation.toString();
    }


}