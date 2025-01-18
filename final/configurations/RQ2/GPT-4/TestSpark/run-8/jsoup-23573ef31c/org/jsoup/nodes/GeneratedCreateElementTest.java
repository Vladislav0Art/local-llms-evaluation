package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document doc = new Document("https://example.com");
        Element element = doc.createElement("mytag");
        assertEquals("mytag", element.tagName());
    }

}