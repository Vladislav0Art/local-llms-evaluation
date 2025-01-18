package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element elem = new Element("div");
        elem.attr("id", "test-id");
        assertEquals("test-id", elem.id());
    }

}