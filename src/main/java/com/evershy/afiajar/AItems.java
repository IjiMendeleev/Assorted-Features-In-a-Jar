package com.evershy.afiajar;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

public class AItems extends Item
{
	public static final List<Item> ITEMS = new ArrayList<Item>(0);
	
	public static final Item BLOCKINATOR = new ItemBase("blockinator");

	public static final ItemPebble PEBBLE = new ItemPebble("cobble_pebble");
	
	public static final BrickThrowable BRICK = new BrickThrowable("brick");
	
}
