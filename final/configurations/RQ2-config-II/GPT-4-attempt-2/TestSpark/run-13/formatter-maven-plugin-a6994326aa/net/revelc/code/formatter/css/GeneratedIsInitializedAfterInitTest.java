package net.revelc.code.formatter.css;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedIsInitializedAfterInitTest {

    private CssFormatter cssFormatter = new CssFormatter();
    private Map<String, String> options = new HashMap<String, String>();
    private LineEnding ending = LineEnding.CRLF;

    @Test
    public void isInitializedAfterInitTest() {
        cssFormatter.init(options, null);
        assertTrue(cssFormatter.isInitialized());
    }

}