package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.transform.OutputKeys;
import java.util.HashMap;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;

public class GeneratedFromJsoupTest {

    @Test
    public void fromJsoupTest() {
        org.jsoup.nodes.Document jsoupDocument = Jsoup.parse("<html><body><div>Test</div></body></html>");
        W3CDom w3cDom = new W3CDom();
        Document w3cDocument = w3cDom.fromJsoup(jsoupDocument);
        assertEquals("html", w3cDocument.getDocumentElement().getTagName());
    }

}