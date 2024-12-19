package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestDocumentConnection {

    @Test
    public void testDocumentConnection() {
        Document document = new Document("https://example.com");
        document.connection();
        assertNotNull(document.connection());
    }

}