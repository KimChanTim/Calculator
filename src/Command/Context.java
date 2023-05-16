package Command;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Context {
    public Map<String, Double> paramMap = null;
    public Stack<Double> valStack = null;

    public Context() {
        paramMap = new HashMap<>();
        valStack = new Stack<>();
    }
}
