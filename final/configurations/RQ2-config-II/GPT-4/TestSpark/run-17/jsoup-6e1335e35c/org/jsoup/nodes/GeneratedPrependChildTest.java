package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class GeneratedPrependChildTest {

    @Test
    public void prependChildTest() {
        Element parent = new Element("div");
        Node child1 = new Element("p");
        Node child2 = new Element("span");
        parent.appendChild(child1);
        parent.prependChild(child2);
        Assert.assertEquals("span", parent.child(0).nodeName());
    }

}