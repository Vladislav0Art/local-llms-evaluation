package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedAsStringPropertiesNullTest {

    @Test
    public void asStringPropertiesNullTest() {
        Document doc = Jsoup.parse("<html><body>Hello world</body></html>");
        W3CDom w3cDom = new W3CDom();
        org.w3c.dom.Document w3cDoc = w3cDom.fromJsoup(doc);
        String html = w3cDom.asString(w3cDoc);
        assertTrue(html.contains("Hello world"));
    }

}