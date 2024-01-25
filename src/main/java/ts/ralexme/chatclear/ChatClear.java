package ts.ralexme.chatclear;

import org.bukkit.plugin.java.JavaPlugin;
import ts.ralexme.chatclear.Functions.ClearCMD;
import ts.ralexme.chatclear.Functions.ClearTC;

import java.util.Objects;

public final class ChatClear extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("RalexME Plugin - ChatClear - Successfully Enabled");

        Objects.requireNonNull(getCommand("clear")).setExecutor(new ClearCMD());
        Objects.requireNonNull(getCommand("clear")).setTabCompleter(new ClearTC());

    }

    @Override
    public void onDisable() {
        System.out.println("RalexME Plugin - ChatClear - Disabled");
    }
}
