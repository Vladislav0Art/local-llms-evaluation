package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Element;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.StringReader;

import static junit.framework.TestCase.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

public class GeneratedTestAsStringWithNullProperties {

    @Test
    public void testAsStringWithNullProperties() throws Exception {
        String html = "<div><p>hello world</p></div>";
        Document doc = W3CDom.convert(Jsoup.parse(html));
        String result = W3CDom.asString(doc, null);
        assertTrue(result.contains("hello world"));
    }

}