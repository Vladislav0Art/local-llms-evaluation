package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import net.revelc.code.formatter.LineEnding;

public class GeneratedTest {

    @Test
    public void initNormalScenarioTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("optionKey", "optionValue");

        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void initNullOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
    }

    @Test
    public void doFormatCodeWithoutNewLinesTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        String code = "body{}";

        String formattedCode = cssFormatter.doFormat(code, LineEnding.CRLF);

        assertTrue(formattedCode.contains(LineEnding.CRLF.getChars()));
    }

    @Test
    public void doFormatNullCodeTest() throws IOException {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.doFormat(null, LineEnding.CRLF);
    }

    @Test
    public void isInitializedFalseScenarioTest() {
        CssFormatter cssFormatter = new CssFormatter();

        assertFalse(cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedTrueScenarioTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("optionKey", "optionValue");

        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

}