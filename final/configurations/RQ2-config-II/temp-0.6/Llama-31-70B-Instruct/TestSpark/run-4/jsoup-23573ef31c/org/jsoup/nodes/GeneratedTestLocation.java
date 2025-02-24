package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTestLocation {

    @Test
    public void testLocation() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

}