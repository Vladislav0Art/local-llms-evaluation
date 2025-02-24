package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        Document document = new Document("http://example.com");
        assertNotNull(document.head());
    }

}