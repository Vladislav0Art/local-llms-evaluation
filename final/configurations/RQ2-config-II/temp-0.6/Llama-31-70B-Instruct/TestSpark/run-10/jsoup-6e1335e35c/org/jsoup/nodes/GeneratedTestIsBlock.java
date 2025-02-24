package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsBlock {

    @Test
    public void testIsBlock() {
        Element element = new Element("div");
        assertTrue(element.isBlock());
        element.tagName("span");
        assertFalse(element.isBlock());
    }

}