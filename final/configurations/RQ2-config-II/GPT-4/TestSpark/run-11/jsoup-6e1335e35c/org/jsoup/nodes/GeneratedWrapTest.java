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

public class GeneratedWrapTest {

    @Test
    public void wrapTest() {
        Element child = new Element("child");
        child.wrap("<parent></parent>");
        Element parent = child.parent();
        Assert.assertEquals("parent", parent.tagName());
    }

}