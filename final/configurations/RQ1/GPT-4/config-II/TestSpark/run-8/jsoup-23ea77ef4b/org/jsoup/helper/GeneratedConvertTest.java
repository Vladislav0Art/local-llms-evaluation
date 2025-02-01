package org.jsoup.helper;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import static org.junit.Assert.*;

public class GeneratedConvertTest {

    @Test
    public void convertTest() {
        org.jsoup.nodes.Document document = new Document("http://example.com");
        Document converted = W3CDom.convert(document);
        assertNotNull(converted);
    }

}