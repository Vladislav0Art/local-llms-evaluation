package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.Jsoup;
import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedAsStringWithPropertiesTest {

    private static final String SOME_HTML = "<html><head><title>First parse</title></head><body><p>Parsed HTML into a doc.</p></body></html>";

    @Test
    public void asStringWithPropertiesTest() throws IOException, SAXException, ParserConfigurationException {
        Element element = Jsoup.parse(SOME_HTML);
        Document document = W3CDom.convert(element.ownerDocument());

        String result = W3CDom.asString(document, W3CDom.OutputHtml());
        assertTrue(result.contains("<title>First parse</title>"));
    }

}