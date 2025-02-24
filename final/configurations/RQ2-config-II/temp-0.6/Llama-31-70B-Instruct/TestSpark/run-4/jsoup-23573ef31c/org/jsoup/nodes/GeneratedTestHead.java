package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTestHead {

    @Test
    public void testHead() {
        Document document = new Document("http://example.com");
        assertNotNull(document.head());
    }

}