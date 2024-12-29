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

public class GeneratedTestIsBlock {

    @Test
    public void testIsBlock() {
        Element element = new Element(Tag.valueOf("div"), "");
        assertTrue(element.isBlock());

        element = new Element(Tag.valueOf("span"), "");
        assertFalse(element.isBlock());
    }

}