package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element element = new Element(Tag.valueOf("div"), "http://test.com");
        Element childOne = new Element(Tag.valueOf("p"), "http://test.com");
        Element childTwo = new Element(Tag.valueOf("p"), "http://test.com");

        element.appendChild(childOne);
        element.appendChild(childTwo);

        Elements elements = element.select("p");
        assertEquals(2, elements.size());
    }

}