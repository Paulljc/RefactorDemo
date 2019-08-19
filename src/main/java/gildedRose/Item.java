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

}
