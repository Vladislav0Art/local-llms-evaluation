package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.*;

import java.util.Arrays;

public class GeneratedInsertChildrenTest {

    @Test
    public void insertChildrenTest() {
        Element element = new Element("div");
        Element child1 = new Element("p");
        Element child2 = new Element("span");
        child1.attr("id", "test1");
        child2.attr("id", "test2");
        element.insertChildren(0, Arrays.asList(child1, child2));
        Assert.assertEquals(2, element.childNodeSize());
        Assert.assertEquals("test1", element.child(0).attr("id"));
        Assert.assertEquals("test2", element.child(1).attr("id"));
    }

}