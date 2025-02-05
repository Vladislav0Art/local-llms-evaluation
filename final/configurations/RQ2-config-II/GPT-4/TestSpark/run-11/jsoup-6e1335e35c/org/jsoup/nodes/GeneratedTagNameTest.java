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

public class GeneratedTagNameTest {

    @Test
    public void tagNameTest() {
        Element e = new Element("mytag");
        Assert.assertEquals("mytag", e.tagName());
        e.tagName("newtag");
        Assert.assertEquals("newtag", e.tagName());
    }

}