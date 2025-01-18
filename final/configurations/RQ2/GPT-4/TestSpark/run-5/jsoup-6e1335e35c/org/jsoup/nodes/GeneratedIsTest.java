package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class GeneratedIsTest {

    @Test
    public void isTest() {
        Element element = new Element("p");
        Assert.assertTrue(element.is("p"));
    }

}