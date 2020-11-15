package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Item;
import main.GildedRose;
	class GildedRoseTest {
		@Test
	    public void foo() {
		 Item[] items = new Item[] {
	                new Item("+5 Dexterity Vest", 10, 20),
	                new Item("Aged Brie", 2, 0),
	                new Item("Elixir of the Mongoose", 5, 7),
	                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
	                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
	                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
	                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
					new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),

	                // this conjured item does not work properly yet
					new Item("Conjured Mana Cake", 3, 6) ,
		 			new Item("Aged Brie", 9, 49),		 			
		 			new Item("Sulfuras, Hand of Ragnaros", 15, 45),		 			
		 			new Item("Backstage passes to a TAFKAL80ETC concert", 15, 55),		 			
		 			new Item("Aged Brie", 20, 51),	
		 			new Item("Aged Brie", -2, 3),		 			
		 			new Item("Aged Brie", -3, 56),
		 			new Item("Elixir of the Mongoose", -2, 8),
		 			new Item("Elixir of the Mongoose", -2, -8),
		 			new Item("Backstage passes to a TAFKAL80ETC concert", -5, 30)
		 			
		 			
		 		 };
	        GildedRose app = new GildedRose(items);
	        app.updateQuality();
	          
	        assertEquals(9, items[0].sellIn);
	        assertEquals(1, items[1].sellIn);
	        assertEquals(4, items[2].sellIn);
	        assertEquals(0, items[3].sellIn); 
	        assertEquals(-1, items[4].sellIn);
	        assertEquals(14, items[5].sellIn);
	        assertEquals(9, items[6].sellIn);
	        assertEquals(4, items[7].sellIn);
	        assertEquals(2, items[8].sellIn);
	        assertEquals(8, items[9].sellIn);
	        assertEquals(15, items[10].sellIn);  
	        assertEquals(14, items[11].sellIn);
	        assertEquals(19, items[12].sellIn);	        
	        assertEquals(-3, items[13].sellIn);
	        assertEquals(-4, items[14].sellIn);
	        assertEquals(-3, items[15].sellIn);
	        assertEquals(-3, items[16].sellIn);
	        assertEquals(-6, items[17].sellIn);
	        
	        
	        
	        assertEquals(19, app.items[0].quality);
	        assertEquals(1,app.items[1].quality);
	        assertEquals(6, app.items[2].quality);
	        assertEquals(80, app.items[3].quality); 
	        assertEquals(80, app.items[4].quality);
	        assertEquals(21, app.items[5].quality);	
	        assertEquals(50, app.items[6].quality);
	        assertEquals(50, app.items[7].quality);   
	        assertEquals(5, app.items[8].quality);
	        assertEquals(50, app.items[9].quality);
	        assertEquals(45, app.items[10].quality);
	        assertEquals(55, app.items[11].quality);
	        assertEquals(51, app.items[12].quality);
	        assertEquals(5, app.items[13].quality);
	        assertEquals(56, app.items[14].quality);
	        assertEquals(6, app.items[15].quality);  
	        assertEquals(-8, app.items[16].quality);
	        assertEquals(0, app.items[17].quality);

	        
		String machaine=null;
		machaine=items[0].name+", "+items[0].sellIn+", "+items[0].quality;
	        assertEquals(machaine, items[0].toString());
	 
	        
	    }


		

	}
