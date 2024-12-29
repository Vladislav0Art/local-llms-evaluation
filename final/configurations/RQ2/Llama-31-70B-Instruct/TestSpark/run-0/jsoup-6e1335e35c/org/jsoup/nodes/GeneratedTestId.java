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

public class GeneratedTestId {

    @Test
    public void testId() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertNull(element.id());

        element.id("test");
        assertEquals("test", element.id());
    }

}