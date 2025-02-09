package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document document = new Document("http://example.com");
        document.title("test");
        assertEquals("test", document.title());
    }

}