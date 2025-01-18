package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        Document doc = new Document("https://example.com");
        Element head = doc.head();
        assertNotNull(head);
        assertEquals("head", head.nodeName());
    }

}