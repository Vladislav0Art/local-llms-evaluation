package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedCssSelectorTest {

    @Test
    public void cssSelectorTest() {
        Element element = new Element("div");
        element.attr("id", "myid").attr("class", "myclass");
        Assert.assertEquals("div#myid.myclass", element.cssSelector());
    }

}