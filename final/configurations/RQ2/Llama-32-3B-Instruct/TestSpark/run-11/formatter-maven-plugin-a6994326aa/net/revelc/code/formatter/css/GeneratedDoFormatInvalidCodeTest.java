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

public class GeneratedDoFormatInvalidCodeTest {

    private CssFormatter formatter = new CssFormatter();

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

}