package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;

public class GeneratedIsInitializedTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void isInitializedTest() {
        assertTrue(formatter.isInitialized());
    }

}