package gildedRose;

import org.junit.Assert;
import org.junit.Test;

public class GlidedRoseTest {
    public static final String AGED = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String OTHER = "Other";

    @Test
    public void should_return_Other_10_10_when_invoke_updateQuality_given_Other_11_11() {
        Item[] items = new Item[]{new Item(OTHER, 11, 11)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Other, 10, 10", gildedRose.items[0].toString());
    }

}
