package eu.diedullis.mod;

import com.jagrosh.discordipc.exceptions.NoDiscordClientException;
import eu.diedullis.mod.discord.DiscordManager;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DieDullisMod implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public DiscordManager discordManager = new DiscordManager();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}
