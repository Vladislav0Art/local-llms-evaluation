package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GeneratedChildrenTest {

    @Test
    public void childrenTest() {
        Element parent = new Element("parent");
        Element child1 = new Element("child");
        Element child2 = new Element("child");
        parent.appendChild(child1);
        parent.appendChild(child2);

        Elements children = parent.children();
        Assert.assertEquals(children.size(), 2);
        Assert.assertEquals(children.get(0), child1);
        Assert.assertEquals(children.get(1), child2);
    }

}