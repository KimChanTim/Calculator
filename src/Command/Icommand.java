package Command;

import java.io.IOException;
import java.io.OutputStreamWriter;

public interface Icommand {
    public void makeWork(OutputStreamWriter writer, Context context, String[] command_str) throws IOException;

}
