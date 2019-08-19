package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;


    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }


   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void updateItem() {
        String itemName = name;
        switch (itemName) {
            case "Aged Brie":
                new AgedBrieStrategy().updateItem(this);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                new BackstageStrategy().updateItem(this);
                break;
            case "Sulfuras, Hand of Ragnaros":
                break;
            default:
                if (quality > 0) {
                    quality--;
                }
                sellIn = sellIn - 1;
                if (sellIn < 0) {
                    if (quality > 0) {
                        quality = quality - 1;
                    }
                }
                break;
        }
    }
}
