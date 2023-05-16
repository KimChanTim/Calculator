package Command;

import java.io.OutputStreamWriter;

public class Mul implements Icommand {
    @Override
    public void makeWork(OutputStreamWriter writer, Context context, String[] command_str) {
        context.valStack.push(context.valStack.pop() * context.valStack.pop());
    }
}
