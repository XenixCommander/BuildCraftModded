/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.silicon.gui;

import buildcraft.core.DefaultProps;
import buildcraft.silicon.TileChargingTable;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiChargingTable extends GuiLaserTable {

	public static final ResourceLocation TEXTURE = new ResourceLocation("buildcraft", DefaultProps.TEXTURE_PATH_GUI + "/charging_table.png");
	private final TileChargingTable table;

	public GuiChargingTable(InventoryPlayer playerInventory, TileChargingTable chargingTable) {
		super(playerInventory, new ContainerChargingTable(playerInventory, chargingTable), chargingTable, TEXTURE);
		this.table = chargingTable;
		xSize = 176;
		ySize = 132;
	}
}