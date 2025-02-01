package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        Document doc = Jsoup.parse("<html><body>Hello world</body></html>");
        org.w3c.dom.Document w3cDoc = W3CDom.convert(doc);
        assertEquals("html", w3cDoc.getDocumentElement().getTagName());
    }

}