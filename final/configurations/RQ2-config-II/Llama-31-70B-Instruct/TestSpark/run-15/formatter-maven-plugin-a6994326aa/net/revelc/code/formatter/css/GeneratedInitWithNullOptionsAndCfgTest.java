package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedInitWithNullOptionsAndCfgTest {

    @Test
    public void initWithNullOptionsAndCfgTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(null, null);
        assertTrue(formatter.isInitialized());
    }

}