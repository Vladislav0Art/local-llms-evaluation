package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    public static class CssFormatter {
        private static final String LINE_SEPARATOR = "\n";

        public static String format(String cssCode) {
            // Implement CSS formatting logic here
            return cssCode;
        }
    }

    @Test
    public void testFormat() {
        String cssCode = ".test { width: 100px; height: 200px; }\n.test { background-color: #f2f2f2; }";
        String expectedOutput = ".test {\n" +
                "  width: 100px;\n" +
                "  height: 200px;\n" +
                "  background-color: #f2f2f2;\n" +
                "}";
        String formattedCode = CssFormatter.format(cssCode);
        assertEquals(expectedOutput, formattedCode);
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

    @Test
    public void testFormatMultipleRules() {
        String cssCode = ".test { width: 100px; height: 200px; } .test { background-color: #f2f2f2; }";
        String expectedOutput = ".test {\n" +
                "  width: 100px;\n" +
                "  height: 200px;\n" +
                "} .test {\n" +
                "  background-color: #f2f2f2;\n" +
                "}";
        String formattedCode = CssFormatter.format(cssCode);
        assertEquals(expectedOutput, formattedCode);
    }

    @Test
    public void testFormatEmpty() {
        String cssCode = "";
        String expectedOutput = "";
        String formattedCode = CssFormatter.format(cssCode);
        assertEquals(expectedOutput, formattedCode);
    }

}