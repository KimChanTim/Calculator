package Command;

import java.io.OutputStreamWriter;

public class Push implements Icommand {
    @Override
    public void makeWork(OutputStreamWriter writer, Context context, String[] command_str) {
        if (context.paramMap.containsKey(command_str[1])) {
            context.valStack.push(context.paramMap.get(command_str[1]));
        } else {
            context.valStack.push(Double.parseDouble(command_str[1]));
        }
    }
}
