package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public ItemStrategy itemStrategy;

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
        itemStrategy.updateItem(this);
    }

//    void updateItem() {
//        switch (name) {
//            case "Aged Brie":
//                new AgedBrieStrategy().updateItem(this);
//                break;
//            case "Backstage passes to a TAFKAL80ETC concert":
//                new BackstageStrategy().updateItem(this);
//                break;
//            case "Sulfuras, Hand of Ragnaros":
//                new SulfurasStrategy().updateItem(this);
//                break;
//            default:
//                new OtherStrategy().updateItem(this);
//                break;
//        }
//    }
}
