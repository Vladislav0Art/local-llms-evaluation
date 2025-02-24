package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GeneratedTestHasChildNodes {

    // Test for Tag and BaseUri

    @Test
    public void testHasChildNodes() {
        Element element = new Element(Tag.valueOf("p"), "http://example.com/");
        element.appendChild(new Element(Tag.valueOf("span"), "http://example.com/"));

        assertEquals(true, element.hasChildNodes());
    }

}