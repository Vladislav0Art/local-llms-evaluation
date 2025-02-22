package net.revelc.code.formatter.css;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import com.steadystate.css.format.CSSFormat;

public class GeneratedInitWithDefaultOptionsTest {

    private CssFormatter cssFormatter;

    @Test
    public void initWithDefaultOptionsTest() {
        cssFormatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        cssFormatter.init(options, null);

        assertEquals(4, cssFormatter.formatter.getPropertiesInSeparateLines());
        assertEquals(true, cssFormatter.formatter.isRgbAsHex());
        assertEquals(false, cssFormatter.formatter.isUseSourceStringValues());
    }

}