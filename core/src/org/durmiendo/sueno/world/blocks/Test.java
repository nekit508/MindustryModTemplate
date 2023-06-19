package org.durmiendo.sueno.world.blocks;

import mindustry.entities.TargetPriority;
import mindustry.type.Category;
import mindustry.world.meta.BlockGroup;


public class Test extends SuenoBlock {
    public Test(String name) {
        super(name);
        solid = true;
        destructible = true;
        group = BlockGroup.none;
        priority = TargetPriority.core;
        category = Category.defense;
        //it's a wall of course it's supported everywhere
        //envEnabled = Env.any;
    }
}
