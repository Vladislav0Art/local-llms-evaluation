package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFormatSingleRule {

    public static class CssFormatter {
        private static final String LINE_SEPARATOR = "\n";

        public static String format(String cssCode) {
            // Implement CSS formatting logic here
            return cssCode;
        }
    }

    @Test
    public void testFormatSingleRule() {
        String cssCode = ".test { width: 100px; }";
        String expectedOutput = ".test {\n" +
                "  width: 100px;\n" +
                "}";
        String formattedCode = CssFormatter.format(cssCode);
        assertEquals(expectedOutput, formattedCode);
    }

}