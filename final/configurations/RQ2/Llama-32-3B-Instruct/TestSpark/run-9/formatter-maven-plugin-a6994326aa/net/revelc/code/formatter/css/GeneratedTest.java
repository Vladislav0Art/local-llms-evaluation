package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.io.IOException;

import org.w3c.css.sac.InputSource;

public class GeneratedTest {

    @Test
    public void init_CanInitWithoutOptions() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        CssFormatter formatter = new CssFormatter();
        formatter.init(options, cfg);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void doFormat_WritesCssWithoutLineEnding() throws IOException {
        String code = "body { color: #fff; }";
        LineEnding ending = LineEnding.LF;
        CssFormatter formatter = new CssFormatter();
        ByteArrayInputStream input = new ByteArrayInputStream(code.getBytes());
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        String output = formatter.doFormat(new InputSource(input), ending);
        assertEquals(code, output);
    }

    @Test
    public void doFormat_WritesCssWithLineEnding() throws IOException {
        String code = "body { color: #fff; }";
        LineEnding ending = LineEnding.CRLF;
        CssFormatter formatter = new CssFormatter();
        ByteArrayInputStream input = new ByteArrayInputStream(code.getBytes());
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        String output = formatter.doFormat(new InputSource(input), ending);
        assertEquals(code + "\n", output);
    }

    @Test
    public void isInitialized_ReturnsTrueWhenInitWasCalled() {
        CssFormatter formatter = new CssFormatter();
        formatter.init(new HashMap<>(), new ConfigurationSource());
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void isInitialized_ReturnsFalseWhenInitWasNotCalled() {
        CssFormatter formatter = new CssFormatter();
        assertFalse(formatter.isInitialized());
    }

}