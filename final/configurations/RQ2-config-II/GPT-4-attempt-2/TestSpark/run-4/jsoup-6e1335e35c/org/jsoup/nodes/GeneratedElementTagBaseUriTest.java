package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementTagBaseUriTest {

    @Test
    public void ElementTagBaseUriTest() {
        Element element = new Element(Tag.valueOf("p"), "www.example.com");
        assertEquals("p", element.tagName());
        assertEquals("www.example.com", element.baseUri());
    }

}