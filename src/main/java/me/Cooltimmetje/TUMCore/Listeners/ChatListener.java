package me.Cooltimmetje.TUMCore.Listeners;

import me.Cooltimmetje.TUMCore.Utilities.MiscUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * This class has been created on 10/28/2015 at 18:03 by Cooltimmetje.
 */
public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event){
        if(event.getMessage().toLowerCase().contains("#teamivar")){
            event.setMessage("#TEAMERIK");
        }

        event.setMessage(MiscUtils.color(event.getMessage().replace("#PrayForParis","&f#&9Pray&fFor&cParis&f")));
    }

}
