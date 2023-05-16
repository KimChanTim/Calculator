package Command;

import java.io.OutputStreamWriter;

public class Define implements Icommand {
    @Override
    public void makeWork(OutputStreamWriter writer, Context context, String[] command_str) {
        context.paramMap.put(command_str[1], Double.parseDouble(command_str[2]));
    }
}
