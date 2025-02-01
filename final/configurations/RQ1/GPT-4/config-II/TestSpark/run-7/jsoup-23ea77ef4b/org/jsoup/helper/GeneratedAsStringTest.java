package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        Document jsoupDocument = new Document("https://www.example.org");
        org.w3c.dom.Document w3cDocument = W3CDom.convert(jsoupDocument);

        String documentStr = W3CDom.asString(w3cDocument, null);
        assertNotNull(documentStr);
        assertTrue(documentStr.contains("https://www.example.org"));
    }

}