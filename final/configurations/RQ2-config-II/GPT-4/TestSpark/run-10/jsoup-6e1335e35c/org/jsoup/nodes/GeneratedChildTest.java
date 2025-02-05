package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedChildTest {

    @Test
    public void childTest() {
        Element element = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        child2.attr("class", "test");
        element.appendChild(child1);
        element.appendChild(child2);
        Assert.assertEquals("span", element.child(1).tagName());
        Assert.assertEquals("test", element.child(1).attr("class"));
    }

}