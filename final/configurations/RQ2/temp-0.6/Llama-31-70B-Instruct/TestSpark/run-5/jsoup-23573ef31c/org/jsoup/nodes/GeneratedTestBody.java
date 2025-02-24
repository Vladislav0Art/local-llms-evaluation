package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTestBody {

    @Test
    public void testBody() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        Element body = document.body();

        assertNotNull(body);
    }

}