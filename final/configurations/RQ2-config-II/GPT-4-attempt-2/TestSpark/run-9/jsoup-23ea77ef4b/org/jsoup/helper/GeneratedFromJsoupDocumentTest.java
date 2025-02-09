package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void fromJsoupDocumentTest() {
        W3CDom instance = new W3CDom();
        org.jsoup.nodes.Document document = Jsoup.parse("<html></html>");
        Document result = instance.fromJsoup(document);
        assertNotNull(result);
    }

}