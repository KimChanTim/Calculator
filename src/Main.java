import Command.Context;
import Command.Icommand;
import Factory.Factory;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        OutputStreamWriter writer = null;

        try {
            if (args.length < 1) {
                reader = new BufferedReader(new InputStreamReader(System.in), 8192);
            } else {
                reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0])), 8192);
            }
            writer = new OutputStreamWriter(new FileOutputStream("output.txt"));

            Parser parser = new Parser(reader);
            Factory factory = new Factory();
            Context context = new Context();

            String[] command_str;
            while ((command_str = parser.parseLine()) != null) {
                try {
                    Icommand command = factory.makeCommand(command_str[0]);
                    command.makeWork(writer, context, command_str);
                } catch (RuntimeException e) {
                    e.printStackTrace(System.err);
                }
            }

        }
        catch (IOException e) {
            e.printStackTrace(System.err);
        }
        finally {

            if (null != reader) {
                try {
                    reader.close();
                }
                catch (IOException e) {
                    e.printStackTrace(System.err);
                }
            }

            if (null != writer) {
                try {
                    writer.close();
                }
                catch (IOException e) {
                    e.printStackTrace(System.err);
                }
            }
        }
    }
}
