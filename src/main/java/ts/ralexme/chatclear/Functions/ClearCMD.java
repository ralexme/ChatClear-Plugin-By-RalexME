package ts.ralexme.chatclear.Functions;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class ClearCMD implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (strings[0].equalsIgnoreCase("chat")){
            for (int a = 0; a < 100; a++) {
                commandSender.sendMessage("              ");
            }
            commandSender.sendMessage("[Kakoy-toWorld] ->" + " Чат успешнo очищен!");
            return true;
        }
        return false;
    }
}
