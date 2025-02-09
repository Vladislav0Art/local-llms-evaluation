package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedConstructorBaseUriTest {

    @Test
    public void constructorBaseUriTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

}