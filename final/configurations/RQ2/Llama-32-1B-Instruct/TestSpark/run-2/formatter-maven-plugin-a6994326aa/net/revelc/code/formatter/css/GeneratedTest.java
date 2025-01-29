package net.revelc.code.formatter.css;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    public static InputSource parse(String string, LineEnding ending) {
        if (string == null || !string.startsWith("#")) {
            throw new IllegalArgumentException("Invalid input");
        }
        String[] lines = string.split("\n");
        InputSource source = new InputSource(lines);
        return source;
    }

}