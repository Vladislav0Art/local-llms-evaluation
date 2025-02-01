package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedFromJsoupTest {

    @Test
    public void fromJsoupTest() {
        W3CDom dom = new W3CDom();
        Document jsoupDocument = new Document("https://www.example.org");
        Element element = new Element("SomeElement");
        jsoupDocument.appendChild(element);

        org.w3c.dom.Document w3cDocument = dom.fromJsoup(jsoupDocument);
        assertNotNull(w3cDocument);
        assertEquals(jsoupDocument.baseUri(), w3cDocument.getDocumentURI());
        assertSame(w3cDocument.getUserData("jsoupSource"), element);
    }

}