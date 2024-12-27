package net.revelc.code.formatter.css;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;

import net.revelc.code.formatter.css.CssFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTest {

    @Test
    public void initOptionsNullCfgNullTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(null, null);

        assertTrue(formatter.isInitialized());
    }

    @Test
    public void initOptionsCfgTest() {
        CssFormatter formatter = new CssFormatter();
        ConfigurationSource cfg = Mockito.mock(ConfigurationSource.class);
        Map<String, String> options = new HashMap<>();

        formatter.init(options, cfg);

        assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormatCodeEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat("body {color: black;}", LineEnding.AUTO);

        assertNotNull(result);
    }

    @Test
    public void doFormatEmptyCodeEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        String result = formatter.doFormat("", LineEnding.AUTO);

        assertEquals("", result);
    }

    @Test
    public void doFormatNullCodeEndingTest() throws IOException {
        CssFormatter formatter = new CssFormatter();
        formatter.doFormat(null, LineEnding.AUTO);
    }

    @Test
    public void isInitializedAfterInitTest() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(null, null);

        assertTrue(formatter.isInitialized());
    }

    @Test
    public void isInitializedBeforeInitTest() {
        CssFormatter formatter = new CssFormatter();

        assertFalse(formatter.isInitialized());
    }

}