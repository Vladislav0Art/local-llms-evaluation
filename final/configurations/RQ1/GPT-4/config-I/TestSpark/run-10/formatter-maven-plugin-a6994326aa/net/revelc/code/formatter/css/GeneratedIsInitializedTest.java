package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();

        assertFalse(cssFormatter.isInitialized());

        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);

        assertTrue(cssFormatter.isInitialized());
    }

}