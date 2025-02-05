package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        Element element = new Element(Tag.valueOf("p"), "http://test.com");
        assertEquals("http://test.com", element.baseUri());
    }

}