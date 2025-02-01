package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedFromJsoupTest {

    @Test
    public void fromJsoupTest() {
        org.jsoup.nodes.Document document = new Document("http://example.com");
        W3CDom w3cDom = new W3CDom();
        Document converted = w3cDom.fromJsoup(document);
        assertNotNull(converted);
    }

}