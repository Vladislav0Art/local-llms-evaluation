package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        Document document = new Document("http://example.com");
        document.text("Test Text");
        assertEquals("Test Text", document.text());
    }

}