package gildedRose;

public class OtherItem extends Item {

    public OtherItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.itemStrategy = new OtherStrategy();
    }
}
