package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedAttrTest {

    @Test
    public void attrTest() {
        Element element = new Element("div");
        element.attr("id", "mydiv");
        assertEquals("mydiv", element.attr("id"));
    }

}