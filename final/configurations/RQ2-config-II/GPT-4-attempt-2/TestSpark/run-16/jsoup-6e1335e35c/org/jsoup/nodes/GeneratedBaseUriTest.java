package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedBaseUriTest {

    @Test
    public void baseUriTest() {
        Element element = new Element("div");
        Assert.assertEquals("", element.baseUri());
    }

}