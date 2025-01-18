package net.revelc.code.formatter.css;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import net.revelc.code.formatter.LineEnding;

public class GeneratedIsInitializedFalseScenarioTest {

    @Test
    public void isInitializedFalseScenarioTest() {
        CssFormatter cssFormatter = new CssFormatter();

        assertFalse(cssFormatter.isInitialized());
    }

}