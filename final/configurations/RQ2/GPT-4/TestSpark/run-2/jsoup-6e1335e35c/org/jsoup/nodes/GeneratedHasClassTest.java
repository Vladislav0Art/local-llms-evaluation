package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedHasClassTest {

    @Test
    public void hasClassTest() {
        Element e = new Element("p");
        e.addClass("test");
        assertTrue(e.hasClass("test"));
    }

}