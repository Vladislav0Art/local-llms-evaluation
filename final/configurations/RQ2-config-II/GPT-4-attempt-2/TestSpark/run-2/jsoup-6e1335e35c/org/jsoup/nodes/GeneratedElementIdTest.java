package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementIdTest {

    @Test
    public void ElementIdTest() {
        Element element = new Element("div");
        element.id("main");
        assertEquals("main", element.id());
    }

}