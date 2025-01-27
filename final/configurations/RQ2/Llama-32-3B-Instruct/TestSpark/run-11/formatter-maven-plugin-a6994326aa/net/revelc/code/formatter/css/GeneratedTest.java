package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.InputSource;
import com.steadystate.css.format.CSSFormat;
import com.steadystate.css.parser.SACParserCSS3;
import net.revelc.code.formatter.AbstractCacheableFormatter;
import net.revelc.code.formatter.ConfigurationSource;
import net.revelc.code.formatter.Formatter;
import net.revelc.code.formatter.LineEnding;

public class GeneratedTest {

    private CssFormatter formatter = new CssFormatter();

    @Test
    public void initDefaultOptionsTest() {
        Map<String, String> options = new HashMap<>();
        ConfigurationSource cfg = null;
        formatter.init(options, cfg);
        assertNull(formatter.getOptions());
    }

    @Test
    public void initWithCustomOptionsTest() {
        Map<String, String> options = new HashMap<>();
        options.put("option1", "value1");
        ConfigurationSource cfg = null;
        formatter.init(options, cfg);
        assertEquals(1, formatter.getOptions().size());
    }

    @Test
    public void doFormatEmptyCodeTest() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        InputSource inputSource = new InputSource(document);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        CSSFormat format = null;
        LineEnding ending = null;
        formatter.doFormat("", outContent, format, ending);
        assertTrue(outContent.toString().isEmpty());
    }

    @Test
    public void doFormatValidCodeTest() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        InputSource inputSource = new InputSource(document);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        CSSFormat format = null;
        LineEnding ending = null;
        formatter.doFormat("<style>body { background-color: #f2f2f2; }</style>", outContent, format, ending);
        assertNotNull(outContent.toString());
    }

    @Test
    public void doFormatInvalidCodeTest() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        InputSource inputSource = new InputSource(document);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        CSSFormat format = null;
        LineEnding ending = null;
        formatter.doFormat("InvalidCSS", outContent, format, ending);
        assertTrue(outContent.toString().isEmpty());
    }

    @Test
    public void isInitializedTrueTest() {
        assertFalse(formatter.isInitialized());
        formatter.init(null, null);
        assertTrue(formatter.isInitialized());
    }

    @Test
    public void isInitializedFalseTest() {
        assertTrue(formatter.isInitialized());
        formatter.init(null, null);
        assertFalse(formatter.isInitialized());
    }

}