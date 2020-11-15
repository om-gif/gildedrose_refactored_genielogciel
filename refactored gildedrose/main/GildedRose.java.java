package main;

public class GildedRose {
    public Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    
    public void Qualite_down (int i) {
        items[i].quality = items[i].quality - 1;
    }

    public void Qualite_up (int i) {
        items[i].quality = items[i].quality + 1;
    }

    public void SellIn_down (int i) {
    	if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
    		items[i].sellIn = items[i].sellIn - 1;
    	}
    }

    public void no_sulfuras_product(int i) {
        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
        	Qualite_down(i);
        }
    }
    public void Qualite_sup_0(int i) {
        if (items[i].quality > 0) {
        	no_sulfuras_product(i);
        }
    }
    
    
    public void Qualite_inf50(int i) {
	    if (items[i].quality < 50) {
	    	Qualite_up(i);
	    }
    }
    public void sellin_inf11(int i) {
    	if (items[i].sellIn < 11) {
    		Qualite_inf50(i);
    	}
    }
    public void sellin_inf6(int i) {
    	 if (items[i].sellIn < 6) {
    		Qualite_inf50(i);
    	 }
    }
    public void Backstage(int i) {
    	if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    		sellin_inf11(i);
    		sellin_inf6(i);
    		
    	}
    }
    public void produits_Aged_Brie_or_Backstage(int i) {
    	
    		Qualite_inf50(i);
    		Backstage(i);	
    	
    }
    
    public void  no_Aged_Brie_product(int i) {
    	 if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    		 Qualite_sup_0(i);
    	 }else {
    		
    		 items[i].quality = items[i].quality - items[i].quality;
    	 }
    }
    public void  Aged_Brie(int i) {
    	Qualite_inf50(i);
    }
    public void regle_sellin_inf_0(int i){
    	 if (!items[i].name.equals("Aged Brie")) {
    		 no_Aged_Brie_product(i);
    	 }else {
    		 Aged_Brie(i);
    	 }
    }
    public void sellin_inf_0(int i){
    	if (items[i].sellIn < 0) {
    		regle_sellin_inf_0(i);
    	}	
    }
    public void updateQuality() {
    	 for (int i = 0; i < items.length; i++) {
    		 if (!items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
    	    		Qualite_sup_0(i) ;
    	     }else {
    	    	 produits_Aged_Brie_or_Backstage(i);
    	     }
    		 SellIn_down(i);
    		 sellin_inf_0(i);
    	 }
    }
    	
    	
    	
    }