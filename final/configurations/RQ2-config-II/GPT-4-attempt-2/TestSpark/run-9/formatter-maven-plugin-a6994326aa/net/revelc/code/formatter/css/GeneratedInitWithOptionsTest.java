package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

import java.util.HashMap;
import java.util.Map;

public class GeneratedInitWithOptionsTest {

    @Test
    public void initWithOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        options.put("opt1", "val1");
        formatter.init(options, null);
        Assert.assertTrue(formatter.isInitialized());
    }

}