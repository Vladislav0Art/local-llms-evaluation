package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.css.CssFormatter;

public class GeneratedIsNotInitializedTest {

    @Test
    public void isNotInitializedTest() {
        CssFormatter cssFormatter = new CssFormatter();

        assertFalse(cssFormatter.isInitialized());
    }

}