package Command;

import java.io.OutputStreamWriter;

import static java.lang.Math.sqrt;

public class Sqrt implements Icommand {
    @Override
    public void makeWork(OutputStreamWriter writer, Context context, String[] command_str) {
        context.valStack.push(sqrt(context.valStack.pop()));
    }
}
