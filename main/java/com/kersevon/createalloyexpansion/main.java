package com.kersevon.createalloyexpansion;

import com.kersevon.createalloyexpansion.registry.Blocks;
import com.kersevon.createalloyexpansion.registry.Items;
import com.kersevon.createalloyexpansion.registry.CreativeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("createalloyexpansion")
public class main {
    public main() {
        Items.register(FMLJavaModLoadingContext.get().getModEventBus());
        Blocks.register(FMLJavaModLoadingContext.get().getModEventBus());
        CreativeTab.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}