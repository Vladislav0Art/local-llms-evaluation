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

public class GeneratedAppendToTest {

    @Test
    public void appendToTest() {
        Element parent = new Element("parent");
        Element child = new Element("child").appendTo(parent);
        Assert.assertTrue(parent == child.parent());
    }

}