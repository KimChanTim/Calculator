package Factory;

import Command.Icommand;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Factory {
    private Map<String, String> commandMap = null;

    public Factory() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream("Factory/factoryConfig.txt");
        if (stream == null) {
            throw new IOException("Stream not received.");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        commandMap = new HashMap<>();
        String tmp_str;
        while ((tmp_str = reader.readLine()) != null) {
            String[] strings = tmp_str.split(" ");
            commandMap.put(strings[0], strings[1]);
        }

        reader.close();
    }

    public Icommand makeCommand(String command_name) {
        try {
            return (Command.Icommand) Class.forName("Command." + commandMap.get(command_name)).getConstructor().newInstance();

        } catch (ClassNotFoundException | InvocationTargetException | IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
