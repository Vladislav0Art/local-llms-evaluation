package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedCreateElementTest {

    // Test constructor

    @Test
    public void createElementTest() {
        Document document = new Document("http://localhost");
        Element element = document.createElement("p");
        assertEquals("p", element.tagName());
    }

}