package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        org.jsoup.nodes.Document document = Jsoup.parse("<html><body>Hello Jsoup</body></html>");
        Document result = new W3CDom().fromJsoup(document);
        assertEquals("body", result.getDocumentElement().getFirstChild().getNodeName());
    }

}