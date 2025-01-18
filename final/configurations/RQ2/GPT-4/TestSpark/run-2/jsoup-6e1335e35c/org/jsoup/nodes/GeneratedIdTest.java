package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIdTest {

    @Test
    public void idTest() {
        Element e = new Element("p");
        e.id("header");
        assertEquals("header", e.id());
    }

}