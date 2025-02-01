package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedConvertIntoProvidedTest {

    @Test
    public void convertIntoProvidedTest() {
        org.jsoup.nodes.Document document = new Document("example.com");
        W3CDom w3cDom = new W3CDom();
        Document outputDocument = w3cDom.fromJsoup(new Element("div"));
        w3cDom.convert(document, outputDocument);
        assertEquals("http://example.com", outputDocument.getDocumentURI());
    }

}