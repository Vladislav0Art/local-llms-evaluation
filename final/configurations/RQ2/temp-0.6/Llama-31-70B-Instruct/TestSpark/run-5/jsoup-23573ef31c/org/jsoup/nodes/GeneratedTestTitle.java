package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTestTitle {

    @Test
    public void testTitle() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        String title = document.title();

        assertEquals("", title);
    }

}