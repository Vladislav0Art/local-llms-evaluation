package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class GeneratedDoSetBaseUriTest {

    @Test
    public void doSetBaseUriTest() {
        Element element = new Element("div");
        element.setBaseUri("http://localhost");
        Assert.assertEquals("http://localhost", element.baseUri());
    }

}