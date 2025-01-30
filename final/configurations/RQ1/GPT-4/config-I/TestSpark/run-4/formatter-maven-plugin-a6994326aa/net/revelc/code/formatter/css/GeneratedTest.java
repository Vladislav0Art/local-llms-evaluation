package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void initScenarioWithNoOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void doFormatScenarioWithTabCharacterTest() throws Exception {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        String initialCode = "body {\n\tcolor: #fffff;\n}";
        String expectedFormattedCode = "body {\n    color: #ffffff;\n}";
        assertEquals(expectedFormattedCode, cssFormatter.doFormat(initialCode, LineEnding.CRLF));
    }

    @Test
    public void doFormatScenarioWithNoChangesTest() throws Exception {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        String initialCode = "body {\n    color: #ffffff;\n}";
        assertNull(cssFormatter.doFormat(initialCode, LineEnding.CRLF));
    }

    @Test
    public void isInitializedScenarioBeforeInitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertTrue(!cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedScenarioAfterInitTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        assertTrue(cssFormatter.isInitialized());
    }

}