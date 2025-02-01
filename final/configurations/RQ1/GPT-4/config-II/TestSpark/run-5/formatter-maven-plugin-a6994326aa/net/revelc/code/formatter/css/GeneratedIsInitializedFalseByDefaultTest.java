package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;
import org.w3c.css.sac.InputSource;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedIsInitializedFalseByDefaultTest {

    @Test
    public void isInitializedFalseByDefaultTest() {
        CssFormatter formatter = new CssFormatter();
        Assert.assertFalse(formatter.isInitialized());
    }

}