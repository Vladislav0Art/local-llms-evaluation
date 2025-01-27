package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Map;
import java.io.IOException;

public class GeneratedTest {

    public static CssFormatter cssFormatter = new CssFormatter();

    @Test
    public void initWithValidOptionsTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = new ConfigurationSource();
        cssFormatter.init(options, cfg);
    }

    @Test
    public void initWithInvalidOptionTest() throws UnsupportedOperationException {
        Map<String, String> options = new HashMap<>();
        options.put("invalid", "option");
        ConfigurationSource cfg = new ConfigurationSource();
        assertThrows(UnsupportedOperationException.class, () -> cssFormatter.init(options, cfg));
    }

    @Test
    public void doFormatEmptyCodeTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        String code = "";
        LineEnding ending = LineEnding.LF;
        assertTrue(cssFormatter.doFormat(code, ending).equals(""));
        assertEquals(0, outContent.size());
    }

    @Test
    public void doFormatOneLineCodeTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        String code = "body { color: red; }";
        LineEnding ending = LineEnding.LF;
        assertTrue(cssFormatter.doFormat(code, ending).contains("color: red;"));
        assertEquals(1, outContent.size());
    }

    @Test
    public void doFormatMultiLineCodeTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        String code = "body { color: red;\nfont-size: 12px;\n}";
        LineEnding ending = LineEnding.LF;
        assertTrue(cssFormatter.doFormat(code, ending).contains("color: red;"));
        assertTrue(cssFormatter.doFormat(code, ending).contains("font-size: 12px;"));
        assertEquals(2, outContent.size());
    }

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        String code = "body { color: red";
        LineEnding ending = LineEnding.LF;
        assertThrows(IOException.class, () -> cssFormatter.doFormat(code, ending));
        assertEquals(1, outContent.size());
    }

    @Test
    public void isInitializedTrueTest() {
        assertTrue(cssFormatter.isInitialized());
    }

    @Test
    public void isInitializedFalseTest() {
        assertFalse(cssFormatter.isInitialized());
    }

}