package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        String baseUri = "https://example.com";
        Element element = new Element(Tag.valueOf("div"), baseUri);
        assertEquals(baseUri, element.baseUri());
    }

}