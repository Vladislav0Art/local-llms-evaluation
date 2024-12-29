package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.css.CssFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class GeneratedInitEmptyOptionsTest {

    @Test
    public void initEmptyOptionsTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(Collections.emptyMap(), null);
        Assert.assertTrue(formatter.isInitialized());
    }

}