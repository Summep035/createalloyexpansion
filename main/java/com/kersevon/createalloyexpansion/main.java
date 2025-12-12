package com.kersevon.createalloyexpansion;

import com.kersevon.createalloyexpansion.registry.Blocks;
import com.kersevon.createalloyexpansion.handlers.FuelHandler;
import com.kersevon.createalloyexpansion.registry.Items;
import com.kersevon.createalloyexpansion.registry.CreativeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod("createalloyexpansion")
public class main {

    public main() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Items.register(bus);
        Blocks.register(bus);
        CreativeTab.register(bus);
        bus.addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(FuelHandler::register);
    }
}