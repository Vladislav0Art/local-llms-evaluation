package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTestHead {

    @Test
    public void testHead() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        Element head = document.head();

        assertNotNull(head);
    }

}