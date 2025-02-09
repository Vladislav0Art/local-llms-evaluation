package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedElementConstructorTagTest {

    @Test
    public void ElementConstructorTagTest() {
        Element element = new Element(Tag.valueOf("div"));
        Assert.assertEquals("div", element.tagName());
    }

}