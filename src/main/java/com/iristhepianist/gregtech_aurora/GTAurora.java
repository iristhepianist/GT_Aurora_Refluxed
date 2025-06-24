package com.iristhepianist.gregtech_aurora;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = "gregtech_aurora",
        version = Tags.VERSION,
        name = Tags.MOD_NAME,
        acceptedMinecraftVersions = "[1.12.2]"
)
public class GTAurora {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info("Hello From {}!", Tags.MOD_NAME);
    }

}