package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

public class GeneratedInitPropertiesAbsentTest {

    @Test
    public void initPropertiesAbsentTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        assertTrue(formatter.isInitialized());
    }

}