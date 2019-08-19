package gildedRose;

public class AgedBrieItem extends Item{

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.itemStrategy = new AgedBrieStrategy();
    }
}
