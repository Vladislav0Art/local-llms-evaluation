package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

public class GeneratedInitTest {

    @Test
    public void initTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), null);
        Assert.assertTrue(formatter.isInitialized());
    }

}