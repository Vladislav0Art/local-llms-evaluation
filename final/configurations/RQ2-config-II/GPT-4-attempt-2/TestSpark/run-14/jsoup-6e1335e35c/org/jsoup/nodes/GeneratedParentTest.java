package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

public class GeneratedParentTest {

    @Test
    public void parentTest() {
        Element parent = new Element("div");
        Element child = new Element("p");
        parent.appendChild(child);
        Assert.assertEquals(parent, child.parent());
    }

}