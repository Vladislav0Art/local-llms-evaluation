package net.revelc.code.formatter.css;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import org.junit.Test;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("indent", "6");
        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

}