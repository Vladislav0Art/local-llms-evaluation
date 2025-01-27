package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;

import com.steadystate.css.format.CSSFormat;

public class GeneratedDoFormat_ValidCode_ReturnsFormattedCss {

    @Test
    public void doFormat_ValidCode_ReturnsFormattedCss() throws Exception {
        final String code = "body { background-color: #fff; }";

        final CssFormatter formatter = new CssFormatter();

        final String formattedCss = formatter.doFormat(code, LineEnding.LF);
        assertNotNull(formattedCss);
        assertTrue(formattedCss.contains("background-color"));
    }

}