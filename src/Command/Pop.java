package Command;

import java.io.OutputStreamWriter;

public class Pop implements Icommand {
    @Override
    public void makeWork(OutputStreamWriter writer, Context context, String[] command_str) {
        context.valStack.pop();
    }
}
