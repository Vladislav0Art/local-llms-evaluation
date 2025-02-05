package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class GeneratedPrependChildrenTest {

    @Test
    public void prependChildrenTest() {
        Element parent = new Element("div");
        Node child1 = new Element("p");
        Node child2 = new Element("span");
        Element child3 = new Element("a");
        parent.prependChildren(Arrays.asList(child1, child2));
        parent.prependChild(child3);

        List<Node> childs = parent.childNodes();
        Assert.assertEquals(3, childs.size());
        Assert.assertEquals("a", childs.get(0).nodeName());
    }

}