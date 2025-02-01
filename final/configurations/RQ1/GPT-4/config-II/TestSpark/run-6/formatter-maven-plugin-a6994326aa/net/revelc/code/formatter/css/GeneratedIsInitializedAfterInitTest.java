package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInitializedAfterInitTest {

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        assertTrue(formatter.isInitialized());
    }

}