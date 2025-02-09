package net.revelc.code.formatter.css;

import net.revelc.code.formatter.LineEnding;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();

        // Before initialization, isInitialized should return false
        Assert.assertFalse(formatter.isInitialized());

        // After initialization, isInitialized should return true
        formatter.init(new HashMap<>(), null);
        Assert.assertTrue(formatter.isInitialized());
    }

}