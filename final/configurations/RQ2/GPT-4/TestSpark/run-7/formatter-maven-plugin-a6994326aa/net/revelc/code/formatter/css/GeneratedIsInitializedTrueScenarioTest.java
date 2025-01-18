package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import net.revelc.code.formatter.LineEnding;

public class GeneratedIsInitializedTrueScenarioTest {

    @Test
    public void isInitializedTrueScenarioTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("optionKey", "optionValue");

        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

}