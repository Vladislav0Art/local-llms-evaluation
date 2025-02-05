package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.LineEnding;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedInitNullParametersTest {

    @Test
    public void initNullParametersTest() {
        CssFormatter formatter = new CssFormatter();

        formatter.init(null, null);

        assertTrue(formatter.isInitialized());
    }

}