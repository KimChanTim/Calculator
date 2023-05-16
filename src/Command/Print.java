package Command;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Print implements Icommand {
    @Override
    public void makeWork(OutputStreamWriter writer, Context context, String[] command_str) throws IOException {
        writer.write(context.valStack.peek().toString() + "\n");
    }
}
