package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParentTest {

    @Test
    public void parentTest() {
        Element parent = new Element("parent");
        Element child = new Element("child");
        parent.appendChild(child);
        assertEquals(parent, child.parent());
    }

}