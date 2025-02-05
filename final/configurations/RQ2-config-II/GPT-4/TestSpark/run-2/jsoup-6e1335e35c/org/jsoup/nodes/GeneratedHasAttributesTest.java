package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedHasAttributesTest {

    @Test
    public void hasAttributesTest() {
        Element element = new Element("div");
        element.attr("class", "myClass");
        assertTrue(element.hasAttributes());
    }

}