package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTestCharset {

    @Test
    public void testCharset() {
        Document document = new Document("http://example.com");
        assertNotNull(document.charset());
        document.charset(Charset.forName("utf-8"));
        assertEquals(Charset.forName("utf-8"), document.charset());
    }

}