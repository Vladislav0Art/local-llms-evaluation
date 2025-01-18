package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPrependTextTest {

    @Test
    public void prependTextTest() {
        Element e = new Element("div");
        e.prependText("test");
        assertEquals("test", e.text());
    }

}