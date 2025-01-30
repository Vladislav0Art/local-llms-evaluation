package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        Document doc = new Document("http://example.com");
        Element head = doc.head();
        assertEquals(head.tagName(), "head");
    }

}