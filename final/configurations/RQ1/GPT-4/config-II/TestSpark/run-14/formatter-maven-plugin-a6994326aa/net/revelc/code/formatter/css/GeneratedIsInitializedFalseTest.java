package net.revelc.code.formatter.css;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedIsInitializedFalseTest {

    @Test
    public void isInitializedFalseTest() {
        CssFormatter cssFormatter = new CssFormatter();
        assertTrue(!cssFormatter.isInitialized());
    }

}