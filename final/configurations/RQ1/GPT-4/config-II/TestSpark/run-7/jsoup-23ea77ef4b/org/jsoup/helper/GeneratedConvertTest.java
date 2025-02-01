package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        Document jsoupDocument = new Document("https://www.example.org");

        org.w3c.dom.Document w3cDocument = W3CDom.convert(jsoupDocument);
        assertNotNull(w3cDocument);
        assertEquals(jsoupDocument.baseUri(), w3cDocument.getDocumentURI());
    }

}