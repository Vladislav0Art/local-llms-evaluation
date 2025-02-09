package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedChildTest {

    @Test
    public void childTest() {
        Element parent = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");

        parent.appendChild(child1);
        parent.appendChild(child2);

        Assert.assertEquals(child1, parent.child(0));
        Assert.assertEquals(child2, parent.child(1));
    }

}