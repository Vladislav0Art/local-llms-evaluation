package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedInitWithNoOptionsTest {

    @Test
    public void initWithNoOptionsTest() {
        CssFormatter cssFormatter = new CssFormatter();
        cssFormatter.init(null, null);
        assertTrue(cssFormatter.isInitialized());
    }

}