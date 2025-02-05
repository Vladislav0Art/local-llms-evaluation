package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedInitWithEmptyOptionsTest {

    @Test
    public void initWithEmptyOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<String, String>(), null);
        assertTrue(cssFormatter.isInitialized());
    }

}