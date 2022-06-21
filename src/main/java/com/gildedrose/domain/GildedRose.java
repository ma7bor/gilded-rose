package com.gildedrose.domain;

import com.gildedrose.interfaces.UpdateQuality;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {

    private List<UpdateQuality> itemList = new ArrayList<>();
   
    public List<UpdateQuality> inventory() {
        return this.itemList;
    }

    public void addItem(UpdateQuality item) {
        inventory().add(item);
    }

    public void updateQuality() {
        for (UpdateQuality item : inventory()) {
            item.updateQ();
        }
    }

    @Override
    public String toString() {
        StringBuilder representation = new StringBuilder();
        for (UpdateQuality item : inventory()) {
            representation.append(item.toString());
            representation.append('\n');
        }
        return representation.toString();
    }


}