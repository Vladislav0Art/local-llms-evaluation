package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        Document doc = Jsoup.parse("<html><body>Hello world</body></html>");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(doc);
        String html = W3CDom.asString(w3cDoc, null);
        assertTrue(html.contains("Hello world"));
    }

}