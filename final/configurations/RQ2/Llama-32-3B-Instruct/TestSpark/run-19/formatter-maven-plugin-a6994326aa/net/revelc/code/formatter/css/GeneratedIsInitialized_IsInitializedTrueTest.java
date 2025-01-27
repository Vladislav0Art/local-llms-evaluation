package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedIsInitialized_IsInitializedTrueTest {

    @Test
    public void isInitialized_IsInitializedTrueTest() {
        ConfigurationSource cfg = null;
        Map<String, String> options = null;
        boolean expectedInit = false;
        boolean actualInit = ((CssFormatter) new CssFormatter()).init(options, cfg);
        assertTrue(actualInit == expectedInit);
    }

}