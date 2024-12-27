package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestInsertStartTag {

    private HtmlTreeBuilder builder;

    @Before
    public void setup() {
        builder = new HtmlTreeBuilder();
    }

    @Test
    public void testInsertStartTag() {
        // GIVEN
        String tagName = "div";
        Element element = new Element(tagName);

        // WHEN
        Object result = builder.insertStartTag(element);

        // THEN
        assertTrue(result instanceof Boolean);
        assertFalse(builder.isInserted());
    }

}