package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedChildTest {

    @Test
    public void childTest() {
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        assertEquals(child, parent.child(0));
    }

}