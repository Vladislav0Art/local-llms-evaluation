package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTestBody {

    @Test
    public void testBody() {
        Document document = new Document("http://example.com");
        assertNotNull(document.body());
    }

}