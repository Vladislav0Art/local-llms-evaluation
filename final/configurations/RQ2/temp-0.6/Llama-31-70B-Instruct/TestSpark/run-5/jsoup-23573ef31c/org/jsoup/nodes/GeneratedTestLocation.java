package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTestLocation {

    @Test
    public void testLocation() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        String location = document.location();

        assertNotNull(location);
        assertEquals(baseUri, location);
    }

}