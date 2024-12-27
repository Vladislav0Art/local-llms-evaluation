package net.revelc.code.formatter.css;

import net.revelc.code.formatter.CssFormatter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.css.ConfigurationSource;
import net.revelc.code.formatter.css.LineEnding;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private CssFormatter formatter;

    public static class ConfigurationSource {
        public String get(String key) {
            return null;
        }
    }

    public static class LineEnding {
        public String getEnding() {
            return "\n";
        }
    }

    @Test
    public void isInitialized_UninitializedTest() {
        assertFalse(formatter.isInitialized());
    }

}