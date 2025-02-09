package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.util.List;

public class GeneratedHasChildNodesTest {

    @Test
    public void hasChildNodesTest() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.appendChild(child);
        assertTrue(parent.hasChildNodes());
    }

}