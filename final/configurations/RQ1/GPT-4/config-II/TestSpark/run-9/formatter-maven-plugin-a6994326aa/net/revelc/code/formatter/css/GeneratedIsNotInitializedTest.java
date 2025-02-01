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
public class GeneratedIsNotInitializedTest {

    @Test
    public void isNotInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}