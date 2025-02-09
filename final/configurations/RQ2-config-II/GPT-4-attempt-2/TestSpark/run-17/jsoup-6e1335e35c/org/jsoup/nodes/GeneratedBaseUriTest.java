package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        String baseUri = "http://example.com";
        Tag tag = Tag.valueOf("a");
        Attributes attributes = new Attributes();
        Element element = new Element(tag, baseUri, attributes);
        assertEquals(baseUri, element.baseUri());
    }

}