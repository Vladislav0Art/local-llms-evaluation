package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element element = new Element("div");
        element.id("test-id");
        assertEquals("test-id", element.id());
    }

}