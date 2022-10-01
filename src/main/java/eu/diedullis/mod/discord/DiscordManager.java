package eu.diedullis.mod.discord;

import com.google.gson.JsonObject;
import com.jagrosh.discordipc.IPCClient;
import com.jagrosh.discordipc.entities.Packet;
import com.jagrosh.discordipc.entities.RichPresence;
import com.jagrosh.discordipc.entities.User;
import com.jagrosh.discordipc.exceptions.NoDiscordClientException;

import java.time.OffsetDateTime;

public class DiscordManager {

    public void loadRichPresence(long cliendId) throws NoDiscordClientException {
        IPCClient client = new IPCClient(cliendId);
        client.setListener(new com.jagrosh.discordipc.IPCListener() {
            @Override
            public void onPacketSent(IPCClient client, Packet packet) {

            }

            @Override
            public void onPacketReceived(IPCClient client, Packet packet) {

            }

            @Override
            public void onActivityJoin(IPCClient client, String secret) {

            }

            @Override
            public void onActivitySpectate(IPCClient client, String secret) {

            }

            @Override
            public void onActivityJoinRequest(IPCClient client, String secret, User user) {

            }

            @Override
            public void onReady(IPCClient client)
            {
                RichPresence.Builder builder = new RichPresence.Builder();
                builder.setState("OMEGA KECK")
                        .setDetails("Die Dullis Client ist cool")
                        .setStartTimestamp(System.currentTimeMillis())
                        .setLargeImage("main", "Die Dullis Client")
                        .setSmallImage("server-tanomc", "Spiel auf TanoMC.net");
                client.sendRichPresence(builder.build());
            }

            @Override
            public void onClose(IPCClient client, JsonObject json) {

            }

            @Override
            public void onDisconnect(IPCClient client, Throwable t) {

            }
        });
        client.connect();
    }

}
