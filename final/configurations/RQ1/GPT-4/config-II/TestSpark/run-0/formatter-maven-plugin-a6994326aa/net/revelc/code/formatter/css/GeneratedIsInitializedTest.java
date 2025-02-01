package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse("Formatter should not be initialized.", formatter.isInitialized());
    }

}