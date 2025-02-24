package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import java.util.List;

public class GeneratedTest {

    private final String TEST_TAG_NAME = "test-tag";
    private final String TEST_ATTRIBUTE_KEY = "test-attribute";
    private final String TEST_ATTRIBUTE_VALUE = "test-value";
    private final String TEST_BASE_URI = "http://test/uri";
    private final String TEST_CHILD_NODE_TAG_NAME = "test-child-node-tag";

    @Test
    public void testElementConstructor() {
        Element element = new Element(Tag.valueOf(TEST_TAG_NAME), TEST_BASE_URI);
        assertNotNull(element);
        assertEquals(TEST_TAG_NAME, element.tagName());
        assertEquals(TEST_BASE_URI, element.baseUri());
        assertFalse(element.hasAttributes());
    }

}