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

public class GeneratedTestConvertWithExistingDocument {

    @Test
    public void testConvertWithExistingDocument() throws Exception {
        String html = "<div><p>hello world</p></div>";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document existingDoc = builder.newDocument();
        new W3CDom().convert(Jsoup.parse(html), existingDoc);
        assertEquals("p", existingDoc.getElementsByTagName("p").item(0).getNodeName());
    }

}