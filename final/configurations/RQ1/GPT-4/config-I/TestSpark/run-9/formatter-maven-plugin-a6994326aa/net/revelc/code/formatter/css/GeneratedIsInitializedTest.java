package net.revelc.code.formatter.css;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;

import java.io.IOException;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        Assert.assertFalse(formatter.isInitialized());
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        Assert.assertTrue(formatter.isInitialized());
    }

}