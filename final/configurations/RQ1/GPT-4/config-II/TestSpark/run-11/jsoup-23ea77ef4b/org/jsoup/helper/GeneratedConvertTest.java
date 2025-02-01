package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedConvertTest {

    private W3CDom w3cDom = new W3CDom();

    @Test
    public void convertTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><body>test</body></html");
        Document doc = W3CDom.convert(jsoupDoc);

        assertEquals(doc.getDocumentElement().getTagName(), jsoupDoc.child(0).tagName());
    }

}