package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Attributes;
import org.jsoup.select.Evaluator;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class GeneratedInsertChildrenTest {

    @Test
    public void insertChildrenTest() {
        Element parent = new Element("parent");
        Element child1 = new Element("child1");
        Element child2 = new Element("child2");
        parent.insertChildren(0, Arrays.asList(child1, child2));
        Assert.assertEquals("child1", parent.child(0).tagName());
        Assert.assertEquals("child2", parent.child(1).tagName());
    }

}