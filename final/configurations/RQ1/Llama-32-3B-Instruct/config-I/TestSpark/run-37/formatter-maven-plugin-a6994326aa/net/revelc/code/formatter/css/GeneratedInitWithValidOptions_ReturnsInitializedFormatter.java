package net.revelc.code.formatter.css;

import java.util.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

public class GeneratedInitWithValidOptions_ReturnsInitializedFormatter {

    @Test
    public void initWithValidOptions_ReturnsInitializedFormatter() {
        Map<String, String> options = new HashMap<>();
        CssFormatter formatter = new CssFormatter(options);
        assertNotNull(formatter);
    }

}

class LineEnding {
    private static final LineEnding LINE_ENDING = new LineEnding("value");

    private LineEnding(String value) {
        this.value = value;
    }

    public enum Type {
        VALUE
    }

}