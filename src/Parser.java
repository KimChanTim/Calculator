import java.io.BufferedReader;
import java.io.IOException;


public class Parser {
    private final BufferedReader reader;

    public Parser(BufferedReader reader) {
        this.reader = reader;
    }

    public String[] parseLine() throws IOException {
        String tmp_str = reader.readLine();
        if (tmp_str == null || tmp_str.length() == 0) {
            return null;
        }
        while (tmp_str.charAt(0) == '#') {
            tmp_str = reader.readLine();
            if (tmp_str == null || tmp_str.length() == 0) {
                return null;
            }
        }
        return tmp_str.split(" ");
    }
}
