package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedIdValidInputTest {

    @Test
    public void idValidInputTest() {
        Element element = new Element("tag");
        element.id("elementId");
        assertEquals("elementId", element.id());
    }

}