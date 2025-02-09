package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedPrependChildTest {

    @Test
    public void prependChildTest() {
        Element parent = new Element("p");
        Element firstChild = new Element("i");
        Element secondChild = new Element("b");
        parent.prependChild(firstChild);
        parent.prependChild(secondChild);
        Assert.assertEquals("b", parent.child(0).tagName());
    }

}