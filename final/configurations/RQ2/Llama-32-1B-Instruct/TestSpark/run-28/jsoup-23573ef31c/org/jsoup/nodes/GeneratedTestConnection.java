package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

public class GeneratedTestConnection {

    private Document document = new Document("https://example.com");

    @Test
    public void testConnection() {
        assertEquals(null, document.connection().toString());
    }

}