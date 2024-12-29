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

public class GeneratedTestTagName {

    @Test
    public void testTagName() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertEquals("div", element.tagName());

        element.tagName("p");
        assertEquals("p", element.tagName());
    }

}