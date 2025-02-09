package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        child.addClass("testClass");
        parent.appendChild(child);
        Elements elements = parent.select(".testClass");
        assertFalse(elements.isEmpty());
    }

}