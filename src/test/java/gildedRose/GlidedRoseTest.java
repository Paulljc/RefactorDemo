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

    @Test
    public void should_return_Other_minus2_9_when_invoke_updateQuality_Other_minus1_11() {
        Item[] items = new Item[]{new Item(OTHER, -1, 11)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Other, -2, 9", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Other_minus2_minus1_when_invoke_updateQuality_Other_minus1_minus1() {
        Item[] items = new Item[]{new Item(OTHER, -1, -1)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Other, -2, -1", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Sulfuras_11_49_when_invoke_updateQuality_Sulfuras_11_49() {
        Item[] items = new Item[]{new Item(SULFURAS, 11, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, 11, 49", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Sulfuras_minus1_49_when_invoke_updateQuality_Sulfuras_minus1_49() {
        Item[] items = new Item[]{new Item(SULFURAS, -1, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, -1, 49", gildedRose.items[0].toString());
    }
}
