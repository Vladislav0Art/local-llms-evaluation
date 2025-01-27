package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

public class GeneratedInit_InitTest {

    @Test
    public void init_InitTest() {
        Map<String, String> options = null;
        ConfigurationSource cfg = null;
        boolean expectedInit = false;
        boolean actualInit = ((CssFormatter) new CssFormatter()).init(options, cfg);
        assertTrue(actualInit == expectedInit);
    }

}