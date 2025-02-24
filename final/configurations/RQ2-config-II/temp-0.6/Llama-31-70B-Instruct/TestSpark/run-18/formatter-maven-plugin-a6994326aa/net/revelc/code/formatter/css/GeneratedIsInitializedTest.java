package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.junit.Test;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        boolean result = formatter.isInitialized();
        assertTrue(result);
    }

}