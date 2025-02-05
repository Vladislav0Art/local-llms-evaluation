package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratedHasAttributesWithOneAttributeTest {

    @Test
    public void hasAttributesWithOneAttributeTest() {
        Element element = new Element("div");
        element.attr("id", "test");
        Assert.assertTrue(element.hasAttributes());
    }

}