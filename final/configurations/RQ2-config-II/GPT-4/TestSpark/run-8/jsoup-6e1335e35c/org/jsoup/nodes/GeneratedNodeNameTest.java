package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Element element = new Element("div");
        Assert.assertEquals("div", element.nodeName());
    }

}