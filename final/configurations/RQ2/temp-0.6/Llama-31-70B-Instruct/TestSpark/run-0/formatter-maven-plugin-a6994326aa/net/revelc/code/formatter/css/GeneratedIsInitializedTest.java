package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedIsInitializedTest {

    private CssFormatter formatter;

    @Test
    public void isInitializedTest() {
        formatter = new CssFormatter();
        boolean initialized = formatter.isInitialized();
        assertTrue(initialized);
    }

}