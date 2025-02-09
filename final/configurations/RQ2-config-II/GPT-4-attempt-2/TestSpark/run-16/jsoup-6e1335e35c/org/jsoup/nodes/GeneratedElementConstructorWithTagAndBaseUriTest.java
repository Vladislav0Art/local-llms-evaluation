package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedElementConstructorWithTagAndBaseUriTest {

    @Test
    public void ElementConstructorWithTagAndBaseUriTest() {
        Element element = new Element(Tag.valueOf("div"), "http://localhost");
        Assert.assertEquals("http://localhost", element.baseUri());
    }

}