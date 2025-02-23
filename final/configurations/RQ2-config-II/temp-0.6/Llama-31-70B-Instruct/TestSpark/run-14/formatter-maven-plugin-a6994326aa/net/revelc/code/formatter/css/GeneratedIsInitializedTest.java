package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();
        boolean isInitialized = cssFormatter.isInitialized();
        assertTrue(isInitialized);
    }

}