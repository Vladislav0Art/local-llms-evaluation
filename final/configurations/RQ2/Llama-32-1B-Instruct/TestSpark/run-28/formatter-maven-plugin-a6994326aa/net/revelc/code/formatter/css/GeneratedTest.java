package net.revelc.code.formatter.css;

import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;
import net.revelc.code.formatter.Parser;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testInit() {
        final AbstractCacheableFormatter formatter = new CssFormatter();
        assertEquals(true, formatter.isInitialized());
    }

    @Test
    public void testDoFormat_Simple() throws IOException {
        final Parser parser = new Parser();
        final String code = "body {\n  background-color: #f2f2f2;\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { background-color: #f2f2f2; }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

    @Test
    public void testDoFormat_Multiple() throws IOException {
        final Parser parser = new Parser();
        final String code = "body {\n  background-color: #f2f2f2;\n  font-size: 14px;\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { background-color: #f2f2f2; font-size: 14px; }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

    @Test
    public void testDoFormat_NoStyles() throws IOException {
        final Parser parser = new Parser();
        final String code = "body {\n  background-color: #ffffff;\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

    @Test
    public void testDoFormat_EmptyStyles() throws IOException {
        final Parser parser = new Parser();
        final String code = "";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

    @Test
    public void testDoFormat_HasStyles() throws IOException {
        final Parser parser = new Parser();
        final String code = "body {\n  background-color: #f2f2f2;\n  font-size: 14px;\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { background-color: #f2f2f2; font-size: 14px; }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

    @Test
    public void testDoFormat_HasMultipleStyles() throws IOException {
        final Parser parser = new Parser();
        final String code = "body {\n  background-color: #f2f2f2;\n  font-size: 14px;\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { background-color: #f2f2f2; font-size: 14px; }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

    @Test
    public void testDoFormat_HasNestedStyles() throws IOException {
        final Parser parser = new Parser();
        final String code = "body {\n  background-color: #f2f2f2;\n  font-size: 14px;\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { background-color: #f2f2f2; font-size: 14px; }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

    @Test
    public void testDoFormat_HasEmptyStyleRule() throws IOException {
        final Parser parser = new Parser();
        final String code = "body {\n  }\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

    @Test
    public void testDoFormat_HasInvalidStyleRule() throws IOException {
        final Parser parser = new Parser();
        final String code = "{\n  background-color: #f2f2f2;\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { background-color: #ffffff; }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

    @Test
    public void testDoFormat_HasInvalidStyleAttribute() throws IOException {
        final Parser parser = new Parser();
        final String code = "{\n  background-color: #f2f2f2;\n  invalid-style; }";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { background-color: #f2f2f2; invalid-style; }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

    @Test
    public void testDoFormat_HasMultipleInvalidStyles() throws IOException {
        final Parser parser = new Parser();
        final String code = "{\n  background-color: #f2f2f2;\n  invalid-style; }\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

    @Test
    public void testDoFormat_HasInvalidStyleAttributeInStyles() throws IOException {
        final Parser parser = new Parser();
        final String code = "{\n  invalid-style: #f2f2f2;\n}";
        final LineEnding ending = LineEnding.LF_EOL;
        final CSSFormatter formatter = new CssFormatter();
        final String expectedCode = "body { invalid-style: #ffffff; }";
        assertEquals(expectedCode, formatter.doFormat(code, ending));
    }

}