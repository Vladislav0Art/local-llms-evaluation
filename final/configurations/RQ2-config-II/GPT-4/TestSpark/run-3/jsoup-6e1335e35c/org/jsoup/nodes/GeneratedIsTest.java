package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsTest {

    @Test
    public void isTest() {
        Element element = new Element("div");
        element.attr("class", "test");
        assertTrue(element.is(".test"));
    }

}