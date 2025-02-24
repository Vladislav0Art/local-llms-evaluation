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
public class GeneratedTestHasAttributes {

    @Test
    public void testHasAttributes() {
        Element element = new Element("div");
        assertFalse(element.hasAttributes());
        element.attr("id", "test");
        assertTrue(element.hasAttributes());
    }

}