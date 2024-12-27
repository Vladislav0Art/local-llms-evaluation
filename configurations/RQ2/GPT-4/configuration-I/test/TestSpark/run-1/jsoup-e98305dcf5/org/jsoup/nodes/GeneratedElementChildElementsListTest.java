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

public class GeneratedElementChildElementsListTest {

    @Test
    public void ElementChildElementsListTest() {
        Element parent = new Element("div");
        Element child1 = new Element("span");
        Element child2 = new Element("p");
        List<Node> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        parent.appendChildren(children);
        assertEquals(2, parent.childElementsList().size());
    }

}