package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedInitWithDefaultOptionValuesTest {

    @Test
    public void initWithDefaultOptionValuesTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(new HashMap<>(), null);
        assertTrue(cssFormatter.isInitialized());
    }

}