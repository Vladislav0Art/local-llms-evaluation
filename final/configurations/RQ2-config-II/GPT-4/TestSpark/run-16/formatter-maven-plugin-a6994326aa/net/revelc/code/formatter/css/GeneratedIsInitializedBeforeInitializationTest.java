package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsInitializedBeforeInitializationTest {

    @Test
    public void isInitializedBeforeInitializationTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertEquals(false, cssFormatter.isInitialized());
    }

}