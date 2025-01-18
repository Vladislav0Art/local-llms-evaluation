package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTitleTest {

    @Test
    public void titleTest() {
        Document document = new Document("http://example.com");
        String title = "TestTitle";
        document.title(title);
        assertEquals(title, document.title());
    }

}