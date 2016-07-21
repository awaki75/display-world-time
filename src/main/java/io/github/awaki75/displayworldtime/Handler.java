package io.github.awaki75.displayworldtime;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class Handler {
    private static final int ONE_HOUR = 1000;
    private static final int HOUR_OFFSET = 6;
    private Minecraft mc;

    public Handler() {
        mc = Minecraft.getMinecraft();
    }

    @SubscribeEvent
    public void onEvent(RenderGameOverlayEvent.Text event) {
        String text = getWorldTime();
        int x = 5;
        int y = 5;
        int color = 0xFFFFFF;

        mc.entityRenderer.setupOverlayRendering();
        mc.fontRenderer.drawStringWithShadow(text, x, y, color);
    }

    private String getWorldTime() {
        long time = mc.theWorld.getWorldTime();
        long h = (time / ONE_HOUR + HOUR_OFFSET) % 24;
        long m = (long) ((double) time / ONE_HOUR * 60) % 60;
        return String.format("%02d:%02d", h, m);
    }
}
