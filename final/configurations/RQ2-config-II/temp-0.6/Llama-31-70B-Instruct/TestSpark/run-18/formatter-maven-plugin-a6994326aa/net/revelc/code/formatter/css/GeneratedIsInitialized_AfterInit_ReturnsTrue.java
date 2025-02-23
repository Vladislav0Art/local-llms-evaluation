package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedIsInitialized_AfterInit_ReturnsTrue {

    @Test
    public void isInitialized_AfterInit_ReturnsTrue() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), null);

        boolean initialized = formatter.isInitialized();

        assertEquals(true, initialized);
    }

}