package net.revelc.code.formatter.css;

import com.steadystate.css.format.CSSFormat;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();

        Assert.assertFalse(cssFormatter.isInitialized());

        Map<String, String> options = new HashMap<>();
        options.put("indent", "2");
        options.put("rgbAsHex", "true");
        options.put("useSourceStringValues", "false");

        cssFormatter.init(options, null);

        Assert.assertTrue(cssFormatter.isInitialized());
    }

}