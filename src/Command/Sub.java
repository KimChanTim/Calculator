package Command;

import java.io.OutputStreamWriter;

public class Sub implements Icommand {
    @Override
    public void makeWork(OutputStreamWriter writer, Context context, String[] command_str) {
        Double v1 = context.valStack.pop();
        Double v2 = context.valStack.pop();
        context.valStack.push(v1 - v2);
    }
}
