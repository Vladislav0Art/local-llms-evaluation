package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSelectTest {

    @Test
    public void selectTest() {
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        Elements selected = parent.select("p");
        assertEquals(1, selected.size());
    }

}