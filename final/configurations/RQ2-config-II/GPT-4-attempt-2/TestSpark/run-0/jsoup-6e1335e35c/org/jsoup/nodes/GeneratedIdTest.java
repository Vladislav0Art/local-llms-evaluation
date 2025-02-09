package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element element = new Element("p");
        element.id("sampleId");
        assertEquals("sampleId", element.id());
    }

}