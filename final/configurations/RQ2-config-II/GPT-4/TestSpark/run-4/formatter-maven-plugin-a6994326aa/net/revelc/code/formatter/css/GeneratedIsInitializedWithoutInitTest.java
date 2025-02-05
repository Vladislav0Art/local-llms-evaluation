package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInitializedWithoutInitTest {

    @Test
    public void isInitializedWithoutInitTest() {
        CssFormatter formatter = new CssFormatter();

        assertFalse(formatter.isInitialized());
    }

}