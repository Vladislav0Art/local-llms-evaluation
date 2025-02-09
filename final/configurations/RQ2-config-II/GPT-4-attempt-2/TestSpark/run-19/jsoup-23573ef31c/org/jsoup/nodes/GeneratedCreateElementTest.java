package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("div");
        assertEquals("div", element.nodeName());
    }

}