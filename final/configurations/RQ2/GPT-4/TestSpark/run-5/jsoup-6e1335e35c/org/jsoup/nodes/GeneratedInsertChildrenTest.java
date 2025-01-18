package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedInsertChildrenTest {

    @Test
    public void insertChildrenTest() {
        Element parent = new Element("div");
        Element firstChild = new Element("p");
        Element secondChild = new Element("span");
        parent.insertChildren(0, Arrays.asList(firstChild, secondChild));
        Assert.assertEquals(firstChild, parent.child(0));
        Assert.assertEquals(secondChild, parent.child(1));
    }

}