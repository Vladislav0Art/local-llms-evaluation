package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIdChangeTest {

    @Test
    public void idChangeTest() {
        Element elem = new Element("div");
        elem.id("test-id");
        assertEquals("test-id", elem.attr("id"));
    }

}