package gildedRose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            updateItem(items[i]);
        }
    }

    private void updateItem(Item item) {
        String itemName = item.name;
        switch (itemName) {
            case "Aged Brie":
                if (item.quality < 50) {
                    item.quality++;
                }
                item.sellIn--;
                if (item.sellIn < 0) {
                    if (item.quality < 50) {
                        item.quality++;
                    }
                }
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                break;
            case "Sulfuras, Hand of Ragnaros":
                break;
            default:
                break;
        }
    }
}