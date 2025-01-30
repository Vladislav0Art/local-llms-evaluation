package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedInitDefaultOptionsTest {

    @Test
    public void initDefaultOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);
        assertTrue(cssFormatter.isInitialized());
    }

}