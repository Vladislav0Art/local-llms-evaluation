package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestBody {

    @Test
    public void testBody() {
        Document document = new Document("https://example.com", ParseSettings.None);
        Elements bodyElements = document.body();
        assertEquals(bodyElements, bodyElementsList());
    }

}