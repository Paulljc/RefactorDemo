package gildedRose;

import org.junit.Assert;
import org.junit.Test;

public class GlidedRoseTest {
    public static final String AGED = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String OTHER = "Other";

    @Test
    public void should_return_Other_10_48_when_invoke_updateQuality_given_Other_11_49() {
        Item[] items = new Item[]{new Item(OTHER, 11, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Other, 10, 48", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Other_minus2_47_when_invoke_updateQuality_Other_minus1_49() {
        Item[] items = new Item[]{new Item(OTHER, -1, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Other, -2, 47", gildedRose.items[0].toString());
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

    @Test
    public void should_return_Backstage_9_50_when_invoke_updateQuality_Backstage_10_49() {
        Item[] items = new Item[]{new Item(BACKSTAGE, 10, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Backstage_9_50_when_invoke_updateQuality_Backstage_10_48() {
        Item[] items = new Item[]{new Item(BACKSTAGE, 10, 48)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Backstage_3_50_when_invoke_updateQuality_Backstage_4_47() {
        Item[] items = new Item[] {new Item(BACKSTAGE, 4, 47)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 3, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Backstage_minus1_0_when_invoke_updateQuality_Backstage_0_50() {
        Item[] items = new Item[] {new Item(BACKSTAGE, 0, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Aged_10_50_when_invoke_updateQuality_Aged_11_50() {
        Item[] items = new Item[] {new AgedBrieItem(AGED, 11, 50)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Aged Brie, 10, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Aged_10_50_when_invoke_updateQuality_Aged_11_49() {
        Item[] items = new Item[] {new AgedBrieItem(AGED, 11, 49)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Aged Brie, 10, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_Aged_minus2_50_when_invoke_updateQuality_Aged_minus1_48() {
        Item[] items = new Item[] {new AgedBrieItem(AGED, -1, 48)};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Aged Brie, -2, 50", gildedRose.items[0].toString());
    }
}
