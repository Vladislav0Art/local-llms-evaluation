package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedElementDataTest {

    @Test
    public void ElementDataTest() {
        Element element = new Element("p");
        element.data("Hello world");
        assertEquals("Hello world", element.data());
    }

}