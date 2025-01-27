package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void init_InitTest() {
        Map<String, String> options = null;
        ConfigurationSource cfg = null;
        boolean expectedInit = false;
        boolean actualInit = ((CssFormatter) new CssFormatter()).init(options, cfg);
        assertTrue(actualInit == expectedInit);
    }

    @Test
    public void doFormat_EmptyInput() throws IOException {
        String input = "";
        LineEnding ending = LineEnding.LF;
        String expectedOutput = "";
        String actualOutput = ((CssFormatter) new CssFormatter()).doFormat(input, ending);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void doFormat_NonEmptyInput() throws IOException {
        String input = "body { color: red; }";
        LineEnding ending = LineEnding.CRLF;
        String expectedOutput = "body { color: red; }\n";
        String actualOutput = ((CssFormatter) new CssFormatter()).doFormat(input, ending);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void doFormat_InvalidInput() throws IOException {
        String input = "{ invalid css ";
        LineEnding ending = LineEnding.LF;
        try {
            ((CssFormatter) new CssFormatter()).doFormat(input, ending);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

    @Test
    public void doFormat_MultipleLines() throws IOException {
        String input = "body { color: red; }\ndiv { font-size: 12px; }";
        LineEnding ending = LineEnding.CRLF;
        String expectedOutput = "body { color: red; }\n\ndiv { font-size: 12px; }\n";
        String actualOutput = ((CssFormatter) new CssFormatter()).doFormat(input, ending);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void doFormat_SACParserCSS3() throws IOException {
        InputSource input = new InputSource(new StringReader("body { color: red; }"));
        CSSStyleSheetImpl styleSheet = new CSSStyleSheetImpl();
        CssFormatter formatter = new CssFormatter();
        boolean initialized = false;
        formatter.init(null, null);
        actualInit = true;
        try {
            ((CssFormatter) formatter).doFormat(styleSheet.getRules().getRule(0), LineEnding.LF);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

    @Test
    public void doFormat_NoOutput() throws IOException {
        String input = "body { color: red; }\n";
        LineEnding ending = LineEnding.CRLF;
        boolean actualOutput = ((CssFormatter) new CssFormatter()).doFormat(input, ending);
        assertFalse(actualOutput);
    }

    @Test
    public void isInitialized_IsInitializedTrueTest() {
        ConfigurationSource cfg = null;
        Map<String, String> options = null;
        boolean expectedInit = false;
        boolean actualInit = ((CssFormatter) new CssFormatter()).init(options, cfg);
        assertTrue(actualInit == expectedInit);
    }

    @Test
    public void isInitialized_IsInitializedFalseTest() {
        ConfigurationSource cfg = null;
        Map<String, String> options = null;
        boolean expectedInit = false;
        boolean actualInit = ((CssFormatter) new CssFormatter()).init(options, cfg);
        assertTrue(actualInit == expectedInit);
    }

}