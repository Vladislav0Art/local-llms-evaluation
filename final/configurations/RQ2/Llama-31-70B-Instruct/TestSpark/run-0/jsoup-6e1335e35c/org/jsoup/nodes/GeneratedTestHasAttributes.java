package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestHasAttributes {

    @Test
    public void testHasAttributes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertFalse(element.hasAttributes());

        element.attr("id", "test");
        assertTrue(element.hasAttributes());
    }

}