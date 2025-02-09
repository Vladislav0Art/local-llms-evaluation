package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementAttributeSetTest {

    @Test
    public void ElementAttributeSetTest() {
        Element element = new Element("div");
        element.attr("class", "myClass");
        assertTrue(element.hasAttributes());
    }

}