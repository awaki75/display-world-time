package io.github.awaki75.displayworldtime;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = DisplayWorldTime.MODID, name = DisplayWorldTime.NAME, version = DisplayWorldTime.VERSION)
public class DisplayWorldTime {
    public static final String MODID = "displayworldtime";
    public static final String NAME = "Display World Time";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new Handler());
    }
}
