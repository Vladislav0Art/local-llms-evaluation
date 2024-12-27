package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedElementChildTest {

    @Test
    public void ElementChildTest() {
        Element parent = new Element("div");
        Element child = new Element("span");
        parent.appendChild(child);
        assertEquals(child, parent.child(0));
    }

}