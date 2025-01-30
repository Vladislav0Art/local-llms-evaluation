package org.jsoup.helper;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathFactory;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConvertToW3CDocumentTest {

    @Test
    public void convertToW3CDocumentTest() throws Exception {
        String html = "<div><p>hello world</p></div>";
        Document doc = W3CDom.convert(org.jsoup.Jsoup.parse(html));
        assertNotNull(doc.getElementsByTagName("p").item(0));
    }

}