package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        Elements selectResult = parent.select("p");
        assertTrue(selectResult.contains(child));
    }

}