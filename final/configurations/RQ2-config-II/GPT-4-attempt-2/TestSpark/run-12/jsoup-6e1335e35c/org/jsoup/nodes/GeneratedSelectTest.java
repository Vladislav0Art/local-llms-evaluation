package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.util.List;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        child.attr("id", "testId");
        parent.appendChild(child);
        Elements elements = parent.select("#testId");
        assertEquals(1, elements.size());
        assertEquals("child", elements.get(0).tagName());
    }

}