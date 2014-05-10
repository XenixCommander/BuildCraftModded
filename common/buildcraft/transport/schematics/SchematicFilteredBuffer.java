/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.transport.schematics;

import buildcraft.api.blueprints.MappingRegistry;
import buildcraft.api.blueprints.SchematicTile;

public class SchematicFilteredBuffer extends SchematicTile {

	@Override
	public void idsToSchematic(MappingRegistry registry) {
		super.idsToSchematic(registry);

		inventorySlotsToSchematic(registry, cpt, "inventoryFilters");
	}

	@Override
	public void idsToWorld(MappingRegistry registry) {
		super.idsToWorld(registry);

		inventorySlotsToWorld(registry, cpt, "inventoryFilters");
	}

}
