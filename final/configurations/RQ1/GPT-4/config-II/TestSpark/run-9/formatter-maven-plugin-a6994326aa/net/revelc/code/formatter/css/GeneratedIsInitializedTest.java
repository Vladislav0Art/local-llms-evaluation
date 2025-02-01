package net.revelc.code.formatter.css;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        Map<String, String> options = new HashMap<>();
        formatter.init(options, null);
        assertTrue(formatter.isInitialized());
    }

}