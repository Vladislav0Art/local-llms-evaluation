package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedTitleGetterSetterTest {

    @Test
    public void titleGetterSetterTest() {
        Document document = new Document("http://example.com");
        document.title("Test Title");
        assertEquals("Test Title", document.title());
    }

}