package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestCharset {

    @Test
    public void testCharset() {
        Document document = new Document("https://example.com");
        document.charset(Charset.forName("UTF-8"));
        assertEquals(document.charset(), Charset.forName("UTF-8"));
    }

}