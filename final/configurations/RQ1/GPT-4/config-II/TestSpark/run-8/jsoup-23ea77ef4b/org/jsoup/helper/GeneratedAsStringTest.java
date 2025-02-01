package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedAsStringTest {

    @Test
    public void asStringTest() {
        org.jsoup.nodes.Document document = new Document("http://example.com");
        Document converted = W3CDom.convert(document);
        String output = W3CDom.asString(converted, null);
        assertTrue(output.contains("http://example.com"));
    }

}