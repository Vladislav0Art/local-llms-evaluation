package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedValTest {

    @Test
    public void valTest() {
        Element element = new Element("input");
        element.val("test value");
        assertEquals("test value", element.val());
    }

}