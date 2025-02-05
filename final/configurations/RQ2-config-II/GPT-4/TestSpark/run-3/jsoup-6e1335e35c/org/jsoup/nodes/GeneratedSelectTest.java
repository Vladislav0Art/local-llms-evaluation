package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element element = new Element("div");
        element.attr("id", "test");
        Elements select = element.select("#test");
        assertEquals(1, select.size());
    }

}