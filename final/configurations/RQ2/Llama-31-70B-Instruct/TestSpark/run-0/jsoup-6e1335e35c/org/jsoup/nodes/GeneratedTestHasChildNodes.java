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

public class GeneratedTestHasChildNodes {

    @Test
    public void testHasChildNodes() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertFalse(element.hasChildNodes());

        element.appendChild(new Element(Tag.valueOf("p"), ""));
        assertTrue(element.hasChildNodes());
    }

}