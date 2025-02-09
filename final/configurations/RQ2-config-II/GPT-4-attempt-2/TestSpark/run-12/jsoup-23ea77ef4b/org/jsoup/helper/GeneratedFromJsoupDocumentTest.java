package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedFromJsoupDocumentTest {

    @Test
    public void FromJsoupDocumentTest() {
        W3CDom w3cDom = new W3CDom();
        Document doc = new Document("test");
        org.w3c.dom.Document result = w3cDom.fromJsoup(doc);
        assertNotNull(result);
    }

}