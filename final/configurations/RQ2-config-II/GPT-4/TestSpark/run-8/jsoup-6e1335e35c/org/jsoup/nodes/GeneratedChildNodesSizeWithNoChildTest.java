package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratedChildNodesSizeWithNoChildTest {

    @Test
    public void childNodesSizeWithNoChildTest() {
        Element element = new Element("p");
        Assert.assertEquals(0, element.childNodeSize());
    }

}