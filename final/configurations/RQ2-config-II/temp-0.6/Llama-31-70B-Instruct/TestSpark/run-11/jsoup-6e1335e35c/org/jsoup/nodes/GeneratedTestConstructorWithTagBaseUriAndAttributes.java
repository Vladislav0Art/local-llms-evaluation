package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GeneratedTestConstructorWithTagBaseUriAndAttributes {

    // Test for Tag and BaseUri

    @Test
    public void testConstructorWithTagBaseUriAndAttributes() {
        String tag = "p";
        String baseUri = "http://example.com/";
        Attributes attributes = new Attributes();
        Element element = new Element(Tag.valueOf(tag), baseUri, attributes);

        assertEquals(tag, element.tagName());
        assertEquals(baseUri, element.baseUri());
        assertEquals(attributes, element.attributes());
    }

}