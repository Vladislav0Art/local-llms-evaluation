package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.util.List;

public class GeneratedAppendChildrenTest {

    @Test
    public void appendChildrenTest() {
        Element parent = new Element("parent");
        Element child1 = new Element("child1");
        Element child2 = new Element("child2");
        List<Node> children = List.of(child1, child2);
        parent.appendChildren(children);
        assertEquals(2, parent.childNodeSize());
    }

}