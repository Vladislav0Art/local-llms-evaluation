package org.jsoup.helper;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.Map;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        org.jsoup.nodes.Document jsoupDoc = Jsoup.parse("<html><head><title>First parse</title></head><body>Test page</body></html>");
        Document doc = W3CDom.convert(jsoupDoc);
        assertEquals("html", doc.getDocumentElement().getNodeName());
    }

}