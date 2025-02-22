package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInitializedTest {

    @Test
    public void isInitializedTest() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}