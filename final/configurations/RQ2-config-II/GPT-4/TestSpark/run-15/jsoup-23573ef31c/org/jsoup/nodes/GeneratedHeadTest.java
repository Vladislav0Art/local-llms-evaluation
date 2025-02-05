package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHeadTest {

    @Test
    public void headTest() {
        Document document = new Document("http://localhost");
        Element head = document.head();
        assertNotNull(head);
    }

}