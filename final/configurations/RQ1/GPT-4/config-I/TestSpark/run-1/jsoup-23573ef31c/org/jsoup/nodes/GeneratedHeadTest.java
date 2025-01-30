package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        Document document = new Document("http://example.com");
        Element head = document.head();

        assertNotNull(head);
        assertTrue(head instanceof Element);
    }

}