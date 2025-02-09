package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedTest {

    private CssFormatter cssFormatter = new CssFormatter();
    private Map<String, String> options = new HashMap<String, String>();
    private LineEnding ending = LineEnding.CRLF;

    @Test
    public void initValidOptionsTest() {
        try {
            cssFormatter.init(options, null);
            assertTrue(cssFormatter.isInitialized());
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void doFormatValidCodeTest() {
        try {
            String code = "body { background-color: #d0e4fe; }";
            String formattedCode = cssFormatter.doFormat(code, ending);
            assertTrue(formattedCode instanceof String);
        } catch (IOException e) {
            assertTrue(false);
        }
    }

    @Test
    public void doFormatNullCodeTest() throws IOException {
        String code = null;
        cssFormatter.doFormat(code, ending);
    }

    @Test
    public void doFormatNullEndingTest() throws IOException {
        String code = "body { background-color: #d0e4fe; }";
        cssFormatter.doFormat(code, null);
    }

    @Test
    public void isInitializedAfterInitTest() {
        cssFormatter.init(options, null);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedBeforeInitTest() {
        assertTrue(!cssFormatter.isInitialized());
    }

}