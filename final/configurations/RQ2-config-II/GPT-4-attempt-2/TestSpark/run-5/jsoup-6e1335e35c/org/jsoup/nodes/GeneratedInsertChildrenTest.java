package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedInsertChildrenTest {

    @Test
    public void insertChildrenTest() {
        Element parent = new Element("ul");
        Element child1 = new Element("li");
        Element child2 = new Element("li");
        parent.insertChildren(0, Arrays.asList(child1, child2));
        Assert.assertEquals("li", parent.child(0).tagName());
        Assert.assertEquals("li", parent.child(1).tagName());
    }

}