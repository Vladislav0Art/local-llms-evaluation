package net.revelc.code.formatter.css;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import org.junit.Test;
import org.mockito.internal.util.reflection.Whitebox;

public class GeneratedInitTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void initTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cs = mock(ConfigurationSource.class);

        try {
            formatter.init(options, cs);
            Boolean isInitialized = (Boolean) Whitebox.getInternalState(formatter, "initialized");
            assertTrue(isInitialized);
        } catch (Exception e) {
            fail("Should not have thrown any exception");
        }
    }

}